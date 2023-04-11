package LoopingPracticePrograms;

import java.util.Scanner;

public class Printing_Zero_and_One_triangle {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n");
        short n= scanner.nextShort();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
//                System.out.print("*");
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
