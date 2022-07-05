package serveur;

import java.sql.SQLException;

import javax.xml.ws.Endpoint;


import service.EtudiantService;

public class ServeurJWS {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="http://localhost:8585/" ;
		Endpoint.publish(url,new EtudiantService());
		System.out.println(url);
	}

}
