

import javax.xml.ws.Endpoint;

import service.EtudiantService;

public class Application {
    public static void main(String[] args) {
        String url="http://localhost:8585/";
        Endpoint.publish(url, new EtudiantService());
        System.out.println(url);
    }
}
