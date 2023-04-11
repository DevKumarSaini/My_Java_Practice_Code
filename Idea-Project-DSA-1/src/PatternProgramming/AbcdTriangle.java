package PatternProgramming;

public class AbcdTriangle {
    public static void main(String[] args) {
        int i=1;
        int n=10;
        char ch = 'A';
        while(i<=n){
            int j=1;
            int start=ch+n-i;
            while (j<=i){
                int cove=ch+j;
//                System.out.print((char) cove+" ");
                System.out.print((char)start+" ");
                j++;
                start++;
            }
            System.out.println();
            i++;
        }
    }
}
