package t1.dqc.UI.view;

import t1.dqc.UI.MainQuizCreator;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TrueFalseTabController {

  //Reference to the main D2LQuizCreation application
    private MainQuizCreator mainQuizCreator;
    
    @FXML
    private TextField titleName;
    
    @FXML
    private Tab trueFalseTab;
    
    @FXML
    private AnchorPane trueFalsePane;

    //True Answer radio button
    @FXML
    private RadioButton trueAnswer;
    
    //False Answer radio button
    @FXML
    private RadioButton falseAnswer;
    
   //TrueFalse Points Amount 
    @FXML
    private TextField points;
    
  //TrueFalse difficulty chooser  
    @FXML
    private ChoiceBox<String> difficulty;
    
  //TrueFalse Question text    
    @FXML
    private TextArea questionText;
    
}
