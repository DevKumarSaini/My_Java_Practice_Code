package Arrays_Programming;
import java.util.Scanner;
public class Adding_Element_Existing_Array {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
     System.out.println("Enter size of your array");
     int inp = scanner.nextShort();
     int [] firstArr= new int[inp+1];
     System.out.println("Enter elements in your array");
     for(int i=0;i<firstArr.length-1;i++){
         firstArr[i]=scanner.nextShort();
     }
        System.out.println("Enter the new element which your want to insert in your array");
        int newElement= scanner.nextShort();

        System.out.println("Enter the position of your new Array");
        int position= scanner.nextShort();

        // Updating task start   -------------------------------------   Check Another Day

        for(int i= firstArr.length;i>=0;i--){
            if(i >position){
                firstArr[inp]=firstArr[inp-1];
            }
            else if(i == position){
                firstArr[i]=newElement;
            }
            else {

//                firstArr[inp]=firstArr[inp];
            }
        }
        // Displaying your updated array
        for(int i=0;i< firstArr.length;i++){
            System.out.println(firstArr[i]);
        }
        System.out.println("Program complete Successfully !!!!!!!  ");
    }
}
