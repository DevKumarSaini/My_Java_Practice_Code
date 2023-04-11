package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddingTwoMatrixes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Define Size of your array");

        System.out.println("Row  ");
        int row= scanner.nextInt();

        System.out.println("Col");
        int col= scanner.nextInt();

        int [][] Arr= new int[row][col];
        System.out.println("Fill First matrix");
        for(int i=0;i<Arr.length;i++){
            for (int j=0;j<Arr.length;j++){
                Arr[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Filling Second Matrix");
        int Arr2[][] = new int[row][col];
        for(int i=0;i< Arr2.length;i++){
            for(int j=0;j< Arr2.length;j++){
                Arr2[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Adding Both Matrix");
        int [][]Arr3=new int[row][col];
        for(int i=0;i< Arr3.length;i++){
            for(int j=0;j< Arr3.length;j++){
                Arr3[i][j]=Arr[i][j]+Arr2[i][j];
            }
        }

        // Displaying
        for(int i=0;i< Arr3.length;i++) {
            for (int j = 0; j < Arr3.length; j++) {
                System.out.print(Arr3[i][j]+" ");
            }
            System.out.println();
        }
        }
}
