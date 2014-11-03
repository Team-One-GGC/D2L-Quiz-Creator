package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="presentation")
public class Presentation
{
	private String mattext = "This is a true false question";
	private Flow flow = null;
	
	@XmlElement(name="flow")
	public Flow getFlow()
	{
		return flow;
	}

	public void setFlow(Flow flow)
	{
		this.flow = flow;
	}

	@XmlElementWrapper(name="material")
	@XmlElement(name="mattext")
	public String getMattext()
	{
		return mattext;
	}

	public void setMattext(String mattext)
	{
		this.mattext = mattext;
	}	
}
