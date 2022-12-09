package com.solvd.airport.classestickets;

public enum TicketClass {
    BUSINESS(150), COMFORT(100), ECONOMY(50);
    private final int RATE;
    TicketClass(int RATE) {
        this.RATE = RATE;
    }

    public int getRATE() {
        return RATE;
    }



}

