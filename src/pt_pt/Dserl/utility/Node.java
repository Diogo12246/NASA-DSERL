package pt_pt.Dserl.utility;

import javafx.scene.layout.AnchorPane;
import pt_pt.Dserl.Controller.PlanetCatalogController;

public class Node {

    private static PlanetCatalogController planetCatalogger;

    public static void getPlanetCatalogController(AnchorPane box) {
        planetCatalogger = planetCatalogger == null ? new PlanetCatalogController() : planetCatalogger;
        config(box, planetCatalogger);
    }

    public static void config(AnchorPane box, AnchorPane conteudo) {
        box.getChildren().clear();
        box.getChildren().add(conteudo);
        Resize.margin(conteudo, 0);
    }
}
