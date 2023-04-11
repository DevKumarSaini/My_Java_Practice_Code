package ConstructorProgramming;

public class SetEmployeeSalary {
    int salary;
    String Name;
    SetEmployeeSalary(){
        this.salary=10000;
    }
    public static void main(String[] args) {
        SetEmployeeSalary obj= new SetEmployeeSalary();
        obj.Name="Rahul";
        System.out.println(obj.salary);
        System.out.println(obj.Name);
    }
}
