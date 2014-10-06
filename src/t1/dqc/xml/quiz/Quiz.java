package t1.dqc.xml.quiz;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.D2LXmlFile;

/**
 * The class representation of a D2L quiz XML. 
 * This is the root element of  the quiz file.
 * NOTE: In xml the root element is called "questestinterop" the name of this class is merely a convenience.
 * @author Derek
 *
 */
@XmlRootElement(name = "questestinterop")
public class Quiz extends D2LXmlFile
{
    private String fileName;
    
    private Assessment assessment;
    
    public Quiz(){}
    
    @XmlElement(name = "assessment")
    public Assessment getAssessment()
    {
        return assessment;
    }

    public void setAssessment(Assessment assessment)
    {
        this.assessment = assessment;
    }

    @Override
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }
    
    @Override
    public String getFileName()
    {
        return fileName;
    }

}
