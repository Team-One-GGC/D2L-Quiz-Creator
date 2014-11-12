package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="varequal")
public class VarEqual
{
	private String respident;

	@XmlAttribute(name="respident")
	public String getRespident()
	{
		return respident;
	}

	public void setRespident(String respident)
	{
		this.respident = respident;
	}
}
