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
