package t1.dqc.xml.quiz.ques;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.XmlNS;

/**
 * This class defines the <item> tag which is inside the <assessment> section.
 * The <item> section contains all of the elements for each question.
 */

@XmlRootElement(name = "item")
public class Question
{
	private String title;
	private String ident;
	private String label;
	private String page;
	private Presentation presentation;
	private ItemMetadata itemMetadata;
	private ItemprocExtension itemprocExtension;
	private List<ResponseCondition> responseConditions;
	
	@XmlElement(name = "itemproc_extension")
	public ItemprocExtension getItemprocExtension()
	{
		return itemprocExtension;
	}
	public void setItemprocExtension(ItemprocExtension itemprocExtension)
	{
		this.itemprocExtension = itemprocExtension;
	}
	
	@XmlElement(name = "itemmetadata")
	public ItemMetadata getItemMetadata()
	{
		return itemMetadata;
	}
	public void setItemMetadata(ItemMetadata itemMetadata)
	{
		this.itemMetadata = itemMetadata;
	}
	@XmlAttribute(name = "title")
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	@XmlAttribute(name = "ident")
	public String getIdent()
	{
		return ident;
	}
	public void setIdent(String ident)
	{
		this.ident = ident;
	}
	
	@XmlAttribute(name = "label")
	public String getLabel()
	{
		return label;
	}
	public void setLabel(String label)
	{
		this.label = label;
	}
	
	@XmlAttribute(name = "page", namespace = XmlNS.D2L_PREFIX)
	public String getPage()
	{
		return page;
	}
	public void setPage(String page)
	{
		this.page = page;
	}
	
	@XmlElementWrapper(name="resprocessing")
	@XmlElement(name="respcondition")
	public List<ResponseCondition> getResponseConditions()
	{
		return responseConditions;
	}
	public void setResponseConditions(List<ResponseCondition> responseConditions)
	{
		this.responseConditions = responseConditions;
	}
	
	@XmlElement(name="presentation")
	public Presentation getPresentation()
	{
		return presentation;
	}
	public void setPresentation(Presentation presentation)
	{
		this.presentation = presentation;
	}
}
