package com.sdacademy.javaFX.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person  {

    private StringProperty name;
    private StringProperty lastname;
    private StringProperty street;
    private StringProperty city;
    private StringProperty postalCode;
    private StringProperty telephone;

    public Person(StringProperty name, StringProperty lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setLastname(String lastname) {
        this.lastname.set(lastname);
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public void setPostalCode(String postalCode) {
        this.postalCode.set(postalCode);
    }

    public void setTelephone(String telephone) {
        this.telephone.set(telephone);
    }

    public Person(String name, String lastname, String street, String city, String postalCode, String telephone) {
        this.name = new SimpleStringProperty(name);
        this.lastname = new SimpleStringProperty(lastname);
        this.street = new SimpleStringProperty(street);
        this.city = new SimpleStringProperty(city);
        this.postalCode = new SimpleStringProperty(postalCode);
        this.telephone = new SimpleStringProperty(telephone);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getLastname() {
        return lastname.get();
    }

    public StringProperty lastnameProperty() {
        return lastname;
    }

    public String getStreet() { return street.get(); }

    public StringProperty streetProperty() {
        return street;
    }

    public String getCity() { return city.get(); }

    public StringProperty cityProperty() {
        return city;
    }

    public String getPostalCode() {
        return postalCode.get();
    }

    public StringProperty postalCodeProperty() {
        return postalCode;
    }

    public String getTelephone() {
        return telephone.get();
    }

    public StringProperty telephoneProperty() {
        return telephone;
    }

}
