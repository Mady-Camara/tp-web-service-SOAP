
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _listeComptesResponse_QNAME = new QName("http://service/", "listeComptesResponse");
    private final static QName _Root_QNAME = new QName("http://service/", "root");
    private final static QName _listeComptes_QNAME = new QName("http://service/", "listeComptes");
    private final static QName _GetCompteResponse_QNAME = new QName("http://service/", "getCompteResponse");
    private final static QName _ConversionEURXOFResponse_QNAME = new QName("http://service/", "Conversion_EUR_XOFResponse");
    private final static QName _GetCompte_QNAME = new QName("http://service/", "getCompte");
    private final static QName _ConversionEURXOF_QNAME = new QName("http://service/", "Conversion_EUR_XOF");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEURXOFResponse }
     * 
     */
    public ConversionEURXOFResponse createConversionEURXOFResponse() {
        return new ConversionEURXOFResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link listeComptes }
     * 
     */
    public listeComptes createlisteComptes() {
        return new listeComptes();
    }

    /**
     * Create an instance of {@link listeComptesResponse }
     * 
     */
    public listeComptesResponse createlisteComptesResponse() {
        return new listeComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link ConversionEURXOF }
     * 
     */
    public ConversionEURXOF createConversionEURXOF() {
        return new ConversionEURXOF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link listeComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listeComptesResponse")
    public JAXBElement<listeComptesResponse> createlisteComptesResponse(listeComptesResponse value) {
        return new JAXBElement<listeComptesResponse>(_listeComptesResponse_QNAME, listeComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "root")
    public JAXBElement<Compte> createRoot(Compte value) {
        return new JAXBElement<Compte>(_Root_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link listeComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listeComptes")
    public JAXBElement<listeComptes> createlisteComptes(listeComptes value) {
        return new JAXBElement<listeComptes>(_listeComptes_QNAME, listeComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEURXOFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Conversion_EUR_XOFResponse")
    public JAXBElement<ConversionEURXOFResponse> createConversionEURXOFResponse(ConversionEURXOFResponse value) {
        return new JAXBElement<ConversionEURXOFResponse>(_ConversionEURXOFResponse_QNAME, ConversionEURXOFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEURXOF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Conversion_EUR_XOF")
    public JAXBElement<ConversionEURXOF> createConversionEURXOF(ConversionEURXOF value) {
        return new JAXBElement<ConversionEURXOF>(_ConversionEURXOF_QNAME, ConversionEURXOF.class, null, value);
    }

}
