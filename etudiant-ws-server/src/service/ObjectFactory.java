
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

    private final static QName _Root_QNAME = new QName("http://service/", "root");
    private final static QName _GetEtudiantsResponse_QNAME = new QName("http://service/", "getEtudiantsResponse");
    private final static QName _UpdateEtudiant_QNAME = new QName("http://service/", "updateEtudiant");
    private final static QName _CreateEtudiantResponse_QNAME = new QName("http://service/", "createEtudiantResponse");
    private final static QName _DeleteEtudiant_QNAME = new QName("http://service/", "deleteEtudiant");
    private final static QName _GetEtudiantResponse_QNAME = new QName("http://service/", "getEtudiantResponse");
    private final static QName _GetEtudiant_QNAME = new QName("http://service/", "getEtudiant");
    private final static QName _DeleteEtudiantResponse_QNAME = new QName("http://service/", "deleteEtudiantResponse");
    private final static QName _GetEtudiants_QNAME = new QName("http://service/", "getEtudiants");
    private final static QName _UpdateEtudiantResponse_QNAME = new QName("http://service/", "updateEtudiantResponse");
    private final static QName _CreateEtudiant_QNAME = new QName("http://service/", "createEtudiant");

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
     * Create an instance of {@link CreateEtudiantResponse }
     * 
     */
    public CreateEtudiantResponse createCreateEtudiantResponse() {
        return new CreateEtudiantResponse();
    }

    /**
     * Create an instance of {@link DeleteEtudiant }
     * 
     */
    public DeleteEtudiant createDeleteEtudiant() {
        return new DeleteEtudiant();
    }

    /**
     * Create an instance of {@link UpdateEtudiant }
     * 
     */
    public UpdateEtudiant createUpdateEtudiant() {
        return new UpdateEtudiant();
    }

    /**
     * Create an instance of {@link GetEtudiantsResponse }
     * 
     */
    public GetEtudiantsResponse createGetEtudiantsResponse() {
        return new GetEtudiantsResponse();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link CreateEtudiant }
     * 
     */
    public CreateEtudiant createCreateEtudiant() {
        return new CreateEtudiant();
    }

    /**
     * Create an instance of {@link GetEtudiants }
     * 
     */
    public GetEtudiants createGetEtudiants() {
        return new GetEtudiants();
    }

    /**
     * Create an instance of {@link UpdateEtudiantResponse }
     * 
     */
    public UpdateEtudiantResponse createUpdateEtudiantResponse() {
        return new UpdateEtudiantResponse();
    }

    /**
     * Create an instance of {@link DeleteEtudiantResponse }
     * 
     */
    public DeleteEtudiantResponse createDeleteEtudiantResponse() {
        return new DeleteEtudiantResponse();
    }

    /**
     * Create an instance of {@link GetEtudiant }
     * 
     */
    public GetEtudiant createGetEtudiant() {
        return new GetEtudiant();
    }

    /**
     * Create an instance of {@link Optional }
     * 
     */
    public Optional createOptional() {
        return new Optional();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateEtudiant")
    public JAXBElement<UpdateEtudiant> createUpdateEtudiant(UpdateEtudiant value) {
        return new JAXBElement<UpdateEtudiant>(_UpdateEtudiant_QNAME, UpdateEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "createEtudiantResponse")
    public JAXBElement<CreateEtudiantResponse> createCreateEtudiantResponse(CreateEtudiantResponse value) {
        return new JAXBElement<CreateEtudiantResponse>(_CreateEtudiantResponse_QNAME, CreateEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteEtudiant")
    public JAXBElement<DeleteEtudiant> createDeleteEtudiant(DeleteEtudiant value) {
        return new JAXBElement<DeleteEtudiant>(_DeleteEtudiant_QNAME, DeleteEtudiant.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteEtudiantResponse")
    public JAXBElement<DeleteEtudiantResponse> createDeleteEtudiantResponse(DeleteEtudiantResponse value) {
        return new JAXBElement<DeleteEtudiantResponse>(_DeleteEtudiantResponse_QNAME, DeleteEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiants")
    public JAXBElement<GetEtudiants> createGetEtudiants(GetEtudiants value) {
        return new JAXBElement<GetEtudiants>(_GetEtudiants_QNAME, GetEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "updateEtudiantResponse")
    public JAXBElement<UpdateEtudiantResponse> createUpdateEtudiantResponse(UpdateEtudiantResponse value) {
        return new JAXBElement<UpdateEtudiantResponse>(_UpdateEtudiantResponse_QNAME, UpdateEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "createEtudiant")
    public JAXBElement<CreateEtudiant> createCreateEtudiant(CreateEtudiant value) {
        return new JAXBElement<CreateEtudiant>(_CreateEtudiant_QNAME, CreateEtudiant.class, null, value);
    }

}
