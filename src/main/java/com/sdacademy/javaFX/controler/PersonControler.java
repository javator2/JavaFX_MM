package com.sdacademy.javaFX.controler;

import com.sdacademy.javaFX.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PersonControler {

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
    public void initialize(){
        nameCol.setCellValueFactory(cell -> cell.getValue().nameProperty());
        lastnameCol.setCellValueFactory(cell -> cell.getValue().lastnameProperty());
    }

}
