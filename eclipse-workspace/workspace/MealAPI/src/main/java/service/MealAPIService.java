//Class "MealAPIService" belongs to package "service"
package service;

//Imports for handling files and Ι/Ο exceptions
import java.io.File;       
import java.io.IOException;

//Imports for handling URIs and URL building
import java.net.URI;
import java.net.URISyntaxException;

//Imports for working with lists and dynamic collections
import java.util.ArrayList;
import java.util.List;

//Apache HTTP client for sending HTTP requests and handling responses
import org.apache.http.HttpEntity;                  //Representation of the body of an HTTP response
import org.apache.http.HttpStatus;                  //Provision of HTTP status codes (e.g., 200 OK)
import org.apache.http.client.ClientProtocolException; //Handling of HTTP protocol errors
import org.apache.http.client.methods.CloseableHttpResponse; //Representation of the HTTP response
import org.apache.http.client.methods.HttpGet;      //Representation of an HTTP GET request
import org.apache.http.client.utils.URIBuilder;    //Help to construct URIs with query parameters
import org.apache.http.impl.client.CloseableHttpClient; //HTTP client that can be closed
import org.apache.http.impl.client.HttpClients;    //Factory for creating HTTP clients

//Jackson libraries for JSON parsing, mapping, and conversion
import com.fasterxml.jackson.core.type.TypeReference; //Help to map generic types during deserialisation
import com.fasterxml.jackson.databind.JsonNode;      //Representation of a JSON node/tree
import com.fasterxml.jackson.databind.ObjectMapper;  //Conversion of JSON into Java objects
import com.fasterxml.jackson.databind.SerializationFeature; //Optional: Configuration of JSON formatting

//Custom exception for handling API-specific exceptions
import exception.MealAPIException;

//Model classes for mapping API JSON responses
import model.MealInfo;         
import model.themealdb.ErrorResponse;
import model.themealdb.Meal;         
import model.themealdb.MealResult;  

//Class "MealAPIService" for data reception from the REST API of THEMEALDB
public class MealAPIService 
{

    //Storage of the base URL of the REST API of THEMEALDB
    private final String API_URL;

    //Constructor for creation of URL of the REST API of THEMEALDB 
    public MealAPIService(String API_URL) 
	{
        this.API_URL = API_URL;
	}
	
	//Meal searching by name or main ingredient from the REST API of THEMEALDB
	public List<MealInfo> getMealByNameOrIngredient(String name) throws MealAPIException 
	{
	
	  //Creation of list for storing resulting MealInfo objects
	  List<MealInfo> mealInfoList = new ArrayList<>();
	
	  try 
	  {
	      //Building of the API URL for "search.php" endpoint
	      //Add query parameter "s" using search term (name/main ingredient)
	      URIBuilder uriBuilder = new URIBuilder(API_URL)
	              .setPathSegments("api", "json", "v1", "1", "search.php")
	              .addParameter("s", name);
	
	      //Conversion of URL into URI object
	      URI uri = uriBuilder.build();
	
	      //Creation of HTTP GET request using the URI
	      HttpGet getRequest = new HttpGet(uri);
	
	      //Creation of Closeable HTTP client
	      CloseableHttpClient httpclient = HttpClients.createDefault();
	
	      //Execution of HTTP GET request and obtaining of response
	      CloseableHttpResponse response = httpclient.execute(getRequest);
	
	      //Extraction of response body (JSON)
	      HttpEntity entity = response.getEntity();
	
	      //Creation of Jackson ObjectMapper for conversion of JSON into Java objects
	      ObjectMapper mapper = new ObjectMapper();
	
	      //Check if the HTTP status is not 200 OK
	      if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) 
		  {
	          //Mapping of error response to ErrorResponse object
	          ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
	          
	          //Throwing of a custom exception when an API error code returns
	          if (errorResponse.getStatusCode() != null) 
			  {
	              throw new MealAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
	          }
	      }
	
	      //Parsing of JSON response in tree form
	      JsonNode root = mapper.readTree(entity.getContent());
	
	      //Extraction of "meals" array from JSON
	      JsonNode mealsNode = root.get("meals");
	
	      //Conversion of "meals" JSON array into a List<Meal>
	      List<Meal> mResults = mapper.convertValue
		  (
	              mealsNode,
	              new TypeReference<List<Meal>>() {}
	      );
	
	      //Conversion of each Meal object into a MealInfo object
	      for (Meal m : mResults) 
		  {
	
	          //Creation of MealInfo object using all relevant fields
	          MealInfo mi = new MealInfo
			  (
	                  m.getIdMeal(), m.getStrMeal(), m.getStrMealThumb()
	          );
	
	          //Addition of converted MealInfo object to result list
	          mealInfoList.add(mi);
	      }
	
	  }
	  //Throwing of an exception when API URL is malformed
	  catch (URISyntaxException e) 
	  {
	      throw new MealAPIException("Problem with URI", e);
	
	  } 
	  //Throwing of an exception when HTTP communication error appears
	  catch (ClientProtocolException e) 
	  {
	      throw new MealAPIException("Problem with Client Protocol", e);
	
	  }
	  //Throwing of an exception when REST API response error appears
	  catch (IOException e) 
	  {
	      throw new MealAPIException("Error requesting data from Meal API", e);
	  }
	
	  //Return of search term meals matching final list
	  return mealInfoList;
	}
	
	//Meal searching by ID from the REST API of THEMEALDB
	public List<MealInfo> getSpecificMeal(String ID) throws MealAPIException 
	{
	
	  //Creation of list for storing resulting MealInfo objects
	  List<MealInfo> mealInfoList = new ArrayList<>();
	
	  try 
	  {
	      //Building of the API URL for "look.php" endpoint
	      //Add query parameter "i" using search term (ID)
	      URIBuilder uriBuilder = new URIBuilder(API_URL)
	              .setPathSegments("api", "json", "v1", "1", "lookup.php")
	              .addParameter("i", ID);
	
	      //Conversion of URL into URI object
	      URI uri = uriBuilder.build();
	
	      //Creation of HTTP GET request using the URI
	      HttpGet getRequest = new HttpGet(uri);
	
	      //Creation of Closeable HTTP client
	      CloseableHttpClient httpclient = HttpClients.createDefault();
	
	      //Execution of HTTP GET request and obtaining of response
	      CloseableHttpResponse response = httpclient.execute(getRequest);
	
	      //Extraction of response body (JSON)
	      HttpEntity entity = response.getEntity();
	
	      //Creation of Jackson ObjectMapper for conversion of JSON into Java objects
	      ObjectMapper mapper = new ObjectMapper();
	
	     //Check if the HTTP status is not 200 OK
	      if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) 
		  {
	          //Mapping of error response to ErrorResponse object
	          ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
	          
	          //Throwing of a custom exception when an API error code returns
	          if (errorResponse.getStatusCode() != null) 
			  {
	              throw new MealAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
	          }
	      }
	
	      //Parsing of JSON response in tree form
	      JsonNode root = mapper.readTree(entity.getContent());
	
	      //Extraction of the "meals" array from JSON
	      JsonNode mealsNode = root.get("meals");
	
	      //Conversion of "meals" JSON array into a List<Meal>
	      List<Meal> mResults = mapper.convertValue
		  (
	              mealsNode,
	              new TypeReference<List<Meal>>() {}
	      );
	
	      //Conversion of each Meal object into a MealInfo object
	      for (Meal m : mResults) 
		  {
	
	          //Creation of MealInfo object using all relevant fields
	          MealInfo mi = new MealInfo
			  (
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
	
	          //Addition of converted MealInfo object to result list
	          mealInfoList.add(mi);
	      }
	
	  } 
	   //Throwing of an exception when API URL is malformed
	  catch (URISyntaxException e) 
	  {
	      throw new MealAPIException("Problem with URI", e);
	
	  } 
	  //Throwing of an exception when HTTP communication error appears
	  catch (ClientProtocolException e) 
	  {
	      throw new MealAPIException("Problem with Client Protocol", e);
	
	  }
	  //Throwing of an exception when REST API response error appears
	  catch (IOException e) 
	  {
	      throw new MealAPIException("Error requesting data from Meal API", e);
	  }
	
	  //Return of search term meals matching final list
	  return mealInfoList;
	}

	
	//Random meal searching from the REST API of THEMEALDB
	public List<MealInfo> getRandomMeal() throws MealAPIException 
	{
	
		 //Creation of list for storing resulting MealInfo objects
	  	 List<MealInfo> mealInfoList = new ArrayList<>();
		
		 try 
		 {
		     //Building of the API URL for "random.php" endpoint
		     URIBuilder uriBuilder = new URIBuilder(API_URL)
		             .setPathSegments("api", "json", "v1", "1", "random.php");
		
		     //Conversion of URL into URI object
		     URI uri = uriBuilder.build();
		
		     //Creation of HTTP GET request using the URI
	         HttpGet getRequest = new HttpGet(uri);
	
		     //Creation of Closeable HTTP client
		     CloseableHttpClient httpclient = HttpClients.createDefault();

		     //Execution of HTTP GET request and obtaining of response
		     CloseableHttpResponse response = httpclient.execute(getRequest);

		     //Extraction of response body (JSON)
		     HttpEntity entity = response.getEntity();

		     //Creation of Jackson ObjectMapper for conversion of JSON into Java objects
		     ObjectMapper mapper = new ObjectMapper();
		
		     //Check if the HTTP status is not 200 OK
		     if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) 
			 {
		         //Mapping of error response to ErrorResponse object
		         ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
		         
		         //Throwing of a custom exception when an API error code returns
		         if (errorResponse.getStatusCode() != null) 
				 {
		             throw new MealAPIException("Error occurred on API call: " + errorResponse.getStatusMessage());
		         }
		     }
		
		     //Parsing of JSON response in tree form
		     JsonNode root = mapper.readTree(entity.getContent());

		     //Extraction of "meals" array from JSON
		     JsonNode mealsNode = root.get("meals");

		     //When meals returns is null, return an empty list
		     if (mealsNode == null || mealsNode.isNull() || !mealsNode.isArray()) 
		     {
		       return mealInfoList;
		     }

		     //Conversion of "meals" JSON array into a List<Meal>
		     List<Meal> mResults = mapper.convertValue
		     (
		     	  mealsNode,
		     	  new TypeReference<List<Meal>>() {}
		     );
		
		     //Conversion of each Meal object into a MealInfo object
	         for (Meal m : mResults) 
		     {
	
	          	  //Creation of MealInfo object using all relevant fields
	          	  MealInfo mi = new MealInfo
				  (
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
		
		         //Addition of converted MealInfo object to result list
		         mealInfoList.add(mi);
		     }
		
		 } 
		 //Throwing of an exception when API URL is malformed
	     catch (URISyntaxException e) 
	     {
	          throw new MealAPIException("Problem with URI", e);
	
	     } 
	     //Throwing of an exception when HTTP communication error appears
         catch (ClientProtocolException e) 
	     { 
	         throw new MealAPIException("Problem with Client Protocol", e);
	     }
	     //Throwing of an exception when REST API response error appears
	     catch (IOException e) 
	     {
	         throw new MealAPIException("Error requesting data from Meal API", e);
	     }
	
	  //Return of search term meals matching final list
	  return mealInfoList;
	}
}



