package Recursion;

public class PrintFIboNachiSeriesUsingRecursion {
    public static void main(String []args){
        PrintFIboNachiSeriesUsingRecursion obj= new PrintFIboNachiSeriesUsingRecursion();
        obj.Fibonachi(15);
    }
    int Fibonachi(int value){
        int a=0, b=1;
        if(value == 0) {
            return a;
        }
        a=a+b;
        value=a;
        System.out.println(value);
        return Fibonachi(value - 1);
    }
}
