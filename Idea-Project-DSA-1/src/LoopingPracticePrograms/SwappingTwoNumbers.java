package LoopingPracticePrograms;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of First Number");
        int a=scanner.nextInt();
        System.out.println("Enter the value of Second Number");
        int b = scanner.nextInt();
        System.out.println("\nBefore Swapping your numbers\na = "+a+"\nb = "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }

}
