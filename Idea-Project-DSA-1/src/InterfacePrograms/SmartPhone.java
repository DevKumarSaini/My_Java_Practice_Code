package InterfacePrograms;

interface Camera {
void takeSnap();
void recordVideo();
// this is private method which is used when our code is
private void greet(){
    System.out.println("I am private method calling into the recording4kVideo" +
            "\nGood Morning");
}
default void recordingIn4k(){
    greet();
    System.out.println("This method is recording in 4K");
}
}

// Second Interface
interface wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
//-----------------------------------
public class SmartPhone {
        void callingNumber(int phoneNumber){
            System.out.println("Calling "+ phoneNumber);
        }
        void pickCall(){
            System.out.println("Connecting ...");
        }
}
class MySmartPhone extends SmartPhone implements wifi,Camera{

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of WiFi networks");
        String [] networks = {"JollyBhai","Kamal Kiskanda","Baki Bihari"};
        return networks;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connection to the networks ");
    }
}
class ActiveAction{
    public static void main(String[] args) {
        MySmartPhone obj = new MySmartPhone();
        String [] billu = obj.getNetworks();
        for(String aa :billu){
            System.out.println(aa);
        }
    }
}