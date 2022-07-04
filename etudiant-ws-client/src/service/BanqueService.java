
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Conversion_EUR_XOF")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Conversion_EUR_XOF", targetNamespace = "http://service/", className = "service.ConversionEURXOF")
    @ResponseWrapper(localName = "Conversion_EUR_XOFResponse", targetNamespace = "http://service/", className = "service.ConversionEURXOFResponse")
    @Action(input = "http://service/BanqueService/Conversion_EUR_XOFRequest", output = "http://service/BanqueService/Conversion_EUR_XOFResponse")
    public double conversionEURXOF(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns service.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://service/", className = "service.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://service/", className = "service.GetCompteResponse")
    @Action(input = "http://service/BanqueService/getCompteRequest", output = "http://service/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        Long code);

    /**
     * 
     * @return
     *     returns java.util.List<service.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listeComptes", targetNamespace = "http://service/", className = "service.listeComptes")
    @ResponseWrapper(localName = "listeComptesResponse", targetNamespace = "http://service/", className = "service.listeComptesResponse")
    @Action(input = "http://service/BanqueService/listeComptesRequest", output = "http://service/BanqueService/listeComptesResponse")
    public List<Compte> listeComptes();

}