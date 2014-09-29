package teamone.dqc.zip;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipReader
{
    //TODO this is meant only for testing purposes and should be deleted later
    public static final String EXAMPLE_ZIP = "/home/derek/Downloads/examples.zip";
    
    private ZipFile zip;
    private String zipFilePath;
    
    public ZipReader(String zipFilePath)
    {
        this.zipFilePath = zipFilePath;
        createZip();
    }
    
    private void createZip()
    {
        try {
            zip = new ZipFile(zipFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public InputStream readFromZip(String fileName) throws IOException
    {
        Enumeration<? extends ZipEntry> zippedFiles = zip.entries();
        while(zippedFiles.hasMoreElements())
        {
            ZipEntry entry = zippedFiles.nextElement();
            
            if(entry.getName().equals(fileName))
            {
                return zip.getInputStream(entry);
            }
        }
        return null;
    }
    
    public void closeStreams()
    {
        try {
            zip.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
