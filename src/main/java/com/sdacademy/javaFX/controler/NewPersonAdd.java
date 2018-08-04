package com.sdacademy.javaFX.controler;

import com.sdacademy.javaFX.Main;
import com.sdacademy.javaFX.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewPersonAdd {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
        personTable.setItems(main.getPersonList());
    }

    @FXML
    private TableView<Person> personTable;

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

    public void setStageForNewPerson(Stage stage) {
        this.stage = stage;
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

    public void handleAddPerson() {
        main.addPerson(person);
        System.out.println("zamykam");
        stage.close();
    }

    public void close() {
        System.out.println("zamykam");
        stage.close();
    }
}
