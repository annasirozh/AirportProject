package com.solvd.airport.classestickets;

public class FirstClass extends ClassOfTickets{
    public String getTypeOfMenu() {
        return typeOfMenu;
    }

    public void setTypeOfMenu(String typeOfMenu) {
        this.typeOfMenu = typeOfMenu;
    }

    private String typeOfMenu;

    public FirstClass(String nameOfClass, int maxWeightHandLuggage, int priceOfTicket, int countOfplacesForHandLuggage, String typeOfMenu) {
        super(nameOfClass, maxWeightHandLuggage, priceOfTicket, countOfplacesForHandLuggage);
        this.typeOfMenu = typeOfMenu;
    }

}
