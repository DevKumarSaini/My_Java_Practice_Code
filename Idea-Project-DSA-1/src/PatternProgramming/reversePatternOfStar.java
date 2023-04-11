package PatternProgramming;

public class reversePatternOfStar {
    public static void main(String[] args) {
        int i=1;
        int n=10;
        while (i<=n){
            int j=1;
            while (j<=i){
                System.out.print(" "+" ");
                j++;
            }
            int k=n;
            while (k>i){
                System.out.print(i+" ");
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
