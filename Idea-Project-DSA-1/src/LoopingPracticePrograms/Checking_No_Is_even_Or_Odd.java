package LoopingPracticePrograms;

import java.util.Scanner;

public class Checking_No_Is_even_Or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=2;
        do {
            System.out.println("Enter your number");
            short inp=scanner.nextShort();
            int flag= inp&1;
            if(flag == 0){
                System.out.println("Even Number");
            }
            else {
                System.out.println("Odd Number");
            }
            a=a-1;
        }while (a>0);
    }
}
