package PatternProgramming;

public class CountingTrianglePrinting {
    public static void main(String[] args) {
        int i=0;
        int n=10;
        int count=0;
        while(i<n){
            int j=0;
            while(j<i){
                System.out.print(count+" ");
                j++;
                count ++;
            }
            System.out.println();

            i++;
        }
    }
}
