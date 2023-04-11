package Inheritance;

interface implementkro{
    void display();
    default void defaultDisplay(){  // this is allowed in the interface
        System.out.println("this is default concrete method of interface");
    }
    static void staticDisplay(){  // this is also allowed in the interface
        privateDisplay();
        System.out.println("this is static concrete method of interface");
    }
    private static void privateDisplay(){
        System.out.println("this is private concrete method of interface but this cannot be derived directly we can run with the help of default method");
    }

}

 class simple implements implementkro{
    public void display(){
        System.out.println("Override display method of interface");
    }

    @Override
    public void defaultDisplay() {
        implementkro.super.defaultDisplay();  // when you want to calling interface method only then use this syntax
    }

    void show(){
        System.out.println("This is show method of simple class");
    }
}
class simple2 extends simple{
    @Override
    void show() {
        super.show();  //calling super class method using child class object 
//        System.out.println("this is the show method of simple2 class");
    }
}
public class testing{
    public static void main(String[] args) {
        simple s = new simple2();
        s.show();
    }
}
