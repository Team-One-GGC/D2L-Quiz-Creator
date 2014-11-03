package t1.dqc.xml.quiz.ques;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.quiz.presentation.Material;

@XmlRootElement(name="flow")
public class Flow
{
	Material material = null;

	@XmlElement(name="material")
	public Material getMaterial()
	{
		return material;
	}

	public void setMaterial(Material material)
	{
		this.material = material;
	}
}
