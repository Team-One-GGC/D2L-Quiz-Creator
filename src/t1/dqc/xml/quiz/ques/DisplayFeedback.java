package t1.dqc.xml.quiz.ques;

/**
 * This class defines the <displayfeedback> tag which is inside
 *  the <resprocessing> section inside of each question item.
 */
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="displayfeedback")
public class DisplayFeedback
{
	private String linkrefid;
	private String feedbacktype;
	
	@XmlAttribute(name="linkrefid")
	public String getLinkrefid()
	{
		return linkrefid;
	}
	public void setLinkrefid(String linkrefid)
	{
		this.linkrefid = linkrefid;
	}
	
	@XmlAttribute(name="feedbacktype")
	public String getFeedbacktype()
	{
		return feedbacktype;
	}
	public void setFeedbacktype(String feedbacktype)
	{
		this.feedbacktype = feedbacktype;
	}
}
