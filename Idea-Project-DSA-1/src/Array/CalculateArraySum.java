package Array;

import java.util.Scanner;

public class CalculateArraySum {
    public static void main(String[] args) {
        float [] arr= new float[5];
        System.out.println("Enter your array elements");
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while(i< arr.length){
            arr[i]=scanner.nextFloat();
            i++;
        }
        for( i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Sum of your array is");
        float sum=0;
        for(i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of your array is");
        System.out.println(sum);

    }
}
