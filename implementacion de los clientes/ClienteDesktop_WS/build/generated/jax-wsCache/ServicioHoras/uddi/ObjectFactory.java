
package uddi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uddi package. 
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

    private final static QName _HorasResponse_QNAME = new QName("http://UDDI/", "horasResponse");
    private final static QName _Horas_QNAME = new QName("http://UDDI/", "horas");
    private final static QName _PagoResponse_QNAME = new QName("http://UDDI/", "pagoResponse");
    private final static QName _Pago_QNAME = new QName("http://UDDI/", "pago");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Horas }
     * 
     */
    public Horas createHoras() {
        return new Horas();
    }

    /**
     * Create an instance of {@link PagoResponse }
     * 
     */
    public PagoResponse createPagoResponse() {
        return new PagoResponse();
    }

    /**
     * Create an instance of {@link HorasResponse }
     * 
     */
    public HorasResponse createHorasResponse() {
        return new HorasResponse();
    }

    /**
     * Create an instance of {@link Pago }
     * 
     */
    public Pago createPago() {
        return new Pago();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HorasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "horasResponse")
    public JAXBElement<HorasResponse> createHorasResponse(HorasResponse value) {
        return new JAXBElement<HorasResponse>(_HorasResponse_QNAME, HorasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Horas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "horas")
    public JAXBElement<Horas> createHoras(Horas value) {
        return new JAXBElement<Horas>(_Horas_QNAME, Horas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "pagoResponse")
    public JAXBElement<PagoResponse> createPagoResponse(PagoResponse value) {
        return new JAXBElement<PagoResponse>(_PagoResponse_QNAME, PagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "pago")
    public JAXBElement<Pago> createPago(Pago value) {
        return new JAXBElement<Pago>(_Pago_QNAME, Pago.class, null, value);
    }

}
