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

public class LongAnswerTabController {

    @FXML
    private TextField titleName;
    
    @FXML
    private TextField points;
    
    @FXML
    private ChoiceBox<String> difficulty;
    
    @FXML
    private TextArea questionText;
    
    @FXML
    private TextArea inputText;
    
}
