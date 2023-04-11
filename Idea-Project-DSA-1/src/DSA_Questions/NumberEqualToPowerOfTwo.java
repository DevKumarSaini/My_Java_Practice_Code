package DSA_Questions;

import java.util.NoSuchElementException;

public class NumberEqualToPowerOfTwo {
        int x;
        NumberEqualToPowerOfTwo(){
            NumberEqualToPowerOfTwo ob1 = new NumberEqualToPowerOfTwo();
            NumberEqualToPowerOfTwo ob2 = new NumberEqualToPowerOfTwo();
            ob1.x=50;
            ob2.x=40;
            display(ob1,ob2);
    }
    public void display(NumberEqualToPowerOfTwo obj1,NumberEqualToPowerOfTwo obj2){
        System.out.println("Calling with anonymous obj calling");
        System.out.println("This is object 1 with data -> "+obj1);
        System.out.println("This is object 2 with data -> "+obj2);
    }
//    private boolean powerOfTwo(int inp){
//        for(int i=0;i<=30;i++){
//            int temp=(int)Math.pow(2,i);
//            if(temp == inp){
//                return true;
//            }
//        }
//        return false;
//    }
//    static int func (int n)
//    {
//        int result;
//        if (n == 1)
//            return 1;
//        result = func (n=n + 1);
//        if (n>30 ){
//            System.exit(0);
//        }
//        System.out.println(result);
//        return result;
//    }

    public static void main(String[] args) {
        new NumberEqualToPowerOfTwo();
    }
}
