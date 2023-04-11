package BitwiseProgram;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Long.toBinaryString;

public class TestingTest {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
//        for(int i=0,j=1000,k=0;i<=1000 && j>=0;i++,j--,k++){
//            System.out.println("i = "+i+"     ||      "+"j = "+j+"      ||      "+"k = "+k*i);
//        }
//        int fibo=0;
//        int nextnumber=1,result=0;
//        for(int i=0; i<20;i++){
//            System.out.println(fibo);
//            result =fibo+nextnumber;
//            fibo=nextnumber;
//            nextnumber=result;
//        }
//        int input=scanner.nextInt();
//        boolean b=false;
//
//        for(int i=2;i<input;i++){
//            if(input % i == 0){
//                b=true;
//                break;
//            }
//    }
//        if(!b){
//            System.out.println(input+" is prime number");
//        }
//        else {
//            System.out.println(input+" is not a prime number");
//        }

//        for(int i=0;i<=10;i++){
//            System.out.println("----------------"+"Grand Loop --> "+i);
//            System.out.println("----------------"+"==============>");
//            for(int j=0;j<=i;j++){
//                System.out.println("Loop --> "+j);
//            }
//        }
        int input= scanner.nextInt();
//        int sum=0,product=1;
//        while(input>0) {
//        int temp=input%10;
//        sum=sum+temp;
//        product=product*temp;
//        input=input/10;
//        }
//        System.out.println("Sum  =  "+sum);
//        System.out.println("Product  =  "+product);
        // Method One ----------------- 1
//        long bin=Integer.parseInt(toBinaryString(input));
//        System.out.println(bin);
//        int i=0,count=0;
//        while (bin>0){
//            long temp=0;
//            temp=bin%10;
//            if(temp == 1){
//                count++;
//            }
//            bin=bin/10;
//        }
//        System.out.println("Total number of bits is "+count);
        // Method  ----------------------- 2
//        int count=0;
//        while (bin!=0){
//            if((bin & 1) == 1){
////                System.out.println("true");
//            }
//            bin=bin>>1;
//            System.out.println(bin);
//        }

//        System.out.println(Integer.toBinaryString(input));
//        System.out.println(Integer.bitCount(input));
//        int combineNo=0;
//        for(int i=0; i<input;i++){
//            int num = scanner.nextInt();
//            int ans=0;
//            ans=(ans*10)+num;
//            combineNo=ans;
//        }
//        System.out.println("Combine No is  ->  "+combineNo);

        // Convert decimal into bit-------------------------------------

//    int ans=0;
//    int i=0;
//    while(input != 0){
//        int bit = input & 1;
//        ans = (int) (bit * Math.pow(10,i))+ans;
//        input=input>>1;
//        i++;
//    }
//        System.out.println(ans);

        //-----------------------------------------------------------------------------------------
        int ans=0;
        int i=0;
        while(input !=0){
            System.out.println(input);
            int bit=input & 1;
            ans=(int)(bit*Math.pow(10,i)+ans);
            input=input>>1;
            i++;
        }
        System.out.println(ans);

        //-----------------------------------------------------------------------------------------
//        System.out.println("Normal Flow");
//            int onceCOmplement = ~input;
////        System.out.println(onceCOmplement);
//            int towsComplement = onceCOmplement + 1 ;
////        System.out.println(towsComplement);
//        int i=0;
//        int ans=0;
//        while (towsComplement != 0){
//            int bit = towsComplement & 1;
//            ans=(int) (bit*Math.pow(10,i)+ans);
//            towsComplement = towsComplement>>1;
//            i++;
//        }
//        System.out.println("Binary Representation Of negative no is "+ans);
//  -----------------------=========================[[[[[[[[[[[[[[[
//        int ans=0;
//        while(input>0){
//            int take= scanner.nextInt();
//            ans=(ans*10)+take;
//            input--;
//        }
//        System.out.println(ans);
//  -----------------------=========================[[[[[[[[[[[[[[[
//        int i=0;
//        int ans=0;
//        while (input>0){
//            int take= scanner.nextInt();
//            ans=(int)(take*Math.pow(10,i)+ans);
//            input--;
//            i++;
//        }
//        System.out.println(ans);
//        [[[[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
//        int binary=Integer.parseInt(toBinaryString(input));
//        System.out.println("Binary value of "+input+" is "+binary);
//        int zero=0,one=1;
//        while (binary != 0){
//            System.out.println(binary);
//            if((binary & 1) == 1){
//                one++;
//            }
//            else {
//                zero++;
//            }
//            binary=binary>>1;
//        }
//        System.out.println("Ones  ==> "+one);
//        System.out.println("Zero  ==> "+zero);

    }}
