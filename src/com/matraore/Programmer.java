package com.matraore;

public class Programmer extends Employee{


    private String[] programmingLanguage;


    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguage) {
        super(name, age, address, experience);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeSomeCode() {
        System.out.println("Write some code");
    }
}
