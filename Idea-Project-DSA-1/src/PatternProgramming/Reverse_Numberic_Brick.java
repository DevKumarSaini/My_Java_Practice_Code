package PatternProgramming;

public class Reverse_Numberic_Brick {
    public static void main(String[] args) {
        int n=10;
//        for(int i=1; i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(" "+(n-j+1)+" "); // n=10 - j=1 + 1
//            }
//            System.out.println();
//        }
        int i=1;
        while(i<n){
            int j=1;
            while(j<n){
                System.out.print(" "+(n-j+1)+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
