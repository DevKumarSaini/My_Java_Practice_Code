package LoopingPracticePrograms;

import java.util.Scanner;

public class CheckIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you no to check prime or not");
        int n=scanner.nextInt();
        boolean check=true;
        for(int i=0;i<n;i++){
            if(n%i !=0){
                check = false;
                break;
            }

        }
        if(check == true ){
            System.out.println("number is prime");
        }
        else {
            System.out.println("no is not prime");
        }
    }
}
