//Class «MealAPISrviceTest» belongs package «testing»
package testing;

//Import of all static assertion methods from JUnit
import static org.junit.Assert.*;

//Import of the List interface
import java.util.List;

//Import of JUnit assertion utilities
import org.junit.Assert;

//Import of the @Test annotation for marking test methods
import org.junit.Test;

//Import of the custom exception thrown by MealAPIService
import exception.MealAPIException;

//Import of the model class representing meal data
import model.MealInfo;

//Import of the service class under test
import service.MealAPIService;

//Class «MealAPIServiceTest» for testing
public class MealAPIServiceTest 
{
    //Test method for searching a meal by name
    @Test
    public void testSearchMealByName() throws MealAPIException 
    {
        //Create a new instance of MealAPIService with the base API URL
        final MealAPIService mealSearchService = new MealAPIService("https://www.themealdb.com/"); 
        //Call the REST API to search meals by the name "Arrabiata" and store the results
        final List<MealInfo> results = mealSearchService.getMealByNameOrIngredient("Arrabiata");
        //Assert that the results list is not empty
        Assert.assertFalse(results.isEmpty());
        //Iterate through all meals in the results
        for (MealInfo meal : results) 
        {
            //Print meal ID, name and image to the console
            System.out.println
            (
                "MealInfo{idMeal='" + meal.getIdMeal() + "'\n, strMeal='" + meal.getStrMeal() + "'\n, strMealThumb='" + meal.getStrMealThumb() + "'\n}"
            );
        }
    }

    //Test method for searching meals by main ingredient
    @Test
    public void testSearchMealByIngredient() throws MealAPIException 
    {
        //Create a new instance of MealAPIService with the base API URL
        final MealAPIService mealSearchService = new MealAPIService("https://www.themealdb.com/"); 
        //Call the REST API to search meals by the main ingredient "pasta" and store the results
        final List<MealInfo> results = mealSearchService.getMealByNameOrIngredient("pasta");
        //Assert that the results list is not empty
        Assert.assertFalse(results.isEmpty());
        //Iterate through all meals in the results
        for (MealInfo meal : results) {
            //Print meal ID, name and image to the console
            System.out.println
            (
                "MealInfo{idMeal='" + meal.getIdMeal() + "'\n, strMeal='" + meal.getStrMeal() + "'\n, strMealThumb='" + meal.getStrMealThumb() + "'\n}"
            );
        }
    }

    //Test searching with an invalid name or ingredient
    @Test
    public void testSearchMealByInvalidNameOrIngredient() throws MealAPIException 
    {
        //Initialize the service
        final MealAPIService mealSearchService = new MealAPIService("https://www.themealdb.com/"); 
        //Attempt to search with a name unlikely to exist
        final List<MealInfo> results = mealSearchService.getMealByNameOrIngredient("watermelon");
        //Print user-friendly message
        System.out.println("There is neither a meal with that name nor that specific ingredient. Please, enter the name of a meal or the name of a specific ingredient in a meal again.");
        //Assert that no meals were returned
        Assert.assertTrue(results.isEmpty());
    }

    //Test searching meals by a valid numeric ID
    @Test
    public void testSearchMealByID() throws MealAPIException 
    {
        //Initialize service
        final MealAPIService mealSearchService = new MealAPIService("https://www.themealdb.com/"); 
        //Search for a meal using its ID
        final List<MealInfo> results = mealSearchService.getSpecificMeal("52772");
        //Assert that at least one result was returned
        Assert.assertFalse(results.isEmpty());
        //Print detailed information for each meal
        for (MealInfo meal : results) 
        {
            System.out.println("MealInfo{idMeal='" + meal.getIdMeal() + "', strMeal='" + meal.getStrMeal() + "', strMealAlternate='" + meal.getStrMealAlternate() + "', strCategory='" + meal.getStrCategory() + "', strArea='" + meal.getStrArea() + "', strInstructions='" + meal.getStrInstructions() + "', strMealThumb='" + meal.getStrMealThumb() + "', strTags='" + meal.getStrTags() + "', strYoutube='" + meal.getStrYoutube() + "', strIngredient1='" + meal.getStrIngredient1() + "', strIngredient2='" + meal.getStrIngredient2() + "', strIngredient3='" + meal.getStrIngredient3() + "', strIngredient4='" + meal.getStrIngredient4() + "', strIngredient5='" + meal.getStrIngredient5() + "', strIngredient6='" + meal.getStrIngredient6() + "', strIngredient7='" + meal.getStrIngredient7() + "', strIngredient8='" + meal.getStrIngredient8() + "', strIngredient9='" + meal.getStrIngredient9() + "', strIngredient10='" + meal.getStrIngredient10() + "', strIngredient11='" + meal.getStrIngredient11() + "', strIngredient12='" + meal.getStrIngredient12() + "', strIngredient13='" + meal.getStrIngredient13() + "', strIngredient14='" + meal.getStrIngredient14() + "', strIngredient15='" + meal.getStrIngredient15() + "', strIngredient16='" + meal.getStrIngredient16() + "', strIngredient17='" + meal.getStrIngredient17() + "', strIngredient18='" + meal.getStrIngredient18() + "', strIngredient19='" + meal.getStrIngredient19() + "', strIngredient20='" + meal.getStrIngredient20() + "', strMeasure1='" + meal.getStrMeasure1() + "', strMeasure2='" + meal.getStrMeasure2() + "', strMeasure3='" + meal.getStrMeasure3() + "', strMeasure4='" + meal.getStrMeasure4() + "', strMeasure5='" + meal.getStrMeasure5() + "', strMeasure6='" + meal.getStrMeasure6() + "', strMeasure7='" + meal.getStrMeasure7() + "', strMeasure8='" + meal.getStrMeasure8() + "', strMeasure9='" + meal.getStrMeasure9() + "', strMeasure10='" + meal.getStrMeasure10() + "', strMeasure11='" + meal.getStrMeasure11() + "', strMeasure12='" + meal.getStrMeasure12() + "', strMeasure13='" + meal.getStrMeasure13() + "', strMeasure14='" + meal.getStrMeasure14() + "', strMeasure15='" + meal.getStrMeasure15() + "', strMeasure16='" + meal.getStrMeasure16() + "', strMeasure17='" + meal.getStrMeasure17() + "', strMeasure18='" + meal.getStrMeasure18() + "', strMeasure19='" + meal.getStrMeasure19() + "', strMeasure20='" + meal.getStrMeasure20() + "', strSource='" + meal.getStrSource() + "', strImageSource='" + meal.getStrImageSource() + "', strCreativeCommonsConfirmed='" + meal.getStrCreativeCommonsConfirmed() + "', dateModified='" + meal.getDateModified() + "'}");
        }
    }

    //Test searching meals with an invalid numeric ID
    @Test
    public void testSearchMealByInvalidNumericID() throws MealAPIException 
    {
        //Initialize service
        final MealAPIService mealSearchService = new MealAPIService("https://www.themealdb.com/"); 
        //Attempt to fetch a meal using a non-existent numeric ID
        final List<MealInfo> results = mealSearchService.getSpecificMeal("12345");
        //Print message to indicate invalid ID
        System.out.println("There is no a meal with that ID. Please, enter the ID of a meal again.");
        //Assert that the returned list is empty
        Assert.assertTrue(results.isEmpty());
    }

    //Test searching meals with an invalid string ID
    @Test
    public void testSearchMealByInvalidStringID() throws MealAPIException 
    {
        //Initialize service
        final MealAPIService mealSearchService = new MealAPIService("https://www.themealdb.com/"); 
        //Attempt to fetch a meal using an invalid string ID
        final List<MealInfo> results = mealSearchService.getSpecificMeal("grape");
        //Print message indicating an error calling the API
        System.out.println("Error calling Meal API");
        //Assert that the returned list is empty
        Assert.assertTrue(results.isEmpty());
    }

    //Test retrieving a random meal
    @Test
    public void testSearchMealRandom() throws MealAPIException 
    {
        //Initialize service
        final MealAPIService mealSearchService = new MealAPIService("https://www.themealdb.com/"); 
        //Call API to get a random meal
        final List<MealInfo> results = mealSearchService.getRandomMeal();
        //Assert that at least one meal is returned
        Assert.assertFalse(results.isEmpty());
        //Print the random meal(s) to the console
        results.forEach(System.out::println);
    }
}
