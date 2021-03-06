package t1.dqc.UI.view;

import t1.dqc.UI.MainQuizCreator;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class RootLayoutController {

  //Reference to the main D2LQuizCreation application
    private MainQuizCreator mainQuizCreator;
    //Root layout stage
    private Stage mainStage;
    //close menu item ref
    @FXML
    private MenuItem close;
    
    //Sets main stage
    public void setDialogStage(Stage mainStage) {
        this.mainStage = mainStage;
    }
    
    //Function to close program
    @FXML
    private void handleCloseMenuOption(){
       Platform.exit();
       System.exit(0);
    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainQuizCreator
     */
    public void setMainQuizCreator(MainQuizCreator mainQuizCreator){
        this.mainQuizCreator = mainQuizCreator;   
    }
    
    //Shows quizOption scene
    public void handleNewMenuOption(){
        mainQuizCreator.showQuizOptions(null);
    }
    
    //Opens file chooser dialog and opens quiz options
    public void handleEditMenuOption(){
      mainQuizCreator.showEditQuiz();
    }
    
    //Opens About Us Dialog Box
    public void showAboutUs(){
       mainQuizCreator.showAboutUsDialog();
    }
    
}
