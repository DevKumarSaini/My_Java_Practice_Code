package DSA_Questions;

import java.util.Scanner;

public class getsOneceComplement {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter your number");
//        int bin= scanner.nextInt();
//        int complement=0;
//        while (bin!=0){
//            int tempVariavle=bin%10;
//            int result=~tempVariavle;
//            complement=(result*10)+complement;
//            bin=bin>>1;
//        }
//        System.out.println(complement);
//        System.out.println(~101);
//       ------------------------[[ Brute force technique ]] -------------------
//        StringBuffer stringBuffer = new StringBuffer();
//        StringBuffer sb = new StringBuffer("");
//        while(bin!=0){
//            int temp= bin%10;
//            if(temp == 0){
//                sb.append("1");
//            }
//            else {
//                sb.append("0");
//            }
//            bin=bin/10;
//        }
//        System.out.println("Normal Binary --> "+);
//        System.out.println(sb);

        System.out.println(onceComplement(5));
    }
    static int onceComplement(int x){
        int inp=x;
        int mask=0; // this is inverse of original number
        // Exception Case if provided 0 then it will return one
        if(inp == 0){
            return 1;
        }
        while (inp !=0){
            mask=(mask<<1)|1;  /* right shift can add one digit into mask and
            | (operator) turns ones into ones for and to original number*/
            inp=inp>>1; /* this will remove all digits until all left to zeros */
        }
        int ans =(~inp)&mask;  // this mask will add to our natural number and gives once
        // complement number
        return ans;
    }
}
