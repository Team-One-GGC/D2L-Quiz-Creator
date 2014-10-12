package t1.dqc.UI.view;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import t1.dqc.UI.MainQuizCreator;
import t1.dqc.xml.manifest.Manifest;
import t1.dqc.zip.ZipReader;
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
    private Button openViewQuiz;
    //Edit Quiz button ref
    @FXML
    private Button editQuiz;
    //File chosen with file reader, filtered to zip files.
    File zipFile;
    
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
    
//    @FXML
//    private void createQuizHandler(){
//        tester.setText("Create Quiz Button Clicked");
//    }
    
    @FXML
    private void editQuizHandler() throws NullPointerException{
        FileChooser fileChooser = new FileChooser();
       
        
        //set zip file extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Zip files (*.zip)", "*.zip");
        fileChooser.getExtensionFilters().add(extFilter);
        //Opens zip file
        fileChooser.setTitle("Open D2L Zip File");
        zipFile = fileChooser.showOpenDialog(null);
        //Passes zip file to Zip file reader/ manifest reader
         if(zipFile != null){
             ZipReader<Manifest> reader = new ZipReader<>(zipFile,Manifest.class);
             Manifest manifest = reader.getObjectFromXML(Manifest.FILE_NAME);
             //sets quiz title to tester label
             String quizTitle = manifest.getResources().get(0).getTitle();
             tester.setText(quizTitle);
             reader.closeStreams();
         }
    }
    
    /**
     * Called when the user clicks the create quiz quit on. Opens a dialog to test this function.
     *
     */
  @FXML
  private void createQuizHandler(){
    mainQuizCreator.showNewQuizDialog();
  }
}
