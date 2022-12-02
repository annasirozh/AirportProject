package com.solvd.airport.classestickets;

public enum TicketClass {
    Business(150), Comfort(100), Economy(50);
    private final int RATE;
    TicketClass(int RATE) {
        this.RATE = RATE;
    }

    public int getRATE() {
        return RATE;
    }

    final TicketClass getBusiness(){
        return  TicketClass.Business;
    }



}

