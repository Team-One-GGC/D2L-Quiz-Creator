package t1.dqc.xml.quiz.options;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import t1.dqc.xml.XmlNS;
import t1.dqc.xml.quiz.presentation.Rubric;

/**
 * This class defines the <assessfeedback> xml tag
 * which is found within the <assessment> section.
 * @author Jason
 *
 */

@XmlRootElement(name="assessfeedback")
@XmlType(propOrder={"rubric", "duration", "responseDisplayTypeId", "showCorrectAnswers",
		"submissionRestrictIp", "showClassAverage", "showScoreDistribution"})
public class AssessFeedback
{
	private String title="";
	private Rubric rubric;
	private int duration = 0;
	private int responseDisplayTypeId = 4;
	private String showCorrectAnswers = "no";
	private String submissionRestrictIp = "no";
	private String showClassAverage = "yes";
	private String showScoreDistribution = "yes";
	
	@XmlAttribute(name="title")
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	@XmlElement(name="rubric")
	public Rubric getRubric()
	{
		return rubric;
	}
	public void setRubric(Rubric rubric)
	{
		this.rubric = rubric;
	}
	
	@XmlElement(name="duration", namespace=XmlNS.D2L_NS)
	public int getDuration()
	{
		return duration;
	}
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	
	@XmlElement(name="response_display_type_id", namespace=XmlNS.D2L_NS)
	public int getResponseDisplayTypeId()
	{
		return responseDisplayTypeId;
	}
	public void setResponseDisplayTypeId(int responseDisplayTypeId)
	{
		this.responseDisplayTypeId = responseDisplayTypeId;
	}
	
	@XmlElement(name="show_correct_answers", namespace=XmlNS.D2L_NS)
	public String getShowCorrectAnswers()
	{
		return showCorrectAnswers;
	}
	public void setShowCorrectAnswers(String showCorrectAnswers)
	{
		this.showCorrectAnswers = showCorrectAnswers;
	}
	

	@XmlElement(name="submission_restrictip", namespace=XmlNS.D2L_NS)
	public String getSubmissionRestrictIp()
	{
		return submissionRestrictIp;
	}
	public void setSubmissionRestrictIp(String submissionRestrictIp)
	{
		this.submissionRestrictIp = submissionRestrictIp;
	}
	
	@XmlElement(name="show_class_average", namespace=XmlNS.D2L_NS)
	public String getShowClassAverage()
	{
		return showClassAverage;
	}
	public void setShowClassAverage(String showClassAverage)
	{
		this.showClassAverage = showClassAverage;
	}
	
	@XmlElement(name="show_score_distribution", namespace=XmlNS.D2L_NS)
	public String getShowScoreDistribution()
	{
		return showScoreDistribution;
	}
	public void setShowScoreDistribution(String showScoreDistribution)
	{
		this.showScoreDistribution = showScoreDistribution;
	}	
}
