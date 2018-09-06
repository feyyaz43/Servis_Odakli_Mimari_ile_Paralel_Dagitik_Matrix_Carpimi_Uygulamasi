
package paket1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ikinci_matris_al complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ikinci_matris_al">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="satir_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matris_2_satir" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ikinci_matris_al", propOrder = {
    "satirNo",
    "matris2Satir"
})
public class IkinciMatrisAl {

    @XmlElement(name = "satir_no")
    protected int satirNo;
    @XmlElement(name = "matris_2_satir", nillable = true)
    protected List<Integer> matris2Satir;

    /**
     * Gets the value of the satirNo property.
     * 
     */
    public int getSatirNo() {
        return satirNo;
    }

    /**
     * Sets the value of the satirNo property.
     * 
     */
    public void setSatirNo(int value) {
        this.satirNo = value;
    }

    /**
     * Gets the value of the matris2Satir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matris2Satir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatris2Satir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getMatris2Satir() {
        if (matris2Satir == null) {
            matris2Satir = new ArrayList<Integer>();
        }
        return this.matris2Satir;
    }

}
