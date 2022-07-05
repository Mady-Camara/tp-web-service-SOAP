package service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import domaine.Etudiant;

import java.sql.*;

@WebService(name = "EtudiantWS")
public class EtudiantService {
    @WebMethod(operationName = "getEtudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> liste = new ArrayList<>();
        String query = "select id,prenom,nom from Etudiants;";
        try {
            Etudiant e = new Etudiant();
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mglsi_news", "etudiant", "etudiant");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                System.out.println("id : " + rs.getInt("id"));
                System.out.println("Prenom : " + rs.getString("prenom"));
                System.out.println("Nom : " + rs.getString("nom"));
                e.setID(rs.getInt("id"));
                e.setPrenom(rs.getString("prenom"));
                e.setNom(rs.getString("nom"));
                liste.add(e);
            }
            connect.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return liste;
    }

    @WebMethod(operationName = "getEtudiant")
    public Etudiant getEtudiant(@WebParam(name = "id") int id) {

        String query = "select id,prenom,nom from Etudiants where id =?";
        Etudiant temp = new Etudiant();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mglsi_news", "etudiant", "etudiant");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setInt(1, id);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                System.out.println("id : " + rs.getInt(id));
                System.out.println("Prenom : " + rs.getString("prenom"));
                System.out.println("Nom : " + rs.getString("nom"));
                temp.setID(rs.getInt("id"));
                temp.setPrenom(rs.getString("prenom"));
                temp.setNom(rs.getString("nom"));

            }
            // System.out.println(preparedStmt.executeQuery());
            connect.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return temp;

    }

    @WebMethod(operationName = "ajouterEtudiant")
    public Boolean ajouterEtudiant(@WebParam(name = "prenom") String prenom, @WebParam(name = "nom") String nom) {
        String query = "Insert into Etudiants (prenom, nom) values (?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mglsi_news", "etudiant", "etudiant");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, prenom);
            preparedStmt.setString(2, nom);
            preparedStmt.executeUpdate();
            System.out.println("Votre compte a bien été créé !");
            connect.close();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @WebMethod(operationName = "modifierEtudiant")
    public Boolean modifierEtudiant(@WebParam(name = "id") int id, @WebParam(name = "prenom") String prenom,
            @WebParam(name = "nom") String nom) {
        String query = "update Etudiants set prenom = ?, nom = ? where id =?;";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mglsi_news", "etudiant", "etudiant");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, prenom);
            preparedStmt.setString(2, nom);
            preparedStmt.setInt(3, id);
            preparedStmt.executeUpdate();
            System.out.println("Modification effectuée !");
            connect.close();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @WebMethod(operationName = "supprimerEtudiant")
    public Boolean supprimerEtudiant(@WebParam(name = "id") int id) {
        String query = "delete from Etudiants where id =?;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mglsi_news", "etudiant", "etudiant");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.executeUpdate();
            System.out.println("Suppression effectuée !");
            connect.close();
            return true;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}