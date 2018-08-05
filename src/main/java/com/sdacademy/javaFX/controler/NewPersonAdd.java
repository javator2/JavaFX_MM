package com.sdacademy.javaFX.controler;

import com.sdacademy.javaFX.Main;
import com.sdacademy.javaFX.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewPersonAdd {
    private Main main;
    public void setMain(Main main) {
        this.main = main;
//        personTable.setItems(main.getPersonList());
    }

//    @FXML
//    private TableView<Person> personTable;

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

    public void setStageForNewPerson(Stage s) {
        this.stage = s;
    }

    public void setPerson(Person p) {
        this.person = p;
        if( p != null ) {
            name.setText(person.getName());
            lastname.setText(person.getLastname());
            street.setText(person.getStreet());
            city.setText(person.getCity());
            postalCode.setText(person.getPostalCode());
            telephoneNumber.setText(person.getTelephone());
        }
    }

    public void handleAddPersonSave() {
        person.setName(name.getText());
        person.setLastname(lastname.getText());
        person.setStreet(street.getText());
        person.setCity(city.getText());
        person.setPostalCode(postalCode.getText());
        person.setTelephone(telephoneNumber.getText());
        main.getPersonList().add(person);
        System.out.println("Łał, ale fajnie że coś zmieniłeś. Zapisuję!");
        stage.close();

    }

    public void close() {
        System.out.println("Nie chcesz dodać nikogo nowego? Napewno? .......... NAPEWNO?!?!?!");
        stage.close();
    }
}
