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
    private boolean confirmClicked = false;
    
    /**
     * Initialized the controller class. Method automatically
     * called after teh fxml file is loaded.
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
     * Returns true if the user clicked OK, false otherwise.
     * 
     * @return
     */
    public boolean isConfirmClicked(){
        return confirmClicked;
    }
    
    /**
     * Called when the ok button is clicked
     */
    @FXML
    private void handleConfirm(){
        confirmClicked = true;
        newQuizDialogStage.close();
    }
}
