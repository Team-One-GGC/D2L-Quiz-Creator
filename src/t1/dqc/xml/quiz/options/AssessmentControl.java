package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "assessmentcontrol")
public class AssessmentControl
{
	private String feedbackswitch;
	private String solutionswitch;
	private String hintswitch;
	
	@XmlAttribute(name = "feedbackswitch")
	public String getFeedbackswitch()
	{
		return feedbackswitch;
	}

	public void setFeedbackswitch(String feedbackswitch)
	{
		this.feedbackswitch = feedbackswitch;
	}

	@XmlAttribute(name = "solutionswitch")
	public String getSolutionswitch()
	{
		return solutionswitch;
	}

	public void setSolutionswitch(String solutionswitch)
	{
		this.solutionswitch = solutionswitch;
	}
	
	@XmlAttribute(name = "hintswitch")
	public String getHintswitch()
	{
		return hintswitch;
	}

	public void setHintswitch(String hintswitch)
	{
		this.hintswitch = hintswitch;
	}	
}
