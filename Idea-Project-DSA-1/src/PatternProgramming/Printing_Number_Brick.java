package PatternProgramming;

public class Printing_Number_Brick {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}
