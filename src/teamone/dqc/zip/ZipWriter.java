package teamone.dqc.zip;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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
    
    private void openStreams()
    {
        try {
            fileOut = new FileOutputStream(zipName);
            zipOut = new ZipOutputStream(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public ZipOutputStream createZipEntry(String entryName) throws IOException
    {
        zipOut.putNextEntry(new ZipEntry(entryName));
        return zipOut;
    }
    
    public void closeEntry()
    {
        try {
            zipOut.closeEntry();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
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
