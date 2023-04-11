package Array;
import java.util.Scanner;
public class Searching_in_Array {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter size of your array");
        int size = scanner.nextShort();
        int [] arr= new int[size];

        System.out.println("Enter Element in your array");
        for(int i=0;i< arr.length;i++){
            arr[i]=scanner.nextShort();
        }

        System.out.println("Enter you element which you want to search in an array");
        int search=scanner.nextShort();

        boolean check =false;
        int i;
        for( i=0;i<arr.length;i++){
            if(arr[i]==search){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Your element is "+arr[i]+"  found on index "+i);
        }
        else {
            System.out.println("No such element is found on your array");
        }



    }
}
