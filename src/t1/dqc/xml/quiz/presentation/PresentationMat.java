package t1.dqc.xml.quiz.presentation;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.quiz.Assessment;

/**
 * The class representation of the <presentation_material> Xml tag.
 * This tag is found within the <assessment> tag see {@link Assessment}
 * @author Derek
 *
 */
@XmlRootElement(name = "presentation_material")
public class PresentationMat
{
    private List<Material> flow_mat;
    
    public PresentationMat(){}

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
