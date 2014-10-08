package t1.dqc.xml.quiz;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.quiz.presentation.PresentationMat;
import t1.dqc.xml.quiz.presentation.Rubric;

/**
 * This class represents the contents of the <assessment> element within the D2L quiz Xml.
 * The <assessment> element is second level element of the Xml a {@link Quiz} contains one Assessment.
 * @author Derek
 *
 */
@XmlRootElement(name = "assessment")
public class Assessment
{
    private String id;
    private String title;
    private String ident;
    
    private Rubric rubric;
    private PresentationMat presentationMat;
    
    public Assessment(){}
    
    @XmlAttribute(name = "id", namespace = "http://desire2learn.com/xsd/d2lcp_v2p0")
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    
    @XmlAttribute(name = "title")
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    @XmlAttribute(name = "ident")
    public String getIdent()
    {
        return ident;
    }
    public void setIdent(String ident)
    {
        this.ident = ident;
    }
    
    @XmlElement(name = "rubric")
    public Rubric getRubric()
    {
        return rubric;
    }
    public void setRubric(Rubric rubric)
    {
        this.rubric = rubric;
    }
    
    @XmlElement(name = "presentation_material")
    public PresentationMat getPresentationMat()
    {
        return presentationMat;
    }
    public void setPresentationMat(PresentationMat presentationMat)
    {
        this.presentationMat = presentationMat;
    }
}
