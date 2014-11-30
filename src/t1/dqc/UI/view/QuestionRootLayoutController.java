package t1.dqc.UI.view;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import t1.dqc.UI.MainQuizCreator;
import t1.dqc.xml.quiz.Quiz;
import t1.dqc.xml.quiz.ques.Question;
import t1.dqc.xml.util.QuizFactory;

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

    private MainQuizCreator mainQuizCreator;
        
    public void setFields(Quiz quiz)
    {
//        List<Question> questions = QuizFactory.getQuestions(quiz);
//        List<String> questionTitles = new ArrayList<String>();
//        for(int i = 0; i < questions.size(); i++)
//        {
//            questionTitles.add("Q "+ (i + 1));
//        }
//        questionPicker.setItems(FXCollections.observableList(questionTitles));
    }
    
    //Load question pane into view
    public void loadQuestionPane(){
      
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
        mainQuizCreator.showD2LQuizCreatorMain();
    }
    
    //Moves on to next question
    public void  laterQuestion(){
        
    }
    
    //Opens Quiz option view
    public void openQuizOptions(){
        mainQuizCreator.showQuizOptions(null);
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
    
    //Set main quiz creator call
    public void setMainQuizCreator(MainQuizCreator mainQuizCreator){
        this.mainQuizCreator = mainQuizCreator;   
    }
    
   
}
