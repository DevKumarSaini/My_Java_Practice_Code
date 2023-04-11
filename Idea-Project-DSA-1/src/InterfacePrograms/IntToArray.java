package InterfacePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface IntToArray {
void takeUserInput() throws IOException ;
void IntToSum(int input) throws IOException;
//void FillingArrayWithInteger(int [] arrr);
}
class Deekho implements IntToArray {
    int input,count=0;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void takeUserInput() throws IOException{  //This method is takign user input
        System.out.println("Enter your Number");
        this.input=Integer.parseInt(bufferedReader.readLine());
        IntToSum(input);
    }
    public void IntToSum(int input){
        int [ ] arr = new int[7];
    int sum=0,temp;
    while(input>0){
        temp=input%10;
        arr[count]=temp;  // Initializing the value in array
        count++;
        sum=sum+temp;
        input=input/10;
    }
        System.out.println("Number represent in array \n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" + ");
        }
        System.out.print(" = "+sum);
    }

}
class perform{
    public static void main(String[] args) throws IOException{
        Deekho obj= new Deekho();
        obj.takeUserInput();

    }
}
