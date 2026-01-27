//Class "Meal" belongs to package "model.themealdb"
package model.themealdb;

//Import of the LinkedHashMap class for storing key-value pairs in insertion order
import java.util.LinkedHashMap;

//Import of the generic Map interface for key-value pair mappings
import java.util.Map;

//Import of Jackson annotation to include additional JSON properties dynamically during serialization
import com.fasterxml.jackson.annotation.JsonAnyGetter;

//Import of Jackson annotation to set additional JSON properties dynamically during deserialization
import com.fasterxml.jackson.annotation.JsonAnySetter;

//Import of Jackson annotation to ignore fields during JSON serialization/deserialization
import com.fasterxml.jackson.annotation.JsonIgnore;

//Import of Jackson annotation to control whether null fields are included in JSON
import com.fasterxml.jackson.annotation.JsonInclude;

//Import of Jackson annotation to explicitly map JSON properties to Java fields
import com.fasterxml.jackson.annotation.JsonProperty;

//Import of Jackson annotation to specify the order of JSON properties during serialization
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//Confirmation that only fields that are not null are included during serialization of this object to JSON
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

//Class "Meal" for the representation of meals from the REST API of THEMEALDB
public class Meal 
{

	//Mapping of the "idMeal" JSON property to this field, storing meal ID
	@JsonProperty("idMeal")
	private String idMeal;
	
	//Mapping of the "strMeal" JSON property to this field, storing meal name
	@JsonProperty("strMeal")
	private String strMeal;
	
	//Mapping of the "strMealAlternate" JSON property to this field, storing alternative meal
	@JsonProperty("strMealAlternate")
	private String strMealAlternate;
	
	//Mapping of the "strCategory" JSON property to this field, storing meal category
	@JsonProperty("strCategory")
	private String strCategory;
	
	//Mapping of the "strArea" JSON property to this field, storing meal origin country
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
	
	//Mapping of the "strIngredient2" JSON property to this field, storing second ingredient of meal
	@JsonProperty("strIngredient2")
	private String strIngredient2;
	
	//Mapping of the "strIngredient3" JSON property to this field, storing third ingredient of meal
	@JsonProperty("strIngredient3")
	private String strIngredient3;
	
	//Mapping of the "strIngredient4" JSON property to this field, storing fourth ingredient of meal
	@JsonProperty("strIngredient4")
	private String strIngredient4;
	
	//Mapping of the "strIngredient5" JSON property to this field, storing fifth ingredient of meal
	@JsonProperty("strIngredient5")
	private String strIngredient5;
	
	//Mapping of the "strIngredient6" JSON property to this field, storing sixth ingredient of meal
	@JsonProperty("strIngredient6")
	private String strIngredient6;
	
	//Mapping of the "strIngredient7" JSON property to this field, storing seventh ingredient of meal
	@JsonProperty("strIngredient7")
	private String strIngredient7;
	
	//Mapping of the "strIngredient8" JSON property to this field, storing eighth ingredient of meal
	@JsonProperty("strIngredient8")
	private String strIngredient8;
	
	//Mapping of the "strIngredient9" JSON property to this field, storing ninth ingredient of meal
	@JsonProperty("strIngredient9")
	private String strIngredient9;
	
	//Mapping of the "strIngredient10" JSON property to this field, storing tenth ingredient of meal
	@JsonProperty("strIngredient10")
	private String strIngredient10;
	
	//Mapping of the "strIngredient11" JSON property to this field, storing eleventh ingredient of meal
	@JsonProperty("strIngredient11")
	private String strIngredient11;
	
	//Mapping of the "strIngredient12" JSON property to this field, storing twelfth ingredient of meal
	@JsonProperty("strIngredient12")
	private String strIngredient12;
	
	//Mapping of the "strIngredient13" JSON property to this field, storing thirteenth ingredient of meal
	@JsonProperty("strIngredient13")
	private String strIngredient13;
	
	//Mapping of the "strIngredient14" JSON property to this field, storing fourteenth ingredient of meal
	@JsonProperty("strIngredient14")
	private String strIngredient14;
	
	//Mapping of the "strIngredient15" JSON property to this field, storing fifteenth ingredient of meal
	@JsonProperty("strIngredient15")
	private String strIngredient15;
	
	//Mapping of the "strIngredient16" JSON property to this field, storing sixteenth ingredient of meal
	@JsonProperty("strIngredient16")
	private String strIngredient16;
	
	//Mapping of the "strIngredient17" JSON property to this field, storing seventeenth ingredient of meal
	@JsonProperty("strIngredient17")
	private String strIngredient17;
	
	//Mapping of the "strIngredient18" JSON property to this field, storing eighteenth ingredient of meal
	@JsonProperty("strIngredient18")
	private String strIngredient18;
	
	//Mapping of the "strIngredient19" JSON property to this field, storing nineteenth ingredient of meal
	@JsonProperty("strIngredient19")
	private String strIngredient19;
	
	//Mapping of the "strIngredient20" JSON property to this field, storing twentieth ingredient of meal
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
	
	//Mapping of the "dateModified" JSON property to this field, storing date of last modification of meal
	@JsonProperty("dateModified")
	private String dateModified;
	
	//Overlooking of this field in JSON serialization/deserialization
    //Storage of any extra JSON properties not explicitly defined above dynamically
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
	
	//Return of meal ID mapped by the "idMeal" JSON property
	@JsonProperty("idMeal")
	public String getIdMeal() 
	{
		return idMeal;
	}
	
	//Setting of meal ID, mapping it to the "idMeal" JSON property
	@JsonProperty("idMeal")
	public void setIdMeal(String idMeal) 
	{
		this.idMeal = idMeal;
	}
	
	//Return of meal name mapped by the "strMeal" JSON property
	@JsonProperty("strMeal")
	public String getStrMeal() 
	{
		return strMeal;
	}
	
	//Setting of meal name, mapping it to the "strMeal" JSON property
	@JsonProperty("strMeal")
	public void setStrMeal(String strMeal) 
	{
		this.strMeal = strMeal;
	}
	
	//Return of alternative meal mapped by "strMealAlternate" JSON property
	@JsonProperty("strMealAlternate")
	public String getStrMealAlternate() 
	{
		return strMealAlternate;
	}
	
	//Setting of alternative meal, mapping it to "strMealAlternate" JSON property
	@JsonProperty("strMealAlternate")
	public void setStrMealAlternate(String strMealAlternate) 
	{
		this.strMealAlternate = strMealAlternate;
	}
	
	//Return of meal category mapped by "strCategory" JSON property
	@JsonProperty("strCategory")
	public String getStrCategory() 
	{
		return strCategory;
	}
	
	//Setting of meal category, mapping it to "strCategory" JSON property
	@JsonProperty("strCategory")
	public void setStrCategory(String strCategory) 
	{
		this.strCategory = strCategory;
	}
	
	//Return of meal origin country mapped by "strArea" JSON property
	@JsonProperty("strArea")
	public String getStrArea() 
	{
		return strArea;
	}
	
	//Setting of meal origin country, mapping it to the "strArea" JSON property
	@JsonProperty("strArea")
	public void setStrArea(String strArea) 
	{
		this.strArea = strArea;
	}
	
	//Return of meal instructions mapped by "strInstructions" JSON property
	@JsonProperty("strInstructions")
	public String getStrInstructions() 
	{
		return strInstructions;
	}
	
	//Setting of meal instructions, mapping it to the "strInstructions" JSON property
	@JsonProperty("strInstructions")
	public void setStrInstructions(String strInstructions) 
	{
		this.strInstructions = strInstructions;
	}
	
	//Return of meal link image, mapped by "strMealThumb" JSON property
	@JsonProperty("strMealThumb")
	public String getStrMealThumb() 
	{
		return strMealThumb;
	}
	
	//Setting of meal link image, mapping it to the "strMealThumb" JSON property
	@JsonProperty("strMealThumb")
	public void setStrMealThumb(String strMealThumb) 
	{
		this.strMealThumb = strMealThumb;
	}
	
	//Return of ingredients category of meal, mapped by the "strTags" JSON property
	@JsonProperty("strTags")
	public String getStrTags() 
	{
		return strTags;
	}
	
	//Setting of ingredients category of meal, mapped by the "strTags" JSON property
	@JsonProperty("strTags")
	public void setStrTags(String strTags) 
	{
		this.strTags = strTags;
	}
	
	//Return of YouTube link, mapped by the "strYouTube" JSON property
	@JsonProperty("strYoutube")
	public String getStrYoutube() 
	{
		return strYoutube;
	}
	
	//Setting of YouTube link, mapping it to the "strYouTube" JSON property
	@JsonProperty("strYoutube")
	public void setStrYoutube(String strYoutube) 
	{
		this.strYoutube = strYoutube;
	}
	
	//Return of first ingredient of meal, mapped by the "strIngredient1" JSON property
	public String getStrIngredient1() 
	{
		return strIngredient1;
	}
	
	//Setting of first ingredient of meal, mapping it to the "strIngredient1" JSON property
	public void setStrIngredient1(String strIngredient1) 
	{
		this.strIngredient1 = strIngredient1;
	}
	
	//Return of second ingredient of meal, mapped by the "strIngredient2" JSON property
	public String getStrIngredient2() 
	{
		return strIngredient2;
	}
	
	//Setting of second ingredient of meal, mapping it to the "strIngredient2" JSON property
	public void setStrIngredient2(String strIngredient2) 
	{
		this.strIngredient2 = strIngredient2;
	}
	
	//Return of third ingredient of meal, mapped by the "strIngredient3" JSON property
	public String getStrIngredient3() 
	{
		return strIngredient3;
	}
	
	//Setting of third ingredient of meal, mapping it to the "strIngredient3" JSON property
	public void setStrIngredient3(String strIngredient3) 
	{
		this.strIngredient3 = strIngredient3;
	}
	
	//Return of fourth ingredient of meal, mapped by the "strIngredient4" JSON property
	public String getStrIngredient4() 
	{
		return strIngredient4;
	}
	
	//Setting of fourth ingredient of meal, mapping it to the "strIngredient4" JSON property
	public void setStrIngredient4(String strIngredient4) 
	{
		this.strIngredient4 = strIngredient4;
	}
	
	//Return of fifth ingredient of meal, mapped by the "strIngredient5" JSON property
	public String getStrIngredient5() 
	{
		return strIngredient5;
	}
	
	//Setting of fifth ingredient of meal, mapping it to the "strIngredient5" JSON property
	public void setStrIngredient5(String strIngredient5) 
	{
		this.strIngredient5 = strIngredient5;
	}
	
	//Return of sixth ingredient of meal, mapped by the "strIngredient6" JSON property
	public String getStrIngredient6() 
	{
		return strIngredient6;
	}
	
	//Setting of sixth ingredient of meal, mapping it to the "strIngredient6" JSON property
	public void setStrIngredient6(String strIngredient6) 
	{
		this.strIngredient6 = strIngredient6;
	}
	
	//Return of seventh ingredient of meal, mapped by the "strIngredient7" JSON property
	public String getStrIngredient7() 
	{
		return strIngredient7;
	}
	
	//Setting of seventh ingredient of meal, mapping it to the "strIngredient7" JSON property
	public void setStrIngredient7(String strIngredient7) 
	{
		this.strIngredient7 = strIngredient7;
	}
	
	//Return of eighth ingredient of meal, mapped by the "strIngredient8" JSON property
	public String getStrIngredient8() 
	{
		return strIngredient8;
	}
	
	//Setting of eighth ingredient of meal, mapping it to the "strIngredient8" JSON property
	public void setStrIngredient8(String strIngredient8) 
	{
		this.strIngredient8 = strIngredient8;
	}
	
	//Return of ninth ingredient of meal, mapped by the "strIngredient9" JSON property
	public String getStrIngredient9() 
	{
		return strIngredient9;
	}
	
	//Setting of ninth ingredient of meal, mapping it to the "strIngredient9" JSON property
	public void setStrIngredient9(String strIngredient9) 
	{
		this.strIngredient9 = strIngredient9;
	}
	
	//Return of tenth ingredient of meal, mapped by the "strIngredient10" JSON property
	public String getStrIngredient10() 
	{
		return strIngredient10;
	}
	
	//Setting of tenth ingredient of meal, mapping it to the "strIngredient10" JSON property
	public void setStrIngredient10(String strIngredient10) 
	{
		this.strIngredient10 = strIngredient10;
	}
	
	//Return of eleventh ingredient of meal, mapped by the "strIngredient11" JSON property
	public String getStrIngredient11() 
	{
		return strIngredient11;
	}
	
	//Setting of eleventh ingredient of meal, mapping it to the "strIngredient11" JSON property
	public void setStrIngredient11(String strIngredient11) 
	{
		this.strIngredient11 = strIngredient11;
	}
	
	//Return of twelfth ingredient of meal, mapped by the "strIngredient12" JSON property
	public String getStrIngredient12() 
	{
		return strIngredient12;
	}
	
	//Setting of twelfth ingredient of meal, mapping it to the "strIngredient12" JSON property
	public void setStrIngredient12(String strIngredient12) 
	{
		this.strIngredient12 = strIngredient12;
	}
	
	//Return of thirteenth ingredient of meal, mapped by the "strIngredient13" JSON property
	public String getStrIngredient13() 
	{
		return strIngredient13;
	}
	
	//Setting of thirteenth ingredient of meal, mapping it to the "strIngredient13" JSON property
	public void setStrIngredient13(String strIngredient13) 
	{
		this.strIngredient13 = strIngredient13;
	}
	
	//Return of fourteenth ingredient of meal, mapped by the "strIngredient14" JSON property
	public String getStrIngredient14() 
	{
		return strIngredient14;
	}
	
	//Setting of fourteenth ingredient of meal, mapping it to the "strIngredient14" JSON property
	public void setStrIngredient14(String strIngredient14) 
	{
		this.strIngredient14 = strIngredient14;
	}
	
	//Return of fifteenth ingredient of meal, mapped by the "strIngredient15" JSON property
	public String getStrIngredient15() 
	{
		return strIngredient15;
	}
	
	//Setting of fifteenth ingredient of meal, mapping it to the "strIngredient15" JSON property
	public void setStrIngredient15(String strIngredient15) 
	{
		this.strIngredient15 = strIngredient15;
	}
	
	//Return of sixteenth ingredient of meal, mapped by the "strIngredient16" JSON property
	public String getStrIngredient16() 
	{
		return strIngredient16;
	}
	
	//Setting of sixteenth ingredient of meal, mapping it to the "strIngredient16" JSON property
	public void setStrIngredient16(String strIngredient16) 
	{
		this.strIngredient16 = strIngredient16;
	}
	
	//Return of seventeenth ingredient of meal, mapped by "strIngredient17" JSON property
	public String getStrIngredient17() 
	{
		return strIngredient17;
	}
	
	//Setting of seventeenth ingredient of meal, mapping it to the "strIngredient17" JSON property
	public void setStrIngredient17(String strIngredient17) 
	{
		this.strIngredient17 = strIngredient17;
	}
	
	//Return of eighteenth ingredient of meal, mapped by "strIngredient18" JSON property
	public String getStrIngredient18() 
	{
		return strIngredient18;
	}
	
	//Setting of eighteenth ingredient of meal, mapping it to the "strIngredient18" JSON property
	public void setStrIngredient18(String strIngredient18) 
	{
		this.strIngredient18 = strIngredient18;
	}
	
	//Return of nineteenth ingredient of meal, mapped by the "strIngredient19" JSON property
	public String getStrIngredient19() 
	{
		return strIngredient19;
	}
	
	//Setting of nineteenth ingredient of meal, mapping it to the "strIngredient19" JSON property
	public void setStrIngredient19(String strIngredient19) 
	{
		this.strIngredient19 = strIngredient19;
	}
	
	//Return of twentieth ingredient of meal, mapped by the "strIngredient20" JSON property
	public String getStrIngredient20() 
	{
		return strIngredient20;
	}
	
	//Setting of twentieth ingredient of meal, mapping it to the "strIngredient20" JSON property
	public void setStrIngredient20(String strIngredient20) 
	{
		this.strIngredient20 = strIngredient20;
	}
	
	//Return of first ingredient measurements of meal, mapped by the "strMeasure1" JSON property
	public String getStrMeasure1() 
	{
		return strMeasure1;
	}
	
	//Setting of first ingredient measurements of meal, mapping it to the "strMeasure1" JSON property
	public void setStrMeasure1(String strMeasure1) 
	{
		this.strMeasure1 = strMeasure1;
	}
	
	//Return of second ingredient measurements of meal, mapped by the "strMeasure2" JSON property
	public String getStrMeasure2() 
	{
		return strMeasure2;
	}
	
	//Setting of second ingredient measurements of meal, mapping it to the "strMeasure2" JSON property
	public void setStrMeasure2(String strMeasure2) 
	{
		this.strMeasure2 = strMeasure2;
	}
	
	//Return of third ingredient measurements of meal, mapped by the "strMeasure3" JSON property
	public String getStrMeasure3() 
	{
		return strMeasure3;
	}
	
	//Setting of third ingredient measurements of meal, mapping it to the "strMeasure3" JSON property
	public void setStrMeasure3(String strMeasure3)
	{
		this.strMeasure3 = strMeasure3;
	}
	
	//Return of fourth ingredient measurements of meal, mapped by to the "strMeasure4" JSON property
	public String getStrMeasure4() 
	{
		return strMeasure4;
	}
	
	//Setting of fourth ingredient measurements of meal, mapping it to the "strMeasure4" JSON property
	public void setStrMeasure4(String strMeasure4) 
	{
		this.strMeasure4 = strMeasure4;
	}
	
	//Return of fifth ingredient measurements of meal, mapped by to the "strMeasure5" JSON property
	public String getStrMeasure5() 
	{
		return strMeasure5;
	}
	
	//Setting of fifth ingredient measurements of meal, mapping it to the "strMeasure5" JSON property
	public void setStrMeasure5(String strMeasure5) 
	{
		this.strMeasure5 = strMeasure5;
	}
	
	//Return of sixth ingredient measurements of meal, mapped by the "strMeasure6" JSON property
	public String getStrMeasure6() 
	{
		return strMeasure6;
	}
	
	//Setting of sixth ingredient measurements of meal, mapping it to the "strMeasure6" JSON property
	public void setStrMeasure6(String strMeasure6) 
	{
		this.strMeasure6 = strMeasure6;
	}
	
	//Return of seventh ingredient measurements of meal, mapped by the "strMeasure7" JSON property
	public String getStrMeasure7() 
	{
		return strMeasure7;
	}
	
	//Setting of seventh ingredient measurements of meal, mapping it to the "strMeasure7" JSON property
	public void setStrMeasure7(String strMeasure7) 
	{
		this.strMeasure7 = strMeasure7;
	}
	
	//Return of eighth ingredient measurements of meal, mapped by the "strMeasure8" JSON property
	public String getStrMeasure8() 
	{
		return strMeasure8;
	}
	
	//Setting of eighth ingredient measurements of meal, mapping it to the "strMeasure8" JSON property
	public void setStrMeasure8(String strMeasure8) 
	{
		this.strMeasure8 = strMeasure8;
	}
	
	//Return of ninth ingredient measurements of meal, mapped by the "strMeasure9" JSON property
	public String getStrMeasure9() 
	{
		return strMeasure9;
	}
	
	//Setting of ninth ingredient measurements of meal, mapping it to the "strMeasure9" JSON property
	public void setStrMeasure9(String strMeasure9) 
	{
		this.strMeasure9 = strMeasure9;
	}
	
	//Return of tenth ingredient measurements of meal, mapped by the "strMeasure10" JSON property
	public String getStrMeasure10() 
	{
		return strMeasure10;
	}
	
	//Setting of tenth ingredient measurements of meal, mapping it to the "strMeasure10" JSON property
	public void setStrMeasure10(String strMeasure10) 
	{
		this.strMeasure10 = strMeasure10;
	}
	
	//Return of eleventh ingredient measurements of meal, mapped by the "strMeasure11" JSON property
	public String getStrMeasure11() 
	{
		return strMeasure11;
	}
	
	//Setting of eleventh ingredient measurements of meal, mapping it to the "strMeasure11" JSON property
	public void setStrMeasure11(String strMeasure11) 
	{
		this.strMeasure11 = strMeasure11;
	}
	
	//Return of twelfth ingredient measurements of meal, mapped by the "strMeasure12" JSON property
	public String getStrMeasure12() 
	{
		return strMeasure12;
	}
	
	//Setting of twelfth ingredient measurements of meal, mapping it to the "strMeasure12" JSON property
	public void setStrMeasure12(String strMeasure12) 
	{
		this.strMeasure12 = strMeasure12;
	}
	
	//Return of thirteenth ingredient measurements of meal, mapped by the "strMeasure13" JSON property
	public String getStrMeasure13() 
	{
		return strMeasure13;
	}
	
	//Setting of thirteenth ingredient measurements of meal, mapping it to the "strMeasure13" JSON property
	public void setStrMeasure13(String strMeasure13) 
	{
		this.strMeasure13 = strMeasure13;
	}
	
	//Return of fourteenth ingredient measurements of meal, mapped by the "strMeasure14" JSON property
	public String getStrMeasure14() 
	{
		return strMeasure14;
	}
	
	//Setting of fourteenth ingredient measurements of meal, mapping it to the "strMeasure14" JSON property
	public void setStrMeasure14(String strMeasure14) 
	{
		this.strMeasure14 = strMeasure14;
	}
	
	//Return of fifteenth ingredient measurements of meal, mapped by the "strMeasure15" JSON property
	public String getStrMeasure15() {
		return strMeasure15;
	}
	
	//Setting of fifteenth ingredient measurements of meal, mapping it to the "strMeasure15" JSON property
	public void setStrMeasure15(String strMeasure15) 
	{
		this.strMeasure15 = strMeasure15;
	}
	
	//Return of sixteenth ingredient measurements of meal, mapped by the "strMeasure16" JSON property
	public String getStrMeasure16() 
	{
		return strMeasure16;
	}
	
	//Setting of sixteenth ingredient measurements of meal, mapping it to the "strMeasure16" JSON property
	public void setStrMeasure16(String strMeasure16) 
	{
		this.strMeasure16 = strMeasure16;
	}
	
	//Return of seventeenth ingredient measurements of meal, mapped by the "strMeasure17" JSON property
	public String getStrMeasure17() 
	{
		return strMeasure17;
	}
	
	//Setting of seventeenth ingredient measurements of meal, mapping it to the "strMeasure17" JSON property
	public void setStrMeasure17(String strMeasure17) 
	{
		this.strMeasure17 = strMeasure17;
	}
	
	//Return of eighteenth ingredient measurements of meal, mapped by the "strMeasure18" JSON property
	public String getStrMeasure18() 
	{
		return strMeasure18;
	}
	
	//Setting of eighteenth ingredient measurements of meal, mapping it to the "strMeasure18" JSON property
	public void setStrMeasure18(String strMeasure18) 
	{
		this.strMeasure18 = strMeasure18;
	}
	
	//Return of nineteenth ingredient measurements of meal, mapped by the "strMeasure19" JSON property
	public String getStrMeasure19() {
		return strMeasure19;
	}
	
	//Setting of nineteenth ingredient measurements of meal, mapping it to the "strMeasure19" JSON property
	public void setStrMeasure19(String strMeasure19) 
	{
		this.strMeasure19 = strMeasure19;
	}
	
	//Return of twentieth ingredient measurements of meal, mapped by the "strMeasure20" JSON property
	public String getStrMeasure20() 
	{
		return strMeasure20;
	}
	
	//Setting of twentieth ingredient measurements of meal, mapping it to the "strMeasure20" JSON property
	public void setStrMeasure20(String strMeasure20) 
	{
		this.strMeasure20 = strMeasure20;
	}
	
	//Return of meal source, mapped by the "strSource" JSON property
	public String getStrSource() 
	{
		return strSource;
	}
	
	//Setting of meal source, mapping it to the "strSource" JSON property
	public void setStrSource(String strSource) 
	{
		this.strSource = strSource;
	}
	
	//Return of meal image source, mapped by the "strImageSource" JSON property
	public String getStrImageSource() 
	{
		return strImageSource;
	}
	
	//Setting of meal image source, mapping it to the "strImageSource" JSON property
	public void setStrImageSource(String strImageSource) 
	{
		this.strImageSource = strImageSource;
	}
	
	//Return of meal or meal source availability with license Creative Commons, mapped by the "strCreativeCommonsConfirmed" JSON property
	public String getStrCreativeCommonsConfirmed() 
	{
		return strCreativeCommonsConfirmed;
	}
	
	//Setting of meal or meal source availability with license Creative Commons, mapping it to the "strCreativeCommonsConfirmed" JSON property
	public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) 
	{
		this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
	}
	
	//Return of date of last modification of meal, mapped by the "dateModified" JSON property
	@JsonProperty("dateModified")
	public String getDateModified() 
	{
		return dateModified;
	}
	
	//Setting of date of last modification of meal, mapping it to the "dateModified" JSON property
	@JsonProperty("dateModified")
	public void setDateModified(String dateModified) 
	{
		this.dateModified = dateModified;
	}
	
	//Return of map of additional properties not explicitly mapped in the class
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() 
	{
		return this.additionalProperties;
	}
	
	//Setting of a single additional property in the map
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
