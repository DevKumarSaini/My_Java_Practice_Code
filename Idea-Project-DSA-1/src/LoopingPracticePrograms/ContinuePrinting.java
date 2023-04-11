package LoopingPracticePrograms;

import java.util.Scanner;

public class ContinuePrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n");
        short inp=scanner.nextShort();
        int count=0;
        for(int i=0;i<=inp;i++){
            System.out.print(i+"  -->  ");
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
