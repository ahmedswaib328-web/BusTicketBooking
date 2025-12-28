package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

    private Stage stage;
    private Scene scene;

    // Go to Registration page
    public void goToRegistration(ActionEvent event) {
        try {
            scene = new Scene(
                    FXMLLoader.load(getClass().getResource("/Application/Registration.fxml"))
            );

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Go to Login page
    public void goToLogin(ActionEvent event) {
        try {
            scene = new Scene(
                    FXMLLoader.load(getClass().getResource("/Application/Login.fxml"))
            );

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


