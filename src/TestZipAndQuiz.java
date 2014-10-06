import java.util.List;

import t1.dqc.xml.manifest.Manifest;
import t1.dqc.xml.manifest.ManifestResource;
import t1.dqc.xml.quiz.Quiz;
import t1.dqc.zip.ZipReader;


public class TestZipAndQuiz
{
    public static final String EXAMPLE_READ_ZIP = "C:/Users/Derek/Desktop/SoftDev/examples.zip";
    
    public static void main(String[] args)
    {
        ZipReader<Manifest> manReader = new ZipReader<>(EXAMPLE_READ_ZIP, Manifest.class);
        ZipReader<Quiz> quizReader = new ZipReader<>(EXAMPLE_READ_ZIP, Quiz.class);
        
        Manifest man = manReader.getObjectFromXML(Manifest.FILE_NAME);
        manReader.closeStreams();
        
        List<ManifestResource> manRes = man.getResources();
        String quizFiles[] = new String[manRes.size()];
        Quiz quizzes[] = new Quiz[manRes.size()];
        for(int i = 0; i < quizFiles.length; i++)
        {
            quizFiles[i] = manRes.get(i).getHref();
            quizzes[i] = quizReader.getObjectFromXML(quizFiles[i]);
            System.out.println("The title of Quiz " + (i + 1) + " is: " + quizzes[i].getAssessment().getTitle());
        }
        quizReader.closeStreams();
    }
}
