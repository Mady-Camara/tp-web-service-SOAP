package service;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import domaine.Etudiant;
import persistence.Requete;

@WebService (name="EtudiantWs")
public class EtudiantService {
	Requete requete;
	
	public EtudiantService() throws SQLException {
		this.requete = new Requete();
	}

	@WebMethod(operationName="getAllEtudiant")
	public List<Etudiant> get() throws SQLException {
		return this.requete.getAllEtudiant();
	}
	
	@WebMethod(operationName="getEtudiantById")
	public Etudiant getEtudaint(@WebParam(name="id")int id) throws SQLException {
		return this.requete.getById(id);
	}
	
	@WebMethod(operationName="addEtudiant")
	public boolean addEtudiant(@WebParam(name="etudiant") Etudiant etudiant) throws SQLException{
		return this.requete.addEtudiant(etudiant);
	}
	
	@WebMethod(operationName="deleteEtudiant")
	public boolean delEtudiant(@WebParam(name="id") int id) throws SQLException{
		return this.requete.deletetById(id);
	}
}
