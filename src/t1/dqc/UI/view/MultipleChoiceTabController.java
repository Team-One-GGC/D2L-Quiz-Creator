package t1.dqc.UI.view;

import t1.dqc.UI.MainQuizCreator;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MultipleChoiceTabController {

  //Reference to the main D2LQuizCreation application
    private MainQuizCreator mainQuizCreator;
    
       @FXML
       private TextField titleName;
    
       @FXML
       private Tab multipleChoiceTab;
       
       @FXML
       private ScrollPane multipleChoicePane;
       
       @FXML
       private AnchorPane multipleChoiceAPane;
       
     //Multiple Choice points  
       @FXML
       private TextField points;
       
     //Multiple Choice Difficulty  
       @FXML
       private ChoiceBox<String> difficulty;
       
     //Multiple Choice Question Text  
       @FXML
       private TextArea questionText;
       
     //Value Box 1 text area
       @FXML
       private TextArea valueOne;
       
       //Weight % Box 1 text field
       @FXML
       private TextField weightOne;
       
       //Value Box 2 text area
       @FXML
       private TextArea valueTwo;
       
       //Weight % Box 2 text field
       @FXML
       private TextField weightTwo;
       
       //Value Box 3 text area
       @FXML
       private TextArea valueThree;
       
       //Weight % Box 3 text field
       @FXML
       private TextField weightThree;
               
       //Value Box 4 text area
       @FXML
       private TextArea valueFour;
       
       //Weight % Box 4 text field
       @FXML
       private TextField weightFour;

}
