//Class «MainSceneCreator» belongs package «gr.unipi.MealFX»
package gr.unipi.MealFX;

//Import of JavaFX classes for handling events
import javafx.event.EventHandler;

//Import of JavaFX classes for UI layout and positioning
import javafx.geometry.Pos;       //Enum for positioning/alignment of nodes
import javafx.scene.Scene;        //Representation of a scene to be displayed in a Stage
import javafx.scene.control.Button; //JavaFX Button control
import javafx.scene.input.MouseEvent; //Event class for mouse events
import javafx.scene.layout.FlowPane;  //Layout pane that arranges nodes in a flow (horizontal/vertical)

//Class «MainSceneCreator» for main scene implementation
public class MainSceneCreator implements EventHandler<MouseEvent> 
{
	//Flow Pane
	FlowPane rootFlowPane;
	//Main scene buttons
	Button mealBtn, favouriteBtn, cookedBtn;

	//Constructor for main scene creation
	public MainSceneCreator() 
	{
    	//Creation of flow pane and buttons
		rootFlowPane = new FlowPane();
    	mealBtn = new Button("Meal");
    	favouriteBtn = new Button("Favourite");
    	cookedBtn = new Button("Cooked");
    	
    	//Attach handle event to buttons
    	mealBtn.setOnMouseClicked(this);
    	favouriteBtn.setOnMouseClicked(this);
    	cookedBtn.setOnMouseClicked(this);
    	
		//Buttons layout inside the flow pane
    	rootFlowPane.setAlignment(Pos.CENTER);
    	rootFlowPane.setHgap(10);
    	mealBtn.setMinSize(120,30);
    	favouriteBtn.setMinSize(120,30);
      	cookedBtn.setMinSize(120,30);
    	
      	//Adding of buttons to Flowpane
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
	    //Check if the event source is the "mealBtn" button
	    if (event.getSource() == mealBtn) 
	    {
	        //Set the title of the primary stage to indicate the MealFX window
	        App.primaryStage.setTitle("MealFX Window");

	        //Switch the main scene to meal scene
	        App.primaryStage.setScene(App.mealScene);
	    }
	    //Check if the event source is the "favouriteBtn" button
	    else if (event.getSource() == favouriteBtn) 
	    {
	        //Set the title of the primary stage to indicate the FavouriteFX window
	        App.primaryStage.setTitle("FavouriteFX Window");

	        //Creation of a new FavouriteScene
	        FavouriteSceneCreator favouriteSceneCreator = new FavouriteSceneCreator();
	        Scene favouriteScene = favouriteSceneCreator.createScene();

	        //Switch the main scene to favourite scene
	        App.primaryStage.setScene(favouriteScene);
	    }
	    //Check if the event source is the "cookedBtn" button
	    else
	    {
	        //Set the title of the primary stage to indicate the CookedFX window
	        App.primaryStage.setTitle("CookedFX Window");

	        //Creation of a new CookedScene
	        CookedSceneCreator cookedSceneCreator = new CookedSceneCreator();
	        Scene cookedScene = cookedSceneCreator.createScene();

	        //Switch the main scene to cooked scene
	        App.primaryStage.setScene(cookedScene);
	    }
	}
}




