package t1.dqc.UI.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
import javafx.scene.control.Button;
import t1.dqc.UI.MainQuizCreator;
//import application.model.;

public class D2LQuizCreatorMainController {
    @FXML
    private Label tester;
    @FXML
    private Button createQuiz;
    @FXML
    private Button openQuiz;
    @FXML
    private Button editViewQuiz;
    
    //Reference to the main D2LQuizCreation application
    private MainQuizCreator mainQuizCreator;
    
    //constructor
    public D2LQuizCreatorMainController(){
    }
    
    //Initialize
    @FXML
    private void initialize() {
    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainQuizCreator
     */
    public void setMainQuizCreator(MainQuizCreator mainQuizCreator){
        this.mainQuizCreator = mainQuizCreator;   
    }
    
  
}
