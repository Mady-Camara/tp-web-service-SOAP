package persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import domaine.Etudiant;

public class Requete {
	
	Connection con;
	Statement etat;
	PreparedStatement pre;
	
	public Requete() throws SQLException {
		this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mglsi_news", "etudiant", "etudiant");
		this.etat = con.createStatement();
	}
	
	public boolean addEtudiant(Etudiant etudiant) throws SQLException {
		this.pre = this.con.prepareStatement("INSERT INTO Etudiants (prenom, nom) VALUES (?, ?)");
		this.pre.setString(1, etudiant.getPrenom());
		this.pre.setString(2, etudiant.getNom());
		boolean ok = this.pre.executeUpdate() > 0 ? true : false;
		
		return ok;
	}
	
	public List<Etudiant> getAllEtudiant() throws SQLException {
		Etudiant etudiant;
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		ResultSet resultats = this.etat.executeQuery("SELECT * FROM Etudiants");
		while(resultats.next()) {
			etudiant = new Etudiant();
			if(resultats.getString("id") != null) {
				etudiant.setID(resultats.getInt("id"));
			}
			if(resultats.getString("prenom") != null) {
				etudiant.setPrenom(resultats.getString("prenom"));
			}
			if(resultats.getString("nom") != null) {
				etudiant.setNom(resultats.getString("nom"));
			}
			etudiants.add(etudiant);
		}
		return etudiants;
	}
	
	
	public Etudiant getById(int id) throws SQLException {
		ResultSet resultats = this.etat.executeQuery("SELECT * FROM Etudiants WHERE id"+id+"");
		Etudiant etudiant = new Etudiant();
		while(resultats.next()) {
			if(resultats.getString("id") != null) {
				etudiant.setID(resultats.getInt("id"));
			}
			if(resultats.getString("prenom") != null) {
				etudiant.setPrenom(resultats.getString("prenom"));
			}
			if(resultats.getString("nom") != null) {
				etudiant.setNom(resultats.getString("nom"));
			}
		}
		
		return etudiant;
	}
	
	public boolean deletetById(int id) throws SQLException {
		this.pre = this.con.prepareStatement("Delete FROM Etudiants WHERE id=?");
		this.pre.setInt(1, id);
		boolean ok = this.pre.executeUpdate() > 0 ? true : false;
		
		return ok;
	}
	

}
