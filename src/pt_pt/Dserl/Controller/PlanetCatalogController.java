package pt_pt.Dserl.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import pt_pt.Dserl.Model.PlanetType;
import pt_pt.Dserl.utility.ExceptionHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLOutput;

public class PlanetCatalogController extends AnchorPane {

    @FXML private TextField planetName;
    @FXML private Spinner planetSize;
    @FXML private Spinner planetCode;
    @FXML private DatePicker planetDiscoveryDate;
    @FXML private ComboBox _planetType;
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

    public void getValueCB(){
        try {
            PlanetType type = (PlanetType) _planetType.getSelectionModel().getSelectedItem();
            Integer id = type.getIdType();
            System.out.println(_planetType.getValue().toString());
            System.out.println("id: " + id.toString());
        }
        catch (Exception ex){
            ExceptionHandler.ThrowEX(ex);
        }
    }

    @FXML
    public void initialize() {
        DserlManager manager = new DserlManager();
        ObservableList<String> planetTypeList = FXCollections.observableArrayList(manager.planetarianTypes());
        _planetType.setItems(planetTypeList);
        System.out.println(planetTypeList.toString());
    }



}
