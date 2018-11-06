package pt_pt.Dserl.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import pt_pt.Dserl.Model.User;
import pt_pt.Dserl.application.DserlAPP;
import pt_pt.Dserl.application.DserlLogin;


public class DserLoginController {

    public static User user = null;

    @FXML private PasswordField _password;
    @FXML private TextField _username;
    @FXML private Label errorReport;

    @FXML void exitapp(ActionEvent event){
        DserlLogin.palco.close();
    }

    @FXML void Login(ActionEvent event) {
        new DserlAPP().start(new Stage());
        DserlLogin.palco.close();
    }



    private void LoginEnter(PasswordField password) {
        password.setOnKeyReleased((KeyEvent key) -> {
            if (key.getCode() == KeyCode.ENTER) {
                Login(null);
            }
        });
    }
}
