
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
    private final static QName _SQLException_QNAME = new QName("http://service/", "SQLException");
    private final static QName _GetEtudiantByIdResponse_QNAME = new QName("http://service/", "getEtudiantByIdResponse");
    private final static QName _DeleteEtudiant_QNAME = new QName("http://service/", "deleteEtudiant");
    private final static QName _GetAllEtudiant_QNAME = new QName("http://service/", "getAllEtudiant");
    private final static QName _GetEtudiantById_QNAME = new QName("http://service/", "getEtudiantById");
    private final static QName _AddEtudiant_QNAME = new QName("http://service/", "addEtudiant");
    private final static QName _AddEtudiantResponse_QNAME = new QName("http://service/", "addEtudiantResponse");
    private final static QName _DeleteEtudiantResponse_QNAME = new QName("http://service/", "deleteEtudiantResponse");
    private final static QName _GetAllEtudiantResponse_QNAME = new QName("http://service/", "getAllEtudiantResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEtudiantById }
     * 
     */
    public GetEtudiantById createGetEtudiantById() {
        return new GetEtudiantById();
    }

    /**
     * Create an instance of {@link DeleteEtudiant }
     * 
     */
    public DeleteEtudiant createDeleteEtudiant() {
        return new DeleteEtudiant();
    }

    /**
     * Create an instance of {@link GetAllEtudiant }
     * 
     */
    public GetAllEtudiant createGetAllEtudiant() {
        return new GetAllEtudiant();
    }

    /**
     * Create an instance of {@link GetEtudiantByIdResponse }
     * 
     */
    public GetEtudiantByIdResponse createGetEtudiantByIdResponse() {
        return new GetEtudiantByIdResponse();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link AddEtudiantResponse }
     * 
     */
    public AddEtudiantResponse createAddEtudiantResponse() {
        return new AddEtudiantResponse();
    }

    /**
     * Create an instance of {@link DeleteEtudiantResponse }
     * 
     */
    public DeleteEtudiantResponse createDeleteEtudiantResponse() {
        return new DeleteEtudiantResponse();
    }

    /**
     * Create an instance of {@link GetAllEtudiantResponse }
     * 
     */
    public GetAllEtudiantResponse createGetAllEtudiantResponse() {
        return new GetAllEtudiantResponse();
    }

    /**
     * Create an instance of {@link AddEtudiant }
     * 
     */
    public AddEtudiant createAddEtudiant() {
        return new AddEtudiant();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link SqlException }
     * 
     */
    public SqlException createSqlException() {
        return new SqlException();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiantByIdResponse")
    public JAXBElement<GetEtudiantByIdResponse> createGetEtudiantByIdResponse(GetEtudiantByIdResponse value) {
        return new JAXBElement<GetEtudiantByIdResponse>(_GetEtudiantByIdResponse_QNAME, GetEtudiantByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllEtudiant")
    public JAXBElement<GetAllEtudiant> createGetAllEtudiant(GetAllEtudiant value) {
        return new JAXBElement<GetAllEtudiant>(_GetAllEtudiant_QNAME, GetAllEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiantById")
    public JAXBElement<GetEtudiantById> createGetEtudiantById(GetEtudiantById value) {
        return new JAXBElement<GetEtudiantById>(_GetEtudiantById_QNAME, GetEtudiantById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addEtudiant")
    public JAXBElement<AddEtudiant> createAddEtudiant(AddEtudiant value) {
        return new JAXBElement<AddEtudiant>(_AddEtudiant_QNAME, AddEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addEtudiantResponse")
    public JAXBElement<AddEtudiantResponse> createAddEtudiantResponse(AddEtudiantResponse value) {
        return new JAXBElement<AddEtudiantResponse>(_AddEtudiantResponse_QNAME, AddEtudiantResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllEtudiantResponse")
    public JAXBElement<GetAllEtudiantResponse> createGetAllEtudiantResponse(GetAllEtudiantResponse value) {
        return new JAXBElement<GetAllEtudiantResponse>(_GetAllEtudiantResponse_QNAME, GetAllEtudiantResponse.class, null, value);
    }

}
