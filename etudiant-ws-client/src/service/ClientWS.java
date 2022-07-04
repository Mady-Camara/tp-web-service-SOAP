package service;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueServiceService().getBanqueServicePort();
        double res=stub.conversionEURXOF(100);
        System.out.println("100 EUR = " + res+ "XOF");
        Compte compte = stub.getCompte(1L);
        System.out.println(compte.getSolde());
        System.out.println("---------------------");
        List<Compte> listeComptes= stub.listeComptes();
        for(Compte c:listeComptes){
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println("---------");
        }
    }
}
