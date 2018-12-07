package pt_pt.Dserl.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import pt_pt.Dserl.Controller.DserlManager;
import pt_pt.Dserl.Model.PlanetType;
import pt_pt.Dserl.utility.ExceptionHandler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.io.IOException;
import java.sql.SQLOutput;

public class PlanetCatalogController extends AnchorPane {

    @FXML private TextField planetName;
    @FXML private TextField planetSize;
    @FXML private TextField planetCode;
    @FXML private TextField planetDiscoveryDate;
    @FXML private ComboBox _planetType;
    @FXML private TextField planetOrbit;
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

    public int getValueCB(){
        Integer planetTypeId = 0;
        try {
            PlanetType type = (PlanetType) _planetType.getSelectionModel().getSelectedItem();
            planetTypeId = type.getIdType();
            System.out.println(_planetType.getValue().toString());
        }
        catch (Exception ex){
            ExceptionHandler.ThrowEX(ex);
        }
        return planetTypeId;
    }

    @FXML
    public void initialize() {
        DserlManager manager = new DserlManager();
        ObservableList<String> planetTypeList = FXCollections.observableArrayList(manager.planetarianTypes());
        _planetType.setItems(planetTypeList);
        /*
        Since I get a very annoying error if I set onAction with buttons.
        I am forced to handle the buttons with a lambda and a listener
        this provides a permanent solution to the problem I am facing.
        The problem had to do with not having a fx controller so the
        "onAction" would give an error, but since I am passing the
        controller on the constructor, there is no trouble in
        handling button clicks with event handlers instead of the
        tradition "onAction" or "onMouseClick".
         */
        btnCatalogPlanet.setOnAction(event -> catalogPlanet());
        btnUpload3dModel.setOnAction(event -> upload3dModel());
    }

    @FXML
    public void catalogPlanet(){
        DserlManager manager = new DserlManager();
        String name = planetName.getText();
        int code =  Integer.parseInt(planetCode.getText());
        double size = Double.parseDouble(planetSize.getText());
        int discoveryDate = Integer.parseInt(planetDiscoveryDate.getText());
        double orbit = Double.parseDouble(planetOrbit.getText());
        double dayTime = Double.parseDouble(planetOrbit.getText());
        String description = planetInfos.getText();
        int planetType = getValueCB();
        manager.catalogPlanet(name, code, size, discoveryDate, planetType, orbit, dayTime, description);
        System.out.println("Hello");
    }

    @FXML
    public void upload3dModel(){
        //PLACEHOLDER
        System.out.println("testingbtn");
    }
}
