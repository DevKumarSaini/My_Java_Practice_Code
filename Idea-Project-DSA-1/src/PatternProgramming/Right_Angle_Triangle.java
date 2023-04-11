package PatternProgramming;

public class Right_Angle_Triangle {
    public static void main(String [] args){
        int n=10;
        int i=0;
        while(i<n){
            int j=0;
            while (j<i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
