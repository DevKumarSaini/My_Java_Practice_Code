package PatternProgramming;

public class ReversePattern {
    public static void main(String[] args) {
        int i=1;
        int n=10;
        while(i<=n){
            int j=1;
            while (j<=i){
                System.out.print(i-j+1+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
