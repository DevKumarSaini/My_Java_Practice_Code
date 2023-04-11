package Inheritance;

class A{
    int rollNumber,age;
    A(){
        System.out.println("Without Parameterized Constructor of A Base/Parent Class");
    }
    A(int age,int rollNumber){
        this.age = age;
        this.rollNumber = rollNumber;
    }
    public void getDetails_A(){
        System.out.println("Age          -->  "+age);
        System.out.println("rollNumber   -->  "+rollNumber);
    }
    A (int age){
        this.age=age;
    }
    public void setRollNumber(int rnumber){
        this.rollNumber=rnumber;
    }
    public int age(){
        return age;
    }
}
class B extends A{
    String name;
    String DressColor;
    B(){
        System.out.println("Without Parameterized constructor of B Child Class");
    }
    B(String name, String DressColor){

        this.name = name;
        this.DressColor = DressColor;
    }
    B(int age,String name){
        super.setRollNumber(age);
        this.name=name;
        System.out.println("Name of Student   -->  "+name);
        System.out.println("Rollnumber of Student   -->  "+age);
    }
    public void getDetails_B(){
        System.out.println("Name   -->  "+name);
        System.out.println("DressColor  -->  "+DressColor);
    }
    protected String name(){
        return name;
    }
}

public class Demonstration_Of_Super_and_this {
    public static void main(String [] args){
//        B Student = new B("Suresh","Green");
//        Student.getDetails_B();
//        A Student1= new A(12,35);
//        Student1.getDetails_A();
//        B Rohit = new B(20,"Rohit Ramlal");
//        System.out.println("Name is -->  "+Rohit.name()+"\nAge is -->  "+Rohit.age());
        B bomb = new B(55,"Krishna");
        bomb.getDetails_A();
        bomb.getDetails_B();

    }
}
