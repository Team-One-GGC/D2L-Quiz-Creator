package t1.dqc.xml.quiz.presentation;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The class representation of the <material> Xml tag.
 * This tag is found throughout the Xml and is associated with how things are presented on D2L.
 * @author Derek
 *
 */
@XmlRootElement(name = "material")
public class Material
{
    private String label;
    
    private MatText matText;
    
    public Material(){}

    @XmlAttribute(name = "label")
    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    @XmlElement(name = "mattext")
    public MatText getMatText()
    {
        return matText;
    }

    public void setMatText(MatText matText)
    {
        this.matText = matText;
    }    
}
