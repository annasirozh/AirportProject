package com.solvd.airport.classestickets;

import java.util.Objects;

public class ClassOfTickets {
    private String nameOfClass;
    private int maxWeightHandLuggage;
    private int ticketFare;
    private int countOfplacesForHandLuggage;

    public ClassOfTickets(String nameOfClass, int maxWeightHandLuggage, int ticketFare, int countOfplacesForHandLuggage) {
        this.nameOfClass = nameOfClass;
        this.maxWeightHandLuggage = maxWeightHandLuggage;
        this.ticketFare = ticketFare;
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

    @Override
    public String toString() {
        return "ClassOfTickets{" +
                "nameOfClass='" + nameOfClass + '\'' +
                ", maxWeightHandLuggage=" + maxWeightHandLuggage +
                ", ticketFare=" + ticketFare +
                ", countOfplacesForHandLuggage=" + countOfplacesForHandLuggage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassOfTickets that)) return false;
        return maxWeightHandLuggage == that.maxWeightHandLuggage && ticketFare == that.ticketFare && countOfplacesForHandLuggage == that.countOfplacesForHandLuggage && Objects.equals(nameOfClass, that.nameOfClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfClass, maxWeightHandLuggage, ticketFare, countOfplacesForHandLuggage);
    }




}
