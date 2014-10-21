package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import t1.dqc.xml.quiz.presentation.Rubric;

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
	
	@XmlElement(name="d2l_2p0:duration")
	public int getDuration()
	{
		return duration;
	}
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	
	@XmlElement(name="d2l_2p0:response_display_type_id")
	public int getResponseDisplayTypeId()
	{
		return responseDisplayTypeId;
	}
	public void setResponseDisplayTypeId(int responseDisplayTypeId)
	{
		this.responseDisplayTypeId = responseDisplayTypeId;
	}
	
	@XmlElement(name="d2l_2p0:show_correct_answers")
	public String getShowCorrectAnswers()
	{
		return showCorrectAnswers;
	}
	public void setShowCorrectAnswers(String showCorrectAnswers)
	{
		this.showCorrectAnswers = showCorrectAnswers;
	}
	

	@XmlElement(name="d2l_2p0:submission_restrictip")
	public String getSubmissionRestrictIp()
	{
		return submissionRestrictIp;
	}
	public void setSubmissionRestrictIp(String submissionRestrictIp)
	{
		this.submissionRestrictIp = submissionRestrictIp;
	}
	
	@XmlElement(name="d2l_2p0:show_class_average")
	public String getShowClassAverage()
	{
		return showClassAverage;
	}
	public void setShowClassAverage(String showClassAverage)
	{
		this.showClassAverage = showClassAverage;
	}
	
	@XmlElement(name="d2l_2p0:show_score_distribution")
	public String getShowScoreDistribution()
	{
		return showScoreDistribution;
	}
	public void setShowScoreDistribution(String showScoreDistribution)
	{
		this.showScoreDistribution = showScoreDistribution;
	}	
}
