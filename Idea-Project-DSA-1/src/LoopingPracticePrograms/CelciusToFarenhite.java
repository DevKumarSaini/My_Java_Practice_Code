package LoopingPracticePrograms;

public class CelciusToFarenhite {
    public static void main(String[] args) {
        System.out.println("Table to show 1 to 100 Degree Celsius to Fahrenheit");
        float i=1;
        System.out.println("Celsius  -->  Fahrenheit");
        while(i<=100){
            System.out.println(i+"  -->  "+((i*1.8)+32));
            i++;
        }
    }
}
