package t1.dqc.xml.quiz.presentation;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

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
