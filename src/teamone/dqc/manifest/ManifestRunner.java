package teamone.dqc.manifest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import teamone.dqc.zip.ZipReader;
import teamone.dqc.zip.ZipWriter;

/**
 * This class acts as an interface between the manifest package and the zip package.
 * It includes methods for reading and writing the imsmanifest.xml found within D2L zip files.
 * @author Derek
 *
 */
public class ManifestRunner
{
    private JAXBContext context;
    
    public ManifestRunner()
    {
        createContext();
    }
    
    /**
     * Initializes the JAXBContext
     */
    private void createContext()
    {
        try {
            context = JAXBContext.newInstance(Manifest.class);
        } catch(JAXBException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Unmarshalls a imsmanifest.xml file and returns a Manifest object.
     * @param reader A ZipReader object
     * @return An instance of the Manifest class
     */
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
    
    /**
     * Marshalls a Manifest object to an imsmanifest.xml file within a zip.
     * @param man The Manifest object to be marshalled
     * @param writer A ZipWriter object
     */
    public void writeManifestToStream(Manifest man, ZipWriter writer)
    {
        Marshaller marsh;
        OutputStream out;
        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        try {
            marsh = context.createMarshaller();
            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marsh.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);//This disables the default JAXB XML header information
            out = writer.createZipEntry(Manifest.FILE_NAME);
            out.write(xmlHeader.getBytes());//Write our custom XML header to the file.
            marsh.marshal(man, out);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        } finally {
            writer.closeEntry();
            writer.closeStreams();
        }
    }
}
