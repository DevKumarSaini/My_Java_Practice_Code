package Practice_Programs;

import java.util.Scanner;

public class CalculateSu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value");
        int inp=scanner.nextInt();
        int i=0,sum=0;
        int result =0;
        while(i<=inp){
            sum =sum+i;
            System.out.println(i+"   "+sum);
            result=sum;
            i=i+2;
        }
//        System.out.println(result);
    }
}
