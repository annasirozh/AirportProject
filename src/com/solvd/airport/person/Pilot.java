package com.solvd.airport.person;

public class Pilot extends Person {
      private static String qualification;

      //блок инициализации
      static {
            qualification = "high";
      }


      public static String getQualification() {
            return qualification;
      }

      public static void setQualification(String qualification) {
            Pilot.qualification = qualification;
      }

     
      public Pilot(String nameOfPerson, String surnameOfPerson, String qualification) {
            super(nameOfPerson, surnameOfPerson);
            this.qualification = qualification;
      }


      @Override
      public void displayInformationAboutPerson() {
            System.out.printf("Pilot name: %s \t Pilot surname: %s \n Pilot qualification: %s \n", super.getNameOfPerson(),super.getSurnameOfPerson(),qualification);
      }
}
