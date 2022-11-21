package com.solvd.airport.classestickets;

public class ClassOfTickets {

    private String nameOfClass;
    private int maxWeightHandLuggage;
    private int priceOfTicket;
    private int countOfplacesForHandLuggage;
    public ClassOfTickets(String nameOfClass, int maxWeightHandLuggage, int priceOfTicket, int countOfplacesForHandLuggage) {
        this.nameOfClass = nameOfClass;
        this.maxWeightHandLuggage = maxWeightHandLuggage;
        this.priceOfTicket = priceOfTicket;
        this.countOfplacesForHandLuggage = countOfplacesForHandLuggage;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public int getMaxWeightHandLuggage() {
        return maxWeightHandLuggage;
    }

    public void setMaxWeightHandLuggage(int maxWeightHandLuggage) {
        this.maxWeightHandLuggage = maxWeightHandLuggage;
    }

    public int getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(int priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public int getCountOfplacesForHandLuggage() {
        return countOfplacesForHandLuggage;
    }

    public void setCountOfplacesForHandLuggage(int countOfplacesForHandLuggage) {
        this.countOfplacesForHandLuggage = countOfplacesForHandLuggage;
    }


}
