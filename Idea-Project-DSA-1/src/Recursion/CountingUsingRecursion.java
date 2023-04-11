package Recursion;

public class CountingUsingRecursion {
    public static void main(String[] args) {
    CountingUsingRecursion obj= new CountingUsingRecursion();
        System.out.println(obj.count(10));
        System.out.println(obj.factorial(7));
    }
    public int count(int a){
        if(a == 0){
            return 0;
        }
        System.out.println(count(a-1));
        return a;
    }
    public int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
