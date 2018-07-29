package com.sdacademy.javaFX;

import com.sdacademy.javaFX.controler.PersonControler;
import com.sdacademy.javaFX.model.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Observable;

public class Main extends Application {

    private Stage stage;
    private VBox layout;

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    public Main() {
        personList.add(new Person("Jan", "Kowalski"));
        personList.add(new Person("Sławek", "Kowalski"));
        personList.add(new Person("Tomasz", "Nowak"));
        personList.add(new Person("Zachary", "Czarnecki"));


    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

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

            Scene scene = new Scene(layout);
            stage.setScene(scene);
            stage.show();

            PersonControler controler = loader.getController();
            controler.setMain(this);

        } catch (IOException err) {
            err.printStackTrace();
        }

    }
}