//Class «MealResult» belongs to package «model.themealdb»
package model.themealdb;

//Imports the LinkedHashMap class for storing key-value pairs in insertion order
import java.util.LinkedHashMap;

//Imports the List interface to store collections of Meal objects in an ordered sequence
import java.util.List;

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
    "page",
    "results",
    "total_pages",
    "total_results"
  }
)

//Class «MealResult» for storage data from REST API to meals list on pages
public class MealResult 
{

    //Mapping of the "page" JSON property to this field, storing pages
    @JsonProperty("page")
    private Integer page;
    
    //Mapping of the "results" JSON property to this field, storing meals
    @JsonProperty("results")
    private List<Meal> meals;
    
    //Mapping of the "total_pages" JSON property to this field, storing total pages
    @JsonProperty("total_pages")
    private Integer totalPages;
    
    //Mapping of the "total_results" JSON property to this field, storing total results
    @JsonProperty("total_results")
    private Integer totalResults;
    
    //Ignores this field during normal JSON serialization/deserialization; used to store extra properties
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    
    //Return the page mapped from the "page" JSON property
    @JsonProperty("page")
    public Integer getPage() 
    {
        return page;
    }
    
    //Set the page, mapping it to the "page" JSON property
    @JsonProperty("page")
    public void setPage(Integer page) 
    {
        this.page = page;
    }
    
    //Return the meals mapped from the "meals" JSON property
    @JsonProperty("meals")
    public List<Meal> getMeals() 
    {
        return meals;
    }
    
    //Set the meals, mapping it to the "meals" JSON property
    @JsonProperty("meals")
    public void setMeals(List<Meal> meals) 
    {
        this.meals = meals;
    }
    
    //Return the total pages mapped from the "total_pages" JSON property
    @JsonProperty("total_pages")
    public Integer getTotalPages() 
    {
    return totalPages;
    }
    
    //Set the total pages, mapping it to the "total_pages" JSON property
    @JsonProperty("total_pages")
    public void setTotalPages(Integer totalPages) 
    {
    this.totalPages = totalPages;
    }
    
    //Return the total results mapped from the "total_results" JSON property
    @JsonProperty("total_results")
    public Integer getTotalResults() 
    {
    return totalResults;
    }
    
    //Set the total results, mapping it to the "total_results" JSON property
    @JsonProperty("total_results")
    public void setTotalResults(Integer totalResults) 
    {
    this.totalResults = totalResults;
    }
    
    /Return the map of additional properties not explicitly mapped in the class
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
    
     //Formatting the display of meal from REST API to list on pages
    @Override
    public String toString() 
    {
        return "MealResult [page=" + page + ", meals=" + meals + ", totalPages=" + totalPages + ", totalResults=" + totalResults + ", additionalProperties=" + additionalProperties + "]";
    }
}
