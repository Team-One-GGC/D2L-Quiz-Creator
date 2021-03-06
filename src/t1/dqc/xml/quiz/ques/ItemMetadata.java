package t1.dqc.xml.quiz.ques;
/**
 * This class defines the <itemmetadata> xml tag 
 * which is found in the <item> section.
 */
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "itemmetadata")
public class ItemMetadata
{
	@XmlElementWrapper(name = "qtimetadata")
	@XmlElement(name = "qti_metadatafield")
	public List<QtiMetadataField> getList()
	{
		return list;
	}

	public void setList(List<QtiMetadataField> list)
	{
		this.list = list;
	}

	private List<QtiMetadataField> list;
	
	/**
	 * @param list
	 */
    public ItemMetadata()
    {
	   /* super();
	    QtiMetadataField item1 = new QtiMetadataField();
	    item1.setFieldlabel("qmd_computerscored");
	    item1.setFieldentry("yes");
	    list.add(item1);
	    
	    QtiMetadataField item2 = new QtiMetadataField();
	    item1.setFieldlabel("qmd_questiontype");
	    item1.setFieldentry("True/False");
	    list.add(item2);
	    
	    QtiMetadataField item3 = new QtiMetadataField();
	    item1.setFieldlabel("qmd_weighting");
	    item1.setFieldentry("1");
	    list.add(item3);*/
    }
}


