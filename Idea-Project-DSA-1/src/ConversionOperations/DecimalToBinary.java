package ConversionOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {
    public static void main(String[] args) throws IOException {
        StringBuffer Sb = new StringBuffer(); // this is using for storing the Binary value in String

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number to see binary value of this");
        int input = Integer.parseInt(br.readLine());

        for(int i=0;i<=input;i++){
            System.out.println(i+"  ->  "+decimalToBinary(i));
        }

    }
    static public StringBuffer binaryToDecimal(StringBuffer sb){

        return null;
    }
   static public StringBuffer decimalToBinary(int input) {
        StringBuffer SB = new StringBuffer();
        while(input>0){
            int division=input/2;
            int remainder=input%2;
            SB.append(remainder);
            input=division;
        }
        return SB.reverse();
    }
}
