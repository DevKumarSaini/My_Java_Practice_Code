package ExceptionHandeling;
import java.util.InputMismatchException;
import  java.util.Scanner;
public class TestingFInallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("------------------Try Block---------------------------");
            System.out.println("1");
            System.out.println("Enter your input in number");
            int store =scanner.nextInt();
            System.out.println(5^4);
            anoterMethod();
        }catch (InputMismatchException ex){
            System.out.println("------------------------Catch Block-------------------------");
            System.out.println("2");
            ex.printStackTrace();
        }
        finally {
            System.out.println("-----------------Finally Block-------------------------");
            System.out.println("This will execute always");

        }
    }
   static private void anoterMethod(){
        System.out.println("------------------------another method-------------------------------");
        System.out.println("3");
        System.out.println();
    }
}
