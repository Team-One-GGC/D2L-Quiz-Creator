import java.io.IOException;
import java.io.InputStream;

import teamone.dqc.manifest.Manifest;
import teamone.dqc.manifest.ManifestRunner;
import teamone.dqc.zip.ZipReader;


public class TestZipAndManifest
{
    public static void main(String[] args)
    {
        ManifestRunner manRunner = new ManifestRunner();
        testReadFromZip(manRunner);
    }
    
    public static void testReadFromZip(ManifestRunner manRunner)
    {
        ZipReader zipReader = new ZipReader(ZipReader.EXAMPLE_ZIP);//EXAMPLE_ZIP must be changed
        InputStream in = null;
        Manifest man = null;
        try {
            in = zipReader.readFromZip(Manifest.FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if(in != null)
            man = manRunner.readManifestFromStream(in);
        else {
            System.exit(1);
            zipReader.closeStreams();
        }
        
        String quizTitle = man.getResources().get(1).getTitle();
        String quizFile = man.getResources().get(1).getHref();
        
        System.out.println("Quiz title: " + quizTitle);
        System.out.println("Quiz file: " + quizFile);
        
        zipReader.closeStreams();
    }
}
