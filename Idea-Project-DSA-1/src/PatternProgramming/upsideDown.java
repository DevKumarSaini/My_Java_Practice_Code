package PatternProgramming;

public class upsideDown {
    public static void main(String[] args) {
        int i=1;
        int n=10;
        while (i<n){
            int j=1;
            while (j<n-i){
                System.out.print("x"+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
