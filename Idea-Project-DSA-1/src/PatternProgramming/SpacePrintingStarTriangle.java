package PatternProgramming;

public class SpacePrintingStarTriangle {
    public static void main(String[] args) {
    int i=1;
    int n=10;
    while(i<n){
        int j=n-i;

        while (j>0){    // First while for printing spaces
            System.out.print(" ");
            j--;
        }
        int ii=1; // practice more times lacking spacing programs
            while (ii<=i){
            System.out.print("*");
            ii++;
        }

        System.out.println();
        i++;
    }
    }
}
