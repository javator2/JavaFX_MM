package com.sdacademy.javaFX;

import com.sdacademy.javaFX.controler.PersonControler;
import com.sdacademy.javaFX.controler.PersonDetails;
import com.sdacademy.javaFX.model.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    public Stage getStage() {
        return stage;
    }

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

            PersonControler controller = loader.getController();
            controller.setMain(this);




        } catch (IOException err) {
            err.printStackTrace();
        }

    }

    public void loadNewPerson() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/NewPerson.fxml"));
            VBox window = (VBox) loader.load();

            Stage editStage = new Stage();
            editStage.setTitle("Please, Enter new Person");
            Scene scene = new Scene(window);
            editStage.setScene(scene);
            editStage.show();
           // NewPersonAdd.setStageForNewPerson(editStage);



        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public void loadPersonEdit(Person person) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/PersonEdit.fxml"));
            VBox window = (VBox) loader.load();

            PersonDetails personDetails = loader.getController();
            personDetails.setPerson(person);

            Stage editStage = new Stage();
            editStage.setTitle("Edit Person Data");

            personDetails.setStage(editStage);
            Scene scene = new Scene(window);
            editStage.setScene(scene);
            editStage.show();



        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public void setPersonList(ObservableList<Person> personList) {
        this.personList = personList;
    }

    public void deletePerson() {

    }

    public void saveNewPerson(){

    }


    public void addPerson(Person person) {
        personList.add(person);
    }

//    public void read() throws IOException {
//        List<Person> convertedPersonList = new ArrayList<>();
//        for (int i = 0, i = personList.lastIndexOf(personList), i++) {
//
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//        File filename = new File("MySuperList.json");
//        filename.createNewFile();
//        mapper.writeValue(filename, convertedPersonList);
//    }
}