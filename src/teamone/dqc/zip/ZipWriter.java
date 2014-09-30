package teamone.dqc.zip;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Utility class to help in writing files to a zip.
 * @author Derek
 *
 */
public class ZipWriter
{
    private String zipName;
    private FileOutputStream fileOut;
    private ZipOutputStream zipOut;
    
    public ZipWriter(String zipName)
    {
        this.zipName = zipName;
        openStreams();
    }
    
    /**
     * Initializes OutputStreams
     */
    private void openStreams()
    {
        try {
            fileOut = new FileOutputStream(zipName);
            zipOut = new ZipOutputStream(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Creates a new ZipEntry with the given name.
     * Calls to this method should have a call to closeEntry() following it.
     * @param entryName The name of the ZipEntry to be put with the outputted zip.
     * @return The ZipOutputStream to be used for marshalling an object to an XML file
     * @throws IOException
     */
    public ZipOutputStream createZipEntry(String entryName) throws IOException
    {
        zipOut.putNextEntry(new ZipEntry(entryName));
        return zipOut;
    }
    
    /**
     * Closes the entry created by the method createZipEntry().
     * Should be called after createZipEntry().
     */
    public void closeEntry()
    {
        try {
            zipOut.closeEntry();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Closes all OutputStreams.
     * The ZipOutputStream needs to be closed first otherwise an exception is thrown.
     */
    public void closeStreams()
    {
        try {//ZipOutputStream must be closed first
            zipOut.close();
            fileOut.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
