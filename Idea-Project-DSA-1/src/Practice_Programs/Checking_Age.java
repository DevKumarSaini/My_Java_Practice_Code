package Practice_Programs;

import java.util.Scanner;

public class Checking_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=scanner.nextInt();
        if(age >120){
            System.out.println("Invalid Input");
        }
        else if(age>50 && age<90){
            System.out.println("Your are old my Friend");
        } else if (age<20) {
            System.out.println("Your are Bachpan");
        } else if (age>90) {
            System.out.println("Your are extreme Old and yor legs in Kabar ");
        } else {
            System.out.println("You are Jawan and Tagda");
        }


    }
}
