package t1.dqc.xml.quiz.ques;

import java.util.List;

import javax.xml.bind.annotation.*;

/**
 * This class defines the <render_choice> xml tag
 * which is found within the <response_lid> section.
 * @author Jason
 *
 */

@XmlRootElement(name="render_choice")
public class RenderChoice
{
	private String shuffle;
	private List<FlowLabel> flowLabel;
	
	@XmlAttribute(name="shuffle")
	public String getShuffle()
	{
		return shuffle;
	}
	public void setShuffle(String shuffle)
	{
		this.shuffle = shuffle;
	}
	
	@XmlElement(name="flow_label")
	public List<FlowLabel> getFlowLabel()
	{
		return flowLabel;
	}
	public void setFlowLabel(List<FlowLabel> flowLabel)
	{
		this.flowLabel = flowLabel;
	}
	
}
