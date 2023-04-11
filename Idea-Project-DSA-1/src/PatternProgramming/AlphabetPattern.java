package PatternProgramming;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
    int i=0;
        while (i<5){
            char ch='A';
            int j=0;
        while (j<5){
            int ab=ch+i;
            System.out.print((char) ab+" ");
            ch++;
            j++;
        }
        System.out.println();
        i++;
    }

    }
}
