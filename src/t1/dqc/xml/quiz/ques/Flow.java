package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.quiz.presentation.MatText;
import t1.dqc.xml.quiz.presentation.Material;

@XmlRootElement(name="flow")
public class Flow
{
	Material material;
	MatText matText;
	ResponseExtension responseExtension;
	
	
	@XmlElementWrapper(name="material")
	@XmlElement(name="mattext")
	public MatText getMatText()
	{
		return matText;
	}

	public void setMatText(MatText matText)
	{
		this.matText = matText;
	}
	
	@XmlElementWrapper(name="material")
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
