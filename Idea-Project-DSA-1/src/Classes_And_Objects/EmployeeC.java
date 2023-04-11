package Classes_And_Objects;

import java.util.Scanner;

public class EmployeeC {
    /*
    Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
     */
    int salary,noOfHours;
    String name;
    EmployeeC(){}

    public void getInfo(String name,int salary, int noOfHours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of Employee");
        this.name=scanner.nextLine();
        System.out.println("Enter no of Working Hours");
        this.noOfHours= scanner.nextInt();
        System.out.println("Enter salary of Employee");
        this.salary= scanner.nextInt();
    }
    public void addSalary(EmployeeC obj){
        if(obj.salary<500){
            obj.salary +=10;
        }
    }
    public void addWork(EmployeeC obj){
        if(obj.noOfHours>6){
            obj.salary +=5;
        }
    }
    public void display(){
        System.out.println("Name of Emp -> "+this.name);
        System.out.println("Salary of Emp -> "+this.salary+"$");
        System.out.println("Working hour of Emp -> "+this.noOfHours+"hr");
    }
    public static void main(String [] args){
        EmployeeC Rahul = new EmployeeC();
        Rahul.getInfo("Rahul Sharma",450,8);
        Rahul.addWork(Rahul);
        Rahul.addSalary(Rahul);
        Rahul.display();
    }
}
