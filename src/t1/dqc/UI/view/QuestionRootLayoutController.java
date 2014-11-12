package t1.dqc.UI.view;

import java.io.IOException;

import t1.dqc.UI.MainQuizCreator;
import t1.dqc.xml.quiz.QuizFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

public class QuestionRootLayoutController {

    @FXML
    private Button addNewQuestion;
    
    @FXML
    private Button removeCurrentQuestion;
    
    @FXML
    private Button changQuizOptions;
    
    @FXML
    private Button backQuestion;
    
    @FXML
    private Button clearQuestion;
    
    @FXML
    private Button cancelAndQuit;
    
    @FXML
    private Button saveAndQuit;
    
    @FXML
    private Button saveQuestion;
    
    @FXML
    private Button nextQuestion;
    
    @FXML
    private ChoiceBox<String> questionPicker;
    
    //Load question pane into view
    public void loadQuestionPane(){
        try {
            // Load quiz options view.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(QuestionRootLayoutController.class.getResource("view/CreateQuestionsTabPage.fxml"));
            AnchorPane QuizOptionsScene = (AnchorPane) loader.load();
            QuizOptionsController controller;
            controller = loader.getController();
            controller.setMainQuizCreator(this);
            if(quiz != null) {
                //showing quiz info
                controller.setQuizName(QuizFactory.getQuizTitle(quiz));
                controller.setFields(quiz);
            }
            // Set person overview into the center of root layout.
            rootLayout.setCenter(QuizOptionsScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Changes to the previous question in the quiz
    public void previousQuestion(){
        
    }
    
    //Clears out all fields on current question
    public void clearFields(){
          
    }
    
    //Saves current question
    public void saveQuestionEditor(){
        
    }
    
    //Quit question editor to main screen
    public void quitQuestionEditor(){
        
    }
    
    //Moves on to next question
    public void  laterQuestion(){
        
    }
    
    //Opens Quiz option view
    public void openQuizOptions(){
        
    }
    
    
    //Removes current question from the quiz
    public void removeQuestion(){
        
    }
    
    //Adds new question to current quiz
    public void createQuestion(){
        
    }
    
    //Populates choice box with quiz question titles
    public void populateQuesionChoiceBox(){
        
    }
}
