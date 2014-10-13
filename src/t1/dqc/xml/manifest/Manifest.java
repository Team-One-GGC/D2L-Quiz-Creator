package t1.dqc.xml.manifest;

import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import t1.dqc.xml.D2LXmlFile;

/**
 * Class representation of the imsmanifest.xml file included in a D2L quiz export
 * @author Derek
 *
 */
@XmlRootElement(name = "manifest")
public class Manifest extends D2LXmlFile
{
    public static final String FILE_NAME = "imsmanifest.xml";
    
    private String identifier;
    
    private List<ManifestResource> resources;
    
    public Manifest(){}//The no-arg constructor is needed by JAXB
    
    public Manifest(String identifier, ManifestResource... res)
    {
        this.identifier = identifier;
        this.resources = Arrays.asList(res);
    }
    
    @XmlAttribute
    public String getIdentifier()
    {
        return identifier;
    }
    
    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }
    
    @XmlElementWrapper(name = "resources")
    @XmlElement(name = "resource")
    public List<ManifestResource> getResources()
    {
        return resources;
    }
    
    public void setResources(List<ManifestResource> resources)
    {
        this.resources = resources;
    }

    @Override
    public void setFileName(String fileName)
    {
        //Do nothing
    }
    
    @Override
    public String getFileName()
    {
        return FILE_NAME;
    }
}
