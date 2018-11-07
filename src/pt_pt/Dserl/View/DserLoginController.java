package pt_pt.Dserl.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import pt_pt.Dserl.Model.User;
import pt_pt.Dserl.application.DserlAPP;
import pt_pt.Dserl.application.DserlLogin;

import java.net.URL;
import java.util.ResourceBundle;
import pt_pt.Dserl.Controller.DserlManager;

public class DserLoginController implements Initializable {

    public static User user = null;
    DserlManager manager = new DserlManager();
    @FXML private PasswordField _password;
    @FXML private TextField _username;
    @FXML private Label errorReport;

    @FXML void exitapp(ActionEvent event){
        DserlLogin.stage.close();
    }

    @FXML void Login(ActionEvent event) {
        new DserlAPP().start(new Stage());
        DserlLogin.stage.close();
    }



    private void LoginEnter(PasswordField password) {
        password.setOnKeyReleased((KeyEvent key) -> {
            if (key.getCode() == KeyCode.ENTER) {
                Login(null);
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        connectionTest();
    }

    public void connectionTest(){

        boolean connection = manager.testConnection("root","root");
        if (connection == true){
            errorReport.setText("Connection to the database was successful. You may Login.");
        } else {
            errorReport.setText("Connection to the database failed. Please contact an administrator.");
        }
    }
}
