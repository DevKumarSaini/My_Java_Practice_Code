package Array;

import java.util.Scanner;
public class Mearging_In_Array {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of your element");
        int size = scanner.nextInt();

        int [] arr= new int[size];

        System.out.println("Enter element in your array");
        for(int i=0;i< arr.length;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println("Enter your element which your want update in you array");
        int update= scanner.nextInt();
        System.out.println("Enter position of your element where you want to update");
        int position = scanner.nextInt();

        for(int i=0;i<arr.length;i++){
            if(i==position){
                arr[i]=update;
                break;
            }
        }
        System.out.println("Displaying of your array");
        for(int i=0;i< arr.length;i++){
            System.out.println("index  -->  "+i+"   Element   -->   "+arr[i]);
        }
    }
}
