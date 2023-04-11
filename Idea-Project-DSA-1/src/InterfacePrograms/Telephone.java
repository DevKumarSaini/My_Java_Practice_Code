package InterfacePrograms;

abstract public class Telephone {
    abstract void with();
    abstract void lift();
    abstract void disconnected();
}
class SmartPhone1 extends Telephone{
    @Override
    void with() {
        System.out.println("Telephone with big battery is a deadly combinationi");
    }

    @Override
    void lift() {
        System.out.println("Telephone with lifting someone in our pocket is a deadly combination");
    }

    @Override
    void disconnected() {
        System.out.println("Your call is being disconnected.... " +
                "\nCall again later thank you");
    }

    public static void main(String[] args) {
        SmartPhone1 sm = new SmartPhone1();
        sm.with();
        sm.lift();
        sm.disconnected();
    }

}
