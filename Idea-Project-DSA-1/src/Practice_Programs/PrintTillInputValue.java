package Practice_Programs;

import java.util.Scanner;

public class PrintTillInputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter your value where your want to print");
        double value = scanner.nextDouble();
        while (value>0){
            System.out.println(value);
            value --;
        }
        System.out.println("------- ***** Code Complete ***** -------");
    }
}
