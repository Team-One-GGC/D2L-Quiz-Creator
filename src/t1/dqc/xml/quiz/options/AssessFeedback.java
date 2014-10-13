package t1.dqc.xml.quiz.options;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
<<<<<<< HEAD
import javax.xml.bind.annotation.XmlType;
=======
>>>>>>> origin/Test_Jared

import t1.dqc.xml.quiz.presentation.Rubric;

@XmlRootElement(name="assessfeedback")
<<<<<<< HEAD
@XmlType(propOrder={"rubric", "duration", "responseDisplayTypeId", "showCorrectAnswers",
		"submissionRestrictIp", "showClassAverage", "showScoreDistribution"})
=======
>>>>>>> origin/Test_Jared
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
	
<<<<<<< HEAD
	@XmlElement(name="d2l_2p0:duration")
=======
	@XmlAttribute(name="d2l_2p0:duration")
>>>>>>> origin/Test_Jared
	public int getDuration()
	{
		return duration;
	}
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	
<<<<<<< HEAD
	@XmlElement(name="d2l_2p0:response_display_type_id")
=======
	@XmlAttribute(name="d2l_2p0:response_display_type_id")
>>>>>>> origin/Test_Jared
	public int getResponseDisplayTypeId()
	{
		return responseDisplayTypeId;
	}
	public void setResponseDisplayTypeId(int responseDisplayTypeId)
	{
		this.responseDisplayTypeId = responseDisplayTypeId;
	}
	
<<<<<<< HEAD
	@XmlElement(name="d2l_2p0:show_correct_answers")
=======
	@XmlAttribute(name="d2l_2p0:show_correct_answers")
>>>>>>> origin/Test_Jared
	public String getShowCorrectAnswers()
	{
		return showCorrectAnswers;
	}
	public void setShowCorrectAnswers(String showCorrectAnswers)
	{
		this.showCorrectAnswers = showCorrectAnswers;
	}
	
<<<<<<< HEAD
	@XmlElement(name="d2l_2p0:submission_restrictip")
=======
	@XmlAttribute(name="d2l_2p0:submission_restrictip")
>>>>>>> origin/Test_Jared
	public String getSubmissionRestrictIp()
	{
		return submissionRestrictIp;
	}
	public void setSubmissionRestrictIp(String submissionRestrictIp)
	{
		this.submissionRestrictIp = submissionRestrictIp;
	}
	
<<<<<<< HEAD
	@XmlElement(name="d2l_2p0:show_class_average")
=======
	@XmlAttribute(name="d2l_2p0:show_class_average")
>>>>>>> origin/Test_Jared
	public String getShowClassAverage()
	{
		return showClassAverage;
	}
	public void setShowClassAverage(String showClassAverage)
	{
		this.showClassAverage = showClassAverage;
	}
	
<<<<<<< HEAD
	@XmlElement(name="d2l_2p0:show_score_distribution")
=======
	@XmlAttribute(name="d2l_2p0:show_score_distribution")
>>>>>>> origin/Test_Jared
	public String getShowScoreDistribution()
	{
		return showScoreDistribution;
	}
	public void setShowScoreDistribution(String showScoreDistribution)
	{
		this.showScoreDistribution = showScoreDistribution;
	}	
}
