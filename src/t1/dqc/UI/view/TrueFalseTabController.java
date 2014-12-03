package t1.dqc.UI.view;

import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import t1.dqc.UI.MainQuizCreator;
import t1.dqc.xml.quiz.Quiz;
import t1.dqc.xml.quiz.ques.Question;
import t1.dqc.xml.util.QuestionFactory;
import t1.dqc.xml.util.QuizFactory;

public class TrueFalseTabController extends AnchorPane{

  //Reference to the main D2LQuizCreation application
    private MainQuizCreator mainQuizCreator;
    
    @FXML
    private TextField titleName;
    
    @FXML
    private Tab trueFalseTab;
    
    @FXML
    private AnchorPane trueFalsePane;

    //True Answer radio button
    @FXML
    private RadioButton trueAnswer;
    
    //False Answer radio button
    @FXML
    private RadioButton falseAnswer;
    
   //TrueFalse Points Amount 
    @FXML
    private TextField points;
    
  //TrueFalse difficulty chooser  
    @FXML
    private ChoiceBox<String> difficulty;
    
  //TrueFalse Question text    
    @FXML
    private TextArea questionText;
    
    public void setFields(Question ques)
    {
        titleName.setText(QuestionFactory.getQuestionTitle(ques));
        points.setText(QuestionFactory.getQuestionPoints(ques));
        
        difficulty.setValue(QuestionFactory.getQuesitonDiff(ques));
        
        questionText.setText(QuestionFactory.getQuestionText(ques));
        
        boolean tfAns = QuestionFactory.getTFAnswer(ques);
        if(tfAns)
            trueAnswer.setSelected(true);
        else
            falseAnswer.setSelected(true);
            
    }
    
}
