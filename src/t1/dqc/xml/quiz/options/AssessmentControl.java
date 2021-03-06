package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.quiz.Assessment;

/**
 * The class representation of the <assessmentcontrol> Xml tag.
 * This tag is found within the <assessment> tag see {@link Assessment}
 * @author Derek
 *
 */
@XmlRootElement(name = "assessmentcontrol")
public class AssessmentControl
{
	private String feedbackswitch = "no";
	private String solutionswitch = "no";
	private String hintswitch = "no";
	
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
