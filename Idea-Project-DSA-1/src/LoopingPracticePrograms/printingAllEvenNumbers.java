package LoopingPracticePrograms;

import java.util.Scanner;

public class printingAllEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter n number to print even numbers");
        int inp=scanner.nextShort();
        for(int i=0;i<=inp;i++){
                System.out.println(i + i);
        }
    }
}
