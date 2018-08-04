package com.sdacademy.javaFX.controler;


import com.sdacademy.javaFX.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PersonDetails {

    @FXML
    private TextField name;

    @FXML
    private TextField lastname;

    @FXML
    private TextField street;

    @FXML
    private TextField city;

    @FXML
    private TextField postalCode;

    @FXML
    private TextField telephoneNumber;

    private Person person;
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }


    @FXML
    public void initialize() {
    }

    public void setPerson(Person person) {
        this.person = person;
        name.setText(person.getName());
        lastname.setText(person.getLastname());
    }

    @FXML
    private Button anuluj;

    @FXML
    private Button save;

    @FXML
    public void handleSaveButton(Person person) {
    }

    public void handleOK() {
        person.setName(name.getText());
        person.setLastname(lastname.getText());
        System.out.println("zamykam");
        stage.close();
    }

    public void close() {
        System.out.println("zamykam");
        stage.close();
    }
}


