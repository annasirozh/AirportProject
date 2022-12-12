import com.solvd.airport.classestickets.ClassOfTickets;
import com.solvd.airport.classestickets.TicketClass;
import com.solvd.airport.countries.Country;
import com.solvd.airport.exceptions.EFlightsIsNULL;
import com.solvd.airport.exceptions.EFoundFlightISNULL;
import com.solvd.airport.exceptions.ENameOfCountryIsNULL;
import com.solvd.airport.flight.Flight;
import com.solvd.airport.person.Pilot;
import com.solvd.airport.plane.Plane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {


    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException, ENameOfCountryIsNULL, IOException, EFoundFlightISNULL, EFlightsIsNULL {


        List<Country> countries = createListOfCountry();
        LOGGER.info("List Of coutry {}:", countries);

        LinkedList<Pilot> pilots = createPilotList();
        LOGGER.info("List Of pilot {}:", pilots);

        List<Flight> flights = addFlights(countries);
        Map<TicketClass, ClassOfTickets> classOfTicketsMap = addClassTicket();

        HashSet<Plane> planes = createPlaneList();
        LOGGER.info("List of available aircraft {}:", planes);

        Scanner in = new Scanner(System.in);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LOGGER.info("Enter country:");
        final String nameOfCountry = reader.readLine();

        if (nameOfCountry.trim().length() == 0) {
            throw new ENameOfCountryIsNULL("Error:You have not entered a country");
        } else {
            LOGGER.info("Our country is: " + nameOfCountry);
        }

        Flight foundFlight = searchOfFlight(flights, nameOfCountry);
        if (foundFlight != null) {
            LOGGER.info("Your flight:");
            foundFlight.displayInformation();
            LOGGER.info("Check out the rate: Economy,Comfort, Business...");
            TicketClass ticketClass = TicketClass.valueOf(reader.readLine().toUpperCase());
            LOGGER.info("Our ticket class is: " + ticketClass);
            ClassOfTickets readTicketClass = classOfTicketsMap.get(ticketClass);
            int price = getPriceOfFlight(foundFlight, readTicketClass);
            LOGGER.info("Price:" + price);
        } else {
            throw new EFoundFlightISNULL("This country is not in the list of flights");
        }
        LOGGER.info("Do you want to buy a ticket? Enter 1 if yes, 0 if no.");
        int decisionVariable = in.nextInt();
        if (decisionVariable == 1) {
            LOGGER.info("Put your surname");

        } else {
            LOGGER.info("Come back to us next time:)");
        }

    }


    /*public static ClassOfTickets addClassTicket(TicketClass ticketClass) {
        ClassOfTickets foundTicketClass;
        switch (ticketClass) {
            case BUSINESS:
                foundTicketClass = new ClassOfTickets(ticketClass, 15, 150, 2);
            case COMFORT:
                foundTicketClass = new ClassOfTickets(ticketClass, 10, 100, 2);
            case ECONOMY:
                foundTicketClass = new ClassOfTickets(ticketClass, 5, 50, 1);
            default:
                foundTicketClass = new ClassOfTickets(ticketClass, 5, 50, 1);
        }
        return foundTicketClass;
    }*/

    public static Map<TicketClass, ClassOfTickets> addClassTicket() {
        return Map.of(TicketClass.BUSINESS, new ClassOfTickets(TicketClass.BUSINESS, 15, 250, 2),
                TicketClass.COMFORT, new ClassOfTickets(TicketClass.COMFORT, 10, 150, 2),
                TicketClass.ECONOMY, new ClassOfTickets(TicketClass.ECONOMY, 5, 50, 1));
    }

    public static List<Country> createListOfCountry() {

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Belarus", "Minsk"));
        countries.add(new Country("Poland", "Warshawa"));
        countries.add(new Country("Russia", "Sochi"));

        return countries;
    }
 /*
    public static List<Country> sortListOfCountry(List<Country> countries){
        for(Country countries1: countries){
            Collections.sort(countries.get().getName());
        }

    }*/

    public static LinkedList<Pilot>  createPilotList() {
        LinkedList<Pilot> pilots = new LinkedList<>();
        Pilot pilot1 = new Pilot("Павел", "Кичкайло", "high");
        Pilot pilot2 = new Pilot("Василий", "Зарницкий", "high");
        pilots.add(pilot1);
        pilots.add(pilot2);
        return pilots;
    }

    public static HashSet<Plane> createPlaneList() {

        HashSet<Plane> planes = new HashSet<>();
        Plane plane1 = new Plane(345, 6125, 590);
        Plane plane2 = new Plane(2345, 7200, 769);
        planes.add(plane1);
        planes.add(plane2);
        return planes;
    }

    public static List<Flight> addFlights(List<Country> countries) throws ParseException {

        Flight flight1 = new Flight(countries.get(0), countries.get(1), 867,
                dateFormat.parse("27.12.2022"), "08:00", dateFormat.parse("28.12.2022"),
                12, 8262);
        Flight flight2 = new Flight(countries.get(0), countries.get(2), 967,
                dateFormat.parse("14.12.2022"), "16:00", dateFormat.parse("15.12.2022"),
                8, 9500);
        return List.of(flight1, flight2);
    }

    public static Flight searchOfFlight(List<Flight> flights, String nameOfCountry) {
        for (Flight flight : flights) {
            if (nameOfCountry.equals(flight.getDestination().getName())) {
                return flight;
            }
        }
        return null;
    }

    public static final int getPriceOfFlight(Flight foundFlight, ClassOfTickets classOfTickets) {
        int price = foundFlight.getPrice() + classOfTickets.getTicketFare();
        return price;
    }
}