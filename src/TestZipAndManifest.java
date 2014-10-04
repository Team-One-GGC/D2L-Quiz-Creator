import java.util.List;

import t1.dqc.xml.manifest.Manifest;
import t1.dqc.xml.manifest.ManifestResource;
import t1.dqc.xml.manifest.ManifestRunner;
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
    public static final String EXAMPLE_READ_ZIP = "C:/Users/Derek/Desktop/SoftDev/examples.zip";
    public static final String EXAMPLE_WRITE_ZIP = "C:/Users/Derek/Desktop/SoftDev/mytest.zip";
    
    public static void main(String[] args)
    {
        ManifestRunner manRunner = new ManifestRunner();
        
        
//        testReadFromZip(manRunner);
        testWriteToZip(manRunner);
    }
    
    public static void testReadFromZip(ManifestRunner manRunner)
    {
        Manifest man = manRunner.readManifestFromZip(new ZipReader(EXAMPLE_READ_ZIP));//EXAMPLE_READ_ZIP must be changed
        List<ManifestResource> res = man.getResources();
        for(ManifestResource r : res)
        {
            System.out.println("Quiz title: " + r.getTitle());
            System.out.println("Quiz file: " + r.getHref());
        }
    }
    
    public static void testWriteToZip(ManifestRunner manRunner)
    {
        ManifestResource res = new ManifestResource("123", "Example quiz");
        Manifest man = new Manifest("D2L_321", res);
        manRunner.writeManifestToStream(man, new ZipWriter(EXAMPLE_WRITE_ZIP));//EXAMPLE_WRITE_ZIP must be changed
        System.out.println("Done");
    }
}
