package AbstractPrograms;

abstract public class Bike_Abstract_Class {

    abstract void Display_Bike_Display();
}
class ActionPerforming1 extends Bike_Abstract_Class{

    void Display_Bike_Display(){
        System.out.println("Bike Name       -->   Gtr Macklren ");
        System.out.println("Bike Colour     -->   Black ");
        System.out.println("Bike CC         -->   2540  ");
        System.out.println("Bike Type       -->   Sports");
        System.out.println("Bike Cylinders  -->   4     ");
    }

    public static void main(String [] args){
        // Performing task to invoking the abstract class
        Bike_Abstract_Class obj = new ActionPerforming1();
        obj.Display_Bike_Display();
    }
}
