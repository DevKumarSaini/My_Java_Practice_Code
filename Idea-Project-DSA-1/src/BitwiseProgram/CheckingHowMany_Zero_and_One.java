package BitwiseProgram;

//import static java.math.BitSieve.bit;

import java.util.Scanner;

public class CheckingHowMany_Zero_and_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // -------------------------  Creating Object
        CheckingHowMany_Zero_and_One obj1= new CheckingHowMany_Zero_and_One();
        System.out.println("Enter your Decimal number");
        int input= scanner.nextInt();
        long binary = obj1.convertDecimalToBinary(input);
        System.out.println("Binary of  "+input+"  is -->  "+binary);
        obj1.checkingOnesAndZeros(binary);

    }
    public void checkingOnesAndZeros(long binary){

        int zero=0,one=0;
        while(binary>0){
            long temp=binary%10;
            if(temp == 1){
                one++;
            }
            else {
                zero++;
            }
            binary=binary/10;
        }
        System.out.println("Zero is --> "+zero);
        System.out.println("One  is --> "+one);
    }
    public long convertDecimalToBinary(long number){
        int i=0,ans=0;
        while (number !=0){
            long bit= number & 1;
            ans=(int)(bit*Math.pow(10,i)+ans);
            number=number>>1;
            i++;
        }
        return ans;
    }
}
