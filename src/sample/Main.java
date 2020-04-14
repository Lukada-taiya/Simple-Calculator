package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_HEIGHT = 360;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Main Scene
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        root.setStyle("-fx-background-color: #6f6e6e;");
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT));
        primaryStage.setWidth(WINDOW_WIDTH);
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}