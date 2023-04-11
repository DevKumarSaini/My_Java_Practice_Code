package PatternProgramming;

public class Printing_X_With_Leftside {
    public static void main(String[] args) {
        int i =0;
        int n=10;
        while(i<n) { // first loop
            int j=0;

            while (j<i){ // second loop for printing spaces
                System.out.print(" "+" ");
                j++;
            }
            int k=n;// third loop for printing x
            while (k>i){
                System.out.print("x"+" ");
                k--;
            }

            System.out.println();
            i++;
        }
        }}
