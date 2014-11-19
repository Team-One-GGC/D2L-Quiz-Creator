/**
 * This class defines the namespaces under the
 * t1.dqc.xml.quiz package.
 */

@XmlSchema(elementFormDefault = XmlNsForm.QUALIFIED,
           xmlns = {
                        @XmlNs(prefix = t1.dqc.xml.XmlNS.D2L_PREFIX, namespaceURI = t1.dqc.xml.XmlNS.D2L_NS)
                   }
          )
package t1.dqc.xml.quiz;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
