package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("design1.fxml"));
        primaryStage.setTitle("Hello World");
       // String s=Integer.parseInt (()->{return "sd";});
        primaryStage.setScene(new Scene(root, 600, 400));
        root.getStylesheets().add
                (Main.class.getResource("Main.css").toExternalForm());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
