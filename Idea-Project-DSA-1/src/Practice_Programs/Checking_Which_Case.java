package Practice_Programs;

import java.util.Scanner;

public class Checking_Which_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("ENter your input");
            char ch = scanner.nextLine().charAt(0);
            int check = (int) ch;
            System.out.println("ASCII value -->  "+check);
            if (check > 96 && check < 128) {
                System.out.println("Lower case letter");
            } else if (check > 64 && check < 90) {
                System.out.println("Upper case Letter");
            } else if (check > 47 && check < 58) {
                System.out.println("Numeric Number between 0 to 9");
            } else {
                System.out.println("Symbols  -->  " + ch);
            }
            System.out.println();
        }while (true);
    }
}
