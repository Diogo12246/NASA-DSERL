package pt_pt.Dserl.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DserlAPP extends Application {

    public static Stage palco;
    private static Scene cena;
    private static AnchorPane pagina;

    private Screen ecra = Screen.getPrimary();
    private Rectangle2D window = ecra.getVisualBounds();


    public static void main(String[] args) {
        DserlLogin.launch(DserlAPP.class, (java.lang.String[]) null);
    }

    @Override
    public void start(final Stage stage){
        try {
            palco = stage;
            pagina = FXMLLoader.load(DserlLogin.class.getResource("../View/DserlAPP.fxml"));
            cena = new Scene(pagina);

            stage.initStyle(StageStyle.UNDECORATED);
            stage.setX(window.getMinX());
            stage.setY(window.getMinY());
            stage.setWidth(window.getWidth());
            stage.setHeight(window.getHeight());
            stage.getIcons().addAll(new Image(DserlLogin.class.getResourceAsStream("../Resources/nasaLOGO.png")));
            stage.setScene(cena);
            stage.show();

        }
        catch (Exception e){
            System.out.println("Ocorreu um erro ");
            e.printStackTrace();
        }
    }
}
