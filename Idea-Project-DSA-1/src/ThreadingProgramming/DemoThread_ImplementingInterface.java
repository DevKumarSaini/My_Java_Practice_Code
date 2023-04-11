package ThreadingProgramming;

public class DemoThread_ImplementingInterface implements Runnable{
    public void run(){
        int i=0;
        while(true){
            System.out.println("I am thread 1 of Outer Class --> "+i);
            i++;
        }
        }
        class DemoThread2 implements Runnable{
        @Override
            public void run(){
            for(int i=0;;i++){
                System.out.println("I am thread 2 Of Inner Class --> "+2+"  -->  "+i);
            }
        }
        }
    }
    class ThreadRunning{
    public static void main(String [] args){
        DemoThread_ImplementingInterface Outerthred_Obj1 = new DemoThread_ImplementingInterface();
        DemoThread_ImplementingInterface.DemoThread2 InnerThread_Obj2 = Outerthred_Obj1.new DemoThread2();

        //--------------------------------- This Can Run Actual Thread and placing Object in Them
        Thread th1 = new Thread(Outerthred_Obj1);
        Thread th2 = new Thread(InnerThread_Obj2);

        th2.start();
        th1.start();
    }
    }
