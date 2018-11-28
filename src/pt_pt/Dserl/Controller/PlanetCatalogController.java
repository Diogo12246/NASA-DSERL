package pt_pt.Dserl.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PlanetCatalogController extends AnchorPane {

    @FXML private TextField planetName;
    @FXML private Spinner planetSize;
    @FXML private Spinner planetCode;
    @FXML private DatePicker planetDiscoveryDate;
    @FXML private ComboBox planetType;
    @FXML private Spinner planetOrbit;
    @FXML private TextArea planetInfos;
    @FXML private Button btnCatalogPlanet;
    @FXML private Button btnUpload3dModel;
    @FXML private CheckBox cbx3dConfirm;


    public PlanetCatalogController() {
        try {
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("../View/appMenu/appSubMenus/pCcatalog.fxml"));
            fxml.setRoot(this);
            fxml.setController(this);
            fxml.load();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }



}
