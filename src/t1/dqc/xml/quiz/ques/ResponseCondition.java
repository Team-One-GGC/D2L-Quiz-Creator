package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="respcondition")
public class ResponseCondition
{
	private VarEqual varEqual;
	private SetVar setVar;
	private DisplayFeedback displayFeedback;
	
	@XmlElementWrapper(name="conditionvar")
	@XmlElement(name="varequal")
	public VarEqual getVarEqual()
	{
		return varEqual;
	}
	public void setVarEqual(VarEqual varEqual)
	{
		this.varEqual = varEqual;
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
	
	
}
