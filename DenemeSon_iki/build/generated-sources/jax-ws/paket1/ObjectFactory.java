
package paket1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the paket1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CarpimResponse_QNAME = new QName("http://paket1/", "carpimResponse");
    private final static QName _IkinciMatrisAlResponse_QNAME = new QName("http://paket1/", "ikinci_matris_alResponse");
    private final static QName _MatrisBoyutAyarlaResponse_QNAME = new QName("http://paket1/", "matris_boyut_ayarlaResponse");
    private final static QName _IkinciMatrisAl_QNAME = new QName("http://paket1/", "ikinci_matris_al");
    private final static QName _MatrisBoyutAyarla_QNAME = new QName("http://paket1/", "matris_boyut_ayarla");
    private final static QName _Carpim_QNAME = new QName("http://paket1/", "carpim");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: paket1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarpimResponse }
     * 
     */
    public CarpimResponse createCarpimResponse() {
        return new CarpimResponse();
    }

    /**
     * Create an instance of {@link IkinciMatrisAlResponse }
     * 
     */
    public IkinciMatrisAlResponse createIkinciMatrisAlResponse() {
        return new IkinciMatrisAlResponse();
    }

    /**
     * Create an instance of {@link MatrisBoyutAyarlaResponse }
     * 
     */
    public MatrisBoyutAyarlaResponse createMatrisBoyutAyarlaResponse() {
        return new MatrisBoyutAyarlaResponse();
    }

    /**
     * Create an instance of {@link MatrisBoyutAyarla }
     * 
     */
    public MatrisBoyutAyarla createMatrisBoyutAyarla() {
        return new MatrisBoyutAyarla();
    }

    /**
     * Create an instance of {@link IkinciMatrisAl }
     * 
     */
    public IkinciMatrisAl createIkinciMatrisAl() {
        return new IkinciMatrisAl();
    }

    /**
     * Create an instance of {@link Carpim }
     * 
     */
    public Carpim createCarpim() {
        return new Carpim();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarpimResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paket1/", name = "carpimResponse")
    public JAXBElement<CarpimResponse> createCarpimResponse(CarpimResponse value) {
        return new JAXBElement<CarpimResponse>(_CarpimResponse_QNAME, CarpimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IkinciMatrisAlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paket1/", name = "ikinci_matris_alResponse")
    public JAXBElement<IkinciMatrisAlResponse> createIkinciMatrisAlResponse(IkinciMatrisAlResponse value) {
        return new JAXBElement<IkinciMatrisAlResponse>(_IkinciMatrisAlResponse_QNAME, IkinciMatrisAlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrisBoyutAyarlaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paket1/", name = "matris_boyut_ayarlaResponse")
    public JAXBElement<MatrisBoyutAyarlaResponse> createMatrisBoyutAyarlaResponse(MatrisBoyutAyarlaResponse value) {
        return new JAXBElement<MatrisBoyutAyarlaResponse>(_MatrisBoyutAyarlaResponse_QNAME, MatrisBoyutAyarlaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IkinciMatrisAl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paket1/", name = "ikinci_matris_al")
    public JAXBElement<IkinciMatrisAl> createIkinciMatrisAl(IkinciMatrisAl value) {
        return new JAXBElement<IkinciMatrisAl>(_IkinciMatrisAl_QNAME, IkinciMatrisAl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrisBoyutAyarla }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paket1/", name = "matris_boyut_ayarla")
    public JAXBElement<MatrisBoyutAyarla> createMatrisBoyutAyarla(MatrisBoyutAyarla value) {
        return new JAXBElement<MatrisBoyutAyarla>(_MatrisBoyutAyarla_QNAME, MatrisBoyutAyarla.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Carpim }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paket1/", name = "carpim")
    public JAXBElement<Carpim> createCarpim(Carpim value) {
        return new JAXBElement<Carpim>(_Carpim_QNAME, Carpim.class, null, value);
    }

}
