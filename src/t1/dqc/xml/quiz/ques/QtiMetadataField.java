package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.*;





@XmlRootElement(name = "qti_metadatafield")
public class QtiMetadataField
{
	private String fieldlabel;
	private String fieldentry;
	
	@XmlElement(name = "fieldlabel")
	public String getFieldlabel()
	{
		return fieldlabel;
	}
	public void setFieldlabel(String fieldlabel)
	{
		this.fieldlabel = fieldlabel;
	}
	
	@XmlElement(name = "fieldentry")
	public String getFieldentry()
	{
		return fieldentry;
	}
	public void setFieldentry(String fieldentry)
	{
		this.fieldentry = fieldentry;
	}
	
	
}
