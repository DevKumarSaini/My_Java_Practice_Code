package LoopingPracticePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GivenNumberIsPrimeOrNot {
    public static void main(String [] args)  {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int i=2;
        while (i<n){
            if(n%i==0){
                System.out.println("Not Prime");
            }
            i++;
        }
    }
}
