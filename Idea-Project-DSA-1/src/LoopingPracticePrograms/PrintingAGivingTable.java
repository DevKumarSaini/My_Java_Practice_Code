package LoopingPracticePrograms;

import java.util.Scanner;

public class PrintingAGivingTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do{
        System.out.println("Enter Number to print table");
        int inp=sc.nextShort();
        for(int i=1;i<=10;i++){
            System.out.println(inp+" x "+i+" = "+(inp*i));
        }}while (true);
    }
}
