package InterfacePrograms;

abstract public class Monkey {
abstract void jump();
abstract void bite();
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends Monkey implements basicanimal{
    void jump(){
        System.out.println("Human is Jumping");
    }
    void bite(){
        System.out.println("Human is Biting our Food");
    }
    public void eat(){
        System.out.println("Human is eating our food with well behave ethics and our morals");
    }
    public void sleep(){
        System.out.println("Human is sleeping at night");
    }

    //--------------------------------
    // All the methods of abstract class and methods of interface is easily implemented
    public static void main(String [] args){
        human human = new human();
        // Printing our method
        human.bite();
        human.eat();
        human.jump();
        human.sleep();
    }
}
