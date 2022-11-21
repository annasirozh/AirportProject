package com.solvd.airport.flight;

import com.solvd.airport.countries.CountryOfDestination;
import com.solvd.airport.crew.Crew;

public class Flight {

    private String departureOfCountry;
    private String cityOfCountry;
    private CountryOfDestination countryOfDestination;
    private int departureDate;
    private int departureTime;
    private int arrivalDate;
    private int arrivalTime;
    private Crew crew;

    public Flight(String departureOfCountry, String cityOfCountry, CountryOfDestination countryOfDestination, int departureDate, int departureTime, int arrivalDate, int arrivalTime, Crew crew) {
        this.departureOfCountry = departureOfCountry;
        this.cityOfCountry = cityOfCountry;
        this.countryOfDestination = countryOfDestination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.crew = crew;
    }

    public String getDepartureOfCountry() {
        return departureOfCountry;
    }

    public void setDepartureOfCountry(String departureOfCountry) {
        this.departureOfCountry = departureOfCountry;
    }

    public String getCityOfCountry() {
        return cityOfCountry;
    }

    public void setCityOfCountry(String cityOfCountry) {
        this.cityOfCountry = cityOfCountry;
    }

    public CountryOfDestination getCountryOfDestination() {
        return countryOfDestination;
    }

    public void setCountryOfDestination(CountryOfDestination countryOfDestination) {
        this.countryOfDestination = countryOfDestination;
    }

    public int getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(int departureDate) {
        this.departureDate = departureDate;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(int arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }


}
