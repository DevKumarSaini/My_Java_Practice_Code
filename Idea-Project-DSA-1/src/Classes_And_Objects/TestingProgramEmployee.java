package Classes_And_Objects;

public class TestingProgramEmployee {
    /*Write a program by creating an 'Employee' class having the following methods and printthe final salary.
    1 - 'getInfo()' which takes the salary, number of hours of work per day of employee asparameter
    2   -   'AddSal()'   which   adds   $10   to   salary   of   the   employee   if   it   is   less   than   $500.
    3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work perday is more than 6 hours.

     */
    int salary;
    int WorkingHours;
    String name;
    int age;

    TestingProgramEmployee (String name, int age ){
        this.name=name;
        this.age=age;
    }
    public void getInfo(int Salary, int WorkingOFHours){
        this.salary=Salary;
        this.WorkingHours=WorkingOFHours;
    }
    public Object AddSalary(TestingProgramEmployee Obj){  // Program name and then local Object for storing the valur of the original object
            if(Obj.salary < 500){
            Obj.salary=Obj.salary+10;
        }
        return Obj;
    }

    public Object AddWork(TestingProgramEmployee Obj){
        if(Obj.WorkingHours > 6){
            Obj.salary=Obj.salary+5;
        }
        return  Obj;
    }
    public void DisplayDetali(){
        System.out.println("--------------------------------------------------");
        System.out.println("Name            >-->  "+name);
        System.out.println("Age             >-->  "+age);
        System.out.println("Salary          >-->  "+salary+"$");
        System.out.println("Working Hours   >-->  "+WorkingHours);
        System.out.println("--------------------------------------------------");
        System.out.println();
    }


}
class ActionClass{
    public static void main(String[] args) {
        TestingProgramEmployee Employee1 = new TestingProgramEmployee("Dev kumar saini",21);
        Employee1.getInfo(546,7);
        Employee1.AddSalary(Employee1);
        Employee1.AddWork(Employee1);

        TestingProgramEmployee Employee2 = new TestingProgramEmployee("Ram Kumar Yadav",31);
        Employee2.getInfo(342,8);
        Employee2.AddSalary(Employee2);
        Employee2.AddWork(Employee2);

        TestingProgramEmployee Employee3 = new TestingProgramEmployee("Yash Kumar saini",40);
        Employee3.getInfo(421,6);
        Employee3.AddSalary(Employee3);
        Employee3.AddWork(Employee3);

        Employee1.DisplayDetali();
        Employee2.DisplayDetali();
        Employee3.DisplayDetali();
    }
}
