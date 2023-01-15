import controllers.ReleveController;
import jakarta.xml.ws.Endpoint;

public class SoapWebServiceApplication {
    public static void main(String[] args) {
        System.out.println(
        " ███████████            ████                               \n" +
        "░░███░░░░░███          ░░███                               \n" +
        " ░███    ░███   ██████  ░███   ██████  █████ █████  ██████ \n" +
        " ░██████████   ███░░███ ░███  ███░░███░░███ ░░███  ███░░███\n" +
        " ░███░░░░░███ ░███████  ░███ ░███████  ░███  ░███ ░███████ \n" +
        " ░███    ░███ ░███░░░   ░███ ░███░░░   ░░███ ███  ░███░░░  \n" +
        " █████   █████░░██████  █████░░██████   ░░█████   ░░██████ \n" +
        "░░░░░   ░░░░░  ░░░░░░  ░░░░░  ░░░░░░     ░░░░░     ░░░░░░  \n" +
        "                                                           \n" +
        "                                                           \n" +
        "                                                           ");

        Endpoint.publish("http://0.0.0.0:8080/", new ReleveController());
        System.out.println("The server is starting on : http://localhost:8080/ ,  http://0.0.0.0:8080/");
    }
}
