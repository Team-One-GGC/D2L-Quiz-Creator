package t1.dqc.UI.view;

import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import t1.dqc.UI.MainQuizCreator;
import t1.dqc.xml.quiz.Quiz;
import t1.dqc.xml.quiz.ques.Question;
import t1.dqc.xml.util.QuestionFactory;
import t1.dqc.xml.util.QuizFactory;

public class CreateQuestionsController
{
	//Reference to the main D2LQuizCreation application
	private MainQuizCreator mainQuizCreator;
	
	//Title Name True False text field
	@FXML
    private TextField titleNameTF;
	
	//Title Name Multiple Choice text field
	@FXML
	private TextField titleNameMC;
	
	//Title Name Long Answer text field
	@FXML
	private TextField titleNameLA;
	
	//Points True False text field
	@FXML
	private TextField pointsTF;
	
	//Points Multiple Choice text field
	@FXML
	private TextField pointsMC;
	
	//Points Long Answer text field
	@FXML
	private TextField pointsLA;
	
	//Difficulty Amount True False choice box
	@FXML
	private ChoiceBox<String> difficultyAmtTF;
	
	//Difficulty Amount Multiple Choice choice box
	@FXML
	private ChoiceBox<String> difficultyAmtMC;
	
	//Difficulty Amount Long Answer choice box
	@FXML
	private ChoiceBox<String> difficultyAmtLA;
	
	//Question Area True False text area
	@FXML
	private TextArea questionTextTF;
	
	//Question Area Multiple Choice text area
	@FXML
	private TextArea questionTextMC;
	
	//Question Area Long Answer text area
	@FXML
	private TextArea questionTextLA;
	
	//True Answer radio button
	@FXML
	private RadioButton trueAnswer;
	
	//False Answer radio button
	@FXML
	private RadioButton falseAnswer;
	
	//Value Box 1 text area
	@FXML
	private TextArea valueOne;
	
	//Weight % Box 1 text field
	@FXML
	private TextField weightOne;
	
	//Value Box 2 text area
	@FXML
	private TextArea valueTwo;
	
	//Weight % Box 2 text field
	@FXML
	private TextField weightTwo;
	
	//Value Box 3 text area
	@FXML
	private TextArea valueThree;
	
	//Weight % Box 3 text field
	@FXML
	private TextField weightThree;
		
	//Value Box 4 text area
	@FXML
	private TextArea valueFour;
	
	//Weight % Box 4 text field
	@FXML
	private TextField weightFour;
	
	//Answer text area
	@FXML
	private TextArea answer;
	
	//Constructor for Create Questions Controller
	public CreateQuestionsController()
	{
		
	}
	
	public void setFields(Quiz quiz)
	{
	    List<Question> questions = QuizFactory.getQuestions(quiz);
	    titleNameTF.setText(QuestionFactory.getQuestionTitle(questions.get(0)));
	    pointsTF.setText(QuestionFactory.getQuestionPoints(questions.get(0)));	    
	}
	
    //Setter
	public void setMainQuizCreator(MainQuizCreator mainQuizCreator)
	{
        this.mainQuizCreator = mainQuizCreator;   
    }
}
