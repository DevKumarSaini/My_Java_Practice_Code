package PatternProgramming;

public class StarPattern_RightAngleTriangle {
    public static void main(String[] args) {
        int i=0;
        int n=10;
        while (i<n){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
