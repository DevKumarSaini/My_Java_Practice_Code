package LoopingPracticePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sumof_N_numbers {
    public static void main(String [] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number which you want to take input");
        int input=Integer.parseInt(bufferedReader.readLine());
        int i=1;
        int sum=0;
        while(i<=input){
            if(i%2==0){
                sum +=i;
                System.out.println("Sum --> "+i+" "+sum);
            }

            i++;
        }
    }
}
