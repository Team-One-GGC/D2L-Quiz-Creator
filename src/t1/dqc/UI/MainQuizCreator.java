package t1.dqc.UI;

import java.io.File;
import java.io.IOException;

import t1.dqc.zip.ZipReader;
import t1.dqc.xml.manifest.Manifest;
import javafx.stage.FileChooser;
import t1.dqc.UI.view.D2LQuizCreatorMainController;
import t1.dqc.UI.view.NewQuizDialogController;
import t1.dqc.UI.view.QuizOptionsController;
import t1.dqc.UI.view.RootLayoutController;
import t1.dqc.xml.manifest.Manifest;
import t1.dqc.zip.ZipReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainQuizCreator extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    //File chosen with file reader, filtered to zip files.
    private File zipFile;
    
    
    // Constructor
    public MainQuizCreator() {

    }
    
    //primaryStage getter
    public Stage getMainStage(){
        return primaryStage;
    }

    //Setting up primary stage
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("D2L Quiz Creator");

        initRootLayout();
        showD2LQuizCreatorMain();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainQuizCreator.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            RootLayoutController rootController = loader.getController();
            rootController.setMainQuizCreator(this);
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Shows the Quiz creator main menu inside the root layout.
     */
    public void showD2LQuizCreatorMain() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainQuizCreator.class.getResource("view/D2LQuizCreatorMain.fxml"));
            AnchorPane D2LQuizCreatorMain = (AnchorPane) loader.load();
            D2LQuizCreatorMainController controller;
            controller = loader.getController();
            controller.setMainQuizCreator(this);
            // Set person overview into the center of root layout.
            rootLayout.setCenter(D2LQuizCreatorMain);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * Opens New Quiz Options
     */
    public void showQuizOptions(String quizTitle){
            try {
                // Load person overview.
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainQuizCreator.class.getResource("view/QuizOptionsScene.fxml"));
                AnchorPane QuizOptionsScene = (AnchorPane) loader.load();
                QuizOptionsController controller;
                controller = loader.getController();
                controller.setMainQuizCreator(this);
                //showing quiz title only for now
                controller.setQuizName(quizTitle);
                // Set person overview into the center of root layout.
                rootLayout.setCenter(QuizOptionsScene);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    public void showEditQuiz() throws NullPointerException{
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
             showQuizOptions(quizTitle);
             reader.closeStreams();
             
             
         }
    }
}
