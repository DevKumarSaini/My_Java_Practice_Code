package LoopingPracticePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Halfpyramid_Upside_Down {
    public static void main(String [] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number to print Upside Down Pyramid");
        int n=Integer.parseInt(bufferedReader.readLine());

//        for(int i=inp;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //-----------------------------------------------------------------------------------------
//        int i=inp;
//        while (i>0){
//            int j=0;
//            while (j<i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i--;
//        }
        //------------------------------------------------------------------------------------------
//        for(int i=1;i<=n;i++){ // For outer Loop
//
//            // inner loop for printing spaces
//            for(int j=1;j<=n-i;j++) {
//                System.out.print(" ");
//            }
//            // inner loop for printing stars
//                for(int k=1;k<=i;k++){
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//            System.out.print(j);
//        }
//        System.out.println();
//    }

        for(int i=1;i<=n+1;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
