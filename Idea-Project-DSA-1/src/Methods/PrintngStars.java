package Methods;

public class PrintngStars {
    public static void main(String[] args) {
        PrintngStars obj= new PrintngStars();
        obj.Print_Matrix(5);
    }
    void Print_Matrix(int x){
        int i=1;
        while(i<=x){
            int j=1;
            while (j<=i){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
