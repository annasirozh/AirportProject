package com.solvd.airport.classestickets;

import java.util.Objects;

public final class ClassOfTickets {

    TicketClass nameOfClassTicket;
    private int maxWeightHandLuggage;
    private int ticketFare;
    private int countOfplacesForHandLuggage;

    public TicketClass getNameOfClassTicket() {
        return nameOfClassTicket;
    }

    public void setNameOfClassTicket(TicketClass nameOfClassTicket) {
        this.nameOfClassTicket = nameOfClassTicket;
    }

    public int getMaxWeightHandLuggage() {
        return maxWeightHandLuggage;
    }

    public void setMaxWeightHandLuggage(int maxWeightHandLuggage) {
        this.maxWeightHandLuggage = maxWeightHandLuggage;
    }

    public int getTicketFare() {
        return ticketFare;
    }

    public void setTicketFare(int ticketFare) {
        this.ticketFare = ticketFare;
    }

    public int getCountOfplacesForHandLuggage() {
        return countOfplacesForHandLuggage;
    }

    public void setCountOfplacesForHandLuggage(int countOfplacesForHandLuggage) {
        this.countOfplacesForHandLuggage = countOfplacesForHandLuggage;
    }

    public ClassOfTickets(TicketClass nameOfClassTicket, int maxWeightHandLuggage, int ticketFare, int countOfplacesForHandLuggage) {
        this.nameOfClassTicket = nameOfClassTicket;
        this.maxWeightHandLuggage = maxWeightHandLuggage;
        this.ticketFare = ticketFare;
        this.countOfplacesForHandLuggage = countOfplacesForHandLuggage;
    }

    @Override
    public String toString() {
        return "ClassOfTickets{" +
                "nameOfClassTicket=" + nameOfClassTicket +
                ", maxWeightHandLuggage=" + maxWeightHandLuggage +
                ", ticketFare=" + ticketFare +
                ", countOfplacesForHandLuggage=" + countOfplacesForHandLuggage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassOfTickets that)) return false;
        return maxWeightHandLuggage == that.maxWeightHandLuggage && ticketFare == that.ticketFare && countOfplacesForHandLuggage == that.countOfplacesForHandLuggage && nameOfClassTicket == that.nameOfClassTicket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfClassTicket, maxWeightHandLuggage, ticketFare, countOfplacesForHandLuggage);
    }
    public void displayInformationAboutClassOfTickets(){
        System.out.printf("Name of class ticket: %s \n, Max weight hand Luggage: %d \n, Ticket fare: %d \n,Count of places for hand luggage: %d \n", nameOfClassTicket,maxWeightHandLuggage,ticketFare,countOfplacesForHandLuggage);
    }

}
