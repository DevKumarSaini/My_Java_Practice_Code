package ConstructorProgramming;

import Array.Insertion_In_Array;

public class InitializingAnObject {
    String Sname;
    int RollNO;
    int yearOfStudy;

    InitializingAnObject (){
        // This parameterized constructor is also used to initializing zero value
    }
    //Initializing variables by using constructor
    InitializingAnObject (String Sname,int RollNo,int yearOfStudy){
        this.RollNO=RollNo;
        this.yearOfStudy=yearOfStudy;
        this.Sname=Sname;
    }

    // This is Setter Method for setting variables value by using method
    public void SettingValues(String Sname,int RollNo, int yearOfStudy){
        this.Sname=Sname;
        this.RollNO=RollNo;
        this.yearOfStudy=yearOfStudy;
    }

    // This is getter method to getting all our values
    public void DisplayDetail(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Name of Student is       >>--->  "+Sname);
        System.out.println("RollNo of Student is     >>--->  "+RollNO);
        System.out.println("Study Year of Student is >>--->  "+yearOfStudy);
        System.out.println("---------------------------------------------------------");
        System.out.println();
    }


    public static void main(String[] args) {
        InitializingAnObject Rahul= new InitializingAnObject("Rahul Meena",12,2);
        InitializingAnObject Dev = new InitializingAnObject();
        Dev.SettingValues("Dev kumar saini",42,3);

        // Initializing the values by using Reference variable and getting values by using Getter method
        InitializingAnObject Vikas = new InitializingAnObject();
        Vikas.RollNO=30;
        Vikas.yearOfStudy=3;
        Vikas.Sname="Vikas Saini";
        System.out.println("Setting values by using Instance / Reference variable");
        Vikas.DisplayDetail();

        // Setting values by using Method and getting values by using getter method
        System.out.println("Setting values by using by Method");
        Dev.DisplayDetail();

        // Setting values by using Parameterized constructor and getting values by getter method
        System.out.println("Setting value by using parameterized constructor");
        Rahul.DisplayDetail();
    }
}
