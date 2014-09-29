package teamone.dqc.manifest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import teamone.dqc.zip.ZipReader;
import teamone.dqc.zip.ZipWriter;

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
    
    public Manifest readManifestFromZip(ZipReader reader)
    {
        Unmarshaller unmarsh;
        Manifest manifest = null;
        InputStream in = null;
        try {
            in = reader.readFromZip(Manifest.FILE_NAME);
            unmarsh = context.createUnmarshaller();
            manifest = (Manifest) unmarsh.unmarshal(in);
        } catch(JAXBException | IOException e) {
            e.printStackTrace();
        } finally {
            reader.closeStreams();
        }
        
        return manifest;
    }
    
    public void writeManifestToStream(Manifest man, ZipWriter writer)
    {
        Marshaller marsh;
        OutputStream out;
        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        try {
            marsh = context.createMarshaller();
            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marsh.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            out = writer.createZipEntry(Manifest.FILE_NAME);
            out.write(xmlHeader.getBytes());
            marsh.marshal(man, out);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.closeEntry();
            writer.closeStreams();
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
