package persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import metier.Etudiant;


public class Requete {
	
	Connection con;
	Statement etat;
	PreparedStatement pre;
	
	public Requete() throws SQLException {
		this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mglsi_news", "root", "");
		this.etat = con.createStatement();
	}
	
	public boolean addEtudiant(String prenom ,String nom) throws SQLException {
		
		this.pre = this.con.prepareStatement("INSERT INTO Etudiants (prenom, nom) VALUES (?, ?)");
		this.pre.setString(1, prenom);
		this.pre.setString(2, nom);
		boolean ok = this.pre.executeUpdate() > 0 ? true : false;
		
		return ok;
	}
public boolean updateEtudiant(int id ,String prenom ,String nom) throws SQLException {
	
		this.pre = this.con.prepareStatement("UPDATE Etudiants SET prenom=?, nom=? WHERE id=?");
		this.pre.setString(1, prenom);
		this.pre.setString(2, nom);
		this.pre.setInt(3, id);
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
	public boolean deletetById(int id) throws SQLException {
		this.pre = this.con.prepareStatement("Delete FROM Etudiants WHERE id=?");
		this.pre.setInt(1, id);
		boolean ok = this.pre.executeUpdate() > 0 ? true : false;
		
		return ok;
	}
	

}