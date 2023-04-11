package Classes_And_Objects;

public class SellPhone {
    public static void main(String[] args) {
        SellPhone htc1 = new SellPhone();
        htc1.Flashing();
        htc1.Ringing();
        htc1.Vibrating();

    }
    public void Ringing(){
        System.out.println("Mobile is ringing");
    }
    public void Vibrating(){
        System.out.println("Mobile is vibrating");
    }
    public void Flashing(){
        System.out.println("Mobile is Flashing");
    }
}
