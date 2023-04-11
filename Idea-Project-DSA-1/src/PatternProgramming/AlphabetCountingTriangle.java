package PatternProgramming;

public class AlphabetCountingTriangle {
    public static void main(String[] args) {
        int n=7;
        int i=1;
        char ch ='A';
        while (i<n){
            int j=1;
            while (j<i){
                System.out.print(ch+" ");
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
