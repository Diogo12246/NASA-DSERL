package pt_pt.Dserl.View;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import pt_pt.Dserl.Controller.DserlManager;

import java.net.URL;
import java.util.ResourceBundle;


public class DserlAPPcontroller implements Initializable {

    DserlManager manager = new DserlManager();

    @FXML
    private Label label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

