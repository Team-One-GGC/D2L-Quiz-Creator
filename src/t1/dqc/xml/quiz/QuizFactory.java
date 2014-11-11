package t1.dqc.xml.quiz;

import java.time.LocalDate;
import java.util.List;

import t1.dqc.xml.quiz.options.AssessmentControl;
import t1.dqc.xml.quiz.options.Date;
import t1.dqc.xml.quiz.options.Date.Timestamp;
import t1.dqc.xml.quiz.options.Procextension;
import t1.dqc.xml.quiz.ques.ItemMetadata;
import t1.dqc.xml.quiz.ques.QtiMetadataField;
import t1.dqc.xml.quiz.ques.Question;
import t1.dqc.xml.quiz.ques.QuestionContainer;

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
    
    /**
     * Returns "Enabled" is quiz is active, "Disabled" otherwise.
     * @param quiz The Quiz instance
     * @return whether the quiz is active 
     */
    public static String getActive(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        if(p.getIsActive().equals("no")) {
            return "Disabled";
        }
        else
            return "Enabled";
    }
  
    /**
     * Returns the start date of the quiz.
     * @param quiz the Quiz instance
     * @return LocalDate representing the year, month, day
     */
    public static LocalDate getStartDate(Quiz quiz)//TODO handle no dates
    {
        Date d = quiz.getAssessment().getExtension().getStartDate();
        int year = d.getTimeStamp().getYear();
        int month = d.getTimeStamp().getMonth();
        int day = d.getTimeStamp().getDay();
        return LocalDate.of(year, month, day);
    }
    
    /**
     * 
     * @param quiz
     * @return
     */
    public static String getStartTime(Quiz quiz)//TODO handle no date
    {
        Date d = quiz.getAssessment().getExtension().getStartDate();
        int hour = d.getTimeStamp().getHour();
        int min = d.getTimeStamp().getMinutes();
        return Integer.toString(hour) +":" + Integer.toString(min);
    }
    
    public static LocalDate getEndDate(Quiz quiz)//TODO handle no date
    {
        Date d = quiz.getAssessment().getExtension().getEndDate();
        int year = d.getTimeStamp().getYear();
        int month = d.getTimeStamp().getMonth();
        int day = d.getTimeStamp().getDay();
        return LocalDate.of(year, month, day);
    }
    
    public static String getEndTime(Quiz quiz)//TODO handle no date
    {
        Date d = quiz.getAssessment().getExtension().getEndDate();
        int hour = d.getTimeStamp().getHour();
        int min = d.getTimeStamp().getMinutes();
        return Integer.toString(hour) +":" + Integer.toString(min);
    }
    
    public static String getPassword(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        return p.getPassword();
    }
    
    public static String getTimeLimit(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        return Integer.toString(p.getTimeLimit());
    }
    
    public static boolean isTimeEnforced(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();        
        return (p.getEnforceTimeLimit().equals("no"))? false : true;
    }
    
    public static String getAttempsAllowed(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        return Integer.toString(p.getAttemptsAllowed());
    }
    
    
    /**
     * Returns a List of all the questions
     * @param quiz
     * @return a List of all the quizzes
     */
    public static List<Question> getQuestions(Quiz quiz)
    {
        return quiz.getAssessment().getContainer().getQuestions();
    }
    
    //Other methods go below
    //I can foresee this class getting very big as development goes on
    
    public static void test(Quiz quiz)
    {//Print out all question text
        List<Question> list = getQuestions(quiz);
        for(Question q : list)
        {
            String ques = q.getPresentation().getFlow().getMaterial().getMatText().getValue();
            System.out.println(ques);
        }
    }
}
