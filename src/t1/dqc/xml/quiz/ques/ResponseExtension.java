package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.XmlNS;

@XmlRootElement(name="response_extension")
public class ResponseExtension
{
	private String displayStyle = "2";
	private String enumeration = "6";
	private String gradingType = "0";
	
	@XmlElement(name="display_style", namespace=XmlNS.D2L_PREFIX)
	public String getDisplayStyle()
	{
		return displayStyle;
	}
	public void setDisplayStyle(String displayStyle)
	{
		this.displayStyle = displayStyle;
	}
	
	@XmlElement(name="enumeration", namespace=XmlNS.D2L_PREFIX)
	public String getEnumeration()
	{
		return enumeration;
	}
	public void setEnumeration(String enumeration)
	{
		this.enumeration = enumeration;
	}
	
	@XmlElement(name="grading_type", namespace=XmlNS.D2L_PREFIX)
	public String getGradingType()
	{
		return gradingType;
	}
	public void setGradingType(String gradingType)
	{
		this.gradingType = gradingType;
	}
	
	
}
