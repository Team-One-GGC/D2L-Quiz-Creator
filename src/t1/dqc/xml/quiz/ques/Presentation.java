package t1.dqc.xml.quiz.ques;

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
