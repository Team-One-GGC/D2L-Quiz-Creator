package t1.dqc.UI.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import t1.dqc.UI.MainQuizCreator;

//import application.model.;

public class D2LQuizCreatorMainController {
    
    //Tester label for output
    @FXML
    private Label tester;
    //Create Quiz Button ref
    @FXML
    private Button createQuiz;
    //Open Quiz button ref
    @FXML
    private Button editQuiz;

    
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
    
    
    @FXML
    private void editQuizHandler(){
       mainQuizCreator.showEditQuiz();       
    }   
    
    /**
     * Called when the user clicks the create quiz quit on. Opens a dialog to test this function.
     *
     */
  @FXML
  private void createQuizHandler(){
    mainQuizCreator.showQuizOptions(null);
  }
}
