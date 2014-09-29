package teamone.ggc.dqc.manifest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ManifestRunner
{
    private JAXBContext context;
    
    public ManifestRunner()
    {
        createContext();
    }
    
    private void createContext()
    {
        try {
            context = JAXBContext.newInstance(Manifest.class);
        } catch(JAXBException e) {
            e.printStackTrace();
        }
    }
    
    public Manifest readManifestFromStream(InputStream in)
    {
        Unmarshaller unmarsh;
        Manifest manifest = null;
        try {
            unmarsh = context.createUnmarshaller();
            manifest = (Manifest) unmarsh.unmarshal(in);
        } catch(JAXBException e) {
            e.printStackTrace();
        }
        
        return manifest;
    }
    
    public void writeManifestToStream(Manifest man, OutputStream out)
    {
        Marshaller marsh;
        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        try {
            marsh = context.createMarshaller();
            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marsh.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            out.write(xmlHeader.getBytes());
            marsh.marshal(man, out);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
    public ManifestResource createManifestResource(String identifier, String title)
    {
        ManifestResource resource = new ManifestResource();
        resource.setIdentifier(identifier);
        resource.setTitle(title);
        resource.setHref(title + ".xml");
        resource.setType("webcontent");
        resource.setMaterial_type("d2lquiz");
        resource.setLink_target("");
        
        return resource;
    }
    
    public Manifest createManifest(String identifier, ManifestResource... resources)
    {
        Manifest manifest = new Manifest();
        manifest.setIdentifer(identifier);
        manifest.setResources(Arrays.asList(resources));
        
        return manifest;
    }
}
