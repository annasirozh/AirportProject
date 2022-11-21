package com.solvd.airport.tickets;

import com.solvd.airport.classestickets.ClassOfTickets;
import com.solvd.airport.flight.Flight;
import com.solvd.airport.person.Passenger;
import com.solvd.airport.plane.Plane;

public class Ticket {

    private int numberOfTicket;
    private Flight flight;
    private Plane plane;
    private ClassOfTickets classOfTickets;
    private Passenger passenger;

    public Ticket(int numberOfTicket, Flight flight, Plane plane, ClassOfTickets classOfTickets, Passenger passenger) {
        this.numberOfTicket = numberOfTicket;
        this.flight = flight;
        this.plane = plane;
        this.classOfTickets = classOfTickets;
        this.passenger = passenger;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public ClassOfTickets getClassOfTickets() {
        return classOfTickets;
    }

    public void setClassOfTickets(ClassOfTickets classOfTickets) {
        this.classOfTickets = classOfTickets;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

}
