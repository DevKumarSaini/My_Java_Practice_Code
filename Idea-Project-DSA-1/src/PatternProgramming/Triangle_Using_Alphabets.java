package PatternProgramming;

public class Triangle_Using_Alphabets {
    public static void main(String[] args) {
//        int a =65;
        char ch= 'A';
        int i=1;
        int n=20;
        while (i<=n){
            int j=1;
            while (j<=n){
                System.out.print( ch+" ");
                j++;
            }
            System.out.println();
            ch++;
            i++;
        }
    }
}
