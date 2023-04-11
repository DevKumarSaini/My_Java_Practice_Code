package LoopingPracticePrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter value of n");
//        int n=scanner.nextInt();
        double a=0,b=1;
        aa:
        for(int i=0;;i++) {
            double nextnumber = a + b;
            System.out.println(i + "  -> " + nextnumber);
            a = b;
            b = nextnumber;
//            if(i==5000){
//                break aa;
//      }      }
        }
    }
}
