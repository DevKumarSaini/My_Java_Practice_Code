package Array;

import java.util.Scanner;

public class FindMazimul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindMazimul obj = new FindMazimul();
        int arr[][] = new int[3][3];
        System.out.println("Filling Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        obj.findMaximum(arr);
        obj.minimumValue(arr);
        //-----------------------------------------------

    }
    void findMaximum(int [][]arr){
        int max=0;
        int i=0;
        while(i<arr.length){
            int j=0;
            while (j< arr.length){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
                j++;
            }
            i++;
        }
        System.out.println("Highest Element Found !!!");
        System.out.println(max);
    }
    void minimumValue(int arr[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Minimum Value is found !!!");
        System.out.println(min);
    }
}
