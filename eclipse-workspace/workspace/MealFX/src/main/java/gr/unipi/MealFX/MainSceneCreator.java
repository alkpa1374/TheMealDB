//Declare the package for this class
package gr.unipi.MealFX;

//Import JavaFX classes for handling events
import javafx.event.EventHandler; //Interface for handling input events

//Import JavaFX classes for UI layout and positioning
import javafx.geometry.Pos;       //Enum for positioning/alignment of nodes
import javafx.scene.Scene;        //Represents a scene to be displayed in a Stage
import javafx.scene.control.Button; //JavaFX Button control
import javafx.scene.input.MouseEvent; //Event class for mouse events
import javafx.scene.layout.FlowPane;  //Layout pane that arranges nodes in a flow (horizontal/vertical)

public class MainSceneCreator implements EventHandler<MouseEvent> 
{
	//Flow Pane (root node)
	FlowPane rootFlowPane;
	//Main scene buttons
	Button mealBtn, favouriteBtn, cookedBtn;

	public MainSceneCreator() 
	{
    	rootFlowPane = new FlowPane();
    	mealBtn = new Button("Meal");
    	favouriteBtn = new Button("Favourite");
    	cookedBtn = new Button("Cooked");
    	
    	//Attach handle event to mealBtn
    	mealBtn.setOnMouseClicked(this);
    	favouriteBtn.setOnMouseClicked(this);
    	cookedBtn.setOnMouseClicked(this);
    	//Set up flow pane
    	rootFlowPane.setAlignment(Pos.CENTER);
    	rootFlowPane.setHgap(10);
    	mealBtn.setMinSize(120,30);
    	favouriteBtn.setMinSize(120,30);
      	cookedBtn.setMinSize(120,30);
    	
      	//add buttons to rootflowpane
    	rootFlowPane.getChildren().add(mealBtn);
    	rootFlowPane.getChildren().add(favouriteBtn);
    	rootFlowPane.getChildren().add(cookedBtn);
	}
	
	//Method to create and return a JavaFX Scene for this UI
    Scene createScene()
    {
      //Create a new Scene using the rootGridPane as the root layout
      //Set the width of the scene to 650 pixels and the height to 300 pixels
      return new Scene(rootFlowPane, 650, 300);
    }

	//Override the handle method from EventHandler to respond to mouse events
	@Override
	public void handle(MouseEvent event) 
	{
	    //Check if the event source (clicked node) is the "mealBtn" button
	    if (event.getSource() == mealBtn) 
	    {
	        //Set the title of the primary stage to indicate the MealFX window
	        App.primaryStage.setTitle("MealFX Window");

	        //Switch the scene of the primary stage to the pre-created mealScene
	        App.primaryStage.setScene(App.mealScene);
	    }
	    //Check if the event source is the "favouriteBtn" button
	    else if (event.getSource() == favouriteBtn) 
	    {
	        //Set the title of the primary stage to indicate the FavouriteFX window
	        App.primaryStage.setTitle("FavouriteFX Window");

	        //Create a new FavouriteScene using the FavouriteSceneCreator class
	        FavouriteSceneCreator favouriteSceneCreator = new FavouriteSceneCreator();
	        Scene favouriteScene = favouriteSceneCreator.createScene();

	        //Switch the primary stage scene to the newly created Favourite scene
	        App.primaryStage.setScene(favouriteScene);
	    }
	    //If the event source is neither mealBtn nor favouriteBtn, assume it's the cookedBtn
	    else
	    {
	        //Set the title of the primary stage to indicate the CookedFX window
	        App.primaryStage.setTitle("CookedFX Window");

	        //Create a new CookedScene using the CookedSceneCreator class
	        CookedSceneCreator cookedSceneCreator = new CookedSceneCreator();
	        Scene cookedScene = cookedSceneCreator.createScene();

	        //Switch the primary stage scene to the newly created Cooked scene
	        App.primaryStage.setScene(cookedScene);
	    }
	}
}

