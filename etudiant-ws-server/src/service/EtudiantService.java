package service;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Etudiant;
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
	
	@WebMethod(operationName="addEtudiant")
	public boolean addEtudiant(@WebParam(name="prenom") String prenom ,@WebParam(name="nom") String nom) throws SQLException{
		return this.requete.addEtudiant(prenom ,nom);
	}
	
	@WebMethod(operationName="deleteEtudiant")
	public boolean delEtudiant(@WebParam(name="id") int id) throws SQLException{
		return this.requete.deletetById(id);
	}
	@WebMethod(operationName="updateEtudiant")
	public boolean updateEtudiant(@WebParam(name="id") int id,@WebParam(name="prenom") String prenom ,@WebParam(name="nom") String nom) throws SQLException{
		return this.requete.updateEtudiant(id,prenom,nom);
	}
}
	
	
	