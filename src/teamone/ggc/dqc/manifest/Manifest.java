package teamone.ggc.dqc.manifest;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "manifest")
public class Manifest
{
    public static final String FILE_NAME = "imsmanifest.xml";
    
    private String identifier;
    
    private List<ManifestResource> resources;
    
    @XmlAttribute
    public String getIdentifier()
    {
        return identifier;
    }
    
    public void setIdentifer(String identifier)
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
}
