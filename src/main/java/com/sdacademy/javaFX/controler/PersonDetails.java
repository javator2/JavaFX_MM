package com.sdacademy.javaFX.controler;


import com.sdacademy.javaFX.model.Person;
import javafx.fxml.FXML;
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
        street.setText(person.getStreet());
        city.setText(person.getCity());
        postalCode.setText(person.getPostalCode());
        telephoneNumber.setText(person.getTelephone());
    }



    public void handleOK() {
        person.setName(name.getText());
        person.setLastname(lastname.getText());
        person.setStreet(street.getText());
        person.setCity(city.getText());
        person.setPostalCode(postalCode.getText());
        person.setTelephone(telephoneNumber.getText());
        System.out.println("Łał, ale fajnie że coś zmieniłeś. Zapisuję!");
        stage.close();
    }

    public void close() {
        System.out.println("Nic nie zmieniasz to zamykam =[");
        stage.close();
    }
}


