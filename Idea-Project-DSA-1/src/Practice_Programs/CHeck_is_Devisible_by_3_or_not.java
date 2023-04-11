package Practice_Programs;

import java.util.Scanner;

public class CHeck_is_Devisible_by_3_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no to check its divisible by 3 or not");
        int inp=scanner.nextInt();
        if(inp % 3 == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }}
