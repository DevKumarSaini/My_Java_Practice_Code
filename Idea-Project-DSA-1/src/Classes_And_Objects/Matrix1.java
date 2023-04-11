package Classes_And_Objects;

import java.util.Scanner;

public class Matrix1 {
/*
Create a class called 'Matrix' containing constructor that initializes the number
 of rows and number of columns of a new Matrix object.
  The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array
 */
    int testArr[][];
    int noofrow,noofcolumn;
    Matrix1(int noOfRows,int noOfColumn){
        testArr = new int[noOfColumn][noOfColumn];
        this.noofcolumn=noOfColumn;
        this.noofrow=noOfRows;
    }
    Scanner scanner = new Scanner(System.in);
    public void displayDetail(){
        System.out.println("Number of row in arr "+this.noofrow);
        System.out.println("Number of column in arr "+this.noofcolumn);
    }
    public void inputElement(){
        System.out.println("Input Element in your Array");
        for(int i=0;i< testArr.length;i++){
            for(int j=0;j< testArr.length;j++){
                testArr[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Insertion of All element is Done");
    }
    public void DisplayingYourArrayElements(){
        System.out.println("Displaying Your Array Element in Tabular Form");
        for(int i=0;i< testArr.length;i++){
            for(int j=0;j< testArr.length;j++){
                System.out.print(testArr[i][j]+"   ");
            }
            System.out.println("");
        }
    }
    public void findYourElement(){
        System.out.println("Enter your number which find in your array");
        int find= scanner.nextInt();
        // initializing loop for traversing array for searching number in it
        for(int i=0;i< testArr.length;i++){
            for(int j=0;j< testArr.length;j++){
                if(find== testArr[i][j]){
                    System.out.println("Finding Element is present in your array\n" +
                            "Element of your array is \n" +
                            testArr[i][j]+" Position on "+(i+1)+" row "+(j+1)+" column");
                }
            }
        }
    }
    public static void main(String [] args){
        Matrix1 array1 = new Matrix1(5,5);
        array1.displayDetail();
        array1.inputElement();
        array1.DisplayingYourArrayElements();
        array1.findYourElement();
    }
}
