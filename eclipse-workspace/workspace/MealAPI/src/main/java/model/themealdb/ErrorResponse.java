//Class «ErrorResponse» belongs to package «model.themealdb»
package model.themealdb;

//Import of LinkedHashMapan to implementation for maintaining insertion order
import java.util.LinkedHashMap;

//Import of the generic Map interface
import java.util.Map;

//Import of annotation to indicate a getter method should be used for dynamic JSON properties
import com.fasterxml.jackson.annotation.JsonAnyGetter;

//Import of annotation to indicate a setter method should be used for dynamic JSON properties
import com.fasterxml.jackson.annotation.JsonAnySetter;

//Import of annotation to ignore a field during JSON serialization/deserialization
import com.fasterxml.jackson.annotation.JsonIgnore;

//Import of annotation to include non-null fields only during JSON serialization
import com.fasterxml.jackson.annotation.JsonInclude;

//Import of annotation to map a Java field to a JSON property name
import com.fasterxml.jackson.annotation.JsonProperty;

//Import of annotation to specify the order of JSON properties during serialization
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//Inclusion of only non-null fields during JSON serialization to avoid sending empty fields
@JsonInclude(JsonInclude.Include.NON_NULL)

//Specification of the order of properties during serialization to JSON
@JsonPropertyOrder
(
    {
        "status_code",
        "status_message",
        "success"
    }
)

//Class «ErrorResponse» for handling errors during data reception from the REST API
public class ErrorResponse 
{

    //Mapping of the JSON field "status_code" to this Java field
    @JsonProperty("status_code")
    private Integer statusCode;
    
    //Mapping of the JSON field "status_message" to this Java field
    @JsonProperty("status_message")
    private String statusMessage;
    
    //Mapping of the JSON field "success" to this Java field
    @JsonProperty("success")
    private Boolean success;
    
    //Overlooking of this field in JSON serialization/deserialization
    //Storage of any extra JSON properties not explicitly defined above
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    //Annotation of the getter for «status_code» so that Jackson uses this during serialization to JSON
    @JsonProperty("status_code")
    //Return of the current value of statusCode
    public Integer getStatusCode() 
    {
        return statusCode;
    }
    
    //Annotation of the setter for «status_code» so that Jackson uses this during deserialization from JSON
    @JsonProperty("status_code")
     //Setting of the value of statusCode from JSON
    public void setStatusCode(Integer statusCode) 
    {
        this.statusCode = statusCode;
    }
    
    //Annotation of the getter for "status_message" so that Jackson uses this during serialization to JSON
    @JsonProperty("status_message")
    //Return of the current value of statusMessage
    public String getStatusMessage() 
    {
        return statusMessage;
    }
    
    //Annotation of the setter for «status_message» so that Jackson uses this during deserialization from JSON
    @JsonProperty("status_message")
    //Setting of the value of statusMessage from JSON
    public void setStatusMessage(String statusMessage) 
    {
        this.statusMessage = statusMessage;
    }
    
    //Annotation of the getter for «success» so that Jackson uses this during serialization to JSON
    @JsonProperty("success")
    //Return of the current value of success
    public Boolean getSuccess() 
    {
        return success;
    }
    
    //Annotation of the setter for «success» so that Jackson uses this during deserialization from JSON
    @JsonProperty("success")
    //Setting of the value of success from JSON
    public void setSuccess(Boolean success) 
    {
        this.success = success;
    }
    
    //Annotation of this method to allow Jackson to include any additional properties not explicitly defined
    @JsonAnyGetter
    //Return of the map of extra dynamic properties
    public Map<String, Object> getAdditionalProperties() 
    {
        return this.additionalProperties;
    }
    
    //Annotation of this method to allow Jackson to store any extra JSON properties in the map during deserialization
    @JsonAnySetter
    //Addition of the extra property to the map
    public void setAdditionalProperty(String name, Object value) 
    {
        this.additionalProperties.put(name, value);
    }

}
