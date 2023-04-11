package Inheritance;

class Phone{
    public void calling(){
        System.out.println("Calling to you vi normal phone");
    }
    public void message(){
        System.out.println("Messaging you vi a normal phone");
    }
    public void OldCalculator(){
        System.out.println("This is old Calculator");
    }
}

class SmartPhone extends Phone{
    public void calling(){
        System.out.println("Calling vi a Android smart phone");
    }

    public void takingPicture(){
        System.out.println("Taking picture using Android smart phone");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj= new SmartPhone();
        obj.calling();  // this is called run time polymorphism
        // if we take reference of base class and make an object of new or child class then we call its run time polymorphism

        SmartPhone obj1 = new SmartPhone();
        obj1.OldCalculator();
    }
}
