package ExceptionHandeling;

import java.io.FileInputStream;

public class TestingExceptionHandeling {
    public static void main(String[] args) {
//        try{
//            FileInputStream file = new FileInputStream("D:\testDemo");
//            System.out.println(file);
//        }
//        catch (Exception e){
////            e.printStackTrace();
//            System.out.println("File not found");
//        }
        Dividing_the_Value();
    }
    static private void Dividing_the_Value(){
        try {
            System.out.println("--------------------------------------------  Try Block");
            int a = 100, b = 0, c;
            System.out.println("Printing your value ");
            c = a / b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("--------------------------------------------  Catch Block");
            System.out.println("Your are try to Divide an invalid number\nDivision by 0 is not possible");
        }
        finally {
            System.out.println("--------------------------------------------  Finally Block Start");
            int a=100,b=2,c;
            c=a/b;
            System.out.println(c);
            System.out.println("--------------------------------------------  Finally Block End");
        }
    }
}
