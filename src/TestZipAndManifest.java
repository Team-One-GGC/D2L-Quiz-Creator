import java.util.List;

import t1.dqc.xml.manifest.Manifest;
import t1.dqc.xml.manifest.ManifestResource;
import t1.dqc.zip.ZipReader;
import t1.dqc.zip.ZipWriter;

/**
 * This will be deleted in the final version
 * @author Derek
 *
 */
public class TestZipAndManifest
{
    //TODO Change these for your system
    public static final String EXAMPLE_READ_ZIP = "/home/derek/Downloads/example.zip";
    public static final String EXAMPLE_WRITE_ZIP = "/home/derek/mytest.zip";
    
    public static void main(String[] args)
    {        
        testReadFromZip();
        testWriteToZip();
    }
    
    public static void testReadFromZip()
    {
        ZipReader<Manifest> reader = new ZipReader<Manifest>(EXAMPLE_READ_ZIP, Manifest.class);
        Manifest man = reader.getObjectFromXML(Manifest.FILE_NAME);
        List<ManifestResource> res = man.getResources();
        
        res.forEach(
                r -> System.out.println(r.getTitle())
                );
        reader.closeStreams();
        
    }
    
    public static void testWriteToZip()
    {
        ManifestResource res = new ManifestResource("123", "Example quiz");
        Manifest man = new Manifest("D2L_321", res);
        ZipWriter<Manifest> writer = new ZipWriter<Manifest>(EXAMPLE_WRITE_ZIP, Manifest.class);
        writer.writeObjectToXML(man);
        System.out.println("Done");
    }
}
