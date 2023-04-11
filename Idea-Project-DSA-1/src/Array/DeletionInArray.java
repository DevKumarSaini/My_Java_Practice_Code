package Array;

import java.util.Scanner;

public class DeletionInArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size of your Array");
        int size= scanner.nextShort();
        int [] arr=new int[size];
        System.out.println("Enter element of your Array");
        for(int i=0;i< arr.length;i++){
            arr[i]=scanner.nextShort();
        }
        System.out.println("Enter your element which you want to Delete");
        short element=scanner.nextShort();

        int [] newarr = new int[size];
        for(int i=0;i< arr.length;i++){
            if(newarr[i]==element){
                continue;
            }
            newarr[i]=arr[i];
        }
        for(int i=0;i< newarr.length;i++){

            System.out.println(arr[i]);
        }
    }
}
