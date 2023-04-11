package ThreadingProgramming;

public class Thread_UsingClass_and_Interface extends Thread{
    @Override
            public void run(){
        int i=0;
        while(true){
            System.out.println("I am thread 1 Thread Class  -->  1 --> "+i);
            i++;
        }
    }
    class InnerThread extends Thread{
        @Override
                public void run(){
            int i=0;
            while(true){
                System.out.println("I am thread 2 of Inner Thread Class -->  2 --> "+i);
                i++;
            }
        }
    }
}
class ThreadUsingInterfaces implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(true){
            System.out.println("I am thread 3 of Outer class Implemented Interface -->  "+i);
            i++;
        }
    }
    class InnerThreadUsingInterface implements Runnable{
        @Override
        public void run(){
            int i=0;
            while(true){
                System.out.println("This is Thread 4 of Inner class Of Interface -->  "+i);
                i++;
            }

        }
    }
}
class ActionThread{
    public static void main(String [] args){
        Thread_UsingClass_and_Interface OuterObjectClass1 = new Thread_UsingClass_and_Interface();
        Thread_UsingClass_and_Interface.InnerThread InnerObjectClass2 = OuterObjectClass1.new InnerThread();

        OuterObjectClass1.start();
        InnerObjectClass2.start();
        //--------------------------------  Upper Class Done Here
        ThreadUsingInterfaces OuterObjectOfClass2 = new ThreadUsingInterfaces();
        ThreadUsingInterfaces.InnerThreadUsingInterface InnerObjectOfClass2 = OuterObjectOfClass2.new InnerThreadUsingInterface();

        Thread th1 = new Thread(OuterObjectOfClass2);
        Thread th2 = new Thread(InnerObjectOfClass2);

        th1.start();
        th2.start();
    }
}
