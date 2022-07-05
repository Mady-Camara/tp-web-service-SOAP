
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

    private final static QName _ModifierEtudiant_QNAME = new QName("http://service/", "modifierEtudiant");
    private final static QName _Root_QNAME = new QName("http://service/", "root");
    private final static QName _GetEtudiantsResponse_QNAME = new QName("http://service/", "getEtudiantsResponse");
    private final static QName _AjouterEtudiantResponse_QNAME = new QName("http://service/", "ajouterEtudiantResponse");
    private final static QName _AjouterEtudiant_QNAME = new QName("http://service/", "ajouterEtudiant");
    private final static QName _SupprimerEtudiantResponse_QNAME = new QName("http://service/", "supprimerEtudiantResponse");
    private final static QName _ModifierEtudiantResponse_QNAME = new QName("http://service/", "modifierEtudiantResponse");
    private final static QName _GetEtudiantResponse_QNAME = new QName("http://service/", "getEtudiantResponse");
    private final static QName _GetEtudiant_QNAME = new QName("http://service/", "getEtudiant");
    private final static QName _SupprimerEtudiant_QNAME = new QName("http://service/", "supprimerEtudiant");
    private final static QName _GetEtudiants_QNAME = new QName("http://service/", "getEtudiants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEtudiantResponse }
     * 
     */
    public GetEtudiantResponse createGetEtudiantResponse() {
        return new GetEtudiantResponse();
    }

    /**
     * Create an instance of {@link ModifierEtudiantResponse }
     * 
     */
    public ModifierEtudiantResponse createModifierEtudiantResponse() {
        return new ModifierEtudiantResponse();
    }

    /**
     * Create an instance of {@link AjouterEtudiant }
     * 
     */
    public AjouterEtudiant createAjouterEtudiant() {
        return new AjouterEtudiant();
    }

    /**
     * Create an instance of {@link SupprimerEtudiantResponse }
     * 
     */
    public SupprimerEtudiantResponse createSupprimerEtudiantResponse() {
        return new SupprimerEtudiantResponse();
    }

    /**
     * Create an instance of {@link AjouterEtudiantResponse }
     * 
     */
    public AjouterEtudiantResponse createAjouterEtudiantResponse() {
        return new AjouterEtudiantResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantsResponse }
     * 
     */
    public GetEtudiantsResponse createGetEtudiantsResponse() {
        return new GetEtudiantsResponse();
    }

    /**
     * Create an instance of {@link ModifierEtudiant }
     * 
     */
    public ModifierEtudiant createModifierEtudiant() {
        return new ModifierEtudiant();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link GetEtudiants }
     * 
     */
    public GetEtudiants createGetEtudiants() {
        return new GetEtudiants();
    }

    /**
     * Create an instance of {@link SupprimerEtudiant }
     * 
     */
    public SupprimerEtudiant createSupprimerEtudiant() {
        return new SupprimerEtudiant();
    }

    /**
     * Create an instance of {@link GetEtudiant }
     * 
     */
    public GetEtudiant createGetEtudiant() {
        return new GetEtudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "modifierEtudiant")
    public JAXBElement<ModifierEtudiant> createModifierEtudiant(ModifierEtudiant value) {
        return new JAXBElement<ModifierEtudiant>(_ModifierEtudiant_QNAME, ModifierEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "root")
    public JAXBElement<Etudiant> createRoot(Etudiant value) {
        return new JAXBElement<Etudiant>(_Root_QNAME, Etudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiantsResponse")
    public JAXBElement<GetEtudiantsResponse> createGetEtudiantsResponse(GetEtudiantsResponse value) {
        return new JAXBElement<GetEtudiantsResponse>(_GetEtudiantsResponse_QNAME, GetEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ajouterEtudiantResponse")
    public JAXBElement<AjouterEtudiantResponse> createAjouterEtudiantResponse(AjouterEtudiantResponse value) {
        return new JAXBElement<AjouterEtudiantResponse>(_AjouterEtudiantResponse_QNAME, AjouterEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ajouterEtudiant")
    public JAXBElement<AjouterEtudiant> createAjouterEtudiant(AjouterEtudiant value) {
        return new JAXBElement<AjouterEtudiant>(_AjouterEtudiant_QNAME, AjouterEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "supprimerEtudiantResponse")
    public JAXBElement<SupprimerEtudiantResponse> createSupprimerEtudiantResponse(SupprimerEtudiantResponse value) {
        return new JAXBElement<SupprimerEtudiantResponse>(_SupprimerEtudiantResponse_QNAME, SupprimerEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "modifierEtudiantResponse")
    public JAXBElement<ModifierEtudiantResponse> createModifierEtudiantResponse(ModifierEtudiantResponse value) {
        return new JAXBElement<ModifierEtudiantResponse>(_ModifierEtudiantResponse_QNAME, ModifierEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiantResponse")
    public JAXBElement<GetEtudiantResponse> createGetEtudiantResponse(GetEtudiantResponse value) {
        return new JAXBElement<GetEtudiantResponse>(_GetEtudiantResponse_QNAME, GetEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiant")
    public JAXBElement<GetEtudiant> createGetEtudiant(GetEtudiant value) {
        return new JAXBElement<GetEtudiant>(_GetEtudiant_QNAME, GetEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "supprimerEtudiant")
    public JAXBElement<SupprimerEtudiant> createSupprimerEtudiant(SupprimerEtudiant value) {
        return new JAXBElement<SupprimerEtudiant>(_SupprimerEtudiant_QNAME, SupprimerEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiants")
    public JAXBElement<GetEtudiants> createGetEtudiants(GetEtudiants value) {
        return new JAXBElement<GetEtudiants>(_GetEtudiants_QNAME, GetEtudiants.class, null, value);
    }

}
