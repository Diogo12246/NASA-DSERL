package pt_pt.Dserl.View.appLogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pt_pt.Dserl.Controller.DserlManager;
import pt_pt.Dserl.Model.User;
import pt_pt.Dserl.application.DserlAPP;
import pt_pt.Dserl.application.DserlLogin;

import java.net.URL;
import java.util.ResourceBundle;

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
        //
        new DserlAPP().start(new Stage());
        DserlLogin.stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        connectionTest();
    }

    public void connectionTest(){

        boolean connection = manager.testConnection("root","root");
        if (connection != true){
            errorReport.setText("Connection to the database failed. Please contact an administrator");
        }
        else errorReport.setText("Connection sucessful, you may login.");
    }
}
