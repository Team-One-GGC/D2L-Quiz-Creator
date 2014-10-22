package t1.dqc.xml.quiz;

import t1.dqc.xml.quiz.options.AssessmentControl;
import t1.dqc.xml.quiz.options.Date;
import t1.dqc.xml.quiz.options.Date.Timestamp;
import t1.dqc.xml.quiz.options.Procextension;

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
    
    //Other methods go below
    //I can foresee this class getting very big as development goes on
    
    public static void test(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        Date d = p.getStartDate();
        Timestamp t = d.getTimeStamp();
        int month = t.getMonth();
        int day = t.getDay();
        
        System.out.println("Month: " + month + " Day: " + day);
    }
}
