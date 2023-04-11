package PatternProgramming;

import java.util.Scanner;

public class RightTriangleDepandUponI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int i = 1;
        while (i <= n) {// for rows
            int j = 1;
            int count = i;
            while (j <= i) {// for column
                System.out.print(count + " ");
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
