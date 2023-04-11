package Practice_Programs;

import PatternProgramming.breaktest;

public class CheckingMethods {
    public static void main(String[] args) {
        CheckingMethods obj = new CheckingMethods();
        System.out.println(obj.add(10,45)+" next "+(float)(obj.add(10,45)));
    }
        public int add(int a,int b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
}
