import java.util.Scanner;

public class Conditional_Programmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A");
        short inp1=scanner.nextShort();
        System.out.println("Enter the value of B");
        short inp2=scanner.nextShort();
        if(inp1>inp2){
            System.out.println(inp1+" is greater");
        }
        else if(inp2>inp1){
            System.out.println(inp2+" is greater");
        }
        else {
            System.out.println(inp1+ " is equal to "+inp2);
        }
    }
}
