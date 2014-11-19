package t1.dqc.xml.quiz.ques;

/**
 * This class represents the <flow_label> xml tag
 *  which is found in the <response_lid> section.
 */
import javax.xml.bind.annotation.*;

@XmlRootElement(name="flow_label")
public class FlowLabel
{
	private String flowLabelClass;
	private ResponseLabel responseLabel;
	
	@XmlAttribute(name="class")
	public String getFlowLabelClass()
	{
		return flowLabelClass;
	}
	public void setFlowLabelClass(String flowLabelClass)
	{
		this.flowLabelClass = flowLabelClass;
	}
	
	@XmlElement(name="response_label")
	public ResponseLabel getResponseLabel()
	{
		return responseLabel;
	}
	public void setResponseLabel(ResponseLabel responseLabel)
	{
		this.responseLabel = responseLabel;
	}
	
	
}
