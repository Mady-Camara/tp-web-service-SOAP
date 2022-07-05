package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement(name="Etudiant") 

public class Etudiant implements Serializable {
	@XmlTransient
	private String prenom ;
	private String nom ;
	private int ID ;
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		ID = ID;
	}
	public Etudiant( int ID, String prenom, String nom) {
		super();
		this.ID = ID;
		this.prenom = prenom;
		this.nom = nom;
		
	}
	public Etudiant() {
		
	}
	

}
