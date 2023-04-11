package LoopingPracticePrograms;

import java.util.Scanner;

public class Subtracting_Numbers_Without_Using_Arithmatic_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c=a+(~b+1);// (~b) it takes once complement and then add one to make two's complement
        System.out.println("Result of "+a+" "+b+" = "+c);
    }
}
