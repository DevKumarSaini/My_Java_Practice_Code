package Array;

import java.util.Scanner;

public class SortingAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]= new int[20];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*100);
        }
        System.out.println("Displaying Your array before sorting");
        for(int a: arr){
            System.out.print(a+" ");
        }
        // Sorting our Array
        boolean check=true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                check=false;
                int temp;
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("\nDisplaying your array after sorting");
        if(check){
            System.out.println("Your array is sorted");
        }
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
}
