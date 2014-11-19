package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

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

	@XmlAttribute(name="action")
	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}
}
