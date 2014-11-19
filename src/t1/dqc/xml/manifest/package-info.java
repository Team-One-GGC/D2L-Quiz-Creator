/**
 * This class defines the namespaces under the
 * t1.dqc.xml.manifest package.
 */

@XmlSchema(elementFormDefault = XmlNsForm.QUALIFIED,
		   namespace = t1.dqc.xml.XmlNS.DEFAULT_NS,
		   xmlns = {
						@XmlNs(prefix = t1.dqc.xml.XmlNS.D2L_PREFIX, namespaceURI = t1.dqc.xml.XmlNS.D2L_NS),
						@XmlNs(prefix = t1.dqc.xml.XmlNS.SCORM_PREFIX, namespaceURI = t1.dqc.xml.XmlNS.SCORM_NS),
						@XmlNs(prefix = "", namespaceURI = t1.dqc.xml.XmlNS.DEFAULT_NS)
				   }
		  )
package t1.dqc.xml.manifest;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlNsForm;
