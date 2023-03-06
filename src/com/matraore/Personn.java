package com.matraore;

import java.util.Arrays;
import java.util.Objects;

public class Personn {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Cat[] cat;

    public Personn(String firstName, String lastName, Gender gender, Cat[] cat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cat = cat;
    }

    public Personn() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cat[] getCat() {
        return cat;
    }

    public void setCat(Cat[] cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Personn{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", cat=" + Arrays.toString(cat) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personn personn = (Personn) o;
        return Objects.equals(firstName, personn.firstName) && Objects.equals(lastName, personn.lastName) && gender == personn.gender && Arrays.equals(cat, personn.cat);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender);
        result = 31 * result + Arrays.hashCode(cat);
        return result;
    }
}
