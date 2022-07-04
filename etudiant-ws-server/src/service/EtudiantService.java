package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import domaine.Etudiant;

@WebService(name = "BanqueService")
// UPDATE DELETE
public class EtudiantService {
    List<Etudiant> listeEtudiants = new ArrayList<>();

    // read one
    @WebMethod
    public Optional<Etudiant> getEtudiant(@WebParam(name = "ID") Long ID) {
        Etudiant tempEtudiant = null;
        for (Etudiant e : listeEtudiants) {
            if (ID == e.getID()) {
                tempEtudiant = e;
            }
        }
        Optional<Etudiant> opt = Optional.ofNullable(tempEtudiant);
        return opt;
    }

    // read multiple
    @WebMethod
    public List<Etudiant> getEtudiants() {
        return listeEtudiants;
    }

    // create
    @WebMethod
    public boolean createEtudiant(String nom, String prenom) {
        Etudiant etudiant = new Etudiant(nom, prenom);
        listeEtudiants.add(etudiant);
        return true;
    }

    // update
    @WebMethod
    public boolean updateEtudiant(@WebParam(name = "ID") Long ID, String nom, String prenom) {
        for (Etudiant e : listeEtudiants) {
            if (ID == e.getID()) {
                e.setNom(nom);
                e.setPrenom(prenom);
            }
        }
        return true;
    }

    // delete
    @WebMethod
    public boolean deleteEtudiant(@WebParam(name = "ID") Long ID) {
        for (Etudiant e : listeEtudiants) {
            if (ID == e.getID()) {
                listeEtudiants.remove(e);
            }
        }
        return true;
    }

}
