package pt_pt.Dserl.Controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class pViewPListController extends AnchorPane implements Initializable {

    DserlManager manager = new DserlManager();

    @FXML private TableView tablePList;
    //TABLES
    @FXML private TableColumn pName;
    @FXML private TableColumn pCode;
    @FXML private TableColumn pSize;
    @FXML private TableColumn pDiscoveryDate;
    @FXML private TableColumn pType;
    @FXML private TableColumn pOrbit;
    @FXML private TableColumn pDayTime;
    //END_TABLES
    ///////

    public pViewPListController() {
        try {
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("../View/appMenu/appSubMenus/pViewPlanetList.fxml"));
            fxml.setRoot(this);
            fxml.setController(this);
            fxml.load();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



}
