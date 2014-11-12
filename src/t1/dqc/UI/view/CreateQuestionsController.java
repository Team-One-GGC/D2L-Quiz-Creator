package t1.dqc.UI.view;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import t1.dqc.UI.MainQuizCreator;

public class CreateQuestionsController
{
	//Reference to the main D2LQuizCreation application
	private MainQuizCreator mainQuizCreator;
	
	//Title Name text field
	@FXML
    private TextField titleName;
	
	//Points text field
	@FXML
	private TextField points;
	
	//Difficulty Amount choice box
	@FXML
	private ChoiceBox difficultyAmt;
	
	//Question Area text area
	@FXML
	private TextArea questionArea1;
	
	//True Answer radio button
	@FXML
	private RadioButton trueAnswer;
	
	//False Answer radio button
	@FXML
	private RadioButton falseAnswer;
	
	//
	
	//Save values to Quiz Object
    @FXML
    public void saveValues()
    {
        
    }
    
    //Cancel Changes and close stage
    @FXML
    public void cancelSaves()
    {
        mainQuizCreator.showD2LQuizCreatorMain();
    }
	
    //Setter
	public void setMainQuizCreator(MainQuizCreator mainQuizCreator)
	{
        this.mainQuizCreator = mainQuizCreator;   
    }
}
