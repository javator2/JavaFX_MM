package com.sdacademy.javaFX.controler;

import com.sdacademy.javaFX.Main;
import com.sdacademy.javaFX.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    public void handleNewButton(){

       this.main.loadPersonEdit();
    }

    @FXML
    private Button editButton;
    @FXML
    private Button deleteButton;


    @FXML
    public void initialize() {
        nameCol.setCellValueFactory(cell -> cell.getValue().nameProperty());
        lastnameCol.setCellValueFactory(cell -> cell.getValue().lastnameProperty());
    }


}
