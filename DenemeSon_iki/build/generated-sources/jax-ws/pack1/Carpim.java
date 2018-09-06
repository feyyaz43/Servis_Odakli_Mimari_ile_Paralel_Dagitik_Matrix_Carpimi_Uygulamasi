
package pack1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carpim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carpim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="satir_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="satir" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carpim", propOrder = {
    "satirNo",
    "satir"
})
public class Carpim {

    @XmlElement(name = "satir_no")
    protected int satirNo;
    @XmlElement(nillable = true)
    protected List<Integer> satir;

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
     * Gets the value of the satir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the satir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSatir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSatir() {
        if (satir == null) {
            satir = new ArrayList<Integer>();
        }
        return this.satir;
    }

}
