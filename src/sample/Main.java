package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Main Scene
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        root.setStyle("-fx-background-color: #6f6e6e;");
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 300, 360));
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
