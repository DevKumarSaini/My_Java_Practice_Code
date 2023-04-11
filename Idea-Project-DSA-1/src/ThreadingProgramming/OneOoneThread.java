package ThreadingProgramming;

public class OneOoneThread extends Thread{  // Extending Thread Class
    public OneOoneThread(String name){
        super(name); // This name is passing to Thread Class Constructor
    }
    public OneOoneThread(){}
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("This is thread one 2  -->  "+i);
            i++;
        }
    }
    class InnerClass implements Runnable{ //Implementing Runnable Interface
        InnerClass(String name1){
//            super(name1);
        }
        public InnerClass(){}
        @Override
        public void run(){
            int j=0;
            while(j<100){
                System.out.println("This is thread of Inner Class 2  --> "+j);
                j++;
            }
        }
    }
    public static void main(String [] args){
        OneOoneThread OuterObject1= new OneOoneThread();
        OneOoneThread Thread2 = new OneOoneThread("Dev Kumar Saini");

        // These are objects of Inner Class
        OneOoneThread.InnerClass InnerObject = OuterObject1.new InnerClass();
        OneOoneThread.InnerClass InnerObject2 = OuterObject1.new InnerClass("Advance Thread");

        OuterObject1.start();
        Thread2.start();
        Thread th1 = new Thread(InnerObject);
        Thread th2 = new Thread(InnerObject2);
        th2.start();
        th1.start();
        System.out.println("Name of your Inner Class Thread -->  "+th1.getName());
        System.out.println("ID   of your Inner Class Thread -->  "+th1.getId());
        System.out.println("Name of Inner Class Thread is --->  "+th2.getName());
        System.out.println("ID of Inner Class Thread is --->  "+th2.getId());


        System.out.println("Name Of Your Thread is  --> Name ==>  "+Thread2.getName());
        System.out.println("ID   Of Your Thread is  --> Name ==>  "+Thread2.getId());


    }
}
