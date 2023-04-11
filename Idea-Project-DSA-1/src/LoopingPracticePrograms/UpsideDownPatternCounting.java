package LoopingPracticePrograms;

public class UpsideDownPatternCounting {
    public static void main(String[] args) {
        int i=1;
        int n=10;
        while (i<n){
            int j=1;
            while (j<=i){
                System.out.print(" "+" ");
                j++;
            }
            int k=1;
            while (k<n-i){
                System.out.print(n-k+1+" ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
