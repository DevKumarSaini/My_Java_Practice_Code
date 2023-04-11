package InterfacePrograms;
/*
interface testingInterface {
    void hello();
}
interface testingInterface2{
    void hello();
    public  class goo{

    }
}
abstract class testingAbstract{
    abstract void hello();
        }
class ApplyingInterface extends testingAbstract implements testingInterface,testingInterface2 {
//    public void hello(){
//        System.out.println("This is printing");
//    }

    public static void main(String[] args) {
    ApplyingInterface ob = new ApplyingInterface();
    ob.hello();
    ob.makingObject();
    }
    private interface h{
        void gigantoo();
    }
    protected interface hh{
        void gigantoo();
    }public interface hhh{
        void gigantoo();
    }

    @Override
    public void hello() {
        System.out.println("This is common method in bothe the interface and abstract class also");
    }
    class google extends pegion{
        public void displaying(){
            System.out.println("this is (Inner class google ) google class extending pegion class");
        }
    }
    abstract class pegion{
        // this is abstract class pegion in applyingINterface class
        public void displya(){
            System.out.println("(Abstract inner class pegion )Hello world i am pegion and ready to fly");
        }
    }
    public void makingObject(){
        google g = new google();
        g.displaying(); // this is displaying the method of google class
        g.displya(); // this is the method of pegion class
        //we cannot make an object of pegion abstract class baby
         }
}

*/
/*
public class testingInterface{
    protected  class goom{
        void disk(){
            System.out.println("Displaying Disk nested class method");
        }
    }

    public static void main(String[] args) {
        testingInterface obj= new testingInterface();
        testingInterface.goom innerobj = obj.new goom();

        innerobj.disk();
    }
}*/

interface A{
    void jamun();
    default void vegan(){
        System.out.println("I am not vegan and also eat chicken with milk");
    }
}
interface B {
    void aanar();
    default void vegan(){
        System.out.println("I am vegan and not even drink milk");
    }
}
public class testingInterface implements B,A{


    @Override
    public void jamun() {

    }

    @Override
    public void aanar() {

    }

    @Override
    public void vegan() {
//        B.super.vegan();
    }

    public static void main(String[] args) {
        testingInterface t = new testingInterface();
        t.vegan();
    }
}