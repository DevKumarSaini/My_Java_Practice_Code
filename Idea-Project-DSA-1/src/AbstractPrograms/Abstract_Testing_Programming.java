package AbstractPrograms;

import java.util.Scanner;

abstract public class Abstract_Testing_Programming {
    abstract void Display(String Display); // passing string type of argument

    abstract int calculate(int a,int b);

    abstract void check_String();
}
class ActionPerforming extends Abstract_Testing_Programming{

    void Display(String D){
        System.out.println("----------------------------------------------");
        System.out.println("Invoking Display method BY creating object of this Abstract class");
        System.out.println("--->"+D);
        System.out.println("----------------------------------------------");
    }
    int calculate(int a, int b){
        return a+b;
    }


    void check_String(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input in your console");
        boolean input= scanner.hasNextLine();
        System.out.println(input);
    }

    public static void main(String []  args){
        // Creating object
        Abstract_Testing_Programming obj = new ActionPerforming();

        // Invoking the Display function
        obj.Display("Hello i am invoking the this abstract method");
        System.out.println("\nJumping on the next function  >>>>>>>>>>----------->   \n");

        // Invoking the Calculate function
        int storage = obj.calculate(10,20);
        System.out.println("Displaying Result >>-->"+storage);
        System.out.println("\nJumping on the next function  >>>>>>>>>>----------->   \n");

        // Checkig your input is string or not
        System.out.println("Checking your input is string or not if its string its give true and if not it print false");
            obj.check_String();
    }
}



/*
     cabstract

class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class TestBank {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
    }
}

abstract class Bike {
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

//Creating a Child class which inherits Abstract class
class Honda extends Bike {
    void run() {
        System.out.println("running safely..");
    }
}

//Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2 {
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
*/