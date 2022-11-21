package com.solvd.airport.classestickets;

public class EconomClass extends ClassOfTickets{

    private String typeOfMenuEconom;
    private String nameOfDrinks;

    public EconomClass(String nameOfClass, int maxWeightHandLuggage, int priceOfTicket, int countOfplacesForHandLuggage, String typeOfMenuEconom, String nameOfDrinks) {
        super(nameOfClass, maxWeightHandLuggage, priceOfTicket, countOfplacesForHandLuggage);
        this.typeOfMenuEconom = typeOfMenuEconom;
        this.nameOfDrinks = nameOfDrinks;
    }

    public String getTypeOfMenuEconom() {
        return typeOfMenuEconom;
    }

    public void setTypeOfMenuEconom(String typeOfMenuEconom) {
        this.typeOfMenuEconom = typeOfMenuEconom;
    }

    public String getNameOfDrinks() {
        return nameOfDrinks;
    }

    public void setNameOfDrinks(String nameOfDrinks) {
        this.nameOfDrinks = nameOfDrinks;
    }

}
