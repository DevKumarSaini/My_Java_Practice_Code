//package ThreadingProgramming;
//
//import Classes_And_Objects.Test;
//
//public class TestOfThreading extends Thread{
//    @Override
//    public void run(){
//        int i=0;
//        while (i<10) {
//            System.out.println("This is i -->  "+i);
//            i++;
//        }
//    }
//    class InnerClass implements Runnable{
//        @Override
//        public void run(){
//            int j=0;
//            while (j<10){
//                System.out.println("This is j -->  "+j);
//            j++;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        TestOfThreading OuterObject = new TestOfThreading();
//        TestOfThreading.InnerClass InenrOject= OuterObject.new InnerClass();
//
//
//        Thread th1 = new Thread(InenrOject,"New FreshThread"); // this is second constructor of Thread Class
//        System.out.println(th1.getName());
//        System.out.println(th1.getId());
//        System.out.println(th1.threadId());
//        th1.start();
//
//    }
//}
//-----------------------------------------------------  creating new thread class to override
package ThreadingProgramming;
class TestOfThreading extends Thread{
    TestOfThreading(String name){
        super(name);
    }
    TestOfThreading(TestOfThreading obj,String name2){
        super(obj,name2);
    }
    TestOfThreading(){
        super();
    }
    TestOfThreading(TestOfThreading obj1){
        super(obj1);
    }

    @Override
    public void run(){
//        int i=0;
//        while(i<12) {
//            System.out.println("Shekhar ki maa ki puddi --> "+i);
//            i ++;
//        }
        System.out.println("Test of thread method 1");
    }

    public static void main(String[] args) {
        TestOfThreading obj1 = new TestOfThreading();
        TestOfThreading obj2 = new TestOfThreading("Thread Of year one");
        TestOfThreading obj3 = new TestOfThreading(obj1,"This is obj1 but Actual Object 3");
        TestOfThreading obj4 = new TestOfThreading(obj3);

        obj1.start();
        System.out.println("Object 1 Name  --> "+obj1.getName());
        System.out.println("Object 1 Id    --> "+obj1.threadId());
        System.out.println("--------------------------------------");
        obj2.start();
        System.out.println("Object 2 Name  --> "+obj2.getName());
        System.out.println("Object 2 Id    --> "+obj2.threadId());
        System.out.println("--------------------------------------");
        obj3.start();
        System.out.println("Object 3 Name  --> "+obj3.getName());
        System.out.println("Object 3 Id    --> "+obj3.threadId());
        System.out.println("--------------------------------------");
        obj4.start();
        System.out.println("Object 4 Name  --> "+obj4.getName());
        System.out.println("Object 4 Id    --> "+obj4.threadId());
        System.out.println("--------------------------------------");
    }
}
