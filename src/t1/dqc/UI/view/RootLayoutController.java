package t1.dqc.UI.view;

import t1.dqc.UI.MainQuizCreator;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class RootLayoutController {

  //Reference to the main D2LQuizCreation application
    private MainQuizCreator mainQuizCreator;
    private Stage mainStage;
    @FXML
    private MenuItem close;
    
    public void setDialogStage(Stage mainStage) {
        this.mainStage = mainStage;
    }
    
    @FXML
    private void handleFileClose(){
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
    
}
