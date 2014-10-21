package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.XmlNS;

/**
 * Class representation of the <intro_message> Xml tag.
 * This tag is found within the <assess_procextension> tag see {@link Procextension}
 * @author Derek
 *
 */
@XmlRootElement(name = "intro_message", namespace = XmlNS.D2L_NS)
public class IntroMessage
{
    private String isDisplayed;
    private String texttype;
    
    public IntroMessage(){}
    
    @XmlAttribute(name = "isdisplayed", namespace = XmlNS.D2L_NS)
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
