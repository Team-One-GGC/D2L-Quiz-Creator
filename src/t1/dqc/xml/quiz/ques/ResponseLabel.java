package t1.dqc.xml.quiz.ques;

import java.util.List;
import t1.dqc.xml.quiz.presentation.*;
import javax.xml.bind.annotation.*;

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
