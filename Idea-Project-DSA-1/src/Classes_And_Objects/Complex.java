package Classes_And_Objects;

public class Complex {
    /*
    Print the sum, difference and product of two complex numbers by creating
    a class named 'Complex' with separate methods for each operation whose real
    and imaginary parts are entered by user.
     */
    private int number1,number2;
    Complex(int number1,int number2){
        this.number1=number1;
        this.number2=number2;
    }
    private int sum(){
        return number1+number2;
    }
    private int difference(){
        return number1-number2;
    }
    private void Product(int input){
        int product=1;
        int temp;
        System.out.println("Product of "+input+" is ...");
        System.out.print(input+" = ");
        while(input>0){
            temp=input%10;
            product=product*temp;
            System.out.print(temp+" * ");
            input=input/10;
        }
        System.out.println(" -> "+product);
    }

    public static void main(String[] args) {
        Complex complex= new Complex(12,30);
        System.out.println("Sum of "+complex.number1+"+"+complex.number2+" is"+" "+complex.sum());
        System.out.println("difference of "+complex.number1+"-"+complex.number2+" is"+" "+complex.difference());
        complex.Product(2348);

    }
}
