//This class belongs to the service package
package service;

//Imports for handling files and input/output exceptions
import java.io.File;       //Allows working with files if needed
import java.io.IOException; //Handles I/O errors when reading API responses

//Imports for handling URIs and URL building
import java.net.URI;          //Represents a Uniform Resource Identifier
import java.net.URISyntaxException; //Handles invalid URI syntax

//Imports for working with lists and dynamic collections
import java.util.ArrayList;   //Implementation of a resizable list
import java.util.List;        //Interface for ordered collections

//Apache HTTP client for sending HTTP requests and handling responses
import org.apache.http.HttpEntity;                  //Represents the body of an HTTP response
import org.apache.http.HttpStatus;                  //Provides HTTP status codes (e.g., 200 OK)
import org.apache.http.client.ClientProtocolException; //Handles HTTP protocol errors
import org.apache.http.client.methods.CloseableHttpResponse; //Represents the HTTP response
import org.apache.http.client.methods.HttpGet;      //Represents an HTTP GET request
import org.apache.http.client.utils.URIBuilder;    //Helps to construct URIs with query parameters
import org.apache.http.impl.client.CloseableHttpClient; //HTTP client that can be closed
import org.apache.http.impl.client.HttpClients;    //Factory for creating HTTP clients

//Jackson libraries for JSON parsing, mapping, and conversion
import com.fasterxml.jackson.core.type.TypeReference; //Helps map generic types when deserializing
import com.fasterxml.jackson.databind.JsonNode;      //Represents a JSON node/tree
import com.fasterxml.jackson.databind.ObjectMapper;  //Converts JSON <-> Java objects
import com.fasterxml.jackson.databind.SerializationFeature; //Optional: configure JSON formatting

//Custom exception for handling API-specific errors
import exception.MealAPIException;

//Model classes for mapping API JSON responses
import model.MealInfo;              //Represents a simplified meal data structure for the application
import model.themealdb.ErrorResponse; //Maps API error responses
import model.themealdb.Meal;         //Maps detailed meal data from the API
import model.themealdb.MealResult;   //Maps the API response containing multiple meals

//Service class responsible for communicating with TheMealDB REST API
public class MealAPIService {

    //Stores the base URL of TheMealDB API
    private final String API_URL;

    //Constructor that initializes the API base URL
    //This allows the service to be reused with different API endpoints if needed
    public MealAPIService(String API_URL) {
        this.API_URL = API_URL; //Assign the provided URL to the class field
    }
	
//Searches for meals by name or ingredient from TheMealDB API
public List<MealInfo> getMealByNameOrIngredient(String name) throws MealAPIException {

  //Create a list that will store the resulting MealInfo objects
  List<MealInfo> mealInfoList = new ArrayList<>();

  try {
      //Build the API URL for the "search.php" endpoint
      //Add query parameter "s" with the search term (name or ingredient)
      URIBuilder uriBuilder = new URIBuilder(API_URL)
              .setPathSegments("api", "json", "v1", "1", "search.php")
              .addParameter("s", name);

      //Convert the URL into a URI object
      URI uri = uriBuilder.build();

      //Create an HTTP GET request using the URI
      HttpGet getRequest = new HttpGet(uri);

      //Create a Closeable HTTP client
      CloseableHttpClient httpclient = HttpClients.createDefault();

      //Execute the HTTP GET request and obtain the response
      CloseableHttpResponse response = httpclient.execute(getRequest);

      //Extract the response body (JSON)
      HttpEntity entity = response.getEntity();

      //Create a Jackson ObjectMapper for converting JSON to Java objects
      ObjectMapper mapper = new ObjectMapper();

      //Check if the HTTP status is not 200 OK
      if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
          //Map the error response to ErrorResponse object
          ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
          
          //If the API returned an error code, throw a custom exception
          if (errorResponse.getStatusCode() != null) {
              throw new MealAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
          }
      }

      //Parse the JSON response as a tree
      JsonNode root = mapper.readTree(entity.getContent());

      //Extract the "meals" array from the JSON
      JsonNode mealsNode = root.get("meals");

      //If no meals were found, return an empty list
      if (mealsNode == null || mealsNode.isNull() || !mealsNode.isArray()) {
          return mealInfoList;
      }

      //Convert the "meals" JSON array to a List<Meal>
      List<Meal> mResults = mapper.convertValue(
              mealsNode,
              new TypeReference<List<Meal>>() {}
      );

      //Convert each Meal object into a MealInfo object
      for (Meal m : mResults) {

          //Create a MealInfo object using all relevant fields
          MealInfo mi = new MealInfo(
                  m.getIdMeal(), m.getStrMeal(), m.getStrMealThumb()
          );

          //Add the converted MealInfo object to the result list
          mealInfoList.add(mi);
      }

  } catch (URISyntaxException e) {
      //Thrown if the API URL is malformed
      throw new MealAPIException("Problem with URI", e);

  } catch (ClientProtocolException e) {
      //Thrown if there is an HTTP communication error
      throw new MealAPIException("Problem with Client Protocol", e);

  } catch (IOException e) {
      //Thrown if there is an error reading the API response
      throw new MealAPIException("Error requesting data from Meal API", e);
  }

  //Return the final list of meals matching the search term
  return mealInfoList;
}
	
//Retrieves a specific meal from the API using its unique ID
public List<MealInfo> getSpecificMeal(String ID) throws MealAPIException {

  //Create a list that will store the final MealInfo objects
  List<MealInfo> mealInfoList = new ArrayList<>();

  try {
      //Build the API URL and set the endpoint path "lookup.php"
      //This endpoint returns a meal based on its ID
      URIBuilder uriBuilder = new URIBuilder(API_URL)
              .setPathSegments("api", "json", "v1", "1", "lookup.php")

              //Add the query parameter "i" with the meal ID
              .addParameter("i", ID);

      //Convert the constructed URL into a URI object
      URI uri = uriBuilder.build();

      //Create an HTTP GET request using the constructed URI
      HttpGet getRequest = new HttpGet(uri);

      //Create an HTTP client that will send the request
      CloseableHttpClient httpclient = HttpClients.createDefault();

      //Execute the HTTP request and receive the server response
      CloseableHttpResponse response = httpclient.execute(getRequest);

      //Extract the response body (JSON) from the HTTP response
      HttpEntity entity = response.getEntity();

      //Create a Jackson ObjectMapper for converting JSON to Java objects
      ObjectMapper mapper = new ObjectMapper();

      //Check if the HTTP response status is not 200 (OK)
      if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {

          //Convert the error JSON response into an ErrorResponse object
          ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);

          //If the API returned an error code, throw a custom exception
          if (errorResponse.getStatusCode() != null) {
              throw new MealAPIException("Error occurred on API call " + errorResponse.getStatusMessage());
          }
      }

      //Read the JSON response as a tree structure
      JsonNode root = mapper.readTree(entity.getContent());

      //Extract the "meals" array from the JSON
      JsonNode mealsNode = root.get("meals");

      //If no meals were returned (invalid ID), return an empty list
      if (mealsNode == null || mealsNode.isNull() || !mealsNode.isArray()) {
          return mealInfoList;
      }

      //Convert the JSON "meals" array into a List of Meal objects
      List<Meal> mResults = mapper.convertValue(
              mealsNode,
              new TypeReference<List<Meal>>() {}
      );

      //Convert each Meal object into a MealInfo object
      for (Meal m : mResults) {

          //Create a MealInfo object using the full meal data
          MealInfo mi = new MealInfo(
                  m.getIdMeal(), m.getStrMeal(), m.getStrMealAlternate(),
                  m.getStrCategory(), m.getStrArea(), m.getStrInstructions(),
                  m.getStrMealThumb(), m.getStrTags(), m.getStrYoutube(),
                  m.getStrIngredient1(), m.getStrIngredient2(), m.getStrIngredient3(),
                  m.getStrIngredient4(), m.getStrIngredient5(), m.getStrIngredient6(),
                  m.getStrIngredient7(), m.getStrIngredient8(), m.getStrIngredient9(),
                  m.getStrIngredient10(), m.getStrIngredient11(), m.getStrIngredient12(),
                  m.getStrIngredient13(), m.getStrIngredient14(), m.getStrIngredient15(),
                  m.getStrIngredient16(), m.getStrIngredient17(), m.getStrIngredient18(),
                  m.getStrIngredient19(), m.getStrIngredient20(),
                  m.getStrMeasure1(), m.getStrMeasure2(), m.getStrMeasure3(),
                  m.getStrMeasure4(), m.getStrMeasure5(), m.getStrMeasure6(),
                  m.getStrMeasure7(), m.getStrMeasure8(), m.getStrMeasure9(),
                  m.getStrMeasure10(), m.getStrMeasure11(), m.getStrMeasure12(),
                  m.getStrMeasure13(), m.getStrMeasure14(), m.getStrMeasure15(),
                  m.getStrMeasure16(), m.getStrMeasure17(), m.getStrMeasure18(),
                  m.getStrMeasure19(), m.getStrMeasure20(),
                  m.getStrSource(), m.getStrImageSource(),
                  m.getStrCreativeCommonsConfirmed(), m.getDateModified()
          );

          //Add the converted object to the result list
          mealInfoList.add(mi);
      }

  } catch (URISyntaxException e) {
      //Thrown if the API URL is malformed
      throw new MealAPIException("Problem with URI", e);

  } catch (ClientProtocolException e) {
      //Thrown if there is an HTTP communication error
      throw new MealAPIException("Problem with Client Protocol", e);

  } catch (IOException e) {
      //Thrown if there is an error reading the API response
      throw new MealAPIException("Error requesting data from Meal API", e);
  }

  //Return the final list containing the requested meal
  return mealInfoList;
}

	
//Retrieves a randomly selected meal from TheMealDB API
public List<MealInfo> getRandomMeal() throws MealAPIException {

 //Create a list to store the MealInfo objects
 List<MealInfo> mealInfoList = new ArrayList<>();

 try {
     //Build the API URL for the random.php endpoint
     URIBuilder uriBuilder = new URIBuilder(API_URL)
             .setPathSegments("api", "json", "v1", "1", "random.php");

     //Convert the constructed URL into a URI object
     URI uri = uriBuilder.build();

     //Create an HTTP GET request for the constructed URI
     HttpGet getRequest = new HttpGet(uri);

     //Create a Closeable HTTP client
     CloseableHttpClient httpclient = HttpClients.createDefault();

     //Execute the HTTP request and get the response
     CloseableHttpResponse response = httpclient.execute(getRequest);

     //Extract the response body (JSON) from the HTTP response
     HttpEntity entity = response.getEntity();

     //Create a Jackson ObjectMapper to convert JSON to Java objects
     ObjectMapper mapper = new ObjectMapper();

     //Check if the HTTP response status is not 200 OK
     if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
         //Map the error response JSON to an ErrorResponse object
         ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
         
         //If an error code exists, throw a custom exception
         if (errorResponse.getStatusCode() != null) {
             throw new MealAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
         }
     }

     //Parse the JSON response as a tree structure
     JsonNode root = mapper.readTree(entity.getContent());

     //Extract the "meals" array from the JSON
     JsonNode mealsNode = root.get("meals");

     //If no meals were returned, return an empty list
     if (mealsNode == null || mealsNode.isNull() || !mealsNode.isArray()) {
         return mealInfoList;
     }

     //Convert the JSON array into a List of Meal objects
     List<Meal> mResults = mapper.convertValue(
             mealsNode,
             new TypeReference<List<Meal>>() {}
     );

     //Convert each Meal object into a MealInfo object
     for (Meal m : mResults) {

         //Construct a MealInfo object with all meal properties
         MealInfo mi = new MealInfo(
                 m.getIdMeal(), m.getStrMeal(), m.getStrMealAlternate(),
                 m.getStrCategory(), m.getStrArea(), m.getStrInstructions(),
                 m.getStrMealThumb(), m.getStrTags(), m.getStrYoutube(),
                 m.getStrIngredient1(), m.getStrIngredient2(), m.getStrIngredient3(),
                 m.getStrIngredient4(), m.getStrIngredient5(), m.getStrIngredient6(),
                 m.getStrIngredient7(), m.getStrIngredient8(), m.getStrIngredient9(),
                 m.getStrIngredient10(), m.getStrIngredient11(), m.getStrIngredient12(),
                 m.getStrIngredient13(), m.getStrIngredient14(), m.getStrIngredient15(),
                 m.getStrIngredient16(), m.getStrIngredient17(), m.getStrIngredient18(),
                 m.getStrIngredient19(), m.getStrIngredient20(),
                 m.getStrMeasure1(), m.getStrMeasure2(), m.getStrMeasure3(),
                 m.getStrMeasure4(), m.getStrMeasure5(), m.getStrMeasure6(),
                 m.getStrMeasure7(), m.getStrMeasure8(), m.getStrMeasure9(),
                 m.getStrMeasure10(), m.getStrMeasure11(), m.getStrMeasure12(),
                 m.getStrMeasure13(), m.getStrMeasure14(), m.getStrMeasure15(),
                 m.getStrMeasure16(), m.getStrMeasure17(), m.getStrMeasure18(),
                 m.getStrMeasure19(), m.getStrMeasure20(),
                 m.getStrSource(), m.getStrImageSource(),
                 m.getStrCreativeCommonsConfirmed(), m.getDateModified()
         );

         //Add the MealInfo object to the result list
         mealInfoList.add(mi);
     }

 } catch (URISyntaxException e) {
     //Thrown if the API URL is malformed
     throw new MealAPIException("Problem with URI", e);

 } catch (ClientProtocolException e) {
     //Thrown if there is an HTTP communication error
     throw new MealAPIException("Problem with Client Protocol", e);

 } catch (IOException e) {
     //Thrown if there is an error reading the API response
     throw new MealAPIException("Error requesting data from Meal API", e);
 }

 //Return the list containing the random meal
 return mealInfoList;
}
	
}
