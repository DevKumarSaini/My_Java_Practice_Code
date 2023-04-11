package ExceptionHandeling;

public class PrintingExceptionMessage {
    public static void main(String[] args) {
        try{
            int a =10,b=2,c;
            c=a/b;
            System.out.println(c);
           show();
        }catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e);
//            System.out.println(e.toString());  // both method can print exception name and Description of exception
            System.out.println(e.getMessage());  // this method can print only Description of the exception
        }
        finally {
            System.out.println("Soo ja Bhai");
        }
    }
    static public void show(){
        int c =12/0;
        System.out.println(c);
        System.out.println("This is show block calling before finally block");
    }
}
