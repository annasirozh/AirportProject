package com.solvd.airport.classestickets;

public class BusinessClass {

    private String typeOfMenuBusinessClass;
    private String nameOfDrink;
    private String additionalАeatures;

    public BusinessClass(String typeOfMenuBusinessClass, String nameOfDrink, String additionalАeatures) {
        this.typeOfMenuBusinessClass = typeOfMenuBusinessClass;
        this.nameOfDrink = nameOfDrink;
        this.additionalАeatures = additionalАeatures;
    }

    public String getTypeOfMenuBusinessClass() {
        return typeOfMenuBusinessClass;
    }

    public void setTypeOfMenuBusinessClass(String typeOfMenuBusinessClass) {
        this.typeOfMenuBusinessClass = typeOfMenuBusinessClass;
    }

    public String getNameOfDrink() {
        return nameOfDrink;
    }

    public void setNameOfDrink(String nameOfDrink) {
        this.nameOfDrink = nameOfDrink;
    }

    public String getAdditionalАeatures() {
        return additionalАeatures;
    }

    public void setAdditionalАeatures(String additionalАeatures) {
        this.additionalАeatures = additionalАeatures;
    }

}
