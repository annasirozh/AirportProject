import com.solvd.airport.classestickets.ClassOfTickets;
import com.solvd.airport.classestickets.TicketClass;
import com.solvd.airport.flight.Flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Main {

    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException {

        List<Flight> flights = addFlights();

        System.out.println("Enter country:");
        Scanner in = new Scanner(System.in);
        String nameOfCountry = in.next();
        System.out.println("Our country is: " + nameOfCountry);

        Flight foundFlight = searchOfCountry(flights, nameOfCountry);
        if (foundFlight != null) {
            System.out.println("Your flight:");
            foundFlight.displayInformation();
            System.out.println("Check out the rate: Economy,Comfort, Business...");
            TicketClass ticketClass = TicketClass.valueOf(in.next());
            System.out.println("Our ticket class is: " + ticketClass);
            int price = getPriceOfFlight(foundFlight, ticketClass);
            System.out.println("Price: " + price);
        } else {
            System.out.println("This country is not in the list of flights");
        }

        //блок для вычисления стоимости билета без перечислений
           /*
           //ClassOfTickets foundClassTicket = searchClassOfTickets(classOfTicketsList, ticketClass);
           if (foundClassTicket != null) {
                int price = foundFlight.getPrice() + foundClassTicket.getTicketFare();
                System.out.println("Price: " + price);
            } else {
                System.out.println("You have not selected the required ticket class");
            }*/

    }

    public static Flight searchOfCountry(List<Flight> flights, String nameOfCountry) {
        for (Flight flight : flights) {
            if (nameOfCountry.equals(flight.getCountryOfDestination())) {
                return flight;
            }
        }
        return null;
    }

    // создание объектов класс без перечислений
    /*
    public static List<ClassOfTickets> addClassTicket() {
        ClassOfTickets business = new ClassOfTickets("business", 15, 250, 2);
        ClassOfTickets comfort = new ClassOfTickets("comfort", 10, 150, 2);
        ClassOfTickets economy = new ClassOfTickets("economy", 5, 50, 1);
        return List.of(business, comfort, economy);
    }*/
    public static List<ClassOfTickets> addClassTicket() {
        ClassOfTickets business = new ClassOfTickets(TicketClass.Business, 15, 250, 2);
        ClassOfTickets comfort = new ClassOfTickets(TicketClass.Comfort, 10, 150, 2);
        ClassOfTickets economy = new ClassOfTickets(TicketClass.Economy, 5, 50, 1);
        return List.of(business, comfort, economy);
    }

    public static List<Flight> addFlights() throws ParseException {

        Flight flight1 = new Flight("Belarus", "Minsk", "Poland", dateFormat.parse("27.12.2022"), "08:00", dateFormat.parse("28.12.2022"), 12, 8262);
        Flight flight2 = new Flight("Belarus", "Minsk", "Russia", dateFormat.parse("14.12.2022"), "16:00", dateFormat.parse("15.12.2022"), 8, 9500);
        return List.of(flight1, flight2);
    }

    //блок для поиска необходимого класса билетов для вычисления необходимой стоимости
/*
    public static ClassOfTickets searchClassOfTickets(List<ClassOfTickets> classOfTicketsList, String ticketClass) {
        for (ClassOfTickets classOfTicket : classOfTicketsList) {
            if (ticketClass.equals(classOfTicket.getNameOfClass())) {
                return classOfTicket;
            }
        }
        return null;
    }*/
    public static final int getPriceOfFlight(Flight foundFlight, TicketClass foundTicketClass) {
        int price = 0;
        if (foundTicketClass.equals(TicketClass.Business)) {
            price = foundFlight.getPrice() + TicketClass.Business.getRATE();

        } else {
            if (foundTicketClass.equals(TicketClass.Comfort)) {
                price = foundFlight.getPrice() + TicketClass.Comfort.getRATE();

            } else {
                if (foundTicketClass.equals(TicketClass.Economy)) {
                    price = foundFlight.getPrice() + TicketClass.Economy.getRATE();
                } else {
                    System.out.println("You entered the wrong class");
                }
            }
        }
        return price;
    }
}