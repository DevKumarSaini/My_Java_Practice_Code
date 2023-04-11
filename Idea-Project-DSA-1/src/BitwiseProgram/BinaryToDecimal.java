package BitwiseProgram;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Enter your Binary Number");
        long binary=scanner.nextLong();
        int i=0;
        long Decimal=0;
        while (binary!=0){
            long temp=binary%10;
            if(temp == 1){
                Decimal=(long)(Math.pow(2,i)+Decimal);
            }
            i++;
            binary=binary/10;
        }
        System.out.println("Your Decimal Value is "+Decimal);
    }}
}
