package pt_pt.Dserl.Controller;


import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.StageStyle;


public class DserlMain /*extends Application*/ {


    public static void main(String[] args) {
        DserlManager m = new DserlManager();
        m.SqlInsPlanets("root","root");
        m.testConnection("root","root");
        //launch(args);
    }

    /*@Override
    public void start(Stage primaryStage) throws Exception{
        //set Stage boundaries to the lower right corner of the visible bounds of the main screen
        Parent root = FXMLLoader.load(getClass().getResource("../View/nasadserlSS.fxml"));
        Scene scene = new Scene(root);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);

    }*/

}

