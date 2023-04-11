package Methods;
interface bag{
     void bad();
}
interface google{
    void google();
}
interface hanumanJi{
    private void testing(){ // This method is not accessible by any other object because theis method is private and you cannot access private methhod using objet
        System.out.println("This is private pujari of Hanumanji Temple");
    }
    default void extendTemplePujari(){
        testing();
        System.out.println("This method is actually derived private pujari function in it ");
    }
    void hanumanji();
}
interface ladyBag extends bag,google,hanumanJi{
    void ladyBag();
}
public class returnignObject implements ladyBag{
    int adding,subtracting;
    returnignObject(){}
    returnignObject(int a,int b){
        this.adding=a;
        this.subtracting=b;
    }
    returnignObject performingAction(){
        returnignObject clone1 = new returnignObject();
        clone1.adding +=10;
        clone1.subtracting += -5;
        System.out.println("---"+clone1.adding);
        return clone1;
    }
    public static void main(String[] args) {
        returnignObject ActualObject = new returnignObject(10,20);
        returnignObject containingReturnObjectValue;
        containingReturnObjectValue=ActualObject.performingAction();

        // Displaying Actual Objects
        System.out.println("Displaying actual objects ");
        System.out.println("----------------------------------");
        System.out.println(ActualObject.adding);
        System.out.println(ActualObject.subtracting);
        System.out.println("----------------------------------");
        System.out.println("Displaying non return Object values");
        System.out.println("----------------------------------");
        System.out.println(containingReturnObjectValue.adding);
        System.out.println(containingReturnObjectValue.subtracting);

        returnignObject checking = new returnignObject();
        checking.hanumanji();
        checking.bad();
        checking.ladyBag();
        checking.google();
        checking.extendTemplePujari();
    }

    @Override
    public void bad() {
        System.out.println("This is Bag");
    }

    @Override
    public void google() {
        System.out.println("This is google");
    }

    @Override
    public void hanumanji() {
        System.out.println("This is hanumanji Temple");
    }

    @Override
    public void ladyBag() {
        System.out.println("This is lady bag");
    }
}
