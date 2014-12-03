package t1.dqc.UI;

import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.swing.JOptionPane;

import t1.dqc.UI.view.AboutUsDialogController;
import t1.dqc.UI.view.CreateQuestionsController;
import t1.dqc.UI.view.D2LQuizCreatorMainController;
import t1.dqc.UI.view.QuestionRootLayoutController;
import t1.dqc.UI.view.QuizOptionsController;
import t1.dqc.UI.view.RootLayoutController;
import t1.dqc.xml.manifest.Manifest;
import t1.dqc.xml.quiz.Quiz;
import t1.dqc.xml.util.QuizFactory;
import t1.dqc.zip.ZipReader;

public class MainQuizCreator extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    //File chosen with file reader, filtered to zip files.
    private File zipFile;
    
    private static double WIDTH = Screen.getPrimary().getVisualBounds().getWidth() / 2;
    private static double HEIGHT = WIDTH * (9.0 / 16.0);
    private BorderPane questionRootLayout;
    
    private Quiz quiz;
    
    
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
            Scene scene = new Scene(rootLayout, WIDTH, HEIGHT);
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
            primaryStage.setMaximized(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        checkJavaVersion();
        launch(args);
    }
    
    private static void checkJavaVersion()
    {
        double version = Double.parseDouble(System.getProperty("java.specification.version"));
        if(version < 1.8) {
            JOptionPane.showMessageDialog(null, "Must have Java 8 installed", "Wrong Java version", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    
    /**
     * Opens New Quiz Options
     */
    public void showQuizOptions(Quiz quiz){
            try {
                // Load quiz options view.
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainQuizCreator.class.getResource("view/QuizOptionsScene.fxml"));
                AnchorPane QuizOptionsScene = (AnchorPane) loader.load();
                QuizOptionsController controller;
                controller = loader.getController();
                controller.setMainQuizCreator(this);
                if(quiz != null) {
                    //showing quiz private BorderPane rootLayout;
                    controller.setQuizName(QuizFactory.getQuizTitle(quiz));
                    controller.setFields(quiz);
                }
                // Set person overview into the center of root layout.
                rootLayout.setCenter(QuizOptionsScene);
                primaryStage.setMaximized(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    public void showAboutUsDialog(){
        try{
            FXMLLoader loader = new FXMLLoader(MainQuizCreator.class.getResource("view/AboutUsDialog.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("About Us");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            
            AboutUsDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            
            dialogStage.showAndWait();
            
    
        }catch (IOException e){
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
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        zipFile = fileChooser.showOpenDialog(null);
        //Passes zip file to Zip file reader/ manifest reader
         if(zipFile != null){
             ZipReader<Manifest> reader = new ZipReader<>(zipFile,Manifest.class);
             Manifest manifest = reader.getObjectFromXML(Manifest.FILE_NAME);
             String quizFile = manifest.getResources().get(0).getHref();
             
             ZipReader<Quiz> quizReader = new ZipReader<>(zipFile, Quiz.class);
             quiz = quizReader.getObjectFromXML(quizFile);
             showQuizOptions(quiz);
         }
    }
    
    public void showQuizQuestionRoot(){
        try {
            // Load quiz options view.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainQuizCreator.class.getResource("view/QuestionRootLayout.fxml"));
            questionRootLayout = (BorderPane) loader.load();
            QuestionRootLayoutController controller;
            controller = loader.getController();
            controller.setMainQuizCreator(this);
            controller.setQuiz(quiz);
            controller.setFields(0);
            controller.addListener();
            primaryStage.setMaximized(true);
            
           
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(questionRootLayout);
//            loadQuestionTabPane();//TODO delete this later
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Load question tab pane
    public void loadQuestionTabPane(){//TODO delete this method
        /*try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainQuizCreator.class.getResource("view/CreateQuestionsTabPage.fxml"));
            AnchorPane QuestionTabPane = (AnchorPane) loader.load();
            //D2LQuizCreatorMainController controller;
            //controller = loader.getController();
            //controller.setMainQuizCreator(this);
            
            CreateQuestionsController controller = loader.getController();
            controller.setMainQuizCreator(this);
            controller.setFields(quiz);
            
            
            // Set person overview into the center of root layout.
            questionRootLayout.setCenter(QuestionTabPane);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
