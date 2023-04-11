package Array;

public class Jagged_Array {
    public static void main(String[] args) {
        int [][]jaggedArr = new int[10][10];


        // Filling jagged array
        for(int i=0;i< jaggedArr.length;i++){
            for(int j=0;j< jaggedArr.length;j++){
                jaggedArr[i][j]=(int)(Math.random()*100);
            }
        }

        // Displaying our jagged array array
        for(int i=0;i< jaggedArr.length;i++){
            for(int j=0;j< jaggedArr.length;j++){
                System.out.print(jaggedArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
