package t1.dqc.xml.util;

import java.util.List;

import t1.dqc.xml.quiz.ques.FlowLabel;
import t1.dqc.xml.quiz.ques.ItemprocExtension;
import t1.dqc.xml.quiz.ques.QtiMetadataField;
import t1.dqc.xml.quiz.ques.Question;
import t1.dqc.xml.quiz.ques.ResponseCondition;
import t1.dqc.xml.quiz.ques.ResponseLabel;

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
    
    public static String getQuestionTitle(Question ques)
    {
        String title = ques.getTitle();
        if(title != null) return title;
        else return "";
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
    
    public static String getQuestionPoints(Question ques)
    {
        List<QtiMetadataField> metaData = ques.getItemMetadata().getList();
        String result = "";
        for(int i = 0; i < metaData.size(); i++)
        {
            if(metaData.get(i).getFieldlabel().equals("qmd_weighting"))
            {
                String points = metaData.get(i).getFieldentry();
                result = points.substring(0, points.indexOf("."));
            }
        }
        return result;
    }
    
    public static String getQuesitonDiff(Question ques)
    {
        ItemprocExtension itemExt = ques.getItemprocExtension();
        return itemExt.getDifficulty();
    }
    
    public static List<ResponseCondition> getReprocessing(Question ques)
    {
        return ques.getResponseConditions();
    }
    
    public static boolean getTFAnswer(Question ques)
    {
        boolean result = false;
        List<ResponseCondition> reprocessing = getReprocessing(ques);
        String correctAnsID = "";
        for(ResponseCondition cond : reprocessing)
        {
            String id = cond.getConditionVar().get(0).getValue();
            double value = cond.getSetVar().getValue();
            if(value > 0)
                correctAnsID = id;
        }
        
        List<FlowLabel> ansBlocks = ques.getPresentation().getFlow().getResponseLid().getRenderChoice().getFlowLabel();
        String ansTxt = "";
        for(FlowLabel lab : ansBlocks)
        {
            String ansId = lab.getResponseLabel().getIdent();
            if(ansId.equals(correctAnsID))
            {
                ansTxt = lab.getResponseLabel().getFlow_mat().get(0).getMatText().getValue();
            }
        }
        
        if(ansTxt.equals("True"))
            result = true;
        else
            result = false;
        
        return result;
    }
}
