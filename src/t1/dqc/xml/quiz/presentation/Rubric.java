package t1.dqc.xml.quiz.presentation;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.quiz.Assessment;
import t1.dqc.xml.quiz.options.AssessFeedback;

/**
 * The class representation of the <rubric> tag.
 * This tag in found within <assessment> and <assessfeedback> see {@link Assessment} and {@link AssessFeedback}
 * @author Derek
 *
 */
@XmlRootElement(name = "rubric")
public class Rubric
{
    private List<Material> flow_mat;

    public Rubric(){}

    @XmlElementWrapper(name = "flow_mat")
    @XmlElement(name = "material")
    public List<Material> getFlow_mat()
    {
        return flow_mat;
    }

    public void setFlow_mat(List<Material> flow_mat)
    {
        this.flow_mat = flow_mat;
    }
}
