package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.XmlNS;



@XmlRootElement(name = "item")
public class Question
{
	private String title = "True/False Title";
	private String ident = "OBJ_54021008";
	private String label = "QUES_22668049_22912484";
	private String page = "1";
	private ItemMetadata itemMetadata = null;
	private ItemprocExtension itemprocExtension = null;
	private Presentation presentation = null;
	
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
	
	@XmlElement(name = "presentation")
	public Presentation getPresentation()
	{
	    return presentation;
	}
	public void setPresentation(Presentation presentation)
	{
	    this.presentation = presentation;
	}
}
