package ThreadingProgramming;

import java.util.Set;

public class SettingJavaThreadPriority extends Thread{
    SettingJavaThreadPriority(){}
    SettingJavaThreadPriority(String name){super(name);}

    @Override
    public void run(){
        while (true){
            System.out.println("I am thread "+Thread.currentThread().getName());
            System.out.println("I am thread "+Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        SettingJavaThreadPriority obj1 = new SettingJavaThreadPriority("My thread");
        SettingJavaThreadPriority obj2 = new SettingJavaThreadPriority();

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();

    }
}
