package PatternProgramming;

public class ABC_Printing {
    public static void main(String[] args) {
        int n=20;
        int i=0;
        char ch='A';
        while(i<n){
            int j=0;
            while (j<n){
//                int chh=ch+j;
                System.out.print((char) ch +" ");
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
