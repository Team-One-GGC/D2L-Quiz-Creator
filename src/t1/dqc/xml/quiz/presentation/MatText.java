package t1.dqc.xml.quiz.presentation;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import t1.dqc.xml.XmlNS;

/**
 * The class representation of the <mattext> Xml tag.
 * This tag is found throughout the Xml and is associated with how things are displayed.
 * NOTE: some fields in this class are optional and might not be supplied in the Xml.
 * @author Derek
 *
 */
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
    
    @XmlAttribute(name = "isdisplayed", namespace = XmlNS.D2L_NS)
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
