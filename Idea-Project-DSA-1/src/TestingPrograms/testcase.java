package TestingPrograms;

public class testcase {
    public static void main(String[] args) {
       int n=10011;
       int remainder=0;

       while (n!=0){
           remainder=n%10;
//           System.out.println("Reverse  ->  "+n);
           n=n/10;

           System.out.print(remainder);
       }
       for(int i=0;i<100;i++){
           System.out.println(i+" >-> "+Integer.toBinaryString(i));
       }
    }
}
