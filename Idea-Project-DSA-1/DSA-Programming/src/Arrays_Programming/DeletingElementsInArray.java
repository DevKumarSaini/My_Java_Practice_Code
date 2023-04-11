package Arrays_Programming;
import java.util.Scanner;
public class DeletingElementsInArray{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of your Array");
        int size=scanner.nextShort();
        int []newarray= new int[size];

        System.out.println("Enter Element of your array");
        for(int i=0;i< newarray.length;i++){
            newarray[i]=scanner.nextShort();
        }
        //Displaying our array elements
        for(int i=0;i<newarray.length;i++){
            System.out.println(newarray[i]+"   -->  "+i);
        }

        System.out.println("Enter position of your element which you want to delete");
        int position=scanner.nextShort();

        //Deleting Elements
        for(int i=0;i<=newarray.length;i++){

            if(position >= i){
                newarray[i]=newarray[i+1];
            }
//            else if(newarray[i]=)
        }

        // Displaying array elements
        for(int i=0;i<newarray.length;i++){
            System.out.println(newarray[i]);
        }
    }

}