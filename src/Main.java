import com.solvd.airport.classestickets.ClassOfTickets;
import com.solvd.airport.flight.Flight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ClassOfTickets business = new ClassOfTickets("business", 15, 250, 2);
        ClassOfTickets comfort = new ClassOfTickets("comfort", 10, 150, 2);
        ClassOfTickets economy = new ClassOfTickets("economy", 5, 50, 1);

        Flight flight1 = new Flight("Belarus","Minsk" ,"Poland","27.12.2022", "28.12.2022",4,8262);
        System.out.println("Enter country:");
        Scanner in = new Scanner(System.in);
        String nameOfCountry = in.next();
        System.out.println("Our country is: " + nameOfCountry);

        if(nameOfCountry.equals(flight1.getCountryOfDestination())){
            System.out.println("Your flight:");
            flight1.displayInformation();
            System.out.println("Check out the rate: economy,comfort, business...");
            String ticketClass = in.next();
            int price=0;
            System.out.println("Our ticket class is: " + ticketClass);
            if(ticketClass.equals(business.getNameOfClass()))
            {
                price=
                flight1.getPrice()+business.getTicketFare();
                System.out.println("Flight cost: " + price);
            } else {
                if(ticketClass.equals(comfort.getNameOfClass()))
                {
                    price=
                            flight1.getPrice()+comfort.getTicketFare();
                    System.out.println("Flight cost: " + price);
                }else {
                    if(ticketClass.equals(economy.getNameOfClass()))
                    {
                        price=
                                flight1.getPrice()+economy.getTicketFare();
                        System.out.println("Flight cost: " + price);
                    }
                    else
                        System.out.println("You have not selected the required ticket class");
                }
            }
            }
        else
            System.out.println("This country is not in the list of flights");
    }
 }