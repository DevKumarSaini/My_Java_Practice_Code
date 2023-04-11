package Array;

import java.util.Scanner;

public class PrintingStudentDetails {
    /*
    Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.
     */
    int rollno;
    String name;
    int hindi,english,computer;
Scanner scanner = new Scanner(System.in);
    PrintingStudentDetails(int i){
        // this is constructor to initialize value
        System.out.println("--------------------------------------------");
        System.out.println("Enter name of student");
        this.name=scanner.nextLine();
        System.out.println("Enter RollNo of Student");
        this.rollno=scanner.nextInt();
        System.out.println("Enter Hindi Marks");
        this.hindi=scanner.nextInt();
        System.out.println("Enter English Marks");
        this.english=scanner.nextInt();
        System.out.println("Enter Computer Marks");
        this.computer=scanner.nextInt();
        System.out.println("--------------------------------------------");
    }
    PrintingStudentDetails(){}

    private void displayData(PrintingStudentDetails obj[]){
        for (int i=0;i<obj.length;i++){
            System.out.println("-------------------------------------------------------------");
            System.out.println("Name            "+obj[i].name);
            System.out.println("Roll no         "+obj[i].rollno);
            System.out.println("English  Marks  "+obj[i].english);
            System.out.println("Hindi    Marks  "+obj[i].hindi);
            System.out.println("Computer Marks  "+obj[i].computer);
            System.out.println("Average  Marks  "+(obj[i].english+obj[i].hindi+obj[i].computer)/3);
            System.out.println("-------------------------------------------------------------\n");
        }
    }

    public static void main(String[] args) {
        PrintingStudentDetails Student1= new PrintingStudentDetails(1);
        PrintingStudentDetails Student2= new PrintingStudentDetails(1);
        PrintingStudentDetails Student3= new PrintingStudentDetails(1);
        PrintingStudentDetails Student4= new PrintingStudentDetails(1);
        PrintingStudentDetails obj = new PrintingStudentDetails();

        PrintingStudentDetails  Students [] ={Student1,Student2,Student3,Student4};
        
        obj.displayData(Students);
    }
}
