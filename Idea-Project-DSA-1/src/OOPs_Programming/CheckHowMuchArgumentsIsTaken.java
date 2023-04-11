package OOPs_Programming;

import java.util.Scanner;

public class CheckHowMuchArgumentsIsTaken {
    public void CheckNoOF(int ...arg){
        int check=arg.length;
//        System.out.println("Length of your argument is "+check);
//        System.out.println("Your input argument list is ");
        for(int i=0;i<arg.length;i++){
            System.out.println(arg[i]);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much arguments would you want to pass in a method");
        int quantity = scanner.nextInt();
        CheckHowMuchArgumentsIsTaken obj1 =new CheckHowMuchArgumentsIsTaken();
        System.out.println("Enter you arguments");
        int [] takingArgs = new int[quantity];

        // Taking Input from user
        for(int i=0;i<takingArgs.length;i++){
                takingArgs[i]= scanner.nextInt();
        }
        System.out.println("Length of your argument is "+quantity);
        System.out.println("Your Argument list is ");
        for(int i=0;i<takingArgs.length;i++){
            obj1.CheckNoOF(takingArgs[i]);
        }

    }
}
