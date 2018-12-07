package pt_pt.Dserl.application;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import pt_pt.Dserl.utility.ExceptionHandler;


public class DserlLogin extends Application {

    public static Stage stage;
    private Scene scene;
    private Screen ecra = Screen.getPrimary();
    private Rectangle2D window = ecra.getVisualBounds();


    public static void main(String[] args) {
        DserlLogin.launch(DserlLogin.class,(java.lang.String[]) null);
    }

    @Override
    public void start(Stage stage){
        try {
            DserlLogin.stage = stage;
            Parent root = FXMLLoader.load(getClass().getResource("../View/appLogin/DserlLogin.fxml"));
            scene = new Scene(root);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setX(window.getMinX());
            stage.setY(window.getMinY());
            stage.setWidth(window.getWidth());
            stage.setHeight(window.getHeight());
            stage.getIcons().addAll(new Image(DserlLogin.class.getResourceAsStream("../Resources/nasaLOGO.png")));
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception ex){
            ExceptionHandler.ThrowEX(ex);
        }
    }

}

