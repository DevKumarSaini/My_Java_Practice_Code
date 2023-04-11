package InterfacePrograms;

/*
Java Practice Questions on Abstract Classes & Interfaces

Create an abstract class pen with methods write () and refill () as abstract methods
Use the pen class from
Q1 to create a concrete class fountain pen with additional method change Nib ()


Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods
Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism
Demonstrate polymorphism using using monkey  class from Q3
Create an interface TVremote and use it to inherit another interface smart TVremote
Create a class TV which implements TVremote interface from Q6

 */


public class PracticeSet {
}
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    public void changeNib(){
        System.out.println("Changing your fountain pen nib");
    }
    void write(){
        System.out.println("Writing with your pen");
    }
    void refill(){
        System.out.println("We are refilling your pen");
    }

    // This is concrete class in which all the abstract method will be defined and also additional userdefined concrete method will we defined
    public static void main(String[] args) {
        FountainPen pen= new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
}
