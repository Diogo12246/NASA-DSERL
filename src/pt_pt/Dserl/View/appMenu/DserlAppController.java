package pt_pt.Dserl.View.appMenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pt_pt.Dserl.Controller.PlanetCatalogController;
import pt_pt.Dserl.utility.Node;

public class DserlAppController {

    private static DserlAppController instance;

    @FXML private ToggleButton btnPlanets;
    @FXML private ToggleButton btnVisualizePlanet;
    @FXML private ToggleButton btnPlanetList;
    @FXML private ToggleButton btnCatalogPlanet;
    @FXML private VBox vboxPlanets;
    @FXML private AnchorPane content;
    @FXML private Button exitBtn;
    @FXML private Canvas modelo3d;

    public static DserlAppController getInstance() {
        return instance;
    }

    @FXML
    private void exitAPP(){
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        stage.close();
    }

    public AnchorPane getContent() {
        return content;
    }

    @FXML
    void planetCatalog(ActionEvent event) {
        Node.getPlanetCatalogController(content);

        //XMLLoader = new FXMLLoader((DserlAppController.class).getResource("../"));

    }

    @FXML
    void planetList(ActionEvent event) {
        Node.getPlanetListController(content);
    }

}

