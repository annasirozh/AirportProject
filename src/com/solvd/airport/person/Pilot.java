package com.solvd.airport.person;

public class Pilot extends Person {

      private String qualification;
      public Pilot(String nameOfPerson, String surnameOfPerson, String qualification) {
            super(nameOfPerson, surnameOfPerson);
            this.qualification = qualification;
      }

      public String getQualification() {
            return qualification;
      }

      public void setQualification(String qualification) {
            this.qualification = qualification;
      }

      @Override
      public void displayInformationAboutPerson() {
            System.out.printf("Pilot name: %s \t Pilot surname: %s \n Pilot qualification: %s \n", super.getNameOfPerson(),super.getSurnameOfPerson(),qualification);
      }
}
