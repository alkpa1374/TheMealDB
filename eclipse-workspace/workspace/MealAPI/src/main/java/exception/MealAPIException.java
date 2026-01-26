//Class «MealAPIException» belongs package «exception»
package exception;

//Class «MealAPIException» for handling exception during data reception from the REST API of THEMEALDB
public class MealAPIException extends Exception
{
    //Definition of a unique serialVersionUID for serialization compatibility, which this ensures that the class can be serialized and deserialized consistently across JVMs
    private static final long serialVersionUID = 5679558042286385889L;
    
    //Constructor for creating an exception with a descriptive message
    public MealAPIException(String message) 
    {
        super(message);
    }
    
    //Constructor for creating an exception with a descriptive message and a cause
    public MealAPIException(String message, Throwable cause) 
    {
       super(message, cause);
    }
}




