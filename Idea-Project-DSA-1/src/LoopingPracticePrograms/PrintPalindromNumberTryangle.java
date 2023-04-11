package LoopingPracticePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintPalindromNumberTryangle {
    public static void main(String [] args) throws IOException {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your value on n");
        int n = Integer.parseInt(bufferedreader.readLine());
    int counter=1;
        for(int i=n;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(n-j);
            }
            for(int k=1;k<counter+1;k++){
                System.out.print(counter);
                counter +=1;

            }
            System.out.println();
        }
    }
}
