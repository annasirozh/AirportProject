package com.solvd.airport.plane;

import com.solvd.airport.person.Pilot;

public class CargoPlane extends Plane{

    private int maximumМolume;
    private int cargoCompartmentSize;
    private int cargoDoorSize;
    private Pilot pilot;

    public CargoPlane(int modelPlane, int maxSpeedPlane, int maxWeight, int numberOfSeats, Pilot pilot, int maximumМolume, int cargoCompartmentSize, int cargoDoorSize, Pilot pilot1) {
        super(modelPlane, maxSpeedPlane, maxWeight, numberOfSeats, pilot);
        this.maximumМolume = maximumМolume;
        this.cargoCompartmentSize = cargoCompartmentSize;
        this.cargoDoorSize = cargoDoorSize;
        this.pilot = pilot1;
    }

    public int getMaximumМolume() {
        return maximumМolume;
    }

    public void setMaximumМolume(int maximumМolume) {
        this.maximumМolume = maximumМolume;
    }

    public int getCargoCompartmentSize() {
        return cargoCompartmentSize;
    }

    public void setCargoCompartmentSize(int cargoCompartmentSize) {
        this.cargoCompartmentSize = cargoCompartmentSize;
    }

    public int getCargoDoorSize() {
        return cargoDoorSize;
    }

    public void setCargoDoorSize(int cargoDoorSize) {
        this.cargoDoorSize = cargoDoorSize;
    }

    @Override
    public Pilot getPilot() {
        return pilot;
    }

    @Override
    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

}
