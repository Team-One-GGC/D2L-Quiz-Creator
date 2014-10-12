package t1.dqc.xml.quiz;

import t1.dqc.xml.quiz.options.AssessFeedback;
import t1.dqc.xml.quiz.options.AssessmentControl;

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
        AssessFeedback a = quiz.getAssessment().getFeedback();
        System.out.println(a.getShowClassAverage());
    }
}
