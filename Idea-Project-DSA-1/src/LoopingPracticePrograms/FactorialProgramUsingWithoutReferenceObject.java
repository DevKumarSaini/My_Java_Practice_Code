package LoopingPracticePrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorialProgramUsingWithoutReferenceObject {

    void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println("Factorial of "+n+" is "+fact);
        }
    }
    void power(int n,int v){
        double store=Math.pow(n,v);
        System.out.println(store);
        }

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Number to get factorial");
        int input=Integer.parseInt(bufferedReader.readLine());
        System.out.println("\n Factorial Result");
        new FactorialProgramUsingWithoutReferenceObject().factorial(input);

        System.out.println("Power result of same number");
        System.out.println("Enter value of power ");
        int nextValue=Integer.parseInt(bufferedReader.readLine());
        new FactorialProgramUsingWithoutReferenceObject().power(input,nextValue);
    }
}
