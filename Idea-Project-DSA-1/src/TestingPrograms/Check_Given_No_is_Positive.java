package TestingPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Check_Given_No_is_Positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {

           System.out.println("Enter the value of A");
           short first = scanner.nextShort();
           if (first > 0) {
               System.out.println(first + " Number is Positive");
           } else if (first < 0) {
               System.out.println(first + " Number is Negative");
           } else {
               System.out.println("Number is Neutral (zero)");
           }
       }catch (InputMismatchException e){
           System.out.println("Your are try to entered Decimal Number");
       }
    }
}
