//Class "MainSceneCreator" belongs to package "gr.unipi.MealFX"
package gr.unipi.MealFX;

//Import of JavaFX classes for events handling
import javafx.event.EventHandler;

//Import of JavaFX classes for UI layout and positioning
import javafx.geometry.Pos;       //Enumeration for nodes positioning/alignment
import javafx.scene.Scene;        //Representation of a scene to be displayed in a Stage
import javafx.scene.control.Button; //JavaFX Button control
import javafx.scene.input.MouseEvent; //Event class for mouse events
import javafx.scene.layout.FlowPane;  //Layout pane for nodes arrangements in a flow (horizontal/vertical)

//Class "MainSceneCreator" for main scene implementation
public class MainSceneCreator implements EventHandler<MouseEvent> 
{
	//Flow Pane
	FlowPane rootFlowPane;
	//Main scene buttons
	Button mealBtn, favouriteBtn, cookedBtn;

	//Constructor for main scene implementation
	public MainSceneCreator() 
	{
    	//Creation of flow pane and buttons
		rootFlowPane = new FlowPane();
    	mealBtn = new Button("Meal");
    	favouriteBtn = new Button("Favourite");
    	cookedBtn = new Button("Cooked");
    	
    	//Attachment of handling event to buttons
    	mealBtn.setOnMouseClicked(this);
    	favouriteBtn.setOnMouseClicked(this);
    	cookedBtn.setOnMouseClicked(this);
    	
		//Buttons layout inside the flow pane
    	rootFlowPane.setAlignment(Pos.CENTER);
    	rootFlowPane.setHgap(10);
    	mealBtn.setMinSize(120,30);
    	favouriteBtn.setMinSize(120,30);
      	cookedBtn.setMinSize(120,30);
    	
      	//Adding of buttons to flow pane
    	rootFlowPane.getChildren().add(mealBtn);
    	rootFlowPane.getChildren().add(favouriteBtn);
    	rootFlowPane.getChildren().add(cookedBtn);
	}
	
	//Method of a JavaFX Scene creation and return for this UI
    Scene createScene()
    {
	    //Creation of a new Scene using the grid pane as the root layout
	    //Setting of the width of the scene to 650 pixels and the height to 300 pixels
	    return new Scene(rootFlowPane, 650, 300);
    }

	//Overriding of the handling method from EventHandler to respond to mouse events
	@Override
	public void handle(MouseEvent event) 
	{
	    //Checking of the the "Meal" button as the event source
	    if (event.getSource() == mealBtn) 
	    {
	        //Setting of the primary stage title for the MealFX window indication
	        App.primaryStage.setTitle("MealFX Window");

	        //Switching of the main scene to meal scene
	        App.primaryStage.setScene(App.mealScene);
	    }
	    //Checking of the "Favourite" button as the event source
	    else if (event.getSource() == favouriteBtn) 
	    {
	        //Setting of the primary stage title for the FavouriteFX window indication
	        App.primaryStage.setTitle("FavouriteFX Window");

	        //Creation of favourite scene
	        FavouriteSceneCreator favouriteSceneCreator = new FavouriteSceneCreator();
	        Scene favouriteScene = favouriteSceneCreator.createScene();

	        //Switching of main scene to favourite scene
	        App.primaryStage.setScene(favouriteScene);
	    }
	    //Checking of the "Cooked" button as the event source
	    else
	    {
	        //Setting of the primary stage title for the CookedFX window indication
			App.primaryStage.setTitle("CookedFX Window");

	        //Creation of cooked scene
	        CookedSceneCreator cookedSceneCreator = new CookedSceneCreator();
	        Scene cookedScene = cookedSceneCreator.createScene();

	        //Switching of main scene to cooked scene
	        App.primaryStage.setScene(cookedScene);
	    }
	}
}//Class "MainSceneCreator" belongs to package "gr.unipi.MealFX"
package gr.unipi.MealFX;

//Import of JavaFX classes for events handling
import javafx.event.EventHandler;

//Import of JavaFX classes for UI layout and positioning
import javafx.geometry.Pos;       //Enumeration for nodes positioning/alignment
import javafx.scene.Scene;        //Representation of a scene to be displayed in a Stage
import javafx.scene.control.Button; //JavaFX Button control
import javafx.scene.input.MouseEvent; //Event class for mouse events
import javafx.scene.layout.FlowPane;  //Layout pane for nodes arrangements in a flow (horizontal/vertical)

//Class "MainSceneCreator" for main scene implementation
public class MainSceneCreator implements EventHandler<MouseEvent> 
{
	//Flow Pane
	FlowPane rootFlowPane;
	//Main scene buttons
	Button mealBtn, favouriteBtn, cookedBtn;

	//Constructor for main scene implementation
	public MainSceneCreator() 
	{
    	//Creation of flow pane and buttons
		rootFlowPane = new FlowPane();
    	mealBtn = new Button("Meal");
    	favouriteBtn = new Button("Favourite");
    	cookedBtn = new Button("Cooked");
    	
    	//Attachment of handling event to buttons
    	mealBtn.setOnMouseClicked(this);
    	favouriteBtn.setOnMouseClicked(this);
    	cookedBtn.setOnMouseClicked(this);
    	
		//Buttons layout inside the flow pane
    	rootFlowPane.setAlignment(Pos.CENTER);
    	rootFlowPane.setHgap(10);
    	mealBtn.setMinSize(120,30);
    	favouriteBtn.setMinSize(120,30);
      	cookedBtn.setMinSize(120,30);
    	
      	//Adding of buttons to flow pane
    	rootFlowPane.getChildren().add(mealBtn);
    	rootFlowPane.getChildren().add(favouriteBtn);
    	rootFlowPane.getChildren().add(cookedBtn);
	}
	
	//Method of a JavaFX Scene creation and return for this UI
    Scene createScene()
    {
	    //Creation of a new Scene using the grid pane as the root layout
	    //Setting of the width of the scene to 650 pixels and the height to 300 pixels
	    return new Scene(rootFlowPane, 650, 300);
    }

	//Overriding of the handling method from EventHandler to respond to mouse events
	@Override
	public void handle(MouseEvent event) 
	{
	    //Checking of the the "Meal" button as the event source
	    if (event.getSource() == mealBtn) 
	    {
	        //Setting of the primary stage title for the MealFX window indication
	        App.primaryStage.setTitle("MealFX Window");

	        //Switching of the main scene to meal scene
	        App.primaryStage.setScene(App.mealScene);
	    }
	    //Checking of the "Favourite" button as the event source
	    else if (event.getSource() == favouriteBtn) 
	    {
	        //Setting of the primary stage title for the FavouriteFX window indication
	        App.primaryStage.setTitle("FavouriteFX Window");

	        //Creation of favourite scene
	        FavouriteSceneCreator favouriteSceneCreator = new FavouriteSceneCreator();
	        Scene favouriteScene = favouriteSceneCreator.createScene();

	        //Switching of main scene to favourite scene
	        App.primaryStage.setScene(favouriteScene);
	    }
	    //Checking of the "Cooked" button as the event source
	    else
	    {
	        //Setting of the primary stage title for the CookedFX window indication
			App.primaryStage.setTitle("CookedFX Window");

	        //Creation of cooked scene
	        CookedSceneCreator cookedSceneCreator = new CookedSceneCreator();
	        Scene cookedScene = cookedSceneCreator.createScene();

	        //Switching of main scene to cooked scene
	        App.primaryStage.setScene(cookedScene);
	    }
	}
}
