package teamone.dqc.zip;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Utility class to help in reading files from a zip.
 * @author Derek
 *
 */
public class ZipReader
{    
    private ZipFile zip;
    private String zipFilePath;
    
    public ZipReader(String zipFilePath)
    {
        this.zipFilePath = zipFilePath;
        createZip();
    }
    
    /**
     * Initializes the ZipFile
     */
    private void createZip()
    {
        try {
            zip = new ZipFile(zipFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Loops through each of the entries within a zip until it finds the name of the file passed.
     * Will return null if it doesn't find the the file passed.
     * @param fileName The name of the file to find within a zip
     * @return An InputStream to zipped file specified by fileName, if the file is not found will return null
     * @throws IOException
     */
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
    
    /**
     * Closes the ZipFile
     */
    public void closeStreams()
    {
        try {
            zip.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
