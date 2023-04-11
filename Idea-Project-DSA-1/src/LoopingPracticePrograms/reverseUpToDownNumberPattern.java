package LoopingPracticePrograms;

public class reverseUpToDownNumberPattern {
    public static void main(String[] args) {

    int i=1;
    int n=10;
    while(i<=n){
        int j=1;
        while (j<=i){
            System.out.print(" "+" ");
            j++;
        }
        int k=1;
        while(k<n-i+1){
            System.out.print(i+" ");
            k++;
        }
        System.out.println();
        i++;
    }
}
}
