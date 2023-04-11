package InterfacePrograms;

interface Bicycle {
    int speed=100;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Horn{
    void blowHorn();
    void BlowHornK3g();
}
class Avon implements Bicycle ,Horn{
    @Override
    public void applyBrake(int decrement) {
        System.out.println("speed down bicycle");
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("speed up bicycle");
    }
    public void blowHorn(){
        System.out.println("Goori tare pyar me pagal me chora ");
    }
    public void BlowHornK3g(){
        System.out.println("Me hoon horn of K3g mare bhai loog");
    }
}
class InterfacePrograms{
    public static void main(String[] args) {
        Avon cicycle = new Avon();
        cicycle.speedUp(10);
        System.out.println(cicycle.speed-100+10);

        cicycle.applyBrake(5);
        System.out.println(cicycle.speed-5);

        System.out.println("\nBlowing horn\n");
        cicycle.blowHorn();
        System.out.println("Applying Second Horn\n");
        cicycle.BlowHornK3g();
    }
}
