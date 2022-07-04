package domaine;

import java.io.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "root")
public class Etudiant implements Serializable {

    private int ID;
    private String nom;
    private String prenom;

    public Etudiant() {
        super();
    }
    public Etudiant(String nom, String prenom){
        super();
        this.nom=nom;
        this.prenom=prenom;
    }
    public Etudiant(int ID, String nom, String prenom) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}