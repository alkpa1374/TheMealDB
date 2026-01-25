//Declare that this class belongs to the "model.themealdb" package
package model.themealdb;

//Import LinkedHashMap, a Map implementation that maintains insertion order
import java.util.LinkedHashMap;

//Import the generic Map interface
import java.util.Map;

//Import annotation to indicate a getter method should be used for dynamic JSON properties
import com.fasterxml.jackson.annotation.JsonAnyGetter;

//Import annotation to indicate a setter method should be used for dynamic JSON properties
import com.fasterxml.jackson.annotation.JsonAnySetter;

//Import annotation to ignore a field during JSON serialization/deserialization
import com.fasterxml.jackson.annotation.JsonIgnore;

//Import annotation to include non-null fields only during JSON serialization
import com.fasterxml.jackson.annotation.JsonInclude;

//Import annotation to map a Java field to a JSON property name
import com.fasterxml.jackson.annotation.JsonProperty;

//Import annotation to specify the order of JSON properties when serialized
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//Include only non-null fields during JSON serialization to avoid sending empty fields
@JsonInclude(JsonInclude.Include.NON_NULL)

//Specify the order of properties when serializing to JSON
@JsonPropertyOrder
(
    {
        "status_code",
        "status_message",
        "success"
    }
)

//Define the ErrorResponse class to represent an error response returned by the API
public class ErrorResponse 
{

    //Map the JSON field "status_code" to this Java field
    @JsonProperty("status_code")
    private Integer statusCode;
    
    //Map the JSON field "status_message" to this Java field
    @JsonProperty("status_message")
    private String statusMessage;
    
    //Map the JSON field "success" to this Java field
    @JsonProperty("success")
    private Boolean success;
    
    //Ignore this field in JSON serialization/deserialization
    //Stores any extra JSON properties not explicitly defined above
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    //Annotate the getter for "status_code" so Jackson uses this when serializing to JSON
    @JsonProperty("status_code")
    public Integer getStatusCode() 
    {
        return statusCode; //Return the current value of statusCode
    }
    
    //Annotate the setter for "status_code" so Jackson uses this when deserializing from JSON
    @JsonProperty("status_code")
    public void setStatusCode(Integer statusCode) 
    {
        this.statusCode = statusCode; //Set the value of statusCode from JSON
    }
    
    //Annotate the getter for "status_message" so Jackson uses this when serializing to JSON
    @JsonProperty("status_message")
    public String getStatusMessage() 
    {
        return statusMessage; //Return the current value of statusMessage
    }
    
    //Annotate the setter for "status_message" so Jackson uses this when deserializing from JSON
    @JsonProperty("status_message")
    public void setStatusMessage(String statusMessage) 
    {
        this.statusMessage = statusMessage; //Set the value of statusMessage from JSON
    }
    
    //Annotate the getter for "success" so Jackson uses this when serializing to JSON
    @JsonProperty("success")
    public Boolean getSuccess() 
    {
        return success; //Return the current value of success
    }
    
    //Annotate the setter for "success" so Jackson uses this when deserializing from JSON
    @JsonProperty("success")
    public void setSuccess(Boolean success) 
    {
        this.success = success; //Set the value of success from JSON
    }
    
    //Annotate this method to allow Jackson to include any additional properties not explicitly defined
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() 
    {
        return this.additionalProperties; //Return the map of extra dynamic properties
    }
    
    //Annotate this method to allow Jackson to store any extra JSON properties in the map during deserialization
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) 
    {
        this.additionalProperties.put(name, value); //Add the extra property to the map
    }

}
