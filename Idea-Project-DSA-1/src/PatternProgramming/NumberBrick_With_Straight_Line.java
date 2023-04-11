package PatternProgramming;

public class NumberBrick_With_Straight_Line {
    public static void main(String[] args) {
        int n=10;
//        for(int i=1;i<n;i++){
//            for(int j=1;j<n;j++){
//                System.out.print(" "+i+" ");
//            }
//            System.out.println();
//        }
        int i=1;
        while(i<n){ // This is for outer line rows
            int j=1;
            while(j<n){ // This is for column
                System.out.print(" "+i+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
