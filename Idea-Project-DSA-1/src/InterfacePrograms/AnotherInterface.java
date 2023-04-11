package InterfacePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Math {
    int sumOfGivenInteger(int inp);
    void takeUserImput() throws IOException;   // this is the way to handle IOException in interface
}
public class AnotherInterface implements Math {

    int userInput1,userInput2;
    @Override
    public int sumOfGivenInteger(int inp) {
        int sum=0,temp;
        while (inp>0){
            temp=inp%10;
            sum=sum+temp;
            inp=inp/10;
        }
        return sum;
    }

    @Override
    public void takeUserImput() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your integer number");
        this.userInput1=Integer.parseInt(bufferedReader.readLine());
    }

    public static void main(String[] args) throws IOException{
        AnotherInterface obj=new AnotherInterface();
        obj.takeUserImput();
        int HoldingValue=obj.sumOfGivenInteger(obj.userInput1);
        System.out.println("Your input integer total is "+HoldingValue);

    }

}

