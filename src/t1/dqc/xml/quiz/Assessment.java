package t1.dqc.xml.quiz;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "assessment")
public class Assessment
{
    private String id;
    private String title;
    private String ident;
    
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
}
