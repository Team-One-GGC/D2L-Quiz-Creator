package t1.dqc.xml.quiz.ques;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "itemmetadata")
public class ItemMetadata
{
	/**
	 * @param list
	 */
    public ItemMetadata(List<QtiMetadataField> list)
    {
	    super();
	    this.list = list;
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
	    list.add(item3);
    }

	@XmlElementWrapper(name = "qtimetadata")
	@XmlElement(name = "qtimetadatafield")
	private List<QtiMetadataField> list;
}


