package com.solvd.airport.crew;

import com.solvd.airport.person.Pilot;
import com.solvd.airport.person.Stewardess;

public class Crew {
    private int numberOfCrew;
    private int countOfPerson;
    private Stewardess stewardess;
    private Pilot pilot;

    public Crew(int numberOfCrew, int countOfPerson, Stewardess stewardess, Pilot pilot) {
        this.numberOfCrew = numberOfCrew;
        this.countOfPerson = countOfPerson;
        this.stewardess = stewardess;
        this.pilot = pilot;
    }

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    public int getCountOfPerson() {
        return countOfPerson;
    }

    public void setCountOfPerson(int countOfPerson) {
        this.countOfPerson = countOfPerson;
    }

    public Stewardess getStewardess() {
        return stewardess;
    }

    public void setStewardess(Stewardess stewardess) {
        this.stewardess = stewardess;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

}
