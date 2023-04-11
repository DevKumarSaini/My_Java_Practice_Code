package Arrays_Programming;
import java.util.Scanner;
public class Array_Insertion_New_Array {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of your Array");
        int inp = scanner.nextShort();

        int []insertarray= new int [inp];  // Adding Elements to creating with new array

        System.out.println("Enter your elements in your array");
        for(int i=0;i< insertarray.length;i++){
            insertarray[i]=scanner.nextByte();
        }
        System.out.println("All keys is stored Successfully");
        System.out.println("Displaying your Whole array elements ");
        for(int i=0;i< insertarray.length;i++){
            System.out.println(insertarray[i]+"   -->  "+i);
        }
        System.out.println("Enter a new element which you want to add in array");
        int newElement=scanner.nextByte();

        int []secondArray = new int[inp+1];
        System.out.println("Enter position where you want to add your new element");
        int position=scanner.nextByte();

        for(int i=0;i<secondArray.length;i++){
            if(i < position ){
                secondArray[i]=insertarray[i];
            }
            else if(i==position){
                secondArray[i]=newElement;
            }
            else {
                secondArray[i]=insertarray[i-1];
            }
        }
        System.out.println("Array after updating a new Element");
        for(int i=0;i<secondArray.length;i++){
            System.out.print(secondArray[i]+" ");
        }

        System.out.println("Your Operation is Done !!!!! ");
        System.out.println("Program is Finish");

    }
}
