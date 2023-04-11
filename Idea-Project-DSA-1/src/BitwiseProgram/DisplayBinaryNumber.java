package BitwiseProgram;

import java.util.Scanner;

public class DisplayBinaryNumber {
    public static void main(String[] args) {
        int i=1;
//        while (i<=2){
//            System.out.println(i+" >-->  "+Integer.toBinaryString(i));
//            i++;
//        }
        int n=485453;
        int ramainder;
        int store=0;
        while (n!=0){
            ramainder=n%10;
//            System.out.print(ramainder);
            n=n/10;
            System.out.println("10 / "+n+"  ->  "+ramainder);
            store=n;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number to get the power of it ");
        int num=scanner.nextInt();

//        System.out.println(store);
    }
}
