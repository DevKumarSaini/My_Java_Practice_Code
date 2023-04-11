package InterfacePrograms;

interface DemoInterface1 {
    void demointerfaceMethod1();
    void demointerfaceMethod2();
}
interface DemoWorking{
    void demoWorkingMethod1();
    void demoWorkingMethod2();

}
class testingInterfaces implements DemoInterface1,DemoWorking{
    public void demointerfaceMethod1(){
        System.out.println("I am first method of Demo Interface Method 1");
    }
    public void demointerfaceMethod2(){
        System.out.println("This is method of Demo Interface Method 2");
    }
    public void demoWorkingMethod1(){
        System.out.println("This is first method of Demo Working Method 1");
    }
    public void demoWorkingMethod2(){
        System.out.println("This is second method of Demo Working Method 2");
    }
    //---------------------------------  Main Method
    public static void main(String[] args) {
        DemoInterface1 ojb = new  testingInterfaces();
        ojb.demointerfaceMethod1();
    }
}
