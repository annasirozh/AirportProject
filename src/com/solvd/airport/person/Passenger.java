package com.solvd.airport.person;

import com.solvd.airport.flight.Flight;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Passenger extends Person {

    static final Logger logger = LogManager.getLogger(Passenger.class.getName());
    private String passportSeries;
    private int numberOfPassport;

    public Passenger(String nameOfPerson, String surnameOfPerson, String passportSeries, String numberOfPassport) {
        super(nameOfPerson, surnameOfPerson);
        this.passportSeries = passportSeries;
        this.numberOfPassport = Integer.parseInt(numberOfPassport);
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

    @Override
    public String toString() {
        return "Passenger{" +
                "passportSeries='" + passportSeries + '\'' +
                '}';
    }

    @Override
    public void displayInformationAboutPerson() {
        logger.info("Passenger: %s \t Passenger surname: %s \n Passenger passportSeries: %s \n Passenger numberOfPassport: %s \n" , super.getNameOfPerson(),super.getSurnameOfPerson(),passportSeries,numberOfPassport);

    }
}
