package t1.dqc.UI.view;

import javafx.fxml.FXML;
import t1.dqc.UI.MainQuizCreator;
import t1.dqc.xml.quiz.Quiz;

public class CreateQuestionsController
{
	//Reference to the main D2LQuizCreation application
	private MainQuizCreator mainQuizCreator;
	
	@FXML
	private TrueFalseTabController trueFalsePaneController;
	
	
	//Constructor for Create Questions Controller
	public CreateQuestionsController()
	{
		
	}
	
	public void setFields(Quiz quiz)
	{
	    trueFalsePaneController.setFields(quiz);
	}
		
    //Setter
	public void setMainQuizCreator(MainQuizCreator mainQuizCreator)
	{
        this.mainQuizCreator = mainQuizCreator;   
    }
}
