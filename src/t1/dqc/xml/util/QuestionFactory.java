package t1.dqc.xml.util;

import java.util.List;

import t1.dqc.xml.quiz.ques.QtiMetadataField;
import t1.dqc.xml.quiz.ques.Question;

/**
 * Utility class for accessing various values from a question.
 * @author Derek
 *
 */
public class QuestionFactory
{
    /**
     * Returns the question's text.
     * @param ques
     * @return
     */
    public static String getQuestionText(Question ques)
    {
        String txt = ques.getPresentation().getFlow().getMaterial().getMatText().getValue();
        return txt;
    }
    
    public static String getQuestionType(Question ques)
    {
        String result = "";
        List<QtiMetadataField> metaData = ques.getItemMetadata().getList();
        for(int i = 0; i < metaData.size(); i++)
        {
            if(metaData.get(i).getFieldlabel().equals("qmd_questiontype"))
            {
                result = metaData.get(i).getFieldentry();
            }
        }
        return result;
    }
}
