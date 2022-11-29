package com.solvd.airport.flight;


import com.solvd.airport.DisplayInformation;

import java.util.Objects;

public class Flight implements DisplayInformation {

    private String departureOfCountry;
    private String cityOfCountry;
    private String countryOfDestination;
    private String departureDate;
    private String departureTime;
    private int travelTime;
    private int price;



    public Flight(String departureOfCountry, String cityOfCountry, String countryOfDestination, String departureDate, String departureTime, int travelTime, int price) {
        this.departureOfCountry = departureOfCountry;
        this.cityOfCountry = cityOfCountry;
        this.countryOfDestination = countryOfDestination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.travelTime = travelTime;
        this.price = price;
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

    public String getCountryOfDestination() {
        return countryOfDestination;
    }

    public void setCountryOfDestination(String countryOfDestination) {
        this.countryOfDestination = countryOfDestination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;
        return travelTime == flight.travelTime && price == flight.price && Objects.equals(departureOfCountry, flight.departureOfCountry) && Objects.equals(cityOfCountry, flight.cityOfCountry) && Objects.equals(countryOfDestination, flight.countryOfDestination) && Objects.equals(departureDate, flight.departureDate) && Objects.equals(departureTime, flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureOfCountry, cityOfCountry, countryOfDestination, departureDate, departureTime, travelTime, price);
    }


    @Override
    public String toString() {
        return "Flight{" +
                "departureOfCountry='" + departureOfCountry + '\'' +
                ", cityOfCountry='" + cityOfCountry + '\'' +
                ", countryOfDestination='" + countryOfDestination + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", travelTime=" + travelTime +
                ", price=" + price +
                '}';
    }

    @Override
    public void displayInformation() {
        System.out.printf("Departure Of Country: %s \n City Of Country: %s \n Country Of Destination: %s \n Departure Date: %s \n Departure Time %s \n Travel Time %d \n Price %d \n", departureOfCountry,cityOfCountry,countryOfDestination,departureDate,departureTime,travelTime,price);
    }
}
