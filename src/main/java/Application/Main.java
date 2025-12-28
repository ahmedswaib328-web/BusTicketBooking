package Application;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // Load first screen (Registration)
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/Application/Registration.fxml")
            );

            Scene scene = new Scene(loader.load());
            stage.setTitle("E-Bus System");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace(); // shows error if something is wrong
        }
    }

    public static void main(String[] args) {

        launch(args);
    }
}

