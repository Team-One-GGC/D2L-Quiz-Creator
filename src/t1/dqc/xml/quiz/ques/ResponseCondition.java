package t1.dqc.xml.quiz.ques;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="respcondition")
public class ResponseCondition
{
	private String title;
	private List<VarEqual> conditionVar;
	private SetVar setVar;
	private DisplayFeedback displayFeedback;
	
	@XmlElementWrapper(name="conditionvar")
	@XmlElement(name="varequal")
	public List<VarEqual> getConditionVar()
	{
		return conditionVar;
	}
	public void setConditionVar(List<VarEqual> conditionVar)
	{
		this.conditionVar = conditionVar;
	}
	@XmlElement(name="setvar")
	public SetVar getSetVar()
	{
		return setVar;
	}
	public void setSetVar(SetVar setVar)
	{
		this.setVar = setVar;
	}
	
	@XmlElement(name="displayfeedback")
	public DisplayFeedback getDisplayFeedback()
	{
		return displayFeedback;
	}
	public void setDisplayFeedback(DisplayFeedback displayFeedback)
	{
		this.displayFeedback = displayFeedback;
	}
	
	@XmlAttribute(name="title")
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	
}
