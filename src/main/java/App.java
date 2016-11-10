import static spark.Spark.*;

/**
 * Created by everson on 09/11/16.
 */

public class App {

    public static void main(String[] args) {
        port(80);
        get("/hello", (req,res) -> "Hello World");
    }
}
