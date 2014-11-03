package t1.dqc.xml.quiz;

import java.util.List;

import t1.dqc.xml.quiz.options.AssessmentControl;
import t1.dqc.xml.quiz.options.Date;
import t1.dqc.xml.quiz.options.Date.Timestamp;
import t1.dqc.xml.quiz.options.Procextension;
import t1.dqc.xml.quiz.ques.ItemMetadata;
import t1.dqc.xml.quiz.ques.QtiMetadataField;
import t1.dqc.xml.quiz.ques.Question;

/**
 * Utility class for getting various objects important to a Quiz object:
 * the different questions in a quiz, the various options associated with that quiz, etc...
 * Works by passing a Quiz instance to a static method.
 * @author derek
 *
 */
public class QuizFactory
{
    /**
     * Returns the title for the quiz.
     * @param quiz The Quiz instance
     * @return The title of the quiz
     */
    public static String getQuizTitle(Quiz quiz)
    {
        return quiz.getAssessment().getTitle();
    }
    
    //TODO Check the logic on this
    public static boolean isActive(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        if(p.getIsActive() == "no") {
            return false;
        }
        else
            return true;
    }
    
    public static String getPassword(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        return p.getPassword();
    }
    
    //Other methods go below
    //I can foresee this class getting very big as development goes on
    
    public static void test(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        Date d = p.getStartDate();
        Timestamp t = d.getTimeStamp();
        int month = t.getMonth();
        int day = t.getDay();
        
      List<Question> questions = quiz.getAssessment().getContainer().getQuestions();
      System.out.println(questions.get(0).getTitle());
     /* ItemMetadata data = questions.get(0).getItemMetadata();
      QtiMetadataField qtiMetadataField = data.getList().get(0);
      System.out.print(qtiMetadataField.getFieldlabel());
      System.out.print(qtiMetadataField.getFieldentry());*/
      
        
        System.out.println("Month: " + month + " Day: " + day);
    }
}
