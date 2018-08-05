package com.sdacademy.javaFX.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonInString {

    private String name;
    private String lastname;
    private String street;
    private String city;
    private String postalCode;
    private String telephone;

    public PersonInString() {}


    public PersonInString(String name, String lastname, String street, String city, String postalCode, String telephone) {
        this.name = name;
        this.lastname = lastname;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.telephone = telephone;
    }
}
