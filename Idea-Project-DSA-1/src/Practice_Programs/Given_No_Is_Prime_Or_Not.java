package Practice_Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Given_No_Is_Prime_Or_Not {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no to check Its Prime Or Not");
        int inp=Integer.parseInt(bufferedReader.readLine());
        for(int i=2;i<inp;i++){
            if(inp % i ==0){}
                System.out.println(inp+" not prime number");

//            else {
                System.out.println(inp + " Is Prime");
//            }
        }
    }
}
