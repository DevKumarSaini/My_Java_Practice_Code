package ThreadingProgramming;

public class DemoThreadExtendingClass extends Thread{
    @Override  // Primary Class 1
    public void run(){
        int i=0;
        while(true){
            System.out.println("I am learning Java --> "+i);
            i++;
        }
    }
    class DemoThread1 extends Thread{ // Inner Class 1
        @Override
        public void run(){
            int i=0;
            while(true){
                System.out.println("I am joining Java "+((char)i)+"    ->  "+i);
                i++;
//                if(i>66000){
//                    break;
//                }
            }
        }
    }
    public static void main(String[] args) {
    DemoThreadExtendingClass OuterThread = new DemoThreadExtendingClass();
    DemoThreadExtendingClass.DemoThread1 InnerThread = OuterThread.new DemoThread1();

//    OuterThread.start();
//    InnerThread.start();
        InnerThread.start();
        OuterThread.start();
    }
}
