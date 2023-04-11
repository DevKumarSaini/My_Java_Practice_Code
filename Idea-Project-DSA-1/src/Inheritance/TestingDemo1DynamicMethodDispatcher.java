package Inheritance;

public class TestingDemo1DynamicMethodDispatcher {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void addFloat(double a,double b){
        System.out.println(a+b);
    }
//     this is class one and we extending class 2
}
class TestingDemo1DynamicMethodDispatcher__2 extends TestingDemo1DynamicMethodDispatcher{
    @Override
    void add(int a, int b) {
        System.out.println("This is overriden method and this is actually multiplying the value instead of adding");
        System.out.println(a*b);
    }
    void addFloat(double a,double b){
        System.out.println("we are multiplying with double");
        System.out.println(a*b);
    }
    void Display(){
        System.out.println("This will not be call because here we using dynamic method dispatch and " +
                "\nand according the rules of dynamic method dispatch we cannot call that method whic is not so common in both the class");
    }
}
class Action3{
    public static void main(String[] args) {
        TestingDemo1DynamicMethodDispatcher test= new TestingDemo1DynamicMethodDispatcher__2();
        test.add(10,20);
        test.addFloat(10.21,45.32);
//        test.Display();  this code cant be reached by java because this is no a part of dynamic method dispatcher
    }
}
