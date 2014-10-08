package t1.dqc.xml.quiz.presentation;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "mattext")
public class MatText
{
    private String textType;
    
    private String isDisplayed;
    
    private String value;
    
    public MatText(){}

    @XmlAttribute(name = "texttype")
    public String getTextType()
    {
        return textType;
    }

    public void setTextType(String textType)
    {
        this.textType = textType;
    }
    
    @XmlAttribute(name = "isdisplayed", namespace = "http://desire2learn.com/xsd/d2lcp_v2p0")
    public String getIsDisplayed()
    {
        return isDisplayed;
    }

    public void setIsDisplayed(String isDisplayed)
    {
        this.isDisplayed = isDisplayed;
    }

    @XmlValue
    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
