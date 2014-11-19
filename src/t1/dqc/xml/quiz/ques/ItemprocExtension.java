package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.XmlNS;

/**
 * This class defines the <itemproc_extension> xml tag 
 * which is found in the <item> section.
 */
@XmlRootElement(name="itemproc_extension")
public class ItemprocExtension
{
	private String difficulty = "1";
	private String isBonus = "no";
	private String isMandatory = "no";
	
	@XmlElement(name="difficulty", namespace=XmlNS.D2L_PREFIX)
	public String getDifficulty()
	{
		return difficulty;
	}
	public void setDifficulty(String difficulty)
	{
		this.difficulty = difficulty;
	}
	
	@XmlElement(name="isbonus", namespace=XmlNS.D2L_PREFIX)
	public String getIsBonus()
	{
		return isBonus;
	}
	public void setIsBonus(String isBonus)
	{
		this.isBonus = isBonus;
	}
	
	@XmlElement(name="ismandatory", namespace=XmlNS.D2L_PREFIX)
	public String getIsMandatory()
	{
		return isMandatory;
	}
	public void setIsMandatory(String isMandatory)
	{
		this.isMandatory = isMandatory;
	}	
}
