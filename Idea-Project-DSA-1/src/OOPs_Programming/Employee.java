package OOPs_Programming;

import java.util.RandomAccess;

public class Employee {
    int salaryOfEmployee;
    int NoOfWorkingHour;
    String NameOfEmployee;



    public void getInfo(String name,int NoOfHours,int salary){  // This FUnction Setting salary and No OF Working Hour
        this.NameOfEmployee=name;
        this.NoOfWorkingHour=NoOfHours;
        this.salaryOfEmployee=salary;
    }

    public Object addSalary(Employee Obj){
        int salary=500;
        if(Obj.salaryOfEmployee < salary){
            Obj.salaryOfEmployee=Obj.salaryOfEmployee+10;
        }
        return Obj.salaryOfEmployee;
    }

    public Object AddWorkHour(Employee Obj){  // Function Which Take Input As A Object And Return As An Object
        int WorkingHour =6;
        if(Obj.NoOfWorkingHour >WorkingHour){
            Obj.salaryOfEmployee =Obj.salaryOfEmployee+5;
        }
        return Obj;
    }
    public void DisplayEmployee(){
        System.out.println("Name "+NameOfEmployee);
        System.out.println("Working Hour "+NoOfWorkingHour);
        System.out.println("Salary  "+salaryOfEmployee);
    }
    /*Write a program by creating an 'Employee' class having the following methods and print the final salary.
    1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
    2 -AddSal()'   which   adds   $10   to   salary   of   the   employee   if   it   is less   than   $500.
    3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
     */
}
class EmployeeAction{
    public static void main(String[] args) {
        Employee Rahul = new Employee();
        Rahul.getInfo("Rahul Kumar",8,495);
        Rahul.addSalary(Rahul);
        Rahul.AddWorkHour(Rahul);
        Rahul.DisplayEmployee();

    }
}