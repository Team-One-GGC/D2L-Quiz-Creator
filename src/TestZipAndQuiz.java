import java.util.List;

import t1.dqc.xml.manifest.Manifest;
import t1.dqc.xml.manifest.ManifestResource;
import t1.dqc.xml.quiz.Quiz;
import t1.dqc.zip.ZipReader;

/**
 * A Class to test the functionality of reading quiz files from a zip.
 * This should be deleted later
 * @author Derek
 *
 */
public class TestZipAndQuiz
{
    //TODO Change for your system
    public static final String EXAMPLE_READ_ZIP = "C:/Users/Derek/Desktop/SoftDev/examples.zip";
    
    public static void main(String[] args)
    {
        
    }
    
    public static void testReadQuizFromZip()
    {
        //Create the ZipReaders that will read the files
        ZipReader<Manifest> manReader = new ZipReader<>(EXAMPLE_READ_ZIP, Manifest.class);
        ZipReader<Quiz> quizReader = new ZipReader<>(EXAMPLE_READ_ZIP, Quiz.class);
        
        //Get the Manifest contained within the zip
        Manifest man = manReader.getObjectFromXML(Manifest.FILE_NAME);
        manReader.closeStreams();//make sure to close the streams before continuing
        
        List<ManifestResource> manRes = man.getResources();//All the ManifestResources within a imsmanifest.xml specified by <resource> tag
        String quizFiles[] = new String[manRes.size()];//Will hold the name of the quiz Xml files within the zip
        Quiz quizzes[] = new Quiz[manRes.size()];//Holds the Quiz objects
        for(int i = 0; i < quizFiles.length; i++)
        {
            quizFiles[i] = manRes.get(i).getHref();//Get the fileNames contained within the zip
            quizzes[i] = quizReader.getObjectFromXML(quizFiles[i]);//Get an instance of the Quiz
            System.out.println("The title of Quiz " + (i + 1) + " is: " + quizzes[i].getAssessment().getTitle());//Print out the title of the Quiz
        }
        quizReader.closeStreams();//Make sure to close the streams
    }
}
