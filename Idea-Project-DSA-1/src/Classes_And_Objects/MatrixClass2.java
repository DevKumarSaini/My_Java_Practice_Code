package Classes_And_Objects;

import java.util.Scanner;

public class MatrixClass2 {
    /*
    The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices
     */
    int row,column;
    int Matrix2[][];
    MatrixClass2(int row, int column){
        this.row=row;
        this.column=column;
        Matrix2 = new int[row][column];
    }
    Scanner scanner = new Scanner(System.in);

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
    public void addingElements(){
        System.out.println("Adding initially elements in your array");
        for(int i=0;i<Matrix2.length;i++){
            for(int j=0;j<Matrix2.length;j++){
                Matrix2[i][j]= scanner.nextInt();
            }
        }
        System.out.println("\nDisplaying Elements in your array");
        for(int i=0;i<Matrix2.length;i++){
            for(int j=0;j<Matrix2.length;j++){
                System.out.print(Matrix2[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public void ModifyArrValue(){
        System.out.println("Enter your element Which you want to modify");
        int modify = scanner.nextInt();
        System.out.println("Enter element position row");
        int rowposition= scanner.nextInt();
        System.out.println("Enter element position col");
        int colposition= scanner.nextInt();

        aa:
        for(int i=0;i<Matrix2.length;i++){
            for(int j=0;j<Matrix2.length;j++){
                if(Matrix2[rowposition][colposition]==Matrix2[i][j]){
                    System.out.println("Your Element is found \nUpdating .....");
                    Matrix2[i][j]=modify;
                    break aa;
                }
            }
        }
        System.out.println("\nDisplay Updated Array Matrix");
        for(int i=0;i<Matrix2.length;i++){
            for(int j=0;j<Matrix2.length;j++){
                System.out.print(Matrix2[i][j]+"  ");
                }
            System.out.println();
            }
        }
        public void AddingMatrixes(){

        int copyMatrix [][]= new int[this.row][this.column];

            System.out.println("\nEnter Elements in second Matrix");
            for(int i=0;i<Matrix2.length;i++){
                for(int j=0;j<Matrix2.length;j++) {
                  copyMatrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Adding Both Matrix");
            for(int i=0;i<Matrix2.length;i++){
                for(int j=0;j<Matrix2.length;j++) {
                    System.out.print(Matrix2[i][j]+copyMatrix[i][j]+"  ");
                }
                System.out.println();
            }

            System.out.println("\nMultiply Both the Matrix");
            for(int i=0;i<Matrix2.length;i++){
                for(int j=0;j<Matrix2.length;j++) {
                    System.out.print(Matrix2[i][j]*copyMatrix[i][j]+"  ");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        MatrixClass2 ob = new MatrixClass2(5,5);
        System.out.println("\nRow of Matrix is       "+ob.getRow());
        System.out.println("Column of Matrix is    "+ob.getColumn());
        ob.addingElements();
        ob.ModifyArrValue();
        ob.AddingMatrixes();
    }
}
