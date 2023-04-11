package LoopingPracticePrograms;
import java.util.Scanner;
public class Lenear_Star_Pattern {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x");
        short n =scanner.nextShort();

        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
