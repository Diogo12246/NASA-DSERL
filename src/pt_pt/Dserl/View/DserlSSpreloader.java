package pt_pt.Dserl.View;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;
import pt_pt.Dserl.Controller.DserlManager;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class DserlSSpreloader implements Initializable {

    DserlManager manager = new DserlManager();

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button connectbtn;
    @FXML
    private ProgressBar pb;
    @FXML
    private TextArea console;

    public void Connection(ActionEvent event) throws IOException {
        pb.setProgress(0.5);
        console.setText("Verifying Credentials...");
        boolean success = manager.testConnection(username.getText(), password.getText());
        if (success == true) {
            pb.setProgress(1);
            console.setText("Credentials match." + "\n" + "Welcome Adventurer!");
            try {
                Parent app = FXMLLoader.load(getClass().getResource("../View/nasadserlAPP.fxml"));
                PauseTransition pt = new PauseTransition(Duration.seconds(2));
                pt.setOnFinished(event1 ->
                {
                    Scene appScene = new Scene(app);
                    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    appStage.setScene(appScene);
                    appStage.show();
                    Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
                    appStage.setX((primScreenBounds.getWidth() - appStage.getWidth()) / 2);
                    appStage.setY((primScreenBounds.getHeight() - appStage.getHeight()) / 2);

                });
                pt.play();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            console.setText("Credentials Fail.");
            pb.setProgress(0);
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}