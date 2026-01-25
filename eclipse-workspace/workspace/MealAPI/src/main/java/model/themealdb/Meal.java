//Defines the package where this class belongs
package model.themealdb;

//Imports the LinkedHashMap class for storing key-value pairs in insertion order
import java.util.LinkedHashMap;

//Imports the generic Map interface for key-value pair mappings
import java.util.Map;

//Imports Jackson annotation to include additional JSON properties dynamically during serialization
import com.fasterxml.jackson.annotation.JsonAnyGetter;

//Imports Jackson annotation to set additional JSON properties dynamically during deserialization
import com.fasterxml.jackson.annotation.JsonAnySetter;

//Imports Jackson annotation to ignore fields during JSON serialization/deserialization
import com.fasterxml.jackson.annotation.JsonIgnore;

//Imports Jackson annotation to control whether null fields are included in JSON
import com.fasterxml.jackson.annotation.JsonInclude;

//Imports Jackson annotation to explicitly map JSON properties to Java fields
import com.fasterxml.jackson.annotation.JsonProperty;

//Imports Jackson annotation to specify the order of JSON properties when serializing
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//Ensures that only fields that are not null are included when serializing this object to JSON
@JsonInclude(JsonInclude.Include.NON_NULL)

//Specifies the order in which properties will appear when this object is serialized to JSON
@JsonPropertyOrder
(
	{
		//Maps the "idMeal" property in JSON to the corresponding Java field
		"idMeal",
		//Maps the "strMeal" property in JSON to the corresponding Java field
		"strMeal",
		//Maps the "strMealAlternate" property in JSON to the corresponding Java field
		"strMealAlternate",
		//Maps the "strCategory" property in JSON to the corresponding Java field
		"strCategory",
		//Maps the "strArea" property in JSON to the corresponding Java field
		"strArea",
		//Maps the "strInstructions" property in JSON to the corresponding Java field
		"strInstructions",
		//Maps the "strMealThumb" property in JSON to the corresponding Java field
		"strMealThumb",
		//Maps the "strTags" property in JSON to the corresponding Java field
		"strTags",
		//Maps the "strYoutube" property in JSON to the corresponding Java field
		"strYoutube",
		//Maps the first ingredient property in JSON to the corresponding Java field
		"strIngredient1",
		//Maps the second ingredient property in JSON to the corresponding Java field
		"strIngredient2",
		//Maps the third ingredient property in JSON to the corresponding Java field
		"strIngredient3",
		//Maps the fourth ingredient property in JSON to the corresponding Java field
		"strIngredient4",
		//Maps the fifth ingredient property in JSON to the corresponding Java field
		"strIngredient5",
		//Maps the sixth ingredient property in JSON to the corresponding Java field
		"strIngredient6",
		//Maps the seventh ingredient property in JSON to the corresponding Java field
		"strIngredient7",
		//Maps the eighth ingredient property in JSON to the corresponding Java field
		"strIngredient8",
		//Maps the ninth ingredient property in JSON to the corresponding Java field
		"strIngredient9",
		//Maps the tenth ingredient property in JSON to the corresponding Java field
		"strIngredient10",
		//Maps the eleventh ingredient property in JSON to the corresponding Java field
		"strIngredient11",
		//Maps the twelfth ingredient property in JSON to the corresponding Java field
		"strIngredient12",
		//Maps the thirteenth ingredient property in JSON to the corresponding Java field
		"strIngredient13",
		//Maps the fourteenth ingredient property in JSON to the corresponding Java field
		"strIngredient14",
		//Maps the fifteenth ingredient property in JSON to the corresponding Java field
		"strIngredient15",
		//Maps the sixteenth ingredient property in JSON to the corresponding Java field
		"strIngredient16",
		//Maps the seventeenth ingredient property in JSON to the corresponding Java field
		"strIngredient17",
		//Maps the eighteenth ingredient property in JSON to the corresponding Java field
		"strIngredient18",
		//Maps the nineteenth ingredient property in JSON to the corresponding Java field
		"strIngredient19",
		//Maps the twentieth ingredient property in JSON to the corresponding Java field
		"strIngredient20",
		//Maps the first measure property in JSON to the corresponding Java field
		"strMeasure1",
		//Maps the second measure property in JSON to the corresponding Java field
		"strMeasure2",
		//Maps the third measure property in JSON to the corresponding Java field
		"strMeasure3",
		//Maps the fourth measure property in JSON to the corresponding Java field
		"strMeasure4",
		//Maps the fifth measure property in JSON to the corresponding Java field
		"strMeasure5",
		//Maps the sixth measure property in JSON to the corresponding Java field
		"strMeasure6",
		//Maps the seventh measure property in JSON to the corresponding Java field
		"strMeasure7",
		//Maps the eighth measure property in JSON to the corresponding Java field
		"strMeasure8",
		//Maps the ninth measure property in JSON to the corresponding Java field
		"strMeasure9",
		//Maps the tenth measure property in JSON to the corresponding Java field
		"strMeasure10",
		//Maps the eleventh measure property in JSON to the corresponding Java field
		"strMeasure11",
		//Maps the twelfth measure property in JSON to the corresponding Java field
		"strMeasure12",
		//Maps the thirteenth measure property in JSON to the corresponding Java field
		"strMeasure13",
		//Maps the fourteenth measure property in JSON to the corresponding Java field
		"strMeasure14",
		//Maps the fifteenth measure property in JSON to the corresponding Java field
		"strMeasure15",
		//Maps the sixteenth measure property in JSON to the corresponding Java field
		"strMeasure16",
		//Maps the seventeenth measure property in JSON to the corresponding Java field
		"strMeasure17",
		//Maps the eighteenth measure property in JSON to the corresponding Java field
		"strMeasure18",
		//Maps the nineteenth measure property in JSON to the corresponding Java field
		"strMeasure19",
		//Maps the twentieth measure property in JSON to the corresponding Java field
		"strMeasure20",
		//Maps the source property in JSON to the corresponding Java field
		"strSource",
		//Maps the image source property in JSON to the corresponding Java field
		"strImageSource",
		//Maps the Creative Commons confirmation property in JSON to the corresponding Java field
		"strCreativeCommonsConfirmed",
		//Maps the date modified property in JSON to the corresponding Java field
		"dateModified"
	}
)

//Defines the class representing a Meal object retrieved from TheMealDB API
public class Meal 
{

	//Maps the "idMeal" JSON property to this field, storing the unique meal ID
	@JsonProperty("idMeal")
	private String idMeal;
	
	//Maps the "strMeal" JSON property to this field, storing the meal name
	@JsonProperty("strMeal")
	private String strMeal;
	
	//Maps the "strMealAlternate" JSON property to this field, storing an alternate name for the meal
	@JsonProperty("strMealAlternate")
	private String strMealAlternate;
	
	//Maps the "strCategory" JSON property to this field, storing the meal category (e.g., "Dessert")
	@JsonProperty("strCategory")
	private String strCategory;
	
	//Maps the "strArea" JSON property to this field, storing the region or cuisine type (e.g., "Italian")
	@JsonProperty("strArea")
	private String strArea;
	
	//Maps the "strInstructions" JSON property to this field, storing cooking instructions
	@JsonProperty("strInstructions")
	private String strInstructions;
	
	//Maps the "strMealThumb" JSON property to this field, storing the URL of the meal's thumbnail image
	@JsonProperty("strMealThumb")
	private String strMealThumb;
	
	//Maps the "strTags" JSON property to this field, storing tags for the meal (comma-separated)
	@JsonProperty("strTags")
	private String strTags;
	
	//Maps the "strYoutube" JSON property to this field, storing the YouTube link for a cooking video
	@JsonProperty("strYoutube")
	private String strYoutube;
	
	//Maps the "strIngredient1" JSON property to this field, storing the first ingredient
	@JsonProperty("strIngredient1")
	private String strIngredient1;
	
	//Maps the "strIngredient2" JSON property to this field, storing the second ingredient
	@JsonProperty("strIngredient2")
	private String strIngredient2;
	
	//Maps the "strIngredient3" JSON property to this field, storing the third ingredient
	@JsonProperty("strIngredient3")
	private String strIngredient3;
	
	//Maps the "strIngredient4" JSON property to this field, storing the fourth ingredient
	@JsonProperty("strIngredient4")
	private String strIngredient4;
	
	//Maps the "strIngredient5" JSON property to this field, storing the fifth ingredient
	@JsonProperty("strIngredient5")
	private String strIngredient5;
	
	//Maps the "strIngredient6" JSON property to this field, storing the sixth ingredient
	@JsonProperty("strIngredient6")
	private String strIngredient6;
	
	//Maps the "strIngredient7" JSON property to this field, storing the seventh ingredient
	@JsonProperty("strIngredient7")
	private String strIngredient7;
	
	//Maps the "strIngredient8" JSON property to this field, storing the eighth ingredient
	@JsonProperty("strIngredient8")
	private String strIngredient8;
	
	//Maps the "strIngredient9" JSON property to this field, storing the ninth ingredient
	@JsonProperty("strIngredient9")
	private String strIngredient9;
	
	//Maps the "strIngredient10" JSON property to this field, storing the tenth ingredient
	@JsonProperty("strIngredient10")
	private String strIngredient10;
	
	//Maps the "strIngredient11" JSON property to this field, storing the eleventh ingredient
	@JsonProperty("strIngredient11")
	private String strIngredient11;
	
	//Maps the "strIngredient12" JSON property to this field, storing the twelfth ingredient
	@JsonProperty("strIngredient12")
	private String strIngredient12;
	
	//Maps the "strIngredient13" JSON property to this field, storing the thirteenth ingredient
	@JsonProperty("strIngredient13")
	private String strIngredient13;
	
	//Maps the "strIngredient14" JSON property to this field, storing the fourteenth ingredient
	@JsonProperty("strIngredient14")
	private String strIngredient14;
	
	//Maps the "strIngredient15" JSON property to this field, storing the fifteenth ingredient
	@JsonProperty("strIngredient15")
	private String strIngredient15;
	
	//Maps the "strIngredient16" JSON property to this field, storing the sixteenth ingredient
	@JsonProperty("strIngredient16")
	private String strIngredient16;
	
	//Maps the "strIngredient17" JSON property to this field, storing the seventeenth ingredient
	@JsonProperty("strIngredient17")
	private String strIngredient17;
	
	//Maps the "strIngredient18" JSON property to this field, storing the eighteenth ingredient
	@JsonProperty("strIngredient18")
	private String strIngredient18;
	
	//Maps the "strIngredient19" JSON property to this field, storing the nineteenth ingredient
	@JsonProperty("strIngredient19")
	private String strIngredient19;
	
	//Maps the "strIngredient20" JSON property to this field, storing the twentieth ingredient
	@JsonProperty("strIngredient20")
	private String strIngredient20;
	
	//Maps the "strMeasure1" JSON property to this field, storing the measurement for ingredient 1
	@JsonProperty("strMeasure1")
	private String strMeasure1;
	
	//Maps the "strMeasure2" JSON property to this field, storing the measurement for ingredient 2
	@JsonProperty("strMeasure2")
	private String strMeasure2;
	
	//Maps the "strMeasure3" JSON property to this field, storing the measurement for ingredient 3
	@JsonProperty("strMeasure3")
	private String strMeasure3;
	
	//Maps the "strMeasure4" JSON property to this field, storing the measurement for ingredient 4
	@JsonProperty("strMeasure4")
	private String strMeasure4;
	
	//Maps the "strMeasure5" JSON property to this field, storing the measurement for ingredient 5
	@JsonProperty("strMeasure5")
	private String strMeasure5;
	
	//Maps the "strMeasure6" JSON property to this field, storing the measurement for ingredient 6
	@JsonProperty("strMeasure6")
	private String strMeasure6;
	
	//Maps the "strMeasure7" JSON property to this field, storing the measurement for ingredient 7
	@JsonProperty("strMeasure7")
	private String strMeasure7;
	
	//Maps the "strMeasure8" JSON property to this field, storing the measurement for ingredient 8
	@JsonProperty("strMeasure8")
	private String strMeasure8;
	
	//Maps the "strMeasure9" JSON property to this field, storing the measurement for ingredient 9
	@JsonProperty("strMeasure9")
	private String strMeasure9;
	
	//Maps the "strMeasure10" JSON property to this field, storing the measurement for ingredient 10
	@JsonProperty("strMeasure10")
	private String strMeasure10;
	
	//Maps the "strMeasure11" JSON property to this field, storing the measurement for ingredient 11
	@JsonProperty("strMeasure11")
	private String strMeasure11;
	
	//Maps the "strMeasure12" JSON property to this field, storing the measurement for ingredient 12
	@JsonProperty("strMeasure12")
	private String strMeasure12;
	
	//Maps the "strMeasure13" JSON property to this field, storing the measurement for ingredient 13
	@JsonProperty("strMeasure13")
	private String strMeasure13;
	
	//Maps the "strMeasure14" JSON property to this field, storing the measurement for ingredient 14
	@JsonProperty("strMeasure14")
	private String strMeasure14;
	
	//Maps the "strMeasure15" JSON property to this field, storing the measurement for ingredient 15
	@JsonProperty("strMeasure15")
	private String strMeasure15;
	
	//Maps the "strMeasure16" JSON property to this field, storing the measurement for ingredient 16
	@JsonProperty("strMeasure16")
	private String strMeasure16;
	
	//Maps the "strMeasure17" JSON property to this field, storing the measurement for ingredient 17
	@JsonProperty("strMeasure17")
	private String strMeasure17;
	
	//Maps the "strMeasure18" JSON property to this field, storing the measurement for ingredient 18
	@JsonProperty("strMeasure18")
	private String strMeasure18;
	
	//Maps the "strMeasure19" JSON property to this field, storing the measurement for ingredient 19
	@JsonProperty("strMeasure19")
	private String strMeasure19;
	
	//Maps the "strMeasure20" JSON property to this field, storing the measurement for ingredient 20
	@JsonProperty("strMeasure20")
	private String strMeasure20;
	
	//Maps the "strSource" JSON property to this field, storing the source URL of the recipe
	@JsonProperty("strSource")
	private String strSource;
	
	//Maps the "strImageSource" JSON property to this field, storing the image source URL
	@JsonProperty("strImageSource")
	private String strImageSource;
	
	//Maps the "strCreativeCommonsConfirmed" JSON property to this field, confirming CC license if applicable
	@JsonProperty("strCreativeCommonsConfirmed")
	private String strCreativeCommonsConfirmed;
	
	//Maps the "dateModified" JSON property to this field, storing the date when the meal was last modified
	@JsonProperty("dateModified")
	private String dateModified;
	
	//Ignores this field during JSON serialization/deserialization; used to store any extra properties dynamically
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	
	//Getters and setters for all fields below.
	//Each getter allows Jackson to read the JSON value.
	//Each setter allows Jackson to populate the field when deserializing JSON.
	
	//Returns the meal's unique ID mapped from the "idMeal" JSON property
	@JsonProperty("idMeal")
	public String getIdMeal() 
	{
		return idMeal;
	}
	
	//Sets the meal's unique ID, mapping it to the "idMeal" JSON property
	@JsonProperty("idMeal")
	public void setIdMeal(String idMeal) 
	{
		this.idMeal = idMeal;
	}
	
	//Returns the meal's name mapped from the "strMeal" JSON property
	@JsonProperty("strMeal")
	public String getStrMeal() 
	{
		return strMeal;
	}
	
	//Sets the meal's name, mapping it to the "strMeal" JSON property
	@JsonProperty("strMeal")
	public void setStrMeal(String strMeal) 
	{
		this.strMeal = strMeal;
	}
	
	//Returns the alternate name of the meal mapped from "strMealAlternate"
	@JsonProperty("strMealAlternate")
	public String getStrMealAlternate() 
	{
		return strMealAlternate;
	}
	
	//Sets the alternate name of the meal mapped to "strMealAlternate"
	@JsonProperty("strMealAlternate")
	public void setStrMealAlternate(String strMealAlternate) 
	{
		this.strMealAlternate = strMealAlternate;
	}
	
	//Returns the meal's category (e.g., "Dessert") from "strCategory"
	@JsonProperty("strCategory")
	public String getStrCategory() 
	{
		return strCategory;
	}
	
	//Sets the meal's category, mapping it to "strCategory"
	@JsonProperty("strCategory")
	public void setStrCategory(String strCategory) 
	{
		this.strCategory = strCategory;
	}
	
	//Returns the region or cuisine type (e.g., "Italian") from "strArea"
	@JsonProperty("strArea")
	public String getStrArea() 
	{
		return strArea;
	}
	
	//Sets the region or cuisine type of the meal
	@JsonProperty("strArea")
	public void setStrArea(String strArea) 
	{
		this.strArea = strArea;
	}
	
	//Returns cooking instructions mapped from "strInstructions"
	@JsonProperty("strInstructions")
	public String getStrInstructions() 
	{
		return strInstructions;
	}
	
	//Sets cooking instructions mapped to "strInstructions"
	@JsonProperty("strInstructions")
	public void setStrInstructions(String strInstructions) 
	{
		this.strInstructions = strInstructions;
	}
	
	//Returns the URL of the meal's thumbnail image
	@JsonProperty("strMealThumb")
	public String getStrMealThumb() 
	{
		return strMealThumb;
	}
	
	//Sets the URL of the meal's thumbnail image
	@JsonProperty("strMealThumb")
	public void setStrMealThumb(String strMealThumb) 
	{
		this.strMealThumb = strMealThumb;
	}
	
	//Returns tags associated with the meal (comma-separated)
	@JsonProperty("strTags")
	public String getStrTags() 
	{
		return strTags;
	}
	
	//Sets tags associated with the meal
	@JsonProperty("strTags")
	public void setStrTags(String strTags) 
	{
		this.strTags = strTags;
	}
	
	//Returns the YouTube link for the meal's cooking video
	@JsonProperty("strYoutube")
	public String getStrYoutube() 
	{
		return strYoutube;
	}
	
	//Sets the YouTube link for the meal's cooking video
	@JsonProperty("strYoutube")
	public void setStrYoutube(String strYoutube) 
	{
		this.strYoutube = strYoutube;
	}
	
	//Returns the first ingredient of the meal
	public String getStrIngredient1() 
	{
		return strIngredient1;
	}
	
	//Sets the first ingredient of the meal
	public void setStrIngredient1(String strIngredient1) 
	{
		this.strIngredient1 = strIngredient1;
	}
	
	//Returns the second ingredient of the meal
	public String getStrIngredient2() 
	{
		return strIngredient2;
	}
	
	//Sets the second ingredient of the meal
	public void setStrIngredient2(String strIngredient2) 
	{
		this.strIngredient2 = strIngredient2;
	}
	
	//Returns the third ingredient of the meal
	public String getStrIngredient3() 
	{
		return strIngredient3;
	}
	
	//Sets the third ingredient of the meal
	public void setStrIngredient3(String strIngredient3) 
	{
		this.strIngredient3 = strIngredient3;
	}
	
	//Returns the fourth ingredient of the meal
	public String getStrIngredient4() 
	{
		return strIngredient4;
	}
	
	//Sets the fourth ingredient of the meal
	public void setStrIngredient4(String strIngredient4) 
	{
		this.strIngredient4 = strIngredient4;
	}
	
	//Returns the fifth ingredient of the meal
	public String getStrIngredient5() 
	{
		return strIngredient5;
	}
	
	//Sets the fifth ingredient of the meal
	public void setStrIngredient5(String strIngredient5) 
	{
		this.strIngredient5 = strIngredient5;
	}
	
	//Returns the sixth ingredient of the meal
	public String getStrIngredient6() 
	{
		return strIngredient6;
	}
	
	//Sets the sixth ingredient of the meal
	public void setStrIngredient6(String strIngredient6) 
	{
		this.strIngredient6 = strIngredient6;
	}
	
	//Returns the seventh ingredient of the meal
	public String getStrIngredient7() 
	{
		return strIngredient7;
	}
	
	//Sets the seventh ingredient of the meal
	public void setStrIngredient7(String strIngredient7) 
	{
		this.strIngredient7 = strIngredient7;
	}
	
	//Returns the eighth ingredient of the meal
	public String getStrIngredient8() 
	{
		return strIngredient8;
	}
	
	//Sets the eighth ingredient of the meal
	public void setStrIngredient8(String strIngredient8) 
	{
		this.strIngredient8 = strIngredient8;
	}
	
	//Returns the ninth ingredient of the meal
	public String getStrIngredient9() 
	{
		return strIngredient9;
	}
	
	//Sets the ninth ingredient of the meal
	public void setStrIngredient9(String strIngredient9) 
	{
		this.strIngredient9 = strIngredient9;
	}
	
	//Returns the tenth ingredient of the meal
	public String getStrIngredient10() 
	{
		return strIngredient10;
	}
	
	//Sets the tenth ingredient of the meal
	public void setStrIngredient10(String strIngredient10) 
	{
		this.strIngredient10 = strIngredient10;
	}
	
	//Returns the eleventh ingredient of the meal
	public String getStrIngredient11() 
	{
		return strIngredient11;
	}
	
	//Sets the eleventh ingredient of the meal
	public void setStrIngredient11(String strIngredient11) 
	{
		this.strIngredient11 = strIngredient11;
	}
	
	//Returns the twelfth ingredient of the meal
	public String getStrIngredient12() 
	{
		return strIngredient12;
	}
	
	//Sets the twelfth ingredient of the meal
	public void setStrIngredient12(String strIngredient12) 
	{
		this.strIngredient12 = strIngredient12;
	}
	
	//Returns the thirteenth ingredient of the meal
	public String getStrIngredient13() 
	{
		return strIngredient13;
	}
	
	//Sets the thirteenth ingredient of the meal
	public void setStrIngredient13(String strIngredient13) 
	{
		this.strIngredient13 = strIngredient13;
	}
	
	//Returns the fourteenth ingredient of the meal
	public String getStrIngredient14() 
	{
		return strIngredient14;
	}
	
	//Sets the fourteenth ingredient of the meal
	public void setStrIngredient14(String strIngredient14) 
	{
		this.strIngredient14 = strIngredient14;
	}
	
	//Returns the fifteenth ingredient of the meal
	public String getStrIngredient15() 
	{
		return strIngredient15;
	}
	
	//Sets the fifteenth ingredient of the meal
	public void setStrIngredient15(String strIngredient15) 
	{
		this.strIngredient15 = strIngredient15;
	}
	
	//Returns the sixteenth ingredient of the meal
	public String getStrIngredient16() 
	{
		return strIngredient16;
	}
	
	//Sets the sixteenth ingredient of the meal
	public void setStrIngredient16(String strIngredient16) 
	{
		this.strIngredient16 = strIngredient16;
	}
	
	//Returns the seventeenth ingredient of the meal
	public String getStrIngredient17() 
	{
		return strIngredient17;
	}
	
	//Sets the seventeenth ingredient of the meal
	public void setStrIngredient17(String strIngredient17) 
	{
		this.strIngredient17 = strIngredient17;
	}
	
	//Returns the eighteenth ingredient of the meal
	public String getStrIngredient18() 
	{
		return strIngredient18;
	}
	
	//Sets the eighteenth ingredient of the meal
	public void setStrIngredient18(String strIngredient18) 
	{
		this.strIngredient18 = strIngredient18;
	}
	
	//Returns the nineteenth ingredient of the meal
	public String getStrIngredient19() 
	{
		return strIngredient19;
	}
	
	//Sets the nineteenth ingredient of the meal
	public void setStrIngredient19(String strIngredient19) 
	{
		this.strIngredient19 = strIngredient19;
	}
	
	//Returns the twentieth ingredient of the meal
	public String getStrIngredient20() 
	{
		return strIngredient20;
	}
	
	//Sets the twentieth ingredient of the meal
	public void setStrIngredient20(String strIngredient20) 
	{
		this.strIngredient20 = strIngredient20;
	}
	
	//Returns the measurement for the first ingredient
	public String getStrMeasure1() 
	{
		return strMeasure1;
	}
	
	//Sets the measurement for the first ingredient
	public void setStrMeasure1(String strMeasure1) 
	{
		this.strMeasure1 = strMeasure1;
	}
	
	//Returns the measurement for the second ingredient
	public String getStrMeasure2() 
	{
		return strMeasure2;
	}
	
	//Sets the measurement for the second ingredient
	public void setStrMeasure2(String strMeasure2) 
	{
		this.strMeasure2 = strMeasure2;
	}
	
	//Returns the measurement for the third ingredient
	public String getStrMeasure3() 
	{
		return strMeasure3;
	}
	
	//Sets the measurement for the third ingredient
	public void setStrMeasure3(String strMeasure3)
	{
		this.strMeasure3 = strMeasure3;
	}
	
	//Returns the measurement for the fourth ingredient
	public String getStrMeasure4() 
	{
		return strMeasure4;
	}
	
	//Sets the measurement for the fourth ingredient
	public void setStrMeasure4(String strMeasure4) 
	{
		this.strMeasure4 = strMeasure4;
	}
	
	//Returns the measurement for the fifth ingredient
	public String getStrMeasure5() 
	{
		return strMeasure5;
	}
	
	//Sets the measurement for the fifth ingredient
	public void setStrMeasure5(String strMeasure5) 
	{
		this.strMeasure5 = strMeasure5;
	}
	
	//Returns the measurement for the sixth ingredient
	public String getStrMeasure6() 
	{
		return strMeasure6;
	}
	
	//Sets the measurement for the sixth ingredient
	public void setStrMeasure6(String strMeasure6) 
	{
		this.strMeasure6 = strMeasure6;
	}
	
	//Returns the measurement for the seventh ingredient
	public String getStrMeasure7() 
	{
		return strMeasure7;
	}
	
	//Sets the measurement for the seventh ingredient
	public void setStrMeasure7(String strMeasure7) 
	{
		this.strMeasure7 = strMeasure7;
	}
	
	//Returns the measurement for the eighth ingredient
	public String getStrMeasure8() 
	{
		return strMeasure8;
	}
	
	//Sets the measurement for the eighth ingredient
	public void setStrMeasure8(String strMeasure8) 
	{
		this.strMeasure8 = strMeasure8;
	}
	
	//Returns the measurement for the ninth ingredient
	public String getStrMeasure9() 
	{
		return strMeasure9;
	}
	
	//Sets the measurement for the ninth ingredient
	public void setStrMeasure9(String strMeasure9) 
	{
		this.strMeasure9 = strMeasure9;
	}
	
	//Returns the measurement for the tenth ingredient
	public String getStrMeasure10() 
	{
		return strMeasure10;
	}
	
	//Sets the measurement for the tenth ingredient
	public void setStrMeasure10(String strMeasure10) 
	{
		this.strMeasure10 = strMeasure10;
	}
	
	//Returns the measurement for the eleventh ingredient
	public String getStrMeasure11() 
	{
		return strMeasure11;
	}
	
	//Sets the measurement for the eleventh ingredient
	public void setStrMeasure11(String strMeasure11) 
	{
		this.strMeasure11 = strMeasure11;
	}
	
	//Returns the measurement for the twelfth ingredient
	public String getStrMeasure12() 
	{
		return strMeasure12;
	}
	
	//Sets the measurement for the twelfth ingredient
	public void setStrMeasure12(String strMeasure12) 
	{
		this.strMeasure12 = strMeasure12;
	}
	
	//Returns the measurement for the thirteenth ingredient
	public String getStrMeasure13() 
	{
		return strMeasure13;
	}
	
	//Sets the measurement for the thirteenth ingredient
	public void setStrMeasure13(String strMeasure13) 
	{
		this.strMeasure13 = strMeasure13;
	}
	
	//Returns the measurement for the fourteenth ingredient
	public String getStrMeasure14() 
	{
		return strMeasure14;
	}
	
	//Sets the measurement for the fourteenth ingredient
	public void setStrMeasure14(String strMeasure14) 
	{
		this.strMeasure14 = strMeasure14;
	}
	
	//Returns the measurement for the fifteenth ingredient
	public String getStrMeasure15() {
		return strMeasure15;
	}
	
	//Sets the measurement for the fifteenth ingredient
	public void setStrMeasure15(String strMeasure15) 
	{
		this.strMeasure15 = strMeasure15;
	}
	
	//Returns the measurement for the sixteenth ingredient
	public String getStrMeasure16() 
	{
		return strMeasure16;
	}
	
	//Sets the measurement for the sixteenth ingredient
	public void setStrMeasure16(String strMeasure16) 
	{
		this.strMeasure16 = strMeasure16;
	}
	
	//Returns the measurement for the seventeenth ingredient
	public String getStrMeasure17() 
	{
		return strMeasure17;
	}
	
	//Sets the measurement for the seventeenth ingredient
	public void setStrMeasure17(String strMeasure17) 
	{
		this.strMeasure17 = strMeasure17;
	}
	
	//Returns the measurement for the eighteenth ingredient
	public String getStrMeasure18() 
	{
		return strMeasure18;
	}
	
	//Sets the measurement for the eighteenth ingredient
	public void setStrMeasure18(String strMeasure18) 
	{
		this.strMeasure18 = strMeasure18;
	}
	
	//Returns the measurement for the nineteenth ingredient
	public String getStrMeasure19() {
		return strMeasure19;
	}
	
	//Sets the measurement for the nineteenth ingredient
	public void setStrMeasure19(String strMeasure19) 
	{
		this.strMeasure19 = strMeasure19;
	}
	
	//Returns the measurement for the twentieth ingredient
	public String getStrMeasure20() 
	{
		return strMeasure20;
	}
	
	//Sets the measurement for the twentieth ingredient
	public void setStrMeasure20(String strMeasure20) 
	{
		this.strMeasure20 = strMeasure20;
	}
	
	//Returns the source URL of the recipe
	public String getStrSource() 
	{
		return strSource;
	}
	
	//Sets the source URL of the recipe
	public void setStrSource(String strSource) 
	{
		this.strSource = strSource;
	}
	
	//Returns the image source URL
	public String getStrImageSource() 
	{
		return strImageSource;
	}
	
	//Sets the image source URL
	public void setStrImageSource(String strImageSource) 
	{
		this.strImageSource = strImageSource;
	}
	
	//Returns the Creative Commons confirmation string
	public String getStrCreativeCommonsConfirmed() 
	{
		return strCreativeCommonsConfirmed;
	}
	
	//Sets the Creative Commons confirmation string
	public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) 
	{
		this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
	}
	
	//Returns the last modification date of the meal
	@JsonProperty("dateModified")
	public String getDateModified() 
	{
		return dateModified;
	}
	
	//Sets the last modification date of the meal
	@JsonProperty("dateModified")
	public void setDateModified(String dateModified) 
	{
		this.dateModified = dateModified;
	}
	
	//Returns the map of additional properties not explicitly mapped in the class
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() 
	{
		return this.additionalProperties;
	}
	
	//Sets a single additional property in the map
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) 
	{
		this.additionalProperties.put(name, value);
	}
	
	//Replaces the whole map of additional properties
	public void setAdditionalProperties(Map<String, Object> additionalProperties) 
	{
		this.additionalProperties = additionalProperties;
	}

}
