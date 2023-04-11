package Loops;

import java.util.Scanner;

public class PrintZPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i=1;i<input;i++){
            if(input / i != 0){
                System.out.println(input+" is not a prime number");
            }
            else {
                System.out.println("is a prime number");
            }

        }
    }
}
