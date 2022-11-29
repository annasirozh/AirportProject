package com.solvd.airport.countries;

import java.util.Objects;

public class CountryOfDestination {
    private String nameOfCountry;
    private int distance;
    private String city;

      public CountryOfDestination() {
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

    @Override
    public String toString() {
        return "CountryOfDestination{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                ", distance=" + distance +
                ", city='" + city + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryOfDestination that)) return false;
        return distance == that.distance && Objects.equals(nameOfCountry, that.nameOfCountry) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCountry, distance, city);
    }
}
