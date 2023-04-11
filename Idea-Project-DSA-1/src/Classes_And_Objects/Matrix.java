package Classes_And_Objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Matrix {
    /*Create a class called 'Matrix' containing constructor that initializes the number of
    rows and number of columns of a new Matrix object. The Matrix class has the following information:
    1. number of rows of matrix
    2. number of columns of matrix
    3. elements of matrix in the form of 2D array

    The Matrix class has methods for each of the following:
    1 - get the number of rows
    2 - get the number of columns
    3 - set the elements of the matrix at given position (i,j)
    4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
    5 - multiplying the two matrices
     */
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int row;
    int columns;
     int [][] Matrix = new int[this.row][this.columns];  // Class level array  // As A type of static array

    Matrix(){}


    // Constructor Time
    Matrix(int row,int columns){
        this.row=row;
        this.columns=columns;
    }

    //----------------------------------------------------------------------------------------  Adding Elements in An Array
    public void FillingArray_ByUser()throws IOException {  // object method is always created with class name and have one parameterized object

        int row= this.row;
        int col= this.columns;

        if(Matrix == null){
            System.out.println("Go And First Define Array Row Value and Array Column Value");
        }
        else {

        System.out.println("Enter your Elements in your Array");
        int [][] Matrix = new int[this.row][this.columns];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                this.Matrix[i][j]=Integer.parseInt(bufferedReader.readLine());
            }
        }

        System.out.println("\nDisplaying Array ");
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix.length;j++){
                System.out.print(Matrix [i][j]+"  ");
            }
        }}
    }
    //-------------------------------------------------------------------------------------------  Display Row and Column
    // Displaying the Row And Column of an Array
    public void DisplayRowAndColumn(Matrix Obj){
        System.out.println("Number of Row in Array is "+Obj.row);
        System.out.println("Number of Column in Array is "+Obj.columns);
    }
    //------------------------------------------------------------------------------------------- Set Size of Row & Column
    // Adding Size of Row and Column in our Array
    public Object Adding_Elements(Matrix Obj)throws  IOException{
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of Row of and Array");
        this.row=Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter the number of Column of an Array");
        this.columns=Integer.parseInt(bufferedReader.readLine());
        return Obj;
    }
    //-------------------------------------------------------------------------------------------
    public int Adding_Two_Matrix()throws IOException{
        // This is class level Array matrix
        if(Matrix == null){
            System.out.println("Your Prime Array is Empty");
            return 0;
        }
        System.out.println("Displaying the First 2D-Array");
        int i=0;
        for( i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix.length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
        }

        // Adding Elements in second array
        int [][]Matrix2 = new int[this.row][this.columns];
        System.out.println("Enter the Elements of second Array");
        for ( i=0;i<Matrix2.length;i++);{
            for (int j=0;j<Matrix2.length;j++){
                Matrix2[i][j]=Integer.parseInt(bufferedReader.readLine());
            }
        }
        // Displaying Element is Second array
        for ( i=0;i<Matrix2.length;i++);{
            for (int j=0;j<Matrix2.length;j++){
                System.out.print(Matrix2[i][j]+" ");
            }
        }

        // Adding Both Matrix
        int [][] Matrix3 = new int[this.row][this.columns];
        for(i=0;i<Matrix3.length;i++){
            for(int j=0;j<Matrix3.length;j++){
                Matrix3[i][j]=Matrix2[i][j]+Matrix[i][j];
            }
        }

        //Displaying the Added matrix
        for(i=0;i<Matrix3.length;i++){
            for (int j=0;j<Matrix3.length;j++){
                System.out.print(Matrix3[i][j]+" ");
            }
        }
        return 0;
    }
    //------------------------------------------------------------------------------
    public void Multiplying_Matrix() throws IOException{
        // Displaying the primary Array
        int i,j;
        for (i=0;i<Matrix.length;i++){
            for(j=0;j<Matrix.length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
        }
        // Adding element in new Array
        int [][]takeInp = new int[this.row][this.columns];
        for(i=0;i<takeInp.length;i++){
            for (j=0;j<takeInp.length;j++){
                takeInp[i][j]=Integer.parseInt(bufferedReader.readLine());
            }
        }
        // Displaying the Added Array Element
        for(i=0;i<takeInp.length;i++){
            for (j=0;j<takeInp.length;j++){
                System.out.print(takeInp[i][j]+" ");
            }
        }

        //Multiplying the Both Matrix
        int [][] MultiplicationMatrix = new int[this.row][this.columns];
        for (i=0;i<MultiplicationMatrix.length;i++){
            for(j=0;j<MultiplicationMatrix.length;j++){
                MultiplicationMatrix[i][j]=Matrix[i][j]*takeInp[i][j];
            }
        }
        // Displaying Multiply Array
        for(i=0;i<MultiplicationMatrix.length;i++){
            for (j=0;j<MultiplicationMatrix.length;j++){
                System.out.print(MultiplicationMatrix[i][j]+" ");
            }
        }

    }
}

class Performing{
    public static void main(String [] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        Matrix Obj= new Matrix();   // All the Operations is performing on this object
        int check=0;
        do{
            System.out.println("Chose Option Which your Want to perform\n" +
                    "\n1 Enter The Value of Rows And Column"+
                    "\n2 Get the no Of Rows & Columns" +
                    "\n3 Set the Elements of the at Given Position (Adding Elements) " +
                    "\n4 Adding Two Matrix " +
                    "\n5 Multiplying the Two matrix");

            int localInput=Integer.parseInt(bufferedReader.readLine());
            switch (localInput){
                case 1 -> Obj.Adding_Elements(Obj);             //     1 Enter The Value of Rows And Column
                case 2 -> Obj.DisplayRowAndColumn(Obj);         //     2 Get the no Of Rows & Columns
                case 3 -> Obj.FillingArray_ByUser();         //     3 3 Set the Elements of the at Given Position (Adding Elements)
                case 4 -> Obj.Adding_Two_Matrix();              //     4 4 Adding Two Matrix
                case 5 -> Obj.Multiplying_Matrix();             //     5 5 Multiplying the Two matrix
                default -> System.out.println("Invalid Option ");
            }

            System.out.println("Are you want to continue the program " +
                    "\n         Yes   --->   Press 1" +
                    "\n         No    --->   Press 2");
            check = Integer.parseInt(bufferedReader.readLine());
        }while(check == 1);
    }
}
