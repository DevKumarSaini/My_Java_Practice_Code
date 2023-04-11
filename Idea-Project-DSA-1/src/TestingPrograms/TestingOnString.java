package TestingPrograms;

import java.util.StringTokenizer;

public class TestingOnString {
    public static void main(String [] args){
        TestingOnString obj = new TestingOnString();
        int total=0,n=1000;

        for(int i=0;i<=n;i++){
        total=obj.sum(i);
    }
        System.out.println("Sum of "+n+" is "+total);

        obj.actualSum(n);

    }
    int sum=0;
    private int sum(int sum){
        return this.sum=this.sum+sum;
    }
    private void actualSum(int number){
        int sum=0;
        for(int i=0;i<=number;i++){
            sum=sum+i;
        }
        System.out.println("Actual sum is "+sum);
    }
}
