package Array;

import java.util.Scanner;

public class Array_Is_Sorted_or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Filling your Array");
        System.out.println("Row value");
        int row= scanner.nextInt();

        System.out.println("Column value");
        int col=scanner.nextInt();

        //Putting the value in our array
        System.out.println("Enter the elements in your array");
        int [][]arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                arr[i][j]= scanner.nextInt();
            }
        }

        Array_Is_Sorted_or_Not obj=new Array_Is_Sorted_or_Not();  // Creating the object of our class
        obj.SortingYourArray(arr); // passing the object in our class

    }
    void SortingYourArray(int arr[][]){
        System.out.println("Displaying Your array Before Sorting");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-1;j++){
                // Checking array is pre sorted or not
                if(arr[i][j]>arr[i][j+1]) {
                    System.out.println("Your Array is Pre sorted No Need for Sorting");
                }
                else {
                    arr[i][j] = arr[i][j + 1];
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Array After Sorting");
            for( i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
