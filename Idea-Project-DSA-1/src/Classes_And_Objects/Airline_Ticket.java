package Classes_And_Objects;

public class Airline_Ticket {
    String Departure_City;
    String Arrival_City;
    String Flight_Number;
    int Row_Number;
    Character Letter;

    Airline_Ticket (String Departure_City,String Arrival_City,String Flight_Number,int Row_Number,Character Seat_Letter){
        this.Departure_City=Departure_City;
        this.Arrival_City=Arrival_City;
        this.Flight_Number=Flight_Number;
         this.Letter=Seat_Letter;
    }

    public void displayDetails(    ){
        System.out.println("===================================================================");
        System.out.println("\n==========          Welcome To Indian Air Lines         ===========\n");
        System.out.println("Departure City  -->  "+Departure_City+"  to");
        System.out.println("Arrival   City  -->  "+Arrival_City);
        System.out.println("Flight Number   -->  "+Flight_Number);
        System.out.println("Seat Number     -->  "+Row_Number+Letter);
        System.out.println("===================================================================");

    }
    /* Create a class that captures airline tickets. Each ticket lists the departure and arrival cities, a flight number, and a seat assignment
        . A seat assignment has both a row and a letter for the seat within the row (such as 12F). Make two examples of tickets.*/
}
class Action4{
    public static void main(String [] args) {
        Airline_Ticket Mohit_Rajoriya = new Airline_Ticket("Jaipur", "Sikar", "45786FG", 12, 'A');
        Airline_Ticket Dev_Kumar_Saini = new Airline_Ticket("Jaipur", "U.S.A", "IN10047", 1, 'A');
    Mohit_Rajoriya.displayDetails();
    Dev_Kumar_Saini.displayDetails();
    }
}
