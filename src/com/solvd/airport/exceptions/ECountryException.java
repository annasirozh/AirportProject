package com.solvd.airport.exceptions;

public class ECountryException extends Exception {
    public String toString(){
        return "Error. Invalid country format.";
    }
}
