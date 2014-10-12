package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "intro_message", namespace = "http://desire2learn.com/xsd/d2lcp_v2p0")
public class IntroMessage
{
    private String isDisplayed;
    private String texttype;
    
    public IntroMessage(){}
    
    @XmlAttribute(name = "isdisplayed", namespace = "http://desire2learn.com/xsd/d2lcp_v2p0")
    public String getIsDisplayed()
    {
        return isDisplayed;
    }
    public void setIsDisplayed(String isDisplayed)
    {
        this.isDisplayed = isDisplayed;
    }
    
    @XmlAttribute(name = "texttype")
    public String getTexttype()
    {
        return texttype;
    }
    public void setTexttype(String texttype)
    {
        this.texttype = texttype;
    }
    
}
