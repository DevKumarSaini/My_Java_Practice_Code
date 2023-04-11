package PatternProgramming;

public class PrintTable {
    public static void main(String[] args) {
        int n=200;
        int i=1;
        while(i<=n){
            int j=1;
            while (j<=n){
                System.out.print(" "+i*j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
