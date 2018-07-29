package com.sdacademy.javaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage stage;
    private VBox layout;

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        this.stage.setTitle("My first App in JavaFX");
        loadView();
    }

    public void loadView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/RootView.fxml"));
            layout = (VBox) loader.load();

        } catch (IOException err) {
            err.printStackTrace();
        }
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

//    public void exit() {
//        break;
//    }
}