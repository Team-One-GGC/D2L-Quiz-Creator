package t1.dqc.UI.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


/**Dialog to test the new quiz functionality
 * 
 * @author Jared Marquez
 *
 */
public class NewQuizDialogController {

    @FXML
    private TextArea testDisplay;
    @FXML
    private Button confirmButton;
    @FXML
    private Button cancelButton;
    
    private Stage newQuizDialogStage;
    
    /**
     * Initialized the controller class. Method automatically
     * called after the fxml file is loaded.
     */
    @FXML
    private void initialize(){
        
    }
    
    /**
     * Sets the stage of this dialog.
     * 
     * @param newQuizDialogStage
     */
    public void setDialogStage(Stage newQuizDialogStage){
        this.newQuizDialogStage = newQuizDialogStage;
    }
    
    
    /**
     * Called when the ok button is clicked
     */
    @FXML
    private void handleConfirm(){
        newQuizDialogStage.close();
    }
}
