package Array;

import java.util.Scanner;

public class Insertion_In_Array {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of your array");
        int size = scanner.nextShort();
        int [] arr = new int[size+1];

        System.out.println("Enter elements in your array");
        for(int i=0;i< arr.length-1;i++){
            arr[i]= scanner.nextShort();
        }
        System.out.println("Enter your element which your want to add in your array");
        int newElement= scanner.nextShort();
        System.out.println("Enter position where you want to add your array");
        int position= scanner.nextShort();


        // inserting element in our array     Completer Working Logic
       for(int i=size;i>=position;i--) {

           arr[i]=arr[i-1];
           if(i == position){
            arr[i]=newElement;
           }
       }

        //Displaying yor array
        for( int i=0;i< arr.length;i++){
            System.out.println("Element   -->   "+arr[i]+"  Indexing -->  "+i);
        }
    }
}
