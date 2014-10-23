package t1.dqc.xml.quiz.ques;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.quiz.Assessment;

/**
 * Class representation of the <section> Xml tag.
 * This tag is found within the <assessment> tag see {@link Assessment}.
 * This class is the container for all the questions within a quiz
 * @author Derek
 *
 */
@XmlRootElement(name = "section")
public class QuestionContainer
{
    private String ident;
    private List<Question> questions;
    
    public QuestionContainer(){}

    @XmlAttribute(name = "ident")
    public String getIdent()
    {
        return ident;
    }

    public void setIdent(String ident)
    {
        this.ident = ident;
    }

    @XmlElement(name = "item")
    public List<Question> getQuestions()
    {
        return questions;
    }

    public void setQuestions(List<Question> questions)
    {
        this.questions = questions;
    }
}
