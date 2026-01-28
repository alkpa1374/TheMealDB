//Class "MealPopUp" belongs to package "gr.unipi.MealFX"
package gr.unipi.MealFX;

//Import of JavaFX classes for creating UI components and windows
import javafx.scene.Scene;        //Representation of a scene to be displayed in a Stage
import javafx.scene.layout.VBox;  //Vertical box layout for vertical nodes arrangement
import javafx.scene.text.Text;    //Simple text node to display text
import javafx.stage.Modality;     //Definition of windows modality (blocking behaviour)
import javafx.stage.Stage;        //Representation of a top-level window (popup, main stage, etc.)

//Class "MealPopUp" for presenting a pop-up window
public class MealPopUp 
{

    //Creation of a new Stage instance for this pop-up window
    final Stage dialog = new Stage();  

    //Constructor for displaying of pop-up window with a message
    public MealPopUp(String message) 
    {

        //Setting of the modality to APPLICATION_MODAL, blocking input to other windows until closed
        dialog.initModality(Modality.APPLICATION_MODAL);
        
        //Setting of the owner of this pop-up window to the main application stage
        dialog.initOwner(App.primaryStage);
        
        //Creation of a vertical layout container with 10px spacing between children
        VBox dialogVbox = new VBox(10);
        
        //Addition of a Text node containing the VBox message
        dialogVbox.getChildren().add(new Text(message));
        
        //Creation of a new Scene containing the VBox, with width 1200px and height 100px
        Scene dialogScene = new Scene(dialogVbox, 1200, 100);
        
        //Setting of the Scene on the dialog Stage
        dialog.setScene(dialogScene);
    }

    //Pop-up window presentation method
    public void show() 
    {
         dialog.show();
    }
}
