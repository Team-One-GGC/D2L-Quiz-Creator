package t1.dqc.xml.util;

import java.time.LocalDate;
import java.util.List;

import t1.dqc.xml.quiz.Quiz;
import t1.dqc.xml.quiz.options.Date;
import t1.dqc.xml.quiz.options.Date.Timestamp;
import t1.dqc.xml.quiz.options.Procextension;
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
     * Returns a DateUtil object of the quiz's start date information.
     * Returns null if no start date is found.
     * @param quiz
     * @return
     */
    public static DateUtil getStartDate(Quiz quiz)
    {
        Timestamp t = quiz.getAssessment().getExtension().getStartDate().getTimeStamp();
        try
        {
            DateUtil d = new DateUtil(t);
            return d;
        } 
        catch(NullPointerException e)
        {
            return null;
        }
    }
    
    /**
     * Returns DateUtil object of the quiz's end date information.
     * Returns null if no end date is found.
     * @param quiz
     * @return
     */
    public static DateUtil getEndDate(Quiz quiz)
    {
        Timestamp t = quiz.getAssessment().getExtension().getEndDate().getTimeStamp();
        try
        {
            DateUtil d = new DateUtil(t);
            return d;
        } 
        catch(NullPointerException e)
        {
            return null;
        }
    }
    
    /**
     * Returns the password for the quiz.
     * NOTE: no checking is done for whether a quiz has a password. This method can return a null object.
     * @param quiz
     * @return
     */
    public static String getPassword(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        return p.getPassword();
    }
    
    /**
     * Returns the quiz's time limit.
     * @param quiz
     * @return
     */
    public static String getTimeLimit(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        return Integer.toString(p.getTimeLimit());
    }
    
    /**
     * Returns how many attempts are allowed for this quiz.
     * @param quiz
     * @return
     */
    public static String getAttempsAllowed(Quiz quiz)
    {
        Procextension p = quiz.getAssessment().getExtension();
        return Integer.toString(p.getAttemptsAllowed());
    }
    
    
    /**
     * Returns a List of all the questions.
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
            String ques = QuestionFactory.getQuestionText(q);
            String type = QuestionFactory.getQuestionType(q);
            System.out.println("Question text: " + ques);
            System.out.println("Question type: " + type);
        }
    }
}
