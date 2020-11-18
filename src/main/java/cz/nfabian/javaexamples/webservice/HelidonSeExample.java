//package cz.nfabian.javaexamples.webservice;
//
//import io.helidon.common.http.Http;
//import io.helidon.webserver.Routing;
//import io.helidon.webserver.ServerConfiguration;
//import io.helidon.webserver.WebServer;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//
//public class HelidonSeExample {
//
//    public static void main(String[] args) throws UnknownHostException {
//        Routing routing = Routing.builder()
//                .any("/", (request, response) -> response.status(200).send("Any handler"))
//                .get("/{id}", (request, response) -> {
//                    String result = "Get handler: " + request.path().param("id");
//                    response.headers().put("Content-Type", "text/plain; charset=UTF-8");
//                    response.status(Http.Status.OK_200);
//                    response.send(result);
//                })
//                .build();
//
//        ServerConfiguration config = ServerConfiguration.builder()
//                .bindAddress(InetAddress.getLocalHost())
//                .port(8888)
//                .build();
//
//        WebServer webServer = WebServer.create(config, routing);
//        webServer.start();
//    }
//}
