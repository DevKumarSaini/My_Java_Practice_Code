package Classes_And_Objects;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no for ASCII");
        char ch=scanner.next().charAt(0);
        System.out.println((int) ch);
    }
}
