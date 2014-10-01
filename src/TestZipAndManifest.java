import java.util.List;

import teamone.dqc.manifest.Manifest;
import teamone.dqc.manifest.ManifestResource;
import teamone.dqc.manifest.ManifestRunner;
import teamone.dqc.zip.ZipReader;
import teamone.dqc.zip.ZipWriter;


public class TestZipAndManifest
{
    //TODO Change these for your system test comment
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
