package com.sdacademy.javaFX.controler;

import com.sdacademy.javaFX.Main;
import com.sdacademy.javaFX.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;


public class PersonControler {

    private Main main;

    public void setMain(Main main) {
        this.main = main;
        personTable.setItems(main.getPersonList());
    }

    @FXML
    private TableView<Person> personTable;
    @FXML
    private Label nameLabel;
    @FXML
    private Label lastnameLabel;
    @FXML
    private Label streetLable;
    @FXML
    private Label cityLable;
    @FXML
    private Label postalCodeLable;
    @FXML
    private Label telephoneLable;
    @FXML
    private TableColumn<Person, String> nameCol;
    @FXML
    private TableColumn<Person, String> lastnameCol;

    @FXML
    private Button newButton;

    @FXML
    public void handleNewButton() {
       this.main.loadNewPerson();
    }

//    @FXML
//    private Button editButton;

    @FXML
    public void handleEditButton() {

        Person selectPerson = personTable.getSelectionModel().getSelectedItem();
        if (selectPerson != null) {
            System.out.println(selectPerson.getName() + " " + selectPerson.getLastname());
            this.main.loadPersonEdit(selectPerson);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(main.getStage());
            alert.setTitle("WARNING");
            alert.setContentText("No Person was selected!");
            alert.showAndWait();
        }
    }

//    @FXML
//    private Button save;

    @FXML
    public void handleSaveButton() throws IOException {
        main.save();
    }

    @FXML
    private Button deleteButton;

    @FXML
    public void handleDeleteButton() {
        int index = personTable.getSelectionModel().getSelectedIndex();
        System.out.println(index + 1);
        Person selectPerson = personTable.getSelectionModel().getSelectedItem();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Delete " + selectPerson.getName() + " "
                + selectPerson.getLastname() + "?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            if (index >= 0) {
                personTable.getItems().remove(index);
            }
        }
    }

    @FXML
    public void viewPersonInfoOnLable(Person person) {

        nameLabel.setText(person.getName());
        lastnameLabel.setText(person.getLastname());
        streetLable.setText(person.getStreet());
        cityLable.setText(person.getCity());
        postalCodeLable.setText(person.getPostalCode());
        telephoneLable.setText(person.getTelephone());
    }


    @FXML
    public void initialize() {
        nameCol.setCellValueFactory(cell -> cell.getValue().nameProperty());
        lastnameCol.setCellValueFactory(cell -> cell.getValue().lastnameProperty());

        personTable.getSelectionModel().selectedItemProperty().addListener((observable, oldField, newField) -> viewPersonInfoOnLable(newField));
    }




}
