import controllers.ReleveController;

import static spark.Spark.*;

public class RestWSApplication {
    public static void main(String[] args) {
        port(8080);
        get("/releve", "application/json", (request, response) -> {
            ReleveController releveController = new ReleveController();
            response.type("Application/json");
            return releveController.getReleve();
        }, new JsonTransformer());
    }
}
