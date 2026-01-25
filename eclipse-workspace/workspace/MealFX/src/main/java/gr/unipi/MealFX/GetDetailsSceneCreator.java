//Declare the package for this class
package gr.unipi.MealFX;

//Import the List interface to hold collections of MealInfo objects
import java.util.List;

//Import JavaFX classes for event handling
import javafx.event.EventHandler;       //Interface to handle input events
import javafx.geometry.Pos;             //Enum for node alignment in layouts
import javafx.scene.Parent;             //Base class for all scene graph nodes
import javafx.scene.Scene;              //Represents a JavaFX Scene
import javafx.scene.control.Button;     //JavaFX Button control
import javafx.scene.control.Label;      //JavaFX Label control for displaying text
import javafx.scene.control.TableColumn;//JavaFX TableColumn to display data in TableView
import javafx.scene.control.TableView;  //JavaFX TableView to display tabular data
import javafx.scene.control.TextField;  //JavaFX TextField for user input
import javafx.scene.control.cell.PropertyValueFactory; //Maps object properties to TableView columns
import javafx.scene.input.MouseEvent;   //Mouse event class for click handling
import javafx.scene.layout.FlowPane;    //Layout pane that arranges nodes in a flow (horizontal/vertical)
import javafx.scene.layout.GridPane;    //Layout pane that arranges nodes in a grid
import model.MealInfo;                  //Custom model class representing a meal

//Define the GetDetailsSceneCreator class that implements EventHandler for MouseEvents
public class GetDetailsSceneCreator implements EventHandler<MouseEvent> 
{
	//Declare a GridPane to serve as the main layout for this scene
	GridPane rootGridPane;

	//Declare a TableView to display MealInfo objects
	TableView<MealInfo> MealTableView;

	//Constructor for GetDetailsSceneCreator that takes a single MealInfo object
	public GetDetailsSceneCreator(MealInfo meal) 
	{
	    //Initialize the root GridPane that will hold all UI elements in a grid layout
	    rootGridPane = new GridPane();

	    //Initialize the TableView to display details of the provided MealInfo
	    MealTableView = new TableView<MealInfo>();
		
	    //Create a TableColumn for the "strInstructions" property
        TableColumn<MealInfo, String> strInstructionsColumn = new TableColumn<>("strInstructions");
        //Bind the column to the "strInstructions" property
        strInstructionsColumn.setCellValueFactory(new PropertyValueFactory<>("strInstructions"));
        //Add the column to the TableView
        MealTableView.getColumns().add(strInstructionsColumn);

        //Create a TableColumn for the "strMealThumb" property (image URL)
        TableColumn<MealInfo, String> strMealThumbColumn = new TableColumn<>("strMealThumb");
        //Bind the column to the "strMealThumb" property
        strMealThumbColumn.setCellValueFactory(new PropertyValueFactory<>("strMealThumb"));
        //Add the column to the TableView
        MealTableView.getColumns().add(strMealThumbColumn);


	    //Create a TableColumn for the first ingredient (strIngredient1) of MealInfo
		TableColumn<MealInfo, String> strIngredient1Column = new TableColumn<>("strIngredient1");

		//Bind the strIngredient1 property of MealInfo to this column
		strIngredient1Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient1"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient1Column);

		//Create a TableColumn for the second ingredient (strIngredient2) of MealInfo
		TableColumn<MealInfo, String> strIngredient2Column = new TableColumn<>("strIngredient2");

		//Bind the strIngredient2 property of MealInfo to this column
		strIngredient2Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient2"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient2Column);

		//Create a TableColumn for the third ingredient (strIngredient3) of MealInfo
		TableColumn<MealInfo, String> strIngredient3Column = new TableColumn<>("strIngredient3");

		//Bind the strIngredient3 property of MealInfo to this column
		strIngredient3Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient3"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient3Column);

		//Create a TableColumn for the fourth ingredient (strIngredient4) of MealInfo
		TableColumn<MealInfo, String> strIngredient4Column = new TableColumn<>("strIngredient4");

		//Bind the strIngredient4 property of MealInfo to this column
		strIngredient4Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient4"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient4Column);

		//Create a TableColumn for the fifth ingredient (strIngredient5) of MealInfo
		TableColumn<MealInfo, String> strIngredient5Column = new TableColumn<>("strIngredient5");

		//Bind the strIngredient5 property of MealInfo to this column
		strIngredient5Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient5"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient5Column);

		//Create a TableColumn for the sixth ingredient (strIngredient6) of MealInfo
		TableColumn<MealInfo, String> strIngredient6Column = new TableColumn<>("strIngredient6");

		//Bind the strIngredient6 property of MealInfo to this column
		strIngredient6Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient6"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient6Column);

		//Create a TableColumn for the seventh ingredient (strIngredient7) of MealInfo
		TableColumn<MealInfo, String> strIngredient7Column = new TableColumn<>("strIngredient7");

		//Bind the strIngredient7 property of MealInfo to this column
		strIngredient7Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient7"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient7Column);

		//Create a TableColumn for the eighth ingredient (strIngredient8) of MealInfo
		TableColumn<MealInfo, String> strIngredient8Column = new TableColumn<>("strIngredient8");

		//Bind the strIngredient8 property of MealInfo to this column
		strIngredient8Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient8"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient8Column);

		//Create a TableColumn for the ninth ingredient (strIngredient9) of MealInfo
		TableColumn<MealInfo, String> strIngredient9Column = new TableColumn<>("strIngredient9");

		//Bind the strIngredient9 property of MealInfo to this column
		strIngredient9Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient9"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient9Column);

		//Create a TableColumn for the tenth ingredient (strIngredient10) of MealInfo
		TableColumn<MealInfo, String> strIngredient10Column = new TableColumn<>("strIngredient10");

		//Bind the strIngredient10 property of MealInfo to this column
		strIngredient10Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient10"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient10Column);

		//Create a TableColumn for the eleventh ingredient (strIngredient11) of MealInfo
		TableColumn<MealInfo, String> strIngredient11Column = new TableColumn<>("strIngredient11");

		//Bind the strIngredient11 property of MealInfo to this column
		strIngredient11Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient11"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient11Column);

		//Create a TableColumn for the twelfth ingredient (strIngredient12) of MealInfo
		TableColumn<MealInfo, String> strIngredient12Column = new TableColumn<>("strIngredient12");

		//Bind the strIngredient12 property of MealInfo to this column
		strIngredient12Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient12"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient12Column);

		//Create a TableColumn for the thirteenth ingredient (strIngredient13) of MealInfo
		TableColumn<MealInfo, String> strIngredient13Column = new TableColumn<>("strIngredient13");

		//Bind the strIngredient13 property of MealInfo to this column
		strIngredient13Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient13"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient13Column);

		//Create a TableColumn for the fourteenth ingredient (strIngredient14) of MealInfo
		TableColumn<MealInfo, String> strIngredient14Column = new TableColumn<>("strIngredient14");

		//Bind the strIngredient14 property of MealInfo to this column
		strIngredient14Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient14"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient14Column);

		//Create a TableColumn for the fifteenth ingredient (strIngredient15) of MealInfo
		TableColumn<MealInfo, String> strIngredient15Column = new TableColumn<>("strIngredient15");

		//Bind the strIngredient15 property of MealInfo to this column
		strIngredient15Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient15"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient15Column);

		//Create a TableColumn for the sixteenth ingredient (strIngredient16) of MealInfo
		TableColumn<MealInfo, String> strIngredient16Column = new TableColumn<>("strIngredient16");

		//Bind the strIngredient16 property of MealInfo to this column
		strIngredient16Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient16"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient16Column);

		//Create a TableColumn for the seventeenth ingredient (strIngredient17) of MealInfo
		TableColumn<MealInfo, String> strIngredient17Column = new TableColumn<>("strIngredient17");

		//Bind the strIngredient17 property of MealInfo to this column
		strIngredient17Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient17"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient17Column);

		//Create a TableColumn for the eighteenth ingredient (strIngredient18) of MealInfo
		TableColumn<MealInfo, String> strIngredient18Column = new TableColumn<>("strIngredient18");

		//Bind the strIngredient18 property of MealInfo to this column
		strIngredient18Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient18"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient18Column);

		//Create a TableColumn for the nineteenth ingredient (strIngredient19) of MealInfo
		TableColumn<MealInfo, String> strIngredient19Column = new TableColumn<>("strIngredient19");

		//Bind the strIngredient19 property of MealInfo to this column
		strIngredient19Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient19"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient19Column);

		//Create a TableColumn for the twentieth ingredient (strIngredient20) of MealInfo
		TableColumn<MealInfo, String> strIngredient20Column = new TableColumn<>("strIngredient20");

		//Bind the strIngredient20 property of MealInfo to this column
		strIngredient20Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient20"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strIngredient20Column);

			
	    //Create a TableColumn for the first measurement (strMeasure1) of MealInfo
		TableColumn<MealInfo, String> strMeasure1Column = new TableColumn<>("strMeasure1");

		//Bind the strMeasure1 property of MealInfo to this column
		strMeasure1Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure1"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure1Column);

		//Create a TableColumn for the second measurement (strMeasure2) of MealInfo
		TableColumn<MealInfo, String> strMeasure2Column = new TableColumn<>("strMeasure2");

		//Bind the strMeasure2 property of MealInfo to this column
		strMeasure2Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure2"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure2Column);

		//Create a TableColumn for the third measurement (strMeasure3) of MealInfo
		TableColumn<MealInfo, String> strMeasure3Column = new TableColumn<>("strMeasure3");

		//Bind the strMeasure3 property of MealInfo to this column
		strMeasure3Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure3"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure3Column);

		//Create a TableColumn for the fourth measurement (strMeasure4) of MealInfo
		TableColumn<MealInfo, String> strMeasure4Column = new TableColumn<>("strMeasure4");

		//Bind the strMeasure4 property of MealInfo to this column
		strMeasure4Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure4"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure4Column);

		//Create a TableColumn for the fifth measurement (strMeasure5) of MealInfo
		TableColumn<MealInfo, String> strMeasure5Column = new TableColumn<>("strMeasure5");

		//Bind the strMeasure5 property of MealInfo to this column
		strMeasure5Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure5"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure5Column);

		//Create a TableColumn for the sixth measurement (strMeasure6) of MealInfo
		TableColumn<MealInfo, String> strMeasure6Column = new TableColumn<>("strMeasure6");

		//Bind the strMeasure6 property of MealInfo to this column
		strMeasure6Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure6"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure6Column);

		//Create a TableColumn for the seventh measurement (strMeasure7) of MealInfo
		TableColumn<MealInfo, String> strMeasure7Column = new TableColumn<>("strMeasure7");

		//Bind the strMeasure7 property of MealInfo to this column
		strMeasure7Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure7"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure7Column);

		//Create a TableColumn for the eighth measurement (strMeasure8) of MealInfo
		TableColumn<MealInfo, String> strMeasure8Column = new TableColumn<>("strMeasure8");

		//Bind the strMeasure8 property of MealInfo to this column
		strMeasure8Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure8"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure8Column);

		//Create a TableColumn for the ninth measurement (strMeasure9) of MealInfo
		TableColumn<MealInfo, String> strMeasure9Column = new TableColumn<>("strMeasure9");

		//Bind the strMeasure9 property of MealInfo to this column
		strMeasure9Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure9"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure9Column);

		//Create a TableColumn for the tenth measurement (strMeasure10) of MealInfo
		TableColumn<MealInfo, String> strMeasure10Column = new TableColumn<>("strMeasure10");

		//Bind the strMeasure10 property of MealInfo to this column
		strMeasure10Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure10"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure10Column);

		//Create a TableColumn for the eleventh measurement (strMeasure11) of MealInfo
		TableColumn<MealInfo, String> strMeasure11Column = new TableColumn<>("strMeasure11");

		//Bind the strMeasure11 property of MealInfo to this column
		strMeasure11Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure11"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure11Column);

		//Create a TableColumn for the twelfth measurement (strMeasure12) of MealInfo
		TableColumn<MealInfo, String> strMeasure12Column = new TableColumn<>("strMeasure12");

		//Bind the strMeasure12 property of MealInfo to this column
		strMeasure12Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure12"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure12Column);

		//Create a TableColumn for the thirteenth measurement (strMeasure13) of MealInfo
		TableColumn<MealInfo, String> strMeasure13Column = new TableColumn<>("strMeasure13");

		//Bind the strMeasure13 property of MealInfo to this column
		strMeasure13Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure13"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure13Column);

		//Create a TableColumn for the fourteenth measurement (strMeasure14) of MealInfo
		TableColumn<MealInfo, String> strMeasure14Column = new TableColumn<>("strMeasure14");

		//Bind the strMeasure14 property of MealInfo to this column
		strMeasure14Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure14"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure14Column);

		//Create a TableColumn for the fifteenth measurement (strMeasure15) of MealInfo
		TableColumn<MealInfo, String> strMeasure15Column = new TableColumn<>("strMeasure15");

		//Bind the strMeasure15 property of MealInfo to this column
		strMeasure15Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure15"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure15Column);

		//Create a TableColumn for the sixteenth measurement (strMeasure16) of MealInfo
		TableColumn<MealInfo, String> strMeasure16Column = new TableColumn<>("strMeasure16");

		//Bind the strMeasure16 property of MealInfo to this column
		strMeasure16Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure16"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure16Column);

		//Create a TableColumn for the seventeenth measurement (strMeasure17) of MealInfo
		TableColumn<MealInfo, String> strMeasure17Column = new TableColumn<>("strMeasure17");

		//Bind the strMeasure17 property of MealInfo to this column
		strMeasure17Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure17"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure17Column);

		//Create a TableColumn for the eighteenth measurement (strMeasure18) of MealInfo
		TableColumn<MealInfo, String> strMeasure18Column = new TableColumn<>("strMeasure18");

		//Bind the strMeasure18 property of MealInfo to this column
		strMeasure18Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure18"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure18Column);

		//Create a TableColumn for the nineteenth measurement (strMeasure19) of MealInfo
		TableColumn<MealInfo, String> strMeasure19Column = new TableColumn<>("strMeasure19");

		//Bind the strMeasure19 property of MealInfo to this column
		strMeasure19Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure19"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure19Column);

		//Create a TableColumn for the twentieth measurement (strMeasure20) of MealInfo
		TableColumn<MealInfo, String> strMeasure20Column = new TableColumn<>("strMeasure20");

		//Bind the strMeasure20 property of MealInfo to this column
		strMeasure20Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure20"));

		//Add this column to the MealTableView
		MealTableView.getColumns().add(strMeasure20Column);
	
	    //Add the TableView (MealTableView) to the root GridPane at column 0, row 0
		rootGridPane.add(MealTableView, 0, 0);

		//Get the list of items currently displayed in the TableView
		List<MealInfo> items = MealTableView.getItems();

		//Clear all existing items from the TableView
		items.clear();

		//Add a new MealInfo object (meal) to the TableView
		items.add(meal);
	}
	
	//Method to create and return a JavaFX Scene for this UI
    Scene createScene()
    {
		//Create a new Scene using the rootGridPane as the root layout
		//Set the width of the scene to 650 pixels and the height to 300 pixels
		return new Scene(rootGridPane, 650, 300);
    }

	//Override the handle method from the EventHandler interface to respond to mouse events
    @Override
    public void handle(MouseEvent event) 
    {
		
	}
}


