//Class «Meal» belongs to package «model.themealdb»
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

//Specification of the order of properties during serialization to JSON
@JsonPropertyOrder
(
	{
		"idMeal",
		"strMeal",
		"strMealAlternate",
		"strCategory",
		"strArea",
		"strInstructions",
		"strMealThumb",
		"strTags",
		"strYoutube",
		"strIngredient1",
		"strIngredient2",
		"strIngredient3",
		"strIngredient4",
		"strIngredient5",
		"strIngredient6",
		"strIngredient7",
		"strIngredient8",
		"strIngredient9",
		"strIngredient10",
		"strIngredient11",
		"strIngredient12",
		"strIngredient13",
		"strIngredient14",
		"strIngredient15",
		"strIngredient16",
		"strIngredient17",
		"strIngredient18",
		"strIngredient19",
		"strIngredient20",
		"strMeasure1",
		"strMeasure2",
		"strMeasure3",
		"strMeasure4",
		"strMeasure5",
		"strMeasure6",
		"strMeasure7",
		"strMeasure8",
		"strMeasure9",
		"strMeasure10",
		"strMeasure11",
		"strMeasure12",
		"strMeasure13",
		"strMeasure14",
		"strMeasure15",
		"strMeasure16",
		"strMeasure17",
		"strMeasure18",
		"strMeasure19",
		"strMeasure20",
		"strSource",
		"strImageSource",
		"strCreativeCommonsConfirmed",
		"dateModified"
	}
)

//Class «Meal» for the representation of meals from the REST API
public class Meal 
{

	//Mapping of the "idMeal" JSON property to this field, storing meal ID
	@JsonProperty("idMeal")
	private String idMeal;
	
	//Mapping of the "strMeal" JSON property to this field, storing meal name
	@JsonProperty("strMeal")
	private String strMeal;
	
	//Mapping of the "strMealAlternate" JSON property to this field, storing alternate meal
	@JsonProperty("strMealAlternate")
	private String strMealAlternate;
	
	//Mapping of the "strCategory" JSON property to this field, storing meal category
	@JsonProperty("strCategory")
	private String strCategory;
	
	//Mapping of the "strArea" JSON property to this field, storing meal category
	@JsonProperty("strArea")
	private String strArea;
	
	//Mapping of the "strInstructions" JSON property to this field, storing meal instructions
	@JsonProperty("strInstructions")
	private String strInstructions;
	
	//Mapping of the "strMealThumb" JSON property to this field, storing meal image link
	@JsonProperty("strMealThumb")
	private String strMealThumb;
	
	//Mapping of the "strTags" JSON property to this field, storing igredients category of meal
	@JsonProperty("strTags")
	private String strTags;
	
	//Mapping of the "strYoutube" JSON property to this field, storing YouTube link
	@JsonProperty("strYoutube")
	private String strYoutube;
	
	//Mapping of the "strIngredient1" JSON property to this field, storing first ingredient of meal
	@JsonProperty("strIngredient1")
	private String strIngredient1;
	
	//Mapping of the "strIngredient2" JSON property to this field, storing the second ingredient of meal
	@JsonProperty("strIngredient2")
	private String strIngredient2;
	
	//Mapping of the "strIngredient3" JSON property to this field, storing the third ingredient of meal
	@JsonProperty("strIngredient3")
	private String strIngredient3;
	
	//Mapping of the "strIngredient4" JSON property to this field, storing the fourth ingredient of meal
	@JsonProperty("strIngredient4")
	private String strIngredient4;
	
	//Mapping of the "strIngredient5" JSON property to this field, storing the fifth ingredient of meal
	@JsonProperty("strIngredient5")
	private String strIngredient5;
	
	//Mapping of the "strIngredient6" JSON property to this field, storing the sixth ingredient of meal
	@JsonProperty("strIngredient6")
	private String strIngredient6;
	
	//Mapping of the "strIngredient7" JSON property to this field, storing the seventh ingredient of meal
	@JsonProperty("strIngredient7")
	private String strIngredient7;
	
	//Mapping of the "strIngredient8" JSON property to this field, storing the eighth ingredient of meal
	@JsonProperty("strIngredient8")
	private String strIngredient8;
	
	//Mapping of the "strIngredient9" JSON property to this field, storing the ninth ingredient of meal
	@JsonProperty("strIngredient9")
	private String strIngredient9;
	
	//Mapping of the "strIngredient10" JSON property to this field, storing the tenth ingredient of meal
	@JsonProperty("strIngredient10")
	private String strIngredient10;
	
	//Mapping of the "strIngredient11" JSON property to this field, storing the eleventh ingredient of meal
	@JsonProperty("strIngredient11")
	private String strIngredient11;
	
	//Mapping of the "strIngredient12" JSON property to this field, storing the twelfth ingredient of meal
	@JsonProperty("strIngredient12")
	private String strIngredient12;
	
	//Mapping of the "strIngredient13" JSON property to this field, storing the thirteenth ingredient of meal
	@JsonProperty("strIngredient13")
	private String strIngredient13;
	
	//Mapping of the "strIngredient14" JSON property to this field, storing the fourteenth ingredient of meal
	@JsonProperty("strIngredient14")
	private String strIngredient14;
	
	//Mapping of the "strIngredient15" JSON property to this field, storing the fifteenth ingredient of meal
	@JsonProperty("strIngredient15")
	private String strIngredient15;
	
	//Mapping of the "strIngredient16" JSON property to this field, storing the sixteenth ingredient of meal
	@JsonProperty("strIngredient16")
	private String strIngredient16;
	
	//Mapping of the "strIngredient17" JSON property to this field, storing the seventeenth ingredient of meal
	@JsonProperty("strIngredient17")
	private String strIngredient17;
	
	//Mapping of the "strIngredient18" JSON property to this field, storing the eighteenth ingredient of meal
	@JsonProperty("strIngredient18")
	private String strIngredient18;
	
	//Mapping of the "strIngredient19" JSON property to this field, storing the nineteenth ingredient of meal
	@JsonProperty("strIngredient19")
	private String strIngredient19;
	
	//Mapping of the "strIngredient20" JSON property to this field, storing the twentieth ingredient of meal
	@JsonProperty("strIngredient20")
	private String strIngredient20;
	
	//Mapping of the "strMeasure1" JSON property to this field, storing first ingredient measurement of meal
	@JsonProperty("strMeasure1")
	private String strMeasure1;
	
	//Mapping of the "strMeasure2" JSON property to this field, storing second ingredient measurement of meal
	@JsonProperty("strMeasure2")
	private String strMeasure2;
	
	//Mapping of the "strMeasure3" JSON property to this field, storing third ingredient measurement of meal
	@JsonProperty("strMeasure3")
	private String strMeasure3;
	
	//Mapping of the "strMeasure4" JSON property to this field, storing fourth ingredient measurement of meal
	@JsonProperty("strMeasure4")
	private String strMeasure4;
	
	//Mapping of the "strMeasure5" JSON property to this field, storing fifth ingredient measurement of meal
	@JsonProperty("strMeasure5")
	private String strMeasure5;
	
	//Mapping of the "strMeasure6" JSON property to this field, storing sixth ingredient measurement of meal
	@JsonProperty("strMeasure6")
	private String strMeasure6;
	
	//Mapping of the "strMeasure7" JSON property to this field, storing seventh ingredient measurement of meal
	@JsonProperty("strMeasure7")
	private String strMeasure7;
	
	//Mapping of the "strMeasure8" JSON property to this field, storing eighth ingredient measurement of meal
	@JsonProperty("strMeasure8")
	private String strMeasure8;
	
	//Mapping of the "strMeasure9" JSON property to this field, storing ninth ingredient measurement of meal
	@JsonProperty("strMeasure9")
	private String strMeasure9;
	
	//Mapping of the "strMeasure10" JSON property to this field, storing tenth ingredient measurement of meal
	@JsonProperty("strMeasure10")
	private String strMeasure10;
	
	//Mapping of the "strMeasure11" JSON property to this field, storing eleventh ingredient measurement of meal
	@JsonProperty("strMeasure11")
	private String strMeasure11;
	
	//Mapping of the "strMeasure12" JSON property to this field, storing twelfth ingredient measurement of meal
	@JsonProperty("strMeasure12")
	private String strMeasure12;
	
	//Mapping of the "strMeasure13" JSON property to this field, storing thirteenth ingredient measurement of meal
	@JsonProperty("strMeasure13")
	private String strMeasure13;
	
	//Mapping of the "strMeasure14" JSON property to this field, storing fourteenth ingredient measurement of meal
	@JsonProperty("strMeasure14")
	private String strMeasure14;
	
	//Mapping of the "strMeasure15" JSON property to this field, storing fifteenth ingredient measurement of meal
	@JsonProperty("strMeasure15")
	private String strMeasure15;
	
	//Mapping of the "strMeasure16" JSON property to this field, storing sixteenth ingredient measurement of meal
	@JsonProperty("strMeasure16")
	private String strMeasure16;
	
	//Mapping of the "strMeasure17" JSON property to this field, storing seventeenth ingredient measurement of meal
	@JsonProperty("strMeasure17")
	private String strMeasure17;
	
	//Mapping of the "strMeasure18" JSON property to this field, storing eighteenth ingredient measurement of meal
	@JsonProperty("strMeasure18")
	private String strMeasure18;
	
	//Mapping of the "strMeasure19" JSON property to this field, storing nineteenth ingredient measurement of meal
	@JsonProperty("strMeasure19")
	private String strMeasure19;
	
	//Mapping of the "strMeasure20" JSON property to this field, storing twentieth ingredient measurement of meal
	@JsonProperty("strMeasure20")
	private String strMeasure20;
	
	//Mapping of the "strSource" JSON property to this field, storing meal source
	@JsonProperty("strSource")
	private String strSource;
	
	//Mapping of the "strImageSource" JSON property to this field, storing image source
	@JsonProperty("strImageSource")
	private String strImageSource;
	
	//Mapping of the "strCreativeCommonsConfirmed" JSON property to this field, storing meal or meal source availability with license Creative Commons
	@JsonProperty("strCreativeCommonsConfirmed")
	private String strCreativeCommonsConfirmed;
	
	//Mapping of the "dateModified" JSON property to this field, storing the date of last modification of meal
	@JsonProperty("dateModified")
	private String dateModified;
	
	//Ignoration of this field in JSON serialization/deserialization
    //Storage of any extra JSON properties not explicitly defined above dynamically
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	
	//Return the meal ID mapped from the "idMeal" JSON property
	@JsonProperty("idMeal")
	public String getIdMeal() 
	{
		return idMeal;
	}
	
	//Set the meal ID, mapping it to the "idMeal" JSON property
	@JsonProperty("idMeal")
	public void setIdMeal(String idMeal) 
	{
		this.idMeal = idMeal;
	}
	
	//Return the meal name mapped from the "strMeal" JSON property
	@JsonProperty("strMeal")
	public String getStrMeal() 
	{
		return strMeal;
	}
	
	//Set the meal name, mapping it to the "strMeal" JSON property
	@JsonProperty("strMeal")
	public void setStrMeal(String strMeal) 
	{
		this.strMeal = strMeal;
	}
	
	//Return the alternate meal mapped from "strMealAlternate" JSON property
	@JsonProperty("strMealAlternate")
	public String getStrMealAlternate() 
	{
		return strMealAlternate;
	}
	
	//Set the alternate meal, mapping it to "strMealAlternate" JSON property
	@JsonProperty("strMealAlternate")
	public void setStrMealAlternate(String strMealAlternate) 
	{
		this.strMealAlternate = strMealAlternate;
	}
	
	//Return the meal category mapped from "strCategory" JSON property
	@JsonProperty("strCategory")
	public String getStrCategory() 
	{
		return strCategory;
	}
	
	//Set the meal category, mapping it to "strCategory" JSON property
	@JsonProperty("strCategory")
	public void setStrCategory(String strCategory) 
	{
		this.strCategory = strCategory;
	}
	
	//Return the meal origin country mapped from "strArea" JSON property
	@JsonProperty("strArea")
	public String getStrArea() 
	{
		return strArea;
	}
	
	//Set the meal origin country, mapping it to the "strArea" JSON property
	@JsonProperty("strArea")
	public void setStrArea(String strArea) 
	{
		this.strArea = strArea;
	}
	
	//Return the meal instructions mapped from "strInstructions" JSON property
	@JsonProperty("strInstructions")
	public String getStrInstructions() 
	{
		return strInstructions;
	}
	
	//Set the meal instructions, mapping it to the "strInstructions" JSON property
	@JsonProperty("strInstructions")
	public void setStrInstructions(String strInstructions) 
	{
		this.strInstructions = strInstructions;
	}
	
	//Return the meal link image, mapped from "strMealThumb" JSON property
	@JsonProperty("strMealThumb")
	public String getStrMealThumb() 
	{
		return strMealThumb;
	}
	
	//Set the meal link image, mapping it to the "strMealThumb" JSON property
	@JsonProperty("strMealThumb")
	public void setStrMealThumb(String strMealThumb) 
	{
		this.strMealThumb = strMealThumb;
	}
	
	//Return the ingredients category of meal, mapped from the "strTags" JSON property
	@JsonProperty("strTags")
	public String getStrTags() 
	{
		return strTags;
	}
	
	//Set the ingredients category of meal, mapped from the "strTags" JSON property
	@JsonProperty("strTags")
	public void setStrTags(String strTags) 
	{
		this.strTags = strTags;
	}
	
	//Return the YouTube link, mapped from the "strYouTube" JSON property
	@JsonProperty("strYoutube")
	public String getStrYoutube() 
	{
		return strYoutube;
	}
	
	//Set the YouTube link, mapping it to the "strYouTube" JSON property
	@JsonProperty("strYoutube")
	public void setStrYoutube(String strYoutube) 
	{
		this.strYoutube = strYoutube;
	}
	
	//Return the first ingredient of meal, mapped from the "strIngredient1" JSON property
	public String getStrIngredient1() 
	{
		return strIngredient1;
	}
	
	//Set the first ingredient of meal, mapping it to the "strIngredient1" JSON property
	public void setStrIngredient1(String strIngredient1) 
	{
		this.strIngredient1 = strIngredient1;
	}
	
	//Return the second ingredient of meal, mapped from the "strIngredient2" JSON property
	public String getStrIngredient2() 
	{
		return strIngredient2;
	}
	
	//Set the second ingredient of meal, mapping it to the "strIngredient2" JSON property
	public void setStrIngredient2(String strIngredient2) 
	{
		this.strIngredient2 = strIngredient2;
	}
	
	//Return the third ingredient of meal, mapped from the "strIngredient3" JSON property
	public String getStrIngredient3() 
	{
		return strIngredient3;
	}
	
	//Set the third ingredient of meal, mapping it to the "strIngredient3" JSON property
	public void setStrIngredient3(String strIngredient3) 
	{
		this.strIngredient3 = strIngredient3;
	}
	
	//Return the fourth ingredient of meal, mapped from the "strIngredient4" JSON property
	public String getStrIngredient4() 
	{
		return strIngredient4;
	}
	
	//Set the fourth ingredient of meal, mapping it to the "strIngredient4" JSON property
	public void setStrIngredient4(String strIngredient4) 
	{
		this.strIngredient4 = strIngredient4;
	}
	
	//Return the fifth ingredient of meal, mapped from the "strIngredient5" JSON property
	public String getStrIngredient5() 
	{
		return strIngredient5;
	}
	
	//Set the fifth ingredient of meal, mapping it to the "strIngredient5" JSON property
	public void setStrIngredient5(String strIngredient5) 
	{
		this.strIngredient5 = strIngredient5;
	}
	
	//Return the sixth ingredient of meal, mapped from the "strIngredient6" JSON property
	public String getStrIngredient6() 
	{
		return strIngredient6;
	}
	
	//Set the sixth ingredient of meal, mapping it to the "strIngredient6" JSON property
	public void setStrIngredient6(String strIngredient6) 
	{
		this.strIngredient6 = strIngredient6;
	}
	
	//Return the seventh ingredient of meal, mapped from the "strIngredient7" JSON property
	public String getStrIngredient7() 
	{
		return strIngredient7;
	}
	
	//Set the seventh ingredient of meal, mapping it to the "strIngredient7" JSON property
	public void setStrIngredient7(String strIngredient7) 
	{
		this.strIngredient7 = strIngredient7;
	}
	
	//Return the eighth ingredient of meal, mapped from the "strIngredient8" JSON property
	public String getStrIngredient8() 
	{
		return strIngredient8;
	}
	
	//Set the eighth ingredient of meal, mapping it to the "strIngredient8" JSON property
	public void setStrIngredient8(String strIngredient8) 
	{
		this.strIngredient8 = strIngredient8;
	}
	
	//Return the ninth ingredient of meal, mapped from the "strIngredient9" JSON property
	public String getStrIngredient9() 
	{
		return strIngredient9;
	}
	
	//Set the ninth ingredient of meal, mapping it to the "strIngredient9" JSON property
	public void setStrIngredient9(String strIngredient9) 
	{
		this.strIngredient9 = strIngredient9;
	}
	
	//Return the tenth ingredient of meal, mapped from the "strIngredient10" JSON property
	public String getStrIngredient10() 
	{
		return strIngredient10;
	}
	
	//Set the tenth ingredient of meal, mapping it to the "strIngredient10" JSON property
	public void setStrIngredient10(String strIngredient10) 
	{
		this.strIngredient10 = strIngredient10;
	}
	
	//Return the eleventh ingredient of meal, mapped from the "strIngredient11" JSON property
	public String getStrIngredient11() 
	{
		return strIngredient11;
	}
	
	//Set the eleventh ingredient of meal, mapping it to the "strIngredient11" JSON property
	public void setStrIngredient11(String strIngredient11) 
	{
		this.strIngredient11 = strIngredient11;
	}
	
	//Return the twelfth ingredient of meal, mapped from the "strIngredient12" JSON property
	public String getStrIngredient12() 
	{
		return strIngredient12;
	}
	
	//Set the twelfth ingredient of meal, mapping it to the "strIngredient12" JSON property
	public void setStrIngredient12(String strIngredient12) 
	{
		this.strIngredient12 = strIngredient12;
	}
	
	//Return the thirteenth ingredient of meal, mapped from the "strIngredient13" JSON property
	public String getStrIngredient13() 
	{
		return strIngredient13;
	}
	
	//Set the thirteenth ingredient of meal, mapping it to the "strIngredient13" JSON property
	public void setStrIngredient13(String strIngredient13) 
	{
		this.strIngredient13 = strIngredient13;
	}
	
	//Return the fourteenth ingredient of meal, mapped from the "strIngredient14" JSON property
	public String getStrIngredient14() 
	{
		return strIngredient14;
	}
	
	//Set the fourteenth ingredient of meal, mapping it to the "strIngredient14" JSON property
	public void setStrIngredient14(String strIngredient14) 
	{
		this.strIngredient14 = strIngredient14;
	}
	
	//Return the fifteenth ingredient of meal, mapped from the "strIngredient15" JSON property
	public String getStrIngredient15() 
	{
		return strIngredient15;
	}
	
	//Set the fifteenth ingredient of meal, mapping it to the "strIngredient15" JSON property
	public void setStrIngredient15(String strIngredient15) 
	{
		this.strIngredient15 = strIngredient15;
	}
	
	//Return the sixteenth ingredient of meal, mapped from the "strIngredient16" JSON property
	public String getStrIngredient16() 
	{
		return strIngredient16;
	}
	
	//Set the sixteenth ingredient of meal, mapping it to the "strIngredient16" JSON property
	public void setStrIngredient16(String strIngredient16) 
	{
		this.strIngredient16 = strIngredient16;
	}
	
	//Return the seventeenth ingredient of meal, mapped from "strIngredient17" JSON property
	public String getStrIngredient17() 
	{
		return strIngredient17;
	}
	
	//Set the seventeenth ingredient of meal, mapping it to the "strIngredient17" JSON property
	public void setStrIngredient17(String strIngredient17) 
	{
		this.strIngredient17 = strIngredient17;
	}
	
	//Return the eighteenth ingredient of meal, mapped from "strIngredient18" JSON property
	public String getStrIngredient18() 
	{
		return strIngredient18;
	}
	
	//Set the eighteenth ingredient of meal, mapping it to the "strIngredient18" JSON property
	public void setStrIngredient18(String strIngredient18) 
	{
		this.strIngredient18 = strIngredient18;
	}
	
	//Return the nineteenth ingredient of meal, mapped from the "strIngredient19" JSON property
	public String getStrIngredient19() 
	{
		return strIngredient19;
	}
	
	//Set the nineteenth ingredient of meal, mapping it to the "strIngredient19" JSON property
	public void setStrIngredient19(String strIngredient19) 
	{
		this.strIngredient19 = strIngredient19;
	}
	
	//Return the twentieth ingredient of meal, mapped from the "strIngredient20" JSON property
	public String getStrIngredient20() 
	{
		return strIngredient20;
	}
	
	//Set the twentieth ingredient of meal, mapping it to the "strIngredient20" JSON property
	public void setStrIngredient20(String strIngredient20) 
	{
		this.strIngredient20 = strIngredient20;
	}
	
	//Return first ingredient measurements of meal, mapped from the "strMeasure1" JSON property
	public String getStrMeasure1() 
	{
		return strMeasure1;
	}
	
	//Set the first ingredient measurements of meal, mapping it to the "strMeasure1" JSON property
	public void setStrMeasure1(String strMeasure1) 
	{
		this.strMeasure1 = strMeasure1;
	}
	
	//Return the second ingredient measurements of meal, mapped from the "strMeasure2" JSON property
	public String getStrMeasure2() 
	{
		return strMeasure2;
	}
	
	//Set the second ingredient measurements of meal, mapping it to the "strMeasure2" JSON property
	public void setStrMeasure2(String strMeasure2) 
	{
		this.strMeasure2 = strMeasure2;
	}
	
	//Return the third ingredient measurements of meal, mapped from the "strMeasure3" JSON property
	public String getStrMeasure3() 
	{
		return strMeasure3;
	}
	
	//Set the third ingredient measurements of meal, mapping it to the "strMeasure3" JSON property
	public void setStrMeasure3(String strMeasure3)
	{
		this.strMeasure3 = strMeasure3;
	}
	
	//Return the fourth ingredient measurements of meal, mapped from to the "strMeasure4" JSON property
	public String getStrMeasure4() 
	{
		return strMeasure4;
	}
	
	//Set the fourth ingredient measurements of meal, mapping it to the "strMeasure4" JSON property
	public void setStrMeasure4(String strMeasure4) 
	{
		this.strMeasure4 = strMeasure4;
	}
	
	//Return the fifth ingredient measurements of meal, mapped from to the "strMeasure5" JSON property
	public String getStrMeasure5() 
	{
		return strMeasure5;
	}
	
	//Set the fifth ingredient measurements of meal, mapping it to the "strMeasure5" JSON property
	public void setStrMeasure5(String strMeasure5) 
	{
		this.strMeasure5 = strMeasure5;
	}
	
	//Return the sixth ingredient measurements of meal, mapped from the "strMeasure6" JSON property
	public String getStrMeasure6() 
	{
		return strMeasure6;
	}
	
	//Set the sixth ingredient measurements of meal, mapping it to the "strMeasure6" JSON property
	public void setStrMeasure6(String strMeasure6) 
	{
		this.strMeasure6 = strMeasure6;
	}
	
	//Return the seventh ingredient measurements of meal, mapped from the "strMeasure7" JSON property
	public String getStrMeasure7() 
	{
		return strMeasure7;
	}
	
	//Set the seventh ingredient measurements of meal, mapping it to the "strMeasure7" JSON property
	public void setStrMeasure7(String strMeasure7) 
	{
		this.strMeasure7 = strMeasure7;
	}
	
	//Return the eighth ingredient measurements of meal, mapped from the "strMeasure8" JSON property
	public String getStrMeasure8() 
	{
		return strMeasure8;
	}
	
	//Set the eighth ingredient measurements of meal, mapping it to the "strMeasure8" JSON property
	public void setStrMeasure8(String strMeasure8) 
	{
		this.strMeasure8 = strMeasure8;
	}
	
	//Return the ninth ingredient measurements of meal, mapped from the "strMeasure9" JSON property
	public String getStrMeasure9() 
	{
		return strMeasure9;
	}
	
	//Set the ninth ingredient measurements of meal, mapping it to the "strMeasure9" JSON property
	public void setStrMeasure9(String strMeasure9) 
	{
		this.strMeasure9 = strMeasure9;
	}
	
	//Return the tenth ingredient measurements of meal, mapped from the "strMeasure10" JSON property
	public String getStrMeasure10() 
	{
		return strMeasure10;
	}
	
	//Set the tenth ingredient measurements of meal, mapping it to the "strMeasure10" JSON property
	public void setStrMeasure10(String strMeasure10) 
	{
		this.strMeasure10 = strMeasure10;
	}
	
	//Return the eleventh ingredient measurements of meal, mapped from the "strMeasure11" JSON property
	public String getStrMeasure11() 
	{
		return strMeasure11;
	}
	
	//Set the eleventh ingredient measurements of meal, mapping it to the "strMeasure11" JSON property
	public void setStrMeasure11(String strMeasure11) 
	{
		this.strMeasure11 = strMeasure11;
	}
	
	//Return the twelfth ingredient measurements of meal, mapped from the "strMeasure12" JSON property
	public String getStrMeasure12() 
	{
		return strMeasure12;
	}
	
	//Set the twelfth ingredient measurements of meal, mapping it to the "strMeasure12" JSON property
	public void setStrMeasure12(String strMeasure12) 
	{
		this.strMeasure12 = strMeasure12;
	}
	
	//Return the thirteenth ingredient measurements of meal, mapped from the "strMeasure13" JSON property
	public String getStrMeasure13() 
	{
		return strMeasure13;
	}
	
	//Set the thirteenth ingredient measurements of meal, mapping it to the "strMeasure13" JSON property
	public void setStrMeasure13(String strMeasure13) 
	{
		this.strMeasure13 = strMeasure13;
	}
	
	//Return the fourteenth ingredient measurements of meal, mapped from the "strMeasure14" JSON property
	public String getStrMeasure14() 
	{
		return strMeasure14;
	}
	
	//Set the fourteenth ingredient measurements of meal, mapping it to the "strMeasure14" JSON property
	public void setStrMeasure14(String strMeasure14) 
	{
		this.strMeasure14 = strMeasure14;
	}
	
	//Return the fifteenth ingredient measurements of meal, mapped from the "strMeasure15" JSON property
	public String getStrMeasure15() {
		return strMeasure15;
	}
	
	//Set the fifteenth ingredient measurements of meal, mapping it to the "strMeasure15" JSON property
	public void setStrMeasure15(String strMeasure15) 
	{
		this.strMeasure15 = strMeasure15;
	}
	
	//Return the sixteenth ingredient measurements of meal, mapped from the "strMeasure16" JSON property
	public String getStrMeasure16() 
	{
		return strMeasure16;
	}
	
	//Set the sixteenth ingredient measurements of meal, mapping it to the "strMeasure16" JSON property
	public void setStrMeasure16(String strMeasure16) 
	{
		this.strMeasure16 = strMeasure16;
	}
	
	//Return the seventeenth ingredient measurements of meal, mapped from the "strMeasure17" JSON property
	public String getStrMeasure17() 
	{
		return strMeasure17;
	}
	
	//Set the seventeenth ingredient measurements of meal, mapping it to the "strMeasure17" JSON property
	public void setStrMeasure17(String strMeasure17) 
	{
		this.strMeasure17 = strMeasure17;
	}
	
	//Return the eighteenth ingredient measurements of meal, mapped from the "strMeasure18" JSON property
	public String getStrMeasure18() 
	{
		return strMeasure18;
	}
	
	//Set the eighteenth ingredient measurements of meal, mapping it to the "strMeasure18" JSON property
	public void setStrMeasure18(String strMeasure18) 
	{
		this.strMeasure18 = strMeasure18;
	}
	
	//Return the nineteenth ingredient measurements of meal, mapped from the "strMeasure19" JSON property
	public String getStrMeasure19() {
		return strMeasure19;
	}
	
	//Set the nineteenth ingredient measurements of meal, mapping it to the "strMeasure19" JSON property
	public void setStrMeasure19(String strMeasure19) 
	{
		this.strMeasure19 = strMeasure19;
	}
	
	//Return the twentieth ingredient measurements of meal, mapped from the "strMeasure20" JSON property
	public String getStrMeasure20() 
	{
		return strMeasure20;
	}
	
	//Set the twentieth ingredient measurements of meal, mapping it to the "strMeasure20" JSON property
	public void setStrMeasure20(String strMeasure20) 
	{
		this.strMeasure20 = strMeasure20;
	}
	
	//Return the meal source, mapped from the "strSource" JSON property
	public String getStrSource() 
	{
		return strSource;
	}
	
	//Set the meal source, mapping it to the "strSource" JSON property
	public void setStrSource(String strSource) 
	{
		this.strSource = strSource;
	}
	
	//Return the meal image source, mapped from the "strImageSource" JSON property
	public String getStrImageSource() 
	{
		return strImageSource;
	}
	
	//Set the meal image source, mapping it to the "strImageSource" JSON property
	public void setStrImageSource(String strImageSource) 
	{
		this.strImageSource = strImageSource;
	}
	
	//Return the meal or meal source availability with license Creative Commons, mapped from the "strCreativeCommonsConfirmed" JSON property
	public String getStrCreativeCommonsConfirmed() 
	{
		return strCreativeCommonsConfirmed;
	}
	
	//Set the meal or meal source availability with license Creative Commons, mapping it to the "strCreativeCommonsConfirmed" JSON property
	public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) 
	{
		this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
	}
	
	//Return the date of last modification of meal, mapped from the "dateModified" JSON property
	@JsonProperty("dateModified")
	public String getDateModified() 
	{
		return dateModified;
	}
	
	//Set the date of last modification of meal, mapping it to the "dateModified" JSON property
	@JsonProperty("dateModified")
	public void setDateModified(String dateModified) 
	{
		this.dateModified = dateModified;
	}
	
	//Return the map of additional properties not explicitly mapped in the class
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() 
	{
		return this.additionalProperties;
	}
	
	//Set a single additional property in the map
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) 
	{
		this.additionalProperties.put(name, value);
	}
	
	//Replacement of the whole map of additional properties
	public void setAdditionalProperties(Map<String, Object> additionalProperties) 
	{
		this.additionalProperties = additionalProperties;
	}

}
