package t1.dqc.xml.quiz.ques;

import java.util.List;
import t1.dqc.xml.quiz.presentation.*;
import javax.xml.bind.annotation.*;


/**
 * This class defines the <response_label> xml tag
 * which is found within the <flow_label> tag inside the
 * <response_lid> section.
 * @author Jason
 *
 */
@XmlRootElement(name="response_label")
public class ResponseLabel
{
	private String ident;
	private List<Material> flow_mat;
	
	@XmlAttribute(name="ident")
	public String getIdent()
	{
		return ident;
	}
	public void setIdent(String ident)
	{
		this.ident = ident;
	}
	
	@XmlElementWrapper(name="flow_mat")
	@XmlElement(name="material")
	public List<Material> getFlow_mat()
	{
		return flow_mat;
	}
	public void setFlow_mat(List<Material> flow_mat)
	{
		this.flow_mat = flow_mat;
	}
	
	
}
