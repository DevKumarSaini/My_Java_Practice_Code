package AbstractPrograms;

abstract public class Parent {
    /*  Create an abstract class 'Parent' with a method 'message'.
    It has two subclasses each having a method with the same name 'message'
    that prints "This is first subclass" and "This is second subclass" respectively.
    Call the methods 'message' by creating an object for each subclass.
        */
   abstract void message();

    public static void main(String[] args) {
        subClass1 obj1= new subClass1();
        obj1.message();
        subClass2 obj2= new subClass2();
        obj2.message();
    }
}

class subClass1 {
    public void message() {
        System.out.println("this is the First Subclass ");
    }
}

class subClass2 {
    public void message() {
        System.out.println("This is the second sub class");
    }
}
