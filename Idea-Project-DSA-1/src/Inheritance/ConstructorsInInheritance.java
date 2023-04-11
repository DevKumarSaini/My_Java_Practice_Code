package Inheritance;

class Derived1 {
    int member1;

    Derived1() {
        System.out.println("I am default constructor of Derived 1");
    }

    Derived1(int a) {
        System.out.println("I am single parameterized constructor of Derived 1  " + a);
    }
}

class ChildDerived extends Derived1 {
    ChildDerived() {
        System.out.println("I am Default constructor of ChildDerived");
    }

    ChildDerived(int a, int b) {
        super(a);
        System.out.println("I am parameterized constructor of ChildDerived " + a + " " + b);
    }
    public void HelperAdd(int a,int b){
        System.out.println("Addition "+(a+b));
    }
}

class DerivedOfDerived extends ChildDerived {
    DerivedOfDerived() {
        System.out.println("I am default constructor of DerivedOfDerived");
    }
    public void HelperAdd(int a, int b){
        System.out.println("This is override method of ChildOfDerived and its actually Multiplying values"+(a*b));
    }

    DerivedOfDerived(int a, int b, int c) {
//    super (a,b);
        System.out.println("I am three parameterized constructor of DerivedOfDerived Constructor " + a + " " + b + " " + c);
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {

        DerivedOfDerived obj1 = new DerivedOfDerived(10, 20, 30);
        DerivedOfDerived newObj = new DerivedOfDerived();
        System.out.println();
        newObj.HelperAdd(10,20);
    }
}
