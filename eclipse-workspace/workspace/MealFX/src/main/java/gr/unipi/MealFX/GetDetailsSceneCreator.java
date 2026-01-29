//Class "GetDetailsSceneCreator" belongs to package "gr.unipi.MealFX"
package gr.unipi.MealFX;

//Import of the List interface for holding MealInfo objects collections
import java.util.List;

//Import JavaFX classes for event handling
import javafx.event.EventHandler;       //Interface to handle input events
import javafx.geometry.Pos;             //Enumeration for node alignment in layouts
import javafx.scene.Parent;             //Base class for all scene graph nodes
import javafx.scene.Scene;              //Representation of a JavaFX Scene
import javafx.scene.control.Button;     //JavaFX Button control
import javafx.scene.control.Label;      //JavaFX Label control for displaying text
import javafx.scene.control.TableColumn;//JavaFX TableColumn for displaying data in TableView
import javafx.scene.control.TableView;  //JavaFX TableView for tabular data displaying 
import javafx.scene.control.TextField;  //JavaFX TextField for user input
import javafx.scene.control.cell.PropertyValueFactory; //Maps object properties to TableView columns
import javafx.scene.input.MouseEvent;   //Mouse event class for click handling
import javafx.scene.layout.FlowPane;    //Layout pane for nodes arrangement in a flow (horizontal/vertical)
import javafx.scene.layout.GridPane;    //Layout pane for nodes arrangement in a grid (vertical)
import model.MealInfo;                  //Custom model class representing a meal

//Class "GetDetailsSceneCreator" of displaying instructions, images, ingredients and ingredients measurements of meal
public class GetDetailsSceneCreator implements EventHandler<MouseEvent> 
{
	//Grid pane
	GridPane rootGridPane;

	//Table view
	TableView<MealInfo> MealTableView;

	//Constructor for GetDetailsSceneCreator taking a single MealInfo object
	public GetDetailsSceneCreator(MealInfo meal) 
	{
	    //Creation of a grid pane
	    rootGridPane = new GridPane();

	    //Creation of a table view
	    MealTableView = new TableView<MealInfo>();
		
	    //Creation of a table column for the "strInstructions" property
        TableColumn<MealInfo, String> strInstructionsColumn = new TableColumn<>("strInstructions");
        //Binding of the column to the "strInstructions" property
        strInstructionsColumn.setCellValueFactory(new PropertyValueFactory<>("strInstructions"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strInstructionsColumn);

        //Creation of a table column for the "strMealThumb" property
        TableColumn<MealInfo, String> strMealThumbColumn = new TableColumn<>("strMealThumb");
        //Binding of the column to the "strMealThumb" property
        strMealThumbColumn.setCellValueFactory(new PropertyValueFactory<>("strMealThumb"));
        //Addition of the column to the table view
        MealTableView.getColumns().add(strMealThumbColumn);


	    //Creation of a table column for the "strIngredient1" property
		TableColumn<MealInfo, String> strIngredient1Column = new TableColumn<>("strIngredient1");
		//Binding of the column to the "strIngredient1" property
		strIngredient1Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient1"));
		//Addition of this column to the table view

		MealTableView.getColumns().add(strIngredient1Column);
		//Creation of a table column for the "strIngredient2" property
		TableColumn<MealInfo, String> strIngredient2Column = new TableColumn<>("strIngredient2");
		//Binding of the column to the "strIngredient2" property
		strIngredient2Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient2"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient2Column);

		//Creation of a table column for the "strIngredient3" property
		TableColumn<MealInfo, String> strIngredient3Column = new TableColumn<>("strIngredient3");
		//Binding of the column to the "strIngredient3" property
		strIngredient3Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient3"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient3Column);

		//Creation of a table column for the "strIngredient4" property
		TableColumn<MealInfo, String> strIngredient4Column = new TableColumn<>("strIngredient4");
		//Binding of the column to the "strIngredient4" property
		strIngredient4Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient4"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient4Column);

		//Creation of a table column for the "strIngredient5" property
		TableColumn<MealInfo, String> strIngredient5Column = new TableColumn<>("strIngredient5");
		//Binding of the column to the "strIngredient5" property
		strIngredient5Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient5"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient5Column);

		//Creation of a table column for the "strIngredient6" property
		TableColumn<MealInfo, String> strIngredient6Column = new TableColumn<>("strIngredient6");
		//Binding of the column to the "strIngredient6" property
		strIngredient6Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient6"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient6Column);

		//Creation of a table column for the "strIngredient7" property
		TableColumn<MealInfo, String> strIngredient7Column = new TableColumn<>("strIngredient7");
		//Binding of the column to the "strIngredient7" property
		strIngredient7Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient7"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient7Column);

		//Creation of a table column for the "strIngredient8" property
		TableColumn<MealInfo, String> strIngredient8Column = new TableColumn<>("strIngredient8");
		//Binding of the column to the "strIngredient8" property
		strIngredient8Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient8"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient8Column);

		//Creation of a table column for the "strIngredient9" property
		TableColumn<MealInfo, String> strIngredient9Column = new TableColumn<>("strIngredient9");
		//Binding of the column to the "strIngredient9" property
		strIngredient9Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient9"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient9Column);

		//Creation of a table column for the "strIngredient10" property
		TableColumn<MealInfo, String> strIngredient10Column = new TableColumn<>("strIngredient10");
		//Binding of the column to the "strIngredient10" property
		strIngredient10Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient10"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient10Column);

		//Creation of a table column for the "strIngredient11" property
		TableColumn<MealInfo, String> strIngredient11Column = new TableColumn<>("strIngredient11");
		//Binding of the column to the "strIngredient11" property
		strIngredient11Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient11"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient11Column);

		//Creation of a table column for the "strIngredient12" property
		TableColumn<MealInfo, String> strIngredient12Column = new TableColumn<>("strIngredient12");
		//Binding of the column to the "strIngredient12" property
		strIngredient12Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient12"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient12Column);

		//Creation of a table column for the "strIngredient13" property
		TableColumn<MealInfo, String> strIngredient13Column = new TableColumn<>("strIngredient13");
		//Binding of the column to the "strIngredient13" property
		strIngredient13Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient13"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient13Column);

		//Creation of a table column for the "strIngredient14" property
		TableColumn<MealInfo, String> strIngredient14Column = new TableColumn<>("strIngredient14");
		//Binding of the column to the "strIngredient14" property
		strIngredient14Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient14"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient14Column);

		//Creation of a table column for the "strIngredient15" property
		TableColumn<MealInfo, String> strIngredient15Column = new TableColumn<>("strIngredient15");
		//Binding of the column to the "strIngredient15" property
		strIngredient15Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient15"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient15Column);

		//Creation of a table column for the "strIngredient16" property
		TableColumn<MealInfo, String> strIngredient16Column = new TableColumn<>("strIngredient16");
		//Binding of the column to the "strIngredient16" property
		strIngredient16Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient16"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient16Column);

		//Creation of a table column for the "strIngredient17" property
		TableColumn<MealInfo, String> strIngredient17Column = new TableColumn<>("strIngredient17");
		//Binding of the column to the "strIngredient17" property
		strIngredient17Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient17"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient17Column);

		//Creation of a table column for the "strIngredient18" property
		TableColumn<MealInfo, String> strIngredient18Column = new TableColumn<>("strIngredient18");
		//Binding of the column to the "strIngredient18" property
		strIngredient18Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient18"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient18Column);

		//Creation of a table column for the "strIngredient19" property
		TableColumn<MealInfo, String> strIngredient19Column = new TableColumn<>("strIngredient19");
		//Binding of the column to the "strIngredient19" property
		strIngredient19Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient19"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient19Column);

		//Creation of a table column for the "strIngredient20" property
		TableColumn<MealInfo, String> strIngredient20Column = new TableColumn<>("strIngredient20");
		//Binding of the column to the "strIngredient20" property
		strIngredient20Column.setCellValueFactory(new PropertyValueFactory<>("strIngredient20"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strIngredient20Column);

	    //Creation of a table column for the "strMeasure1" property
		TableColumn<MealInfo, String> strMeasure1Column = new TableColumn<>("strMeasure1");
		//Binding of the column to the "strMeasure1" property
		strMeasure1Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure1"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure1Column);

		//Creation of a table column for the "strMeasure2" property
		TableColumn<MealInfo, String> strMeasure2Column = new TableColumn<>("strMeasure2");
		//Binding of the column to the "strMeasure2" property
		strMeasure2Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure2"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure2Column);

		//Creation of a table column for the "strMeasure3" property
		TableColumn<MealInfo, String> strMeasure3Column = new TableColumn<>("strMeasure3");
		//Binding of the column to the "strMeasure3" property
		strMeasure3Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure3"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure3Column);

		//Creation of a table column for the "strMeasure4" property
		TableColumn<MealInfo, String> strMeasure4Column = new TableColumn<>("strMeasure4");
		//Binding of the column to the "strMeasure4" property
		strMeasure4Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure4"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure4Column);

		//Creation of a table column for the "strMeasure5" property
		TableColumn<MealInfo, String> strMeasure5Column = new TableColumn<>("strMeasure5");
		//Binding of the column to the "strMeasure5" property
		strMeasure5Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure5"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure5Column);

		//Creation of a table column for the "strMeasure6" property
		TableColumn<MealInfo, String> strMeasure6Column = new TableColumn<>("strMeasure6");
		//Binding of the column to the "strMeasure6" property
		strMeasure6Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure6"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure6Column);

		//Creation of a table column for the "strMeasure7" property
		TableColumn<MealInfo, String> strMeasure7Column = new TableColumn<>("strMeasure7");
		//Binding of the column to the "strMeasure7" property
		strMeasure7Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure7"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure7Column);

		//Creation of a table column for the "strMeasure8" property
		TableColumn<MealInfo, String> strMeasure8Column = new TableColumn<>("strMeasure8");
		//Binding of the column to the "strMeasure8" property
		strMeasure8Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure8"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure8Column);

		//Creation of a table column for the "strMeasure9" property
		TableColumn<MealInfo, String> strMeasure9Column = new TableColumn<>("strMeasure9");
		//Binding of the column to the "strMeasure9" property
		strMeasure9Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure9"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure9Column);

		//Creation of a table column for the "strMeasure10" property
		TableColumn<MealInfo, String> strMeasure10Column = new TableColumn<>("strMeasure10");
		//Binding of the column to the "strMeasure10" property
		strMeasure10Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure10"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure10Column);

		//Creation of a table column for the "strMeasure11" property
		TableColumn<MealInfo, String> strMeasure11Column = new TableColumn<>("strMeasure11");
		//Binding of the column to the "strMeasure11" property
		strMeasure11Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure11"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure11Column);

		//Creation of a table column for the "strMeasure12" property
		TableColumn<MealInfo, String> strMeasure12Column = new TableColumn<>("strMeasure12");
		//Binding of the column to the "strMeasure12" property
		strMeasure12Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure12"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure12Column);

		//Creation of a table column for the "strMeasure13" property
		TableColumn<MealInfo, String> strMeasure13Column = new TableColumn<>("strMeasure13");
		//Binding of the column to the "strMeasure13" property
		strMeasure13Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure13"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure13Column);

		//Creation of a table column for the "strMeasure14" property
		TableColumn<MealInfo, String> strMeasure14Column = new TableColumn<>("strMeasure14");
		//Binding of the column to the "strMeasure14" property
		strMeasure14Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure14"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure14Column);

		//Creation of a table column for the "strMeasure15" property
		TableColumn<MealInfo, String> strMeasure15Column = new TableColumn<>("strMeasure15");
		//Binding of the column to the "strMeasure15" property
		strMeasure15Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure15"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure15Column);

		//Creation of a table column for the "strMeasure16" property
		TableColumn<MealInfo, String> strMeasure16Column = new TableColumn<>("strMeasure16");
		//Binding of the column to the "strMeasure16" property
		strMeasure16Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure16"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure16Column);

		//Creation of a table column for the "strMeasure17" property
		TableColumn<MealInfo, String> strMeasure17Column = new TableColumn<>("strMeasure17");
		//Binding of the column to the "strMeasure17" property
		strMeasure17Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure17"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure17Column);

		//Creation of a table column for the "strMeasure18" property
		TableColumn<MealInfo, String> strMeasure18Column = new TableColumn<>("strMeasure18");
		//Binding of the column to the "strMeasure18" property
		strMeasure18Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure18"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure18Column);

		//Creation of a table column for the "strMeasure19" property
		TableColumn<MealInfo, String> strMeasure19Column = new TableColumn<>("strMeasure19");
		//Binding of the column to the "strMeasure19" property
		strMeasure19Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure19"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure19Column);

		//Creation of a table column for the "strMeasure20" property
		TableColumn<MealInfo, String> strMeasure20Column = new TableColumn<>("strMeasure20");
		//Binding of the column to the "strMeasure20" property
		strMeasure20Column.setCellValueFactory(new PropertyValueFactory<>("strMeasure20"));
		//Addition of this column to the table view
		MealTableView.getColumns().add(strMeasure20Column);
	    //Addition of the table view to the grid pane
		rootGridPane.add(MealTableView, 0, 0);

		//Get the list of items currently displayed in the table view
		List<MealInfo> items = MealTableView.getItems();

		//Clearance of all existing items from the table view
		items.clear();

		//Addition a new MealInfo object to the table view
		items.add(meal);
	}
	
	//Method of a JavaFX Scene creation and return for this UI
    Scene createScene()
    {
		//Creation of a new Scene using the grid pane as the root layout
	    //Setting of the width of the scene to 650 pixels and the height to 300 pixels
		return new Scene(rootGridPane, 650, 300);
    }

	//Overriding of the handling method from EventHandler to respond to mouse events
    @Override
    public void handle(MouseEvent event) 
    {
		
	}
}




