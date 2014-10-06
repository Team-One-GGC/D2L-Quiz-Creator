package t1.dqc.zip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import t1.dqc.xml.D2LXmlFile;

/**
 * Utility class to help in writing files to a zip.
 * This class takes a generic parameter of a class that extends {@link D2LXmlFile}. For each file to be written to a zip a new ZipWriter should be created.
 * EXAMPLE: ZipWriter<Manifest> writer;
 * @author Derek
 *
 */
public class ZipWriter<T extends D2LXmlFile>
{
    private JAXBContext context;
    private FileOutputStream fileOut;
    private ZipOutputStream zipOut;
    
    /**
     * Constructor that takes the path of a zip file as a String
     * @param zipName
     */
    public ZipWriter(String zipFilePath, Class<T> clazz)
    {
        try {
            context = JAXBContext.newInstance(clazz);
            fileOut = new FileOutputStream(zipFilePath);
            zipOut = new ZipOutputStream(fileOut);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Constructor that the File object of a zip file
     * @param zipFile
     */
    public ZipWriter(File zipFile, Class<T> clazz)
    {
        try {
            context = JAXBContext.newInstance(clazz);
            fileOut = new FileOutputStream(zipFile);
            zipOut = new ZipOutputStream(fileOut);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Marshalls an object specified by T to an Xml file within a zip.
     * NOTE: JAXB creates a default head that is overridden by this method.
     * @param obj
     */
    public void writeObjectToXML(T obj)
    {
        Marshaller marsh;
        OutputStream out;
        String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        try {
            marsh = context.createMarshaller();
            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marsh.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);//This disables the default JAXB XML header information
            out = createZipEntry(obj.getFileName());
            out.write(xmlHeader.getBytes());//Write our custom XML header to the file.
            marsh.marshal(obj, out);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        } finally {
            closeEntry();
            closeStreams();
        }
    }
    
    /**
     * Creates a new ZipEntry with the given name.
     * Calls to this method should have a call to closeEntry() following it.
     * @param entryName The name of the ZipEntry to be put with the outputted zip.
     * @return The ZipOutputStream to be used for marshalling an object to an XML file
     * @throws IOException
     */
    private ZipOutputStream createZipEntry(String entryName) throws IOException
    {
        zipOut.putNextEntry(new ZipEntry(entryName));
        return zipOut;
    }
    
    /**
     * Closes the entry created by the method createZipEntry().
     * Should be called after createZipEntry().
     */
    private void closeEntry()
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
    private void closeStreams()
    {
        try {//ZipOutputStream must be closed first
            zipOut.close();
            fileOut.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
