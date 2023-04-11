package typePromotionSimpleProgram;

import java.lang.reflect.Type;
class oggy{
    protected void havingChill(int a,int b){
        System.out.println("Oggy Method "+a+"  "+b);
    }
}
public class TypePromotionInMethods extends oggy{
    TypePromotionInMethods(){
        System.out.println("Using constructor with super keyword - 3");
        super.havingChill(10,20);
    }
    protected void havingChill(int a,int b){
        System.out.println("Override Method "+a+"  "+b);
    }
    private void add(int a,int b){
        System.out.println("First  input  ->  "+a);
        System.out.println("Second input  ->  "+b);
        System.out.println("FInal  input  ->  "+(b+a));

    }
    private void add(int a,double b){
        System.out.println("First  input  ->  "+a);
        System.out.println("Second input  ->  "+b);
        System.out.println("FInal  input  ->  "+(b+a));

    }
    public static void main(String[] args) {
        TypePromotionInMethods obj=new TypePromotionInMethods();
        obj.add('f',20);
        obj.add((byte)42,42);
        //----------------------------  2 Methods to calling oggy of super class
        oggy og = new oggy();
        System.out.println("Using parent class Object - 1");
        og.havingChill(10,20);  // Method 1  using parent class object
        obj.testing();

    }
    public void testing(){
        System.out.println("Using non static Method - 2");
        super.havingChill(100,200);
    }
}
