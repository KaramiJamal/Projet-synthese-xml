
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _Releve_QNAME = new QName("http://controllers/", "releve");
    private final static QName _Releves_QNAME = new QName("http://controllers/", "releves");
    private final static QName _RelevesResponse_QNAME = new QName("http://controllers/", "relevesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Releve }
     * 
     * @return
     *     the new instance of {@link Releve }
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link Releves }
     * 
     * @return
     *     the new instance of {@link Releves }
     */
    public Releves createReleves() {
        return new Releves();
    }

    /**
     * Create an instance of {@link RelevesResponse }
     * 
     * @return
     *     the new instance of {@link RelevesResponse }
     */
    public RelevesResponse createRelevesResponse() {
        return new RelevesResponse();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     * @return
     *     the new instance of {@link Operations }
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     */
    @XmlElementDecl(namespace = "http://controllers/", name = "releve")
    public JAXBElement<Releve> createReleve(Releve value) {
        return new JAXBElement<>(_Releve_QNAME, Releve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releves }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Releves }{@code >}
     */
    @XmlElementDecl(namespace = "http://controllers/", name = "releves")
    public JAXBElement<Releves> createReleves(Releves value) {
        return new JAXBElement<>(_Releves_QNAME, Releves.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelevesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelevesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controllers/", name = "relevesResponse")
    public JAXBElement<RelevesResponse> createRelevesResponse(RelevesResponse value) {
        return new JAXBElement<>(_RelevesResponse_QNAME, RelevesResponse.class, null, value);
    }

}
