package TestingPrograms;

import DSA_Questions.NumberEqualToPowerOfTwo;

public class DummyClass {
   public void function1(String firstname){
       System.out.println("This is outer function -> "+firstname);
       // Here start second function
   }
}
class pussy{
    public static void main(String[] args) {
        new DummyClass();
    }
}

