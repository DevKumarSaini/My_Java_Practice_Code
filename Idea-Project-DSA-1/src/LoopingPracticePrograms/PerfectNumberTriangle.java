package LoopingPracticePrograms;

import java.util.Scanner;

public class PerfectNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value in n");
        short n=scanner.nextShort();
        int count=1;
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print(count+" ");
            }
            count +=1;
            System.out.println();
        }
    }
}
/*
*        1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9

 * */
