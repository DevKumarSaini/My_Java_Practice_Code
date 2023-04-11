package Inheritance;

class Aa{
    Aa(){
        System.out.println("This is first constructor");
    }
}
class Bb extends Aa{
    Bb(){
        System.out.println("This is Second Constructor");
    }
}
public class ConstructorsInJava {
    public static void main(String[] args) {
        Bb bb = new Bb();
    }
}
