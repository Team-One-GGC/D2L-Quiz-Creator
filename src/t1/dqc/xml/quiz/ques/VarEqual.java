package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
/**
 * This class defines the <varequal> xml tag
 * which is found within the <respcondition> section.
 * @author Jason
 *
 */
@XmlRootElement(name="varequal")
public class VarEqual
{
	private String respident;
	private String value;

	@XmlAttribute(name="respident")
	public String getRespident()
	{
		return respident;
	}

	public void setRespident(String respident)
	{
		this.respident = respident;
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
