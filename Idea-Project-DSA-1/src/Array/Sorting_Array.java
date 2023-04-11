package Array;
import  java.util.Scanner;
public class Sorting_Array {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size of your array");
        int size = scanner.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter Element in your array");
        for(int i=0;i< arr.length;i++){
            arr[i]= scanner.nextInt();
        }
        // Checking array is sorted or not
        for(int i=0;i< arr.length;i++){
            int temp=arr[i];
//            if(arr[i]<)
        }

    }
}
