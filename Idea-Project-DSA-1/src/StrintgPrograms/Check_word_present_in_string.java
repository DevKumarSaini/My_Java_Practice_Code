package StrintgPrograms;

import java.util.StringTokenizer;

public class Check_word_present_in_string {
    public static void main(String[] args) {
        String check="this is Orange juice and i love to drink ir";

        System.out.println(check.contains("Orange"));
        if(check.contains("Orange")){
            System.out.println("Your element is fount");
        }
    }
}
