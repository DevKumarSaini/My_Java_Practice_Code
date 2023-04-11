package LoopingPracticePrograms;

import java.util.Scanner;

public class RightShiftOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int inp = scanner.nextInt();
        int temp=0;
        while(inp>0){ // shifting one bit means value divide by 2
            inp=inp>>1;
            System.out.println(inp);
        }
    }
}
