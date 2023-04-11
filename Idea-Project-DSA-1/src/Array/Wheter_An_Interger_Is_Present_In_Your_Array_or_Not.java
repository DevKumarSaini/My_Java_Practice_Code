package Array;

import java.util.Scanner;

public class Wheter_An_Interger_Is_Present_In_Your_Array_or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define Size of your array");
        System.out.println("Row  ");
        int row= scanner.nextInt();
        System.out.println("Col");
        int col= scanner.nextInt();
        System.out.println("Enter element");
        int[][] Mat = new int[row][col];
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat.length; j++) {
                Mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter your element to find in an array");
        int element = scanner.nextInt();
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat.length; j++) {
                if (element == Mat[i][j]) {
                    System.out.println("Your element is found  " + Mat[i][i]);
                    System.out.println("Position of your Element is " + " Row " + i + " Column " + j);
                }
            }
        }
    }}
