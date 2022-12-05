package com.solvd.airport.countries;


import com.solvd.airport.exceptions.ECountryException;

import java.util.Objects;

public class CountryOfDestination {
    private String nameOfCountry;
    private int distance;
    private String city;

      public CountryOfDestination() {
        //this.nameOfCountry = nameOfCountry;
        this.distance = distance;
        this.city = city;
    }
    public CountryOfDestination(String _nameOfCountry){
          try {
              //check if the string contains numbers
              for (int i = 0; i < _nameOfCountry.length(); i++) {
                  if (Character.isDigit(_nameOfCountry.charAt(i))) {
                      throw new ECountryException();
                  }

              }
          }
              catch(ECountryException e)
              {
                 System.out.println("Exception:"+e.toString());
                 return;
              }
          nameOfCountry=_nameOfCountry;
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
