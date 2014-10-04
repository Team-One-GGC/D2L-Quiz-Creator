@XmlSchema(elementFormDefault = XmlNsForm.QUALIFIED,
           namespace = "http://www.imsglobal.org/xsd/imscp_v1p1",
           xmlns = {
                        @XmlNs(prefix = "d2l_2p0", namespaceURI = "http://desire2learn.com/xsd/d2lcp_v2p0"),
                        @XmlNs(prefix = "scorm_1p2", namespaceURI = "http://www.adlnet.org/xsd/adlcp_rootv1p2"),
                        @XmlNs(prefix = "", namespaceURI = "http://www.imsglobal.org/xsd/imscp_v1p1")
                   }
          )
package t1.dqc.xml.manifest;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
