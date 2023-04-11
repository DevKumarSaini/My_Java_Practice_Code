package LoopingPracticePrograms;

import java.util.Scanner;

public class ForLoopIncrementingCountingTill10000 {
    public static void main(String[] args) {
//        for(int i=0,j=0,k=0;i<=10000 && j>= -10000 && k<=50000; i++,j--,k++){
//            System.out.println(i+" "+j+" "+k*i+" "+(i<<50154));
//        }
//        System.out.println("Input n ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you input n");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }

}
