package t1.dqc.zip;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import t1.dqc.xml.D2LXmlFile;

/**
 * Utility class to help in reading files from a zip.
 * This class takes a generic parameter of a class that extend {@link D2LXmlFile}. For each file within a zip a new ZipReader should be created.
 * EXAMPLE: ZipReader<Manifest> reader;
 * @author Derek
 *
 */
public class ZipReader<T extends D2LXmlFile>
{
    private Class<T> clazz;
    private JAXBContext context;
    private ZipFile zip;
    
    /**
     * Constructor that takes the path to the zip file as a String
     * @param zipFilePath
     */
    public ZipReader(String zipFilePath, Class<T> clazz)
    {
        this.clazz = clazz;
        
        try {
            zip = new ZipFile(zipFilePath);
            context = JAXBContext.newInstance(clazz);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Constructor that takes the File object of the zip file
     * @param zipFile
     */
    public ZipReader(File zipFile, Class<T> clazz)
    {
        this.clazz = clazz;
        try {
            context = JAXBContext.newInstance(clazz);
            zip = new ZipFile(zipFile);
        } catch(JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Unmarhalls a file specified by fileName from a zip and returns an instance of T by casting the Object returned by unmarshal().
     * @param fileName the name of the file within the zip
     * @return T the generic reference to the class (will be either Manifest or Quiz)
     */
    public T getObjectFromXML(String fileName)
    {
        Unmarshaller unmarsh;
        T result = null;
        InputStream in = null;
        try {
            in = readFromZip(fileName);
            unmarsh = context.createUnmarshaller();
            result = clazz.cast(unmarsh.unmarshal(in));
            result.setFileName(fileName);
        } catch(JAXBException | IOException e) {
            e.printStackTrace();
        } finally {
            closeStreams();
        }
        return result;
    }
    
    /**
     * Loops through each of the entries within a zip until it finds the name of the file passed.
     * Will return null if it doesn't find the the file passed.
     * @param fileName The name of the file to find within a zip
     * @return An InputStream to zipped file specified by fileName, if the file is not found will return null
     * @throws IOException
     */
    private InputStream readFromZip(String fileName) throws IOException
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
    private void closeStreams()
    {
        try {
            zip.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
