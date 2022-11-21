package com.solvd.airport.person;

public class Stewardess extends Person{

    private String qualification;
    private int numberOfLanguagesLearned;

    public Stewardess(String nameOfPerson, String surnameOfPerson, int age, String qualification, int numberOfLanguagesLearned) {
        super(nameOfPerson, surnameOfPerson, age);
        this.qualification = qualification;
        this.numberOfLanguagesLearned = numberOfLanguagesLearned;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getNumberOfLanguagesLearned() {
        return numberOfLanguagesLearned;
    }

    public void setNumberOfLanguagesLearned(int numberOfLanguagesLearned) {
        this.numberOfLanguagesLearned = numberOfLanguagesLearned;
    }


}
