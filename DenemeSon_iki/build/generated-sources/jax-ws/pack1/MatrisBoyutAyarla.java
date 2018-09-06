
package pack1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matris_boyut_ayarla complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matris_boyut_ayarla">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matris_boyut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matris_boyut_ayarla", propOrder = {
    "matrisBoyut"
})
public class MatrisBoyutAyarla {

    @XmlElement(name = "matris_boyut")
    protected int matrisBoyut;

    /**
     * Gets the value of the matrisBoyut property.
     * 
     */
    public int getMatrisBoyut() {
        return matrisBoyut;
    }

    /**
     * Sets the value of the matrisBoyut property.
     * 
     */
    public void setMatrisBoyut(int value) {
        this.matrisBoyut = value;
    }

}
