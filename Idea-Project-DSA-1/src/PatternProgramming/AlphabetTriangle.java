package PatternProgramming;

public class AlphabetTriangle{
    public static void main(String[] args) {
        int n=10;
        int i=1;
        char ch ='A';
        while(i<=n){
            int j=1;
            while (j<=i){
                System.out.print(ch+" ");
                j++;
            }
            ch++;
            System.out.println();
            i++;
        }
    }
}
