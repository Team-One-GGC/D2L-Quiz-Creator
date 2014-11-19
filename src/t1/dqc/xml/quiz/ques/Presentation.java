package t1.dqc.xml.quiz.ques;

/**
 * This class defines the <presentation> xml tag 
 * which is inside the <item> section.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="presentation")
public class Presentation
{
	private Flow flow;
	
	@XmlElement(name="flow")
	public Flow getFlow()
	{
		return flow;
	}

	public void setFlow(Flow flow)
	{
		this.flow = flow;
	}
}
