package com.solvd.airport.plane;

import com.solvd.airport.person.Pilot;

public class Plane {

    private int modelPlane;
    private int maxSpeedPlane;
    private int maxWeight;
    public Plane(int modelPlane, int maxSpeedPlane, int maxWeight) {
        this.modelPlane = modelPlane;
        this.maxSpeedPlane = maxSpeedPlane;
        this.maxWeight = maxWeight;
    }

    public int getModelPlane() {
        return modelPlane;
    }

    public void setModelPlane(int modelPlane) {
        this.modelPlane = modelPlane;
    }

    public int getMaxSpeedPlane() {
        return maxSpeedPlane;
    }

    public void setMaxSpeedPlane(int maxSpeedPlane) {
        this.maxSpeedPlane = maxSpeedPlane;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }


}