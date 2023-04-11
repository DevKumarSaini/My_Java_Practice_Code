package Inheritance;

class Base{
    Base(){
        System.out.println("I am a Base class Constructor");
    }
    Base(int x){
        System.out.println("I am Overloaded Constructor of Base class with value of x is  -->>  "+x);
    }
}

//---------------------------------------------------------------------------------------------------
class Derived extends Base{
    Derived (){
//        super(0);
        System.out.println("I am Derived Class Constructor");
    }
    Derived(int x ,int y){
        super (x);
        System.out.println("I am overloaded constructor of derived class with value of y  -->> "+y);
    }
}
//---------------------------------------------------------------------------------------------------
class ChildOfBothClass extends Derived{
    ChildOfBothClass(){
        System.out.println("I am constructor of child class non parameterized constructor");
    }
    ChildOfBothClass (int x, int y, int z){
        super(x,y);
        System.out.println("I am parameterized constructor of ChildOfBothClass and i have vale of z -->  "+z);
    }
}

public class Constructor_In_Inheritance {
    public static void main(String [] args){
//        Derived obj=new Derived();
//        Derived object2 = new Derived(10,21);
        ChildOfBothClass Child1 = new ChildOfBothClass(10,20,30);
    }
}
