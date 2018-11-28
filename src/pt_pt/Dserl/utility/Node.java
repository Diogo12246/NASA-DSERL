package pt_pt.Dserl.utility;

import javafx.scene.layout.AnchorPane;
import pt_pt.Dserl.Controller.*;

public class Node {

    private static PlanetCatalogController planetCatalogger;
    private static pViewPListController planetList;

    public static void getPlanetCatalogController(AnchorPane box) {
        planetCatalogger = planetCatalogger == null ? new PlanetCatalogController() : planetCatalogger;
        config(box, planetCatalogger);
    }

    public static void getPlanetListController(AnchorPane box) {
         planetList = planetList == null ? new pViewPListController() : planetList;
        config(box, planetList);
    }

    public static void config(AnchorPane box, AnchorPane content) {
        box.getChildren().clear();
        box.getChildren().add(content);
    }
}
