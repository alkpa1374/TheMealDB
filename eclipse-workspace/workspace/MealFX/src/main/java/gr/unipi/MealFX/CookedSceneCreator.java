//Class «CookedSceneCreator» belongs package «gr.unipi.MealFX»
package gr.unipi.MealFX;

//Import of File class for representing files in the file system
import java.io.File;

//Import of IOException for handling input/output exceptions when working with files
import java.io.IOException;

//Import of ArrayList for dynamically-sized lists of objects
import java.util.ArrayList;

//Import of List interface for using lists as a collection type
import java.util.List;

//Import of exception class for JSON generation errors from Jackson library
import com.fasterxml.jackson.core.JsonGenerationException;

//Import of exception class for JSON mapping errors from Jackson library
import com.fasterxml.jackson.databind.JsonMappingException;

//Import of ObjectMapper from Jackson library to read and write JSON data
import com.fasterxml.jackson.databind.ObjectMapper;

//Import of SerializationFeature to configure formatting options for JSON output
import com.fasterxml.jackson.databind.SerializationFeature;

//Import of TypeFactory from Jackson library to construct complex collection types for JSON deserialization
import com.fasterxml.jackson.databind.type.TypeFactory;

//Import of custom exception class for handling Meal API related errors
import exception.MealAPIException;

//Import of ObservableList, a JavaFX collection that allows automatic updates in UI controls like TableView
import javafx.collections.ObservableList;

//Import of EventHandler interface to handle events such as mouse clicks
import javafx.event.EventHandler;

//Import of Pos enum to set alignment (e.g., CENTER) in JavaFX layout panes
import javafx.geometry.Pos;

//Import of Scene class to represent a container for all content in a JavaFX window
import javafx.scene.Scene;

//Import of Alert dialog class for showing pop-up messages to the user
import javafx.scene.control.Alert;

//Import of AlertType enum to specify the type of alert (e.g., INFORMATION, ERROR)
import javafx.scene.control.Alert.AlertType;

//Import of Button control to allow user interactions
import javafx.scene.control.Button;

//Import of Label control to display text in the UI
import javafx.scene.control.Label;

//Import of TableView control to display tabular data
import javafx.scene.control.TableView;

//Import of TableViewSelectionModel to handle selection operations within a TableView
import javafx.scene.control.TableView.TableViewSelectionModel;

//Import of TextField control for user input of single-line text
import javafx.scene.control.TextField;

//Import of PropertyValueFactory to map table columns to object properties for TableView
import javafx.scene.control.cell.PropertyValueFactory;

//Import of FlowPane layout for arranging UI elements horizontally or vertically
import javafx.scene.layout.FlowPane;

//Import of GridPane layout for arranging UI elements in a flexible grid of rows and columns
import javafx.scene.layout.GridPane;

//Import of Stage class to represent a top-level JavaFX window
import javafx.stage.Stage;

//Import of the MealInfo model representing a meal entity
import model.MealInfo;

//Import of service class for interacting with the Meal API
import service.MealAPIService;

//Import of MouseEvent class to handle mouse input events like clicks
import javafx.scene.input.MouseEvent;

//Import of TableColumn class to define columns in a TableView
import javafx.scene.control.TableColumn;

//Class «CookedSceneCreator» for meal scene implementation
public class CookedSceneCreator implements EventHandler<MouseEvent>
{
	//FlowPane to organize buttons in a flow layout
	FlowPane buttonFlowPane;
	
	//GridPanes for arranging UI elements in a grid layout
	GridPane rootGridPane, inputFieldsPane;
	
	//Buttons for various actions in the meal scene
	Button deleteCookedBtn, moveMealBtn, getDetailsBtn, backBtn;
	
	//Label to display text or instructions in the meal scene
	Label textLbl;
	
	//TextField for user input or parameters in the meal scene
	TextField paramField;
	
	//TableView to display a list of MealInfo objects in a tabular form
	TableView<MealInfo> MealTableView;
	
	//Jackson ObjectMapper instances for JSON serialization/deserialization
	ObjectMapper mapper1 = new ObjectMapper();
	ObjectMapper mapper2 = new ObjectMapper();

	//Constructor for the CookedSceneCreator class
	public CookedSceneCreator() 
	{
		 //Initialize the root grid pane that contains the main layout
		 rootGridPane = new GridPane();
		
		 //Initialize the grid pane that holds input fields
		 inputFieldsPane = new GridPane();
		
		 //Initialize the flow pane that holds buttons in a horizontal flow
		 buttonFlowPane = new FlowPane();
		
		 //Initialize buttons with their labels
		 deleteCookedBtn = new Button("Delete Cooked");
		 moveMealBtn = new Button("Move Meal");
		 getDetailsBtn = new Button("Get Details");
		 backBtn = new Button("Back");
		
		 //Initialize the TableView to display MealInfo objects
		 MealTableView = new TableView<MealInfo>();
		
		  //Create a TableColumn for the "idMeal" property of MealInfo objects
		 TableColumn<MealInfo, String> idMealColumn = new TableColumn<>("idMeal");
		 //Bind the column to the "idMeal" property of MealInfo using PropertyValueFactory
		 idMealColumn.setCellValueFactory(new PropertyValueFactory<>("idMeal"));
		 //Add the column to the TableView
		 MealTableView.getColumns().add(idMealColumn);
		
		 //Create a TableColumn for the "strMeal" property of MealInfo objects
		 TableColumn<MealInfo, String> strMealColumn = new TableColumn<>("strMeal");
		 //Bind the column to the "strMeal" property
		 strMealColumn.setCellValueFactory(new PropertyValueFactory<>("strMeal"));
		 //Add the column to the TableView
		 MealTableView.getColumns().add(strMealColumn);
		
		 //Create a TableColumn for the "strMealAlternate" property
		 TableColumn<MealInfo, String> strMealAlternateColumn = new TableColumn<>("strMealAlternate");
		 //Bind the column to the "strMealAlternate" property
		 strMealAlternateColumn.setCellValueFactory(new PropertyValueFactory<>("strMealAlternate"));
		 //Add the column to the TableView
		 MealTableView.getColumns().add(strMealAlternateColumn);
		
		 //Create a TableColumn for the "strCategory" property
		 TableColumn<MealInfo, String> strCategoryColumn = new TableColumn<>("strCategory");
		 //Bind the column to the "strCategory" property
		 strCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("strCategory"));
		 //Add the column to the TableView
		 MealTableView.getColumns().add(strCategoryColumn);
		
		 //Create a TableColumn for the "strArea" property
		 TableColumn<MealInfo, String> strAreaColumn = new TableColumn<>("strArea");
		 //Bind the column to the "strArea" property
		 strAreaColumn.setCellValueFactory(new PropertyValueFactory<>("strArea"));
		 //Add the column to the TableView
		 MealTableView.getColumns().add(strAreaColumn);
		
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
		
		 //Create a TableColumn for the "strTags" property
		 TableColumn<MealInfo, String> strTagsColumn = new TableColumn<>("strTags");
		 //Bind the column to the "strTags" property
		 strTagsColumn.setCellValueFactory(new PropertyValueFactory<>("strTags"));
		 //Add the column to the TableView
		 MealTableView.getColumns().add(strTagsColumn);
		
		 //Create a TableColumn for the "strYoutube" property (YouTube link)
		 TableColumn<MealInfo, String> strYoutubeColumn = new TableColumn<>("strYoutube");
		 //Bind the column to the "strYoutube" property
		 strYoutubeColumn.setCellValueFactory(new PropertyValueFactory<>("strYoutube"));
		 //Add the column to the TableView
		 MealTableView.getColumns().add(strYoutubeColumn);
		
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
		
		  //Create a TableColumn for the 'strSource' property of MealInfo
		 TableColumn<MealInfo, String> strSourceColumn = new TableColumn<>("strSource");
		
		 //Bind the strSource property of MealInfo to this column
		 strSourceColumn.setCellValueFactory(new PropertyValueFactory<>("strSource"));
		
		 //Add this column to the MealTableView
		 MealTableView.getColumns().add(strSourceColumn);
		
		 //Create a TableColumn for the 'strImageSource' property of MealInfo
		 TableColumn<MealInfo, String> strImageSourceColumn = new TableColumn<>("strImageSource");
		
		 //Bind the strImageSource property of MealInfo to this column
		 strImageSourceColumn.setCellValueFactory(new PropertyValueFactory<>("strImageSource"));
		
		 //Add this column to the MealTableView
		 MealTableView.getColumns().add(strImageSourceColumn);
		
		 //Create a TableColumn for the 'strCreativeCommonsConfirmed' property of MealInfo
		 TableColumn<MealInfo, String> strCreativeCommonsConfirmedColumn = new TableColumn<>("strCreativeCommonsConfirmed");
		
		 //Bind the strCreativeCommonsConfirmed property of MealInfo to this column
		 strCreativeCommonsConfirmedColumn.setCellValueFactory(new PropertyValueFactory<>("strCreativeCommonsConfirmed"));
		
		 //Add this column to the MealTableView
		 MealTableView.getColumns().add(strCreativeCommonsConfirmedColumn);
		
		 //Create a TableColumn for the 'dateModified' property of MealInfo
		 TableColumn<MealInfo, String> dateModifiedColumn = new TableColumn<>("dateModified");
		
		 //Bind the dateModified property of MealInfo to this column
		 dateModifiedColumn.setCellValueFactory(new PropertyValueFactory<>("dateModified"));
		
		  //Add the deleteCookedBtn button to the horizontal button flow pane
		 buttonFlowPane.getChildren().add(deleteCookedBtn);
		
		 //Add the moveMealBtn button to the horizontal button flow pane
		 buttonFlowPane.getChildren().add(moveMealBtn);
		
		 //Add the getDetailsBtn button to the horizontal button flow pane
		 buttonFlowPane.getChildren().add(getDetailsBtn);
		
		 //Center-align all buttons in the buttonFlowPane
		 buttonFlowPane.setAlignment(Pos.CENTER);
		
		 //Set horizontal spacing between buttons to 10 pixels
		 buttonFlowPane.setHgap(10);
		
		 //Add the MealTableView (table of meals) to the root grid pane at column 0, row 1
		 rootGridPane.add(MealTableView, 0, 1);
		
		 //Add the inputFieldsPane (text fields and labels) to the root grid pane at column 0, row 0
		 rootGridPane.add(inputFieldsPane, 0, 0);
		
		 //Add the buttonFlowPane (buttons) to the root grid pane at column 0, row 2
		 rootGridPane.add(buttonFlowPane, 0, 2);
		
		 //Add the backBtn button to the root grid pane at column 0, row 3
		 rootGridPane.add(backBtn, 0, 3);
		
		 //Set horizontal gap between elements in the rootGridPane to 10 pixels
		 rootGridPane.setHgap(10);
		
		 //Set vertical gap between elements in the rootGridPane to 10 pixels
		 rootGridPane.setVgap(10);
		
		 //Attach the mouse click event handler (this class) to deleteCookedBtn
		 deleteCookedBtn.setOnMouseClicked(this);
		
		 //Attach the mouse click event handler (this class) to moveMealBtn
		 moveMealBtn.setOnMouseClicked(this);
		
		 //Attach the mouse click event handler (this class) to getDetailsBtn
		 getDetailsBtn.setOnMouseClicked(this);
		
		 //Attach the mouse click event handler (this class) to backBtn
		 backBtn.setOnMouseClicked(this);
		
		 //Create a File object representing "favourite.json" for reading/writing favourite meals
		 File favourite = new File("favourite.json");
		
		 //Create a File object representing "cooked.json" for reading/writing cooked meals
		 File cooked = new File("cooked.json");
		
		 //Enable pretty-printing for JSON output in mapper1 (used for favourite meals)
		 mapper1.enable(SerializationFeature.INDENT_OUTPUT);
		
		 //Enable pretty-printing for JSON output in mapper2 (used for cooked meals)
		 mapper2.enable(SerializationFeature.INDENT_OUTPUT);
		
		      
		  //Check if the "cooked.json" file exists
		 if (cooked.exists())
		 {
		     try 
		     {
		         //Obtain a TypeFactory instance from mapper2 for advanced type handling
		         TypeFactory typeFactory = mapper2.getTypeFactory();
		
		         //Deserialize the JSON content of "cooked.json" into a List of MealInfo objects
		         //and assign it to the application's cooked meals list (CoMealList)
		         App.CoMealList = mapper2.readValue(
		             new File("cooked.json"),
		             typeFactory.constructCollectionType(List.class, MealInfo.class)
		         );
		
		         //Print a message to indicate successful deserialization of cooked meals
		         System.out.println("Cooked object deserialized from cooked.json:");
		         
		     } 
			 catch (IOException e) 
		     {
		         //Print the exception stack trace if an I/O error occurs during deserialization
		         e.printStackTrace();
		     }
		 }
		
		 //Print a message indicating that the cooked object has been serialized (or loaded)
		 System.out.println("Cooked object serialized to cooked.json");
	
	     //Check if the "favourite.json" file exists
	     if (favourite.exists())
	     {
	         try 
		     {
	             //Obtain a TypeFactory instance from mapper1 for advanced type handling
	             TypeFactory typeFactory = mapper1.getTypeFactory();
	
	             //Deserialize the JSON content of "favourite.json" into a List of MealInfo objects
	             //and assign it to the application's favourite meals list (FavMealList)
	             App.FavMealList = mapper1.readValue
				 (
	                 new File("favourite.json"),
	                 typeFactory.constructCollectionType(List.class, MealInfo.class)
	             );
	
	             //Print a message to indicate successful deserialization of favourite meals
	             System.out.println("Favourite object deserialized from favourite.json:");
	             
	         } 
			 catch (IOException e) 
			 {
	             //Print the exception stack trace if an I/O error occurs during deserialization
	             e.printStackTrace();
	         }
	     }
	
	     //Print a message indicating that the favourite object has been serialized (or loaded)
	     System.out.println("Favourite object serialized to favourite.json");
	
	     //Get the list of items currently displayed in the MealTableView
	     List<MealInfo> items = MealTableView.getItems();
	
	     //Clear all existing items from the TableView to prepare for fresh data
	     items.clear();
	
	     //Loop through each MealInfo object in the application's cooked meals list (CoMealList)
	     for (MealInfo Meal : App.CoMealList) 
	     {
	         //Add each MealInfo object to the TableView for display
	         items.add(Meal);
	     }
     }

	//Method to create and return a JavaFX Scene for this UI
	Scene createScene()
	{
	  //Create a new Scene using the rootGridPane as the root layout
	  //Set the width of the scene to 650 pixels and the height to 300 pixels
	  return new Scene(rootGridPane, 650, 300);
	}


	//Override the handle method from EventHandler<MouseEvent> to handle mouse click events
	@Override
	public void handle(MouseEvent event) 
	{
		 //Check if the event source is the deleteCookedBtn button
		 if (event.getSource() == deleteCookedBtn) 
		 {
		     try
		     {
		         //Get the selection model of the MealTableView to know which items are selected
		         TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
		
		         //Get the list of currently selected MealInfo objects
		         ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
		
		         //Loop through all MealInfo items currently in the MealTableView
		         for (MealInfo MI : MealTableView.getItems())
		         {
		             //If the current item is selected
		             if (selectedItems.contains(MI))
		             {
		                 //Remove the meal from the application's cooked meals list
		                 App.CoMealList.remove(MI);
		
		                 //Show a pop-up message confirming successful deletion
		                 MealPopUp mealPopUp = new MealPopUp("This meal has been successfully deleted from the list of cooked meals.");
		                 mealPopUp.show();
		             }
		         }
		
		         //Serialize the updated CoMealList to "cooked.json" to save the changes
		         mapper2.writeValue(new File("cooked.json"), App.CoMealList);
		
		         //Loop through each MealInfo in the updated CoMealList
		         for (MealInfo mi : App.CoMealList) 
				 {
		             try 
					 {
		                 //Convert each MealInfo object to a JSON string for logging purposes
		                 String cookedJsonString = mapper2.writeValueAsString(mi);
		
		                 //Print a message indicating the meal has been serialized
		                 System.out.println("Cooked object serialized to JSON string:");
		
		                 //Print the JSON string of the meal
		                 System.out.println(cookedJsonString);
		
		             } 
					 catch (IOException e) 
					 {
		                 //Print the stack trace if an I/O error occurs during serialization
		                 e.printStackTrace();
		             }
		         }
		
		         //Get the items currently displayed in the TableView
		         List<MealInfo> items = MealTableView.getItems();
		
		         //Clear all items from the TableView to refresh the display
		         items.clear();
		
		         //Loop through each MealInfo in the updated CoMealList
		         for (MealInfo Meal : App.CoMealList) 
		         {
		             //Add each meal back to the TableView for display
		             items.add(Meal);
		         }
		     }
		     //Catch block for JSON generation errors
		     catch (JsonGenerationException e1) 
			 {
		         System.err.println("Failed to generate JSON output for cooked.json");
		         e1.printStackTrace();
		     } 
		     //Catch block for JSON mapping errors
		     catch (JsonMappingException e1) 
			 {
		         e1.printStackTrace();
		     } 
		     //Catch block for general I/O errors
		     catch (IOException e1) 
			 {
		         e1.printStackTrace();
		     }
		 }
		//Check if the event source is the moveMealBtn button
		else if (event.getSource() == moveMealBtn) 
		{
		  try
		  {
		      //Get the selection model of the MealTableView to know which items are selected
		      TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
		
		      //Get the list of currently selected MealInfo objects
		      ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
		
		      //Loop through all MealInfo items currently in the MealTableView
		      for (MealInfo MI : MealTableView.getItems())
		      {
		          //If the meal is NOT already in the favourite meals list
		          if (!App.FavMealList.contains(MI))
		          {
		              //Remove the meal from the cooked meals list
		              App.CoMealList.remove(MI);
		
		              //Add the meal to the favourite meals list
		              App.FavMealList.add(MI);
		
		              //Show a pop-up message confirming the meal has been moved
		              MealPopUp mealPopUp = new MealPopUp("This meal has been successfully moved from the list of cooked meals to the list of favourite meals.");
		              mealPopUp.show();
		          }
		          else
		          {
		              //Show a pop-up message indicating the meal is already in favourites
		              MealPopUp mealPopUp = new MealPopUp("This meal is already in the list of favourite meals.");
		              mealPopUp.show();
		          }
		      }
		
		      //Serialize the updated favourite meals list to "favourite.json"
		      mapper1.writeValue(new File("favourite.json"), App.FavMealList);
		
		      //Loop through each MealInfo in the updated favourite list to log JSON
		      for (MealInfo mi : App.FavMealList) 
			  {
		          try 
				  {
		              //Convert each MealInfo object to a JSON string for logging purposes
		              String favouriteJsonString = mapper1.writeValueAsString(mi);
		
		              //Print a message indicating the favourite meal has been serialized
		              System.out.println("Favourite object serialized to JSON string:");
		
		              //Print the JSON string
		              System.out.println(favouriteJsonString);
		
		          } 
				  catch (IOException e) 
				  {
		              //Print stack trace if an I/O error occurs during serialization
		              e.printStackTrace();
		          }
		      }
		
		      //Serialize the updated cooked meals list to "cooked.json"
		      mapper2.writeValue(new File("cooked.json"), App.CoMealList);
		
		      //Loop through each MealInfo in the updated cooked list to log JSON
		      for (MealInfo mi : App.CoMealList) 
			  {
		          try 
				  {
		              //Convert each MealInfo object to a JSON string for logging purposes
		              String cookedJsonString = mapper2.writeValueAsString(mi);
		
		              //Print a message indicating the cooked meal has been serialized
		              System.out.println("Cooked object serialized to JSON string:");
		
		              //Print the JSON string
		              System.out.println(cookedJsonString);
		
		          } 
				  catch (IOException e) 
				  {
		              //Print stack trace if an I/O error occurs during serialization
		              e.printStackTrace();
		          }
		      }
		
		      //Get the items currently displayed in the TableView
		      List<MealInfo> items = MealTableView.getItems();
		
		      //Clear all items from the TableView to refresh the display
		      items.clear();
		
		      //Loop through each MealInfo in the updated cooked meals list
		      for (MealInfo Meal : App.CoMealList) 
		      {
		          //Add each meal back to the TableView for display
		          items.add(Meal);
		      }
		  }
		  //Catch block for JSON generation errors
		  catch (JsonGenerationException e1) 
		  {
		      System.err.println("JSON generation failed while writing favourite.json or cooked.json from Meal lists");
		      e1.printStackTrace();
		  } 
		  //Catch block for JSON mapping errors
		  catch (JsonMappingException e1) 
		  {
		      e1.printStackTrace();
		  } 
		  //Catch block for general I/O errors
		  catch (IOException e1) 
		  {
		      e1.printStackTrace();
		  }
		}
		
		//Check if the event source is the getDetailsBtn button
		else if (event.getSource() == getDetailsBtn) 
		{
			  //Get the selection model of the MealTableView to determine which items are selected
			  TableViewSelectionModel selectionModel = MealTableView.getSelectionModel();
			
			  //Get the list of currently selected MealInfo objects
			  ObservableList<MealInfo> selectedItems = selectionModel.getSelectedItems();
			
			  //Declare a local list variable (not used here, can be removed)
			  List<MealInfo> MealList = null;
			
			  //Loop through all MealInfo items currently in the MealTableView
			  for (MealInfo MI : MealTableView.getItems())
			  {
					  //If the current item is selected
				  if (selectedItems.contains(MI))
				  {
				      //Create a new GetDetailsSceneCreator for the selected meal
					  GetDetailsSceneCreator getDetailsSceneCreator = new GetDetailsSceneCreator(MI);
					
					  //Create the scene containing the meal details
					  Scene getDetailsScene = getDetailsSceneCreator.createScene();
					
					  //Create a new Stage (window) for displaying the details
					  Stage getDetailsStage = new Stage();
					
					  //Set the title of the new Stage window
					  getDetailsStage.setTitle("Get Details");
					
					  //Set the scene of the Stage to the details scene
					  getDetailsStage.setScene(getDetailsScene);
					
					  //Show the Stage window to the user
					  getDetailsStage.show();
				 }
			}
		}
		
		//Check if the event source is the backBtn button
		else if (event.getSource() == backBtn) 
		{
			//Set the application's primary stage back to the main scene
			App.primaryStage.setScene(App.mainScene);
		}
	
	}

}

