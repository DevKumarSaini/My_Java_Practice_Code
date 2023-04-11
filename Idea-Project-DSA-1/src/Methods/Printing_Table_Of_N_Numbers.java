package Methods;

import Recursion.PrintFIboNachiSeriesUsingRecursion;

public class Printing_Table_Of_N_Numbers {
    public static void main(String[] args) {
        Printing_Table_Of_N_Numbers obj=new Printing_Table_Of_N_Numbers();
        obj.print_N_Table(45,20);
    }
    void print_N_Table(int table,int SizeOf){
        int i=1;
        while (i<=SizeOf){
            System.out.println(table+" x "+i+" = "+(table*i));
            i++;
        }
    }
}
