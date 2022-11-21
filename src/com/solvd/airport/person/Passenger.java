package com.solvd.airport.person;

public class Passenger extends Person {

    private String passportSeries;
    private int numberOfPassport;
    private String nationality;

    public Passenger(String nameOfPerson, String surnameOfPerson, int age, String passportSeries, int numberOfPassport, String nationality) {
        super(nameOfPerson, surnameOfPerson, age);
        this.passportSeries = passportSeries;
        this.numberOfPassport = numberOfPassport;
        this.nationality = nationality;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public int getNumberOfPassport() {
        return numberOfPassport;
    }

    public void setNumberOfPassport(int numberOfPassport) {
        this.numberOfPassport = numberOfPassport;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
