/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Lucas
 */
public class Person {

    private  IntegerProperty id;
    private  StringProperty lastName;
    private  StringProperty street;
    private  IntegerProperty postalCode;
    private  IntegerProperty city;
    private  ObjectProperty<LocalDate> birthday;

    /**
     *  Construtor padrão.
     */
    public Person() {
        this(null, null);
    }

    /**
     * Construtor com alguns dados iniciais.
     * 
     * @param firstName Primeiro nome da Pessoa.
     * @param lastName Sobrenome da Pessoa.
     */
    public Person(Integer firstName, String lastName) {
        this.id = new SimpleIntegerProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.city = new SimpleIntegerProperty(0);

   
    }

    public Person(Integer firstName, String lastName, Integer postalCode) {
        this.id = new SimpleIntegerProperty(firstName);
        this.lastName = new SimpleStringProperty (lastName);
        this.postalCode = new SimpleIntegerProperty(postalCode);
                this.city = new SimpleIntegerProperty(0);


    }

    public Integer getFirstName() {
        return id.get();
    }

    public void setFirstName(Integer firstName) {
        this.id.set(firstName);
    }

    public IntegerProperty firstNameProperty() {
        return id;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public StringProperty streetProperty() {
        return street;
    }

    public int getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(int postalCode) {
        this.postalCode.set(postalCode);
    }

    public IntegerProperty postalCodeProperty() {
        return postalCode;
    }

    public Integer getCity() {
        return city.get();
    }

    public void setCity(Integer city) {
        this.city.set(city);
    }

    public IntegerProperty cityProperty() {
        return city;
    }

    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
}