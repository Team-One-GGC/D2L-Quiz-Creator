package t1.dqc.xml.quiz.ques;

/**
 * This class defines the <flow> tag which is inside
 *  the <presentation> section for each question item. 
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.quiz.presentation.Material;

@XmlRootElement(name="flow")
public class Flow
{
	private Material material;
	private ResponseExtension responseExtension;
	private ResponseLid responseLid;
	
	@XmlElement(name="response_lid")
	public ResponseLid getResponseLid()
	{
		return responseLid;
	}
	public void setResponseLid(ResponseLid responseLid)
	{
		this.responseLid = responseLid;
	}
	
	
	@XmlElement(name="material")
	public Material getMaterial()
	{
		return material;
	}

	public void setMaterial(Material material)
	{
		this.material = material;
	}
	
	@XmlElement(name="response_extension")
	public ResponseExtension getResponseExtension()
	{
		return responseExtension;
	}	

	public void setResponseExtension(ResponseExtension responseExtension)
	{
		this.responseExtension = responseExtension;
	}	
}
