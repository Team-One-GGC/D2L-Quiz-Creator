package t1.dqc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * This class provides an interface for writing Xml files to a zip.
 * See {@link ZipWriter}
 * @author derek
 *
 */
@XmlAccessorType(XmlAccessType.NONE)
public abstract class D2LXmlFile
{
    public abstract void setFileName(String fileName);
    public abstract String getFileName();
}
