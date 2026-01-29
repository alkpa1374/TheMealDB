//Class"MealResult" belongs to package "model.themealdb"
package model.themealdb;

//Import of the LinkedHashMap class for storing key-value pairs in insertion order
import java.util.LinkedHashMap;

//Import of the List interface to store collections of Meal objects in an ordered sequence
import java.util.List;

//Import of the generic Map interface for key-value pair mappings
import java.util.Map;

//Import of Jackson annotation to include additional JSON properties dynamically during serialisation
import com.fasterxml.jackson.annotation.JsonAnyGetter;

//Import of Jackson annotation to set additional JSON properties dynamically during deserialisation
import com.fasterxml.jackson.annotation.JsonAnySetter;

//Import of Jackson annotation to ignore fields during JSON serialisation/deserialisation
import com.fasterxml.jackson.annotation.JsonIgnore;

//Import of Jackson annotation to control whether null fields are included in JSON
import com.fasterxml.jackson.annotation.JsonInclude;

//Import of Jackson annotation to explicitly map JSON properties to Java fields
import com.fasterxml.jackson.annotation.JsonProperty;

//Import of Jackson annotation to specify the order of JSON properties during serialisation
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//Confirmation that only fields that are not null are included during serialisation of this object to JSON
@JsonInclude(JsonInclude.Include.NON_NULL)

//Specification of the order of properties during serialisation to JSON
@JsonPropertyOrder
(
  {
    "page",
    "results",
    "total_pages",
    "total_results"
  }
)

//Class "MealResult" for storage data from REST API of THEMEALAPI to meals list on pages
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
    
    //Overlooking of this field during normal JSON serialisation/deserialisation for usage to store extra properties
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    
    //Return of page mapped by the "page" JSON property
    @JsonProperty("page")
    public Integer getPage() 
    {
        return page;
    }
    
    //Setting of page, mapping it to the "page" JSON property
    @JsonProperty("page")
    public void setPage(Integer page) 
    {
        this.page = page;
    }
    
    //Return of meals mapped by the "meals" JSON property
    @JsonProperty("meals")
    public List<Meal> getMeals() 
    {
        return meals;
    }
    
    //Setting of meals, mapping it to the "meals" JSON property
    @JsonProperty("meals")
    public void setMeals(List<Meal> meals) 
    {
        this.meals = meals;
    }
    
    //Return of total pages mapped by the "total_pages" JSON property
    @JsonProperty("total_pages")
    public Integer getTotalPages() 
    {
    return totalPages;
    }
    
    //Setting of total pages, mapping it to the "total_pages" JSON property
    @JsonProperty("total_pages")
    public void setTotalPages(Integer totalPages) 
    {
    this.totalPages = totalPages;
    }
    
    //Return of total results mapped by the "total_results" JSON property
    @JsonProperty("total_results")
    public Integer getTotalResults() 
    {
    return totalResults;
    }
    
    //Setting of total results, mapping it to the "total_results" JSON property
    @JsonProperty("total_results")
    public void setTotalResults(Integer totalResults) 
    {
    this.totalResults = totalResults;
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
    
    //Formatting of the display of meal from REST API of THEMEALDB to list on pages
    @Override
    public String toString() 
    {
        return "MealResult [page=" + page + ", meals=" + meals + ", totalPages=" + totalPages + ", totalResults=" + totalResults + ", additionalProperties=" + additionalProperties + "]";
    }
}
