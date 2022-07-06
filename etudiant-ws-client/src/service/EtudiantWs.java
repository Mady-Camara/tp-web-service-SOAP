
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EtudiantWs", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EtudiantWs {


    /**
     * 
     * @param id
     * @return
     *     returns service.Etudiant
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEtudiantById", targetNamespace = "http://service/", className = "service.GetEtudiantById")
    @ResponseWrapper(localName = "getEtudiantByIdResponse", targetNamespace = "http://service/", className = "service.GetEtudiantByIdResponse")
    @Action(input = "http://service/EtudiantWs/getEtudiantByIdRequest", output = "http://service/EtudiantWs/getEtudiantByIdResponse", fault = {
        @FaultAction(className = SQLException_Exception.class, value = "http://service/EtudiantWs/getEtudiantById/Fault/SQLException")
    })
    public Etudiant getEtudiantById(
        @WebParam(name = "id", targetNamespace = "")
        int id)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param etudiant
     * @return
     *     returns boolean
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEtudiant", targetNamespace = "http://service/", className = "service.AddEtudiant")
    @ResponseWrapper(localName = "addEtudiantResponse", targetNamespace = "http://service/", className = "service.AddEtudiantResponse")
    @Action(input = "http://service/EtudiantWs/addEtudiantRequest", output = "http://service/EtudiantWs/addEtudiantResponse", fault = {
        @FaultAction(className = SQLException_Exception.class, value = "http://service/EtudiantWs/addEtudiant/Fault/SQLException")
    })
    public boolean addEtudiant(
        @WebParam(name = "etudiant", targetNamespace = "")
        Etudiant etudiant)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteEtudiant", targetNamespace = "http://service/", className = "service.DeleteEtudiant")
    @ResponseWrapper(localName = "deleteEtudiantResponse", targetNamespace = "http://service/", className = "service.DeleteEtudiantResponse")
    @Action(input = "http://service/EtudiantWs/deleteEtudiantRequest", output = "http://service/EtudiantWs/deleteEtudiantResponse", fault = {
        @FaultAction(className = SQLException_Exception.class, value = "http://service/EtudiantWs/deleteEtudiant/Fault/SQLException")
    })
    public boolean deleteEtudiant(
        @WebParam(name = "id", targetNamespace = "")
        int id)
        throws SQLException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<service.Etudiant>
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEtudiant", targetNamespace = "http://service/", className = "service.GetAllEtudiant")
    @ResponseWrapper(localName = "getAllEtudiantResponse", targetNamespace = "http://service/", className = "service.GetAllEtudiantResponse")
    @Action(input = "http://service/EtudiantWs/getAllEtudiantRequest", output = "http://service/EtudiantWs/getAllEtudiantResponse", fault = {
        @FaultAction(className = SQLException_Exception.class, value = "http://service/EtudiantWs/getAllEtudiant/Fault/SQLException")
    })
    public List<Etudiant> getAllEtudiant()
        throws SQLException_Exception
    ;

}