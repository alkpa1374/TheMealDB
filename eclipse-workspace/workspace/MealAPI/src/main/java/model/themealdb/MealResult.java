//Defines the package in which this class resides
//This allows other classes in the same package to access it and organizes the code logically
package model.themealdb;

//Imports the LinkedHashMap class for storing key-value pairs with insertion order preserved
import java.util.LinkedHashMap;

//Imports the List interface to store collections of Meal objects in an ordered sequence
import java.util.List;

//Imports the Map interface for storing key-value pairs
import java.util.Map;

//Imports Jackson annotation to indicate a getter method for additional JSON properties
import com.fasterxml.jackson.annotation.JsonAnyGetter;

//Imports Jackson annotation to indicate a setter method for additional JSON properties
import com.fasterxml.jackson.annotation.JsonAnySetter;

//Imports Jackson annotation to mark fields to be ignored during serialization/deserialization
import com.fasterxml.jackson.annotation.JsonIgnore;

//Imports Jackson annotation to include only non-null fields when serializing to JSON
import com.fasterxml.jackson.annotation.JsonInclude;

//Imports Jackson annotation to map a Java field to a JSON property
import com.fasterxml.jackson.annotation.JsonProperty;

//Imports Jackson annotation to define the order of JSON properties when serializing
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//Ensures that only non-null fields will be included when serializing this object to JSON
@JsonInclude(JsonInclude.Include.NON_NULL)

//Specifies the order in which fields should appear when serialized to JSON
@JsonPropertyOrder
(
  {
    "page",
    "results",
    "total_pages",
    "total_results"
  }
)

//Declares the MealResult class, which maps the API response for a list of meals
public class MealResult 
{

    //Maps the "page" property from JSON to this Java field
    @JsonProperty("page")
    private Integer page;
    
    //Maps the "results" property from JSON to this Java field, which is a list of Meal objects
    @JsonProperty("results")
    private List<Meal> meals;
    
    //Maps the "total_pages" property from JSON to this Java field
    @JsonProperty("total_pages")
    private Integer totalPages;
    
    //Maps the "total_results" property from JSON to this Java field
    @JsonProperty("total_results")
    private Integer totalResults;
    
    //Ignores this field during normal JSON serialization/deserialization; used to store extra properties
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    
    //Getter for the "page" field, annotated to link with the JSON property
    @JsonProperty("page")
    public Integer getPage() 
    {
        return page;
    }
    
    //Setter for the "page" field, annotated to link with the JSON property
    @JsonProperty("page")
    public void setPage(Integer page) 
    {
        this.page = page;
    }
    
    //Getter for the "results" field (meals list), mapped from JSON "results"
    @JsonProperty("meals")
    public List<Meal> getMeals() 
    {
        return meals;
    }
    
    //Setter for the "results" field (meals list), mapped from JSON "results"
    @JsonProperty("meals")
    public void setMeals(List<Meal> meals) 
    {
        this.meals = meals;
    }
    
    //Getter for the "total_pages" field, linked to JSON property
    @JsonProperty("total_pages")
    public Integer getTotalPages() 
    {
    return totalPages;
    }
    
    //Setter for the "total_pages" field, linked to JSON property
    @JsonProperty("total_pages")
    public void setTotalPages(Integer totalPages) 
    {
    this.totalPages = totalPages;
    }
    
    //Getter for the "total_results" field, linked to JSON property
    @JsonProperty("total_results")
    public Integer getTotalResults() 
    {
    return totalResults;
    }
    
    //Setter for the "total_results" field, linked to JSON property
    @JsonProperty("total_results")
    public void setTotalResults(Integer totalResults) 
    {
    this.totalResults = totalResults;
    }
    
    //Getter for additional properties not explicitly mapped to a class field
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() 
    {
    return this.additionalProperties;
    }
    
    //Setter for any additional JSON properties not mapped to a specific field
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) 
    {
    this.additionalProperties.put(name, value);
    }
    
    //Overrides the default toString() method to provide a human-readable representation of the object
    @Override
    public String toString() 
    {
        return "MealResult [page=" + page + ", meals=" + meals + ", totalPages=" + totalPages + ", totalResults=" + totalResults + ", additionalProperties=" + additionalProperties + "]";
    }
}
