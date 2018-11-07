package pt_pt.Dserl.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import pt_pt.Dserl.utility.Node;

public class DserlAppController {

    private static DserlAppController instance;

    @FXML private ToggleButton btnPlanets;
    @FXML private ToggleButton btnVisualizePlanet;
    @FXML private ToggleButton btnPlanetList;
    @FXML private ToggleButton btnCatalogPlanet;
    @FXML private VBox vboxPlanets;
    @FXML private AnchorPane content;

    public static DserlAppController getInstance() {
        return instance;
    }

    public AnchorPane getContent() {
        return content;
    }

    @FXML
    void planetCatalog(ActionEvent event) {
        Node.getPlanetCatalogController(content);
    }

}

