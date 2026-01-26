//Class «GetDetailsSceneCreator» belongs package «gr.unipi.MealFX»
package gr.unipi.MealFX;

//Import of the List interface to hold collections of MealInfo objects
import java.util.List;

//Import JavaFX classes for event handling
import javafx.event.EventHandler;       //Interface to handle input events
import javafx.geometry.Pos;             //Enum for node alignment in layouts
import javafx.scene.Parent;             //Base class for all scene graph nodes
import javafx.scene.Scene;              //Representation of a JavaFX Scene
import javafx.scene.control.Button;     //JavaFX Button control
import javafx.scene.control.Label;      //JavaFX Label control for displaying text
import javafx.scene.control.TableColumn;//JavaFX TableColumn to display data in TableView
import javafx.scene.control.TableView;  //JavaFX TableView to display tabular data
import javafx.scene.control.TextField;  //JavaFX TextField for user input
import javafx.scene.control.cell.PropertyValueFactory; //Maps object properties to TableView columns
import javafx.scene.input.MouseEvent;   //Mouse event class for click handling
import javafx.scene.layout.FlowPane;    //Layout pane that arranges nodes in a flow (horizontal/vertical)
import javafx.scene.layout.GridPane;    //Layout pane that arranges nodes in a grid (vertical)
import model.MealInfo;                  //Custom model class representing a meal

//Class class «GetDetailsSceneCreator» to display instructions, images, ingredients and ingredients measurements of meal
public class GetDetailsSceneCreator implements EventHandler<MouseEvent> 
{
	//Grid Pane
	GridPane rootGridPane;

	//TableView
	TableView<MealInfo> MealTableView;

	//Constructor for GetDetailsSceneCreator that takes a single MealInfo object
	public GetDetailsSceneCreator(MealInfo meal) 
	{
	    //Creation of a grid pane
	    rootGridPane = new GridPane();

	    //Creation of a TableView
	    MealTableView = new TableView<MealInfo>();
		
	    //Creation of a TableColumn for the «strInstructions» property
        TableColumn<MealInfo, String> strInstructionsColumn = new TableColumn<>("strInstructions");
        //Binding of the column to the «strInstructions» property
        strInstructionsColumn.setCellValueFactory(new PropertyValueFactory<>("strInstructions"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strInstructionsColumn);

        //Creation of a TableColumn for the «strMealThumb» property
        TableColumn<MealInfo, String> strMealThumbColumn = new TableColumn<>("strMealThumb");
        //Binding of the column to the «strMealThumb» property
        strMealThumbColumn.setCellValueFactory(new PropertyValueFactory<>("strMealThumb"));
        //Adding of the column to the TableView
        MealTableView.getColumns().add(strMealThumbColumn);


	    //Creation of a TableColumn for the «strIngredient1» of MealInfo
		TableColumn<MealInfo, String> strIngredient1Column = new TableColumn<>("strIngredient1");

		//Binding of the column to the «strIngredient1» property
		strIngredient1Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient1"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient1Column);

		//Creation of a TableColumn for the «strIngredient2» of MealInfo
		TableColumn<MealInfo, String> strIngredient2Column = new TableColumn<>("strIngredient2");

		//Binding of the column to the «strIngredient2» property
		strIngredient2Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient2"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient2Column);

		//Creation of a TableColumn for the «strIngredient3» of MealInfo
		TableColumn<MealInfo, String> strIngredient3Column = new TableColumn<>("strIngredient3");

		//Binding of the column to the «strIngredient3» property
		strIngredient3Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient3"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient3Column);

		//Creation of a TableColumn for the «strIngredient4» of MealInfo
		TableColumn<MealInfo, String> strIngredient4Column = new TableColumn<>("strIngredient4");

		//Binding of the column to the «strIngredient4» property
		strIngredient4Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient4"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient4Column);

		//Creation of a TableColumn for the «strIngredient5» of MealInfo
		TableColumn<MealInfo, String> strIngredient5Column = new TableColumn<>("strIngredient5");

		//Binding of the column to the «strIngredient5» property
		strIngredient5Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient5"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient5Column);

		//Creation of a TableColumn for the «strIngredient6» of MealInfo
		TableColumn<MealInfo, String> strIngredient6Column = new TableColumn<>("strIngredient6");

		//Binding of the column to the «strIngredient6» property
		strIngredient6Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient6"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient6Column);

		//Creation of a TableColumn for the «strIngredient7» of MealInfo
		TableColumn<MealInfo, String> strIngredient7Column = new TableColumn<>("strIngredient7");

		//Binding of the column to the «strIngredient7» property
		strIngredient7Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient7"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient7Column);

		//Creation of a TableColumn for the «strIngredient8» of MealInfo
		TableColumn<MealInfo, String> strIngredient8Column = new TableColumn<>("strIngredient8");

		//Binding of the column to the «strIngredient8» property
		strIngredient8Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient8"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient8Column);

		//Creation of a TableColumn for the «strIngredient9» of MealInfo
		TableColumn<MealInfo, String> strIngredient9Column = new TableColumn<>("strIngredient9");

		//Binding of the column to the «strIngredient9» property
		strIngredient9Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient9"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient9Column);

		//Creation of a TableColumn for the «strIngredient10» of MealInfo
		TableColumn<MealInfo, String> strIngredient10Column = new TableColumn<>("strIngredient10");

		//Binding of the column to the «strIngredient10» property
		strIngredient10Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient10"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient10Column);

		//Creation of a TableColumn for the «strIngredient11» of MealInfo
		TableColumn<MealInfo, String> strIngredient11Column = new TableColumn<>("strIngredient11");

		//Binding of the column to the «strIngredient11» property
		strIngredient11Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient11"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient11Column);

		//Creation of a TableColumn for the «strIngredient12» of MealInfo
		TableColumn<MealInfo, String> strIngredient12Column = new TableColumn<>("strIngredient12");

		//Binding of the column to the «strIngredient12» property
		strIngredient12Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient12"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient12Column);

		//Creation of a TableColumn for the «strIngredient13» of MealInfo
		TableColumn<MealInfo, String> strIngredient13Column = new TableColumn<>("strIngredient13");

		//Binding of the column to the «strIngredient13» property
		strIngredient13Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient13"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient13Column);

		//Creation of a TableColumn for the «strIngredient14» of MealInfo
		TableColumn<MealInfo, String> strIngredient14Column = new TableColumn<>("strIngredient14");

		//Binding of the column to the «strIngredient14» property
		strIngredient14Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient14"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient14Column);

		//Creation of a TableColumn for the «strIngredient15» of MealInfo
		TableColumn<MealInfo, String> strIngredient15Column = new TableColumn<>("strIngredient15");

		//Binding of the column to the «strIngredient15» property
		strIngredient15Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient15"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient15Column);

		//Creation of a TableColumn for the «strIngredient16» of MealInfo
		TableColumn<MealInfo, String> strIngredient16Column = new TableColumn<>("strIngredient16");

		//Binding of the column to the «strIngredient16» property
		strIngredient16Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient16"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient16Column);

		//Creation of a TableColumn for the «strIngredient17» of MealInfo
		TableColumn<MealInfo, String> strIngredient17Column = new TableColumn<>("strIngredient17");

		//Binding of the column to the «strIngredient17» property
		strIngredient17Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient17"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient17Column);

		//Creation of a TableColumn for the «strIngredient18» of MealInfo
		TableColumn<MealInfo, String> strIngredient18Column = new TableColumn<>("strIngredient18");

		//Binding of the column to the «strIngredient18» property
		strIngredient18Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient18"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient18Column);

		//Creation of a TableColumn for the «strIngredient19» of MealInfo
		TableColumn<MealInfo, String> strIngredient19Column = new TableColumn<>("strIngredient19");

		//Binding of the column to the «strIngredient19» property
		strIngredient19Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient19"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient19Column);

		//Creation of a TableColumn for the «strIngredient20» of MealInfo
		TableColumn<MealInfo, String> strIngredient20Column = new TableColumn<>("strIngredient20");

		//Binding of the column to the «strIngredient20» property
		strIngredient20Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient20"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strIngredient20Column);

			
	    //Creation of a TableColumn for the «strMeasure1» of MealInfo
		TableColumn<MealInfo, String> strMeasure1Column = new TableColumn<>("strMeasure1");

		//Binding of the column to the «strMeasure1» property
		strMeasure1Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure1"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure1Column);

		//Creation of a TableColumn for the «strMeasure2» of MealInfo
		TableColumn<MealInfo, String> strMeasure2Column = new TableColumn<>("strMeasure2");

		//Binding of the column to the «strMeasure2» property
		strMeasure2Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure2"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure2Column);

		//Creation of a TableColumn for the «strMeasure3» of MealInfo
		TableColumn<MealInfo, String> strMeasure3Column = new TableColumn<>("strMeasure3");

		//Binding of the column to the «strMeasure3» property
		strMeasure3Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure3"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure3Column);

		//Creation of a TableColumn for the «strMeasure4» of MealInfo
		TableColumn<MealInfo, String> strMeasure4Column = new TableColumn<>("strMeasure4");

		//Binding of the column to the «strMeasure4» property
		strMeasure4Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure4"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure4Column);

		//Creation of a TableColumn for the «strMeasure5» of MealInfo
		TableColumn<MealInfo, String> strMeasure5Column = new TableColumn<>("strMeasure5");

		//Binding of the column to the «strMeasure5» property
		strMeasure5Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure5"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure5Column);

		//Creation of a TableColumn for the «strMeasure6» of MealInfo
		TableColumn<MealInfo, String> strMeasure6Column = new TableColumn<>("strMeasure6");

		//Binding of the column to the «strMeasure6» property
		strMeasure6Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure6"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure6Column);

		//Creation of a TableColumn for the «strMeasure7» of MealInfo
		TableColumn<MealInfo, String> strMeasure7Column = new TableColumn<>("strMeasure7");

		//Binding of the column to the «strMeasure7» property
		strMeasure7Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure7"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure7Column);

		//Creation of a TableColumn for the «strMeasure8» of MealInfo
		TableColumn<MealInfo, String> strMeasure8Column = new TableColumn<>("strMeasure8");

		//Binding of the column to the «strMeasure8» property
		strMeasure8Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure8"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure8Column);

		//Creation of a TableColumn for the «strMeasure9» of MealInfo
		TableColumn<MealInfo, String> strMeasure9Column = new TableColumn<>("strMeasure9");

		//Binding of the column to the «strMeasure9» property
		strMeasure9Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure9"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure9Column);

		//Creation of a TableColumn for the «strMeasure10» of MealInfo
		TableColumn<MealInfo, String> strMeasure10Column = new TableColumn<>("strMeasure10");

		//Binding of the column to the «strMeasure10» property
		strMeasure10Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure10"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure10Column);

		//Creation of a TableColumn for the «strMeasure11» of MealInfo
		TableColumn<MealInfo, String> strMeasure11Column = new TableColumn<>("strMeasure11");

		//Binding of the column to the «strMeasure11» property
		strMeasure11Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure11"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure11Column);

		//Creation of a TableColumn for the «strMeasure12» of MealInfo
		TableColumn<MealInfo, String> strMeasure12Column = new TableColumn<>("strMeasure12");

		//Binding of the column to the «strMeasure12» property
		strMeasure12Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure12"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure12Column);

		//Creation of a TableColumn for the «strMeasure13» of MealInfo
		TableColumn<MealInfo, String> strMeasure13Column = new TableColumn<>("strMeasure13");

		//Binding of the column to the «strMeasure13» property
		strMeasure13Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure13"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure13Column);

		//Creation of a TableColumn for the «strMeasure14» of MealInfo
		TableColumn<MealInfo, String> strMeasure14Column = new TableColumn<>("strMeasure14");

		//Binding of the column to the «strMeasure14» property
		strMeasure14Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure14"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure14Column);

		//Creation of a TableColumn for the «strMeasure15» of MealInfo
		TableColumn<MealInfo, String> strMeasure15Column = new TableColumn<>("strMeasure15");

		//Binding of the column to the «strMeasure15» property
		strMeasure15Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure15"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure15Column);

		//Creation of a TableColumn for the «strMeasure16» of MealInfo
		TableColumn<MealInfo, String> strMeasure16Column = new TableColumn<>("strMeasure16");

		//Binding of the column to the «strMeasure16» property
		strMeasure16Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure16"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure16Column);

		//Creation of a TableColumn for the «strMeasure17» of MealInfo
		TableColumn<MealInfo, String> strMeasure17Column = new TableColumn<>("strMeasure17");

		//Binding of the column to the «strMeasure17» property
		strMeasure17Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure17"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure17Column);

		//Creation of a TableColumn for the «strMeasure18» of MealInfo
		TableColumn<MealInfo, String> strMeasure18Column = new TableColumn<>("strMeasure18");

		//Binding of the column to the «strMeasure18» property
		strMeasure18Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure18"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure18Column);

		//Creation of a TableColumn for the «strMeasure19» of MealInfo
		TableColumn<MealInfo, String> strMeasure19Column = new TableColumn<>("strMeasure19");

		//Binding of the column to the «strMeasure19» property
		strMeasure19Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure19"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure19Column);

		//Creation of a TableColumn for the «strMeasure20» of MealInfo
		TableColumn<MealInfo, String> strMeasure20Column = new TableColumn<>("strMeasure20");

		//Binding of the column to the «strMeasure20» property
		strMeasure20Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure20"));

		//Adding of this column to the MealTableView
		MealTableView.getColumns().add(strMeasure20Column);
	
	    //Adding of the TableView to the grid pane
		rootGridPane.add(MealTableView, 0, 0);

		//Get the list of items currently displayed in the TableView
		List<MealInfo> items = MealTableView.getItems();

		//Clearance of all existing items from the TableView
		items.clear();

		//Adding a new MealInfo object to the TableView
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




