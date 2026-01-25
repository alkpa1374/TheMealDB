//Declare that this class belongs to the "exception" package
package exception;

//Define a custom checked exception class named MealAPIException that extends the base Java Exception class
public class MealAPIException extends Exception
{
    //Define a unique serialVersionUID for serialization compatibility
    //This ensures that the class can be serialized and deserialized consistently across JVMs
    private static final long serialVersionUID = 5679558042286385889L;
    
    //Constructor that takes only a message string as input
    //Allows creating an exception with a descriptive message
    public MealAPIException(String message) 
    {
        //Call the parent Exception class constructor with the message
        super(message);
    }

    //Constructor that takes a message string and a Throwable cause
    //Allows creating an exception that wraps another exception
    public MealAPIException(String message, Throwable cause) 
    {
        //Call the parent Exception class constructor with the message and the cause
        super(message, cause);
    }
}
