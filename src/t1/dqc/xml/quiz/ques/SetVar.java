package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * This class defines the <setvar> xml tag
 * which is found within the <respcondition> section.
 * @author Jason
 *
 */

@XmlRootElement(name="setvar")
public class SetVar
{
	private String action;
	
	private double value;

	@XmlAttribute(name="action")
	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}
	
	@XmlValue
	public double getValue()
	{
	    return value;
	}
	
	public void setValue(double value)
	{
	    this.value = value;
	}
}
