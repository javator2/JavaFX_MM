package com.sdacademy.javaFX.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty name;
    private StringProperty lastname;
    private StringProperty street;
    private StringProperty city;
    private StringProperty postalCode;
    private StringProperty telephone;

    public Person() {
    }

    public Person(String name, String lastname) {
        this.name = new SimpleStringProperty(name);
        this.lastname = new SimpleStringProperty(lastname);
    }


}
