package com.solvd.airport.person;

public class Person {
    private String nameOfPerson;
    private String surnameOfPerson;
    private int age;

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public String getSurnameOfPerson() {
        return surnameOfPerson;
    }

    public void setSurnameOfPerson(String surnameOfPerson) {
        this.surnameOfPerson = surnameOfPerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String nameOfPerson, String surnameOfPerson, int age) {
        this.nameOfPerson = nameOfPerson;
        this.surnameOfPerson = surnameOfPerson;
        this.age = age;
    }


}
