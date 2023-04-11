package Recursion;

public class SunOf_FirstN_Natural_Numbers {
    public static void main(String[] args) {
        SunOf_FirstN_Natural_Numbers obj=new SunOf_FirstN_Natural_Numbers();
        System.out.println(obj.sumOfN(15));
    }
    int sumOfN(int n){
       if(n == 0 || n == 1){
           return n -1;
       }
       else {
           return sumOfN(n-1) + sumOfN(n-2);
       }
    }
}
