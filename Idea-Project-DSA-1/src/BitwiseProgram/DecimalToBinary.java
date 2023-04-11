package BitwiseProgram;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
//        while (n!=0) {

            int bit = n >> 1;  // N Divide by 2
            System.out.print(bit);
//        }


    }
}
