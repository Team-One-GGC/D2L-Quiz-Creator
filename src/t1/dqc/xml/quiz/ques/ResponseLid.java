package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="response_lid")
public class ResponseLid
{
	private String ident;
	private String rcardinality;
	private RenderChoice renderChoice;

	@XmlElement(name="render_choice")
	public RenderChoice getRenderChoice()
	{
		return renderChoice;
	}
	public void setRenderChoice(RenderChoice renderChoice)
	{
		this.renderChoice = renderChoice;
	}
	@XmlAttribute(name="ident")
	public String getIdent()
	{
		return ident;
	}
	public void setIdent(String ident)
	{
		this.ident = ident;
	}
	
	@XmlAttribute(name="rcardinality")
	public String getRcardinality()
	{
		return rcardinality;
	}
	public void setRcardinality(String rcardinality)
	{
		this.rcardinality = rcardinality;
	}
	
	
}
