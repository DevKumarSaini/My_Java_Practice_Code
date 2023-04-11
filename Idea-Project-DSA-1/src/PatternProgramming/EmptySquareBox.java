package PatternProgramming;

import java.util.Scanner;

public class EmptySquareBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you square size  \"Ex 30 will we (30*30) block\"");
        int n= scanner.nextInt();
//        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i==1 && j==1 || i>1 && j==1 ||i<=n && j==n || i==1 && j<n || i==n && j<n){
                   System.out.print("  *");
               }
               else {
                   System.out.print("   ");
               }
            }
            System.out.println("");
        }
    }
}
