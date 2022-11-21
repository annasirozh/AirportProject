package com.solvd.airport.countries;

public class CountryOfDestination {

    private String nameOfCountry;
    private int distance;
    private String city;

    public CountryOfDestination(String nameOfCountry, int distance, String city) {
        this.nameOfCountry = nameOfCountry;
        this.distance = distance;
        this.city = city;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
