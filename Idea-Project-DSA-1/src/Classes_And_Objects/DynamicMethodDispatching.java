package Classes_And_Objects;

import org.w3c.dom.ls.LSOutput;

class A1{
    protected void A1Method1(){
        System.out.println("This is method of A1");
    }
    protected void A1Method2(){
        System.out.println("This is method of A2");
    }
}
class B1 extends A1{
    protected void B1Method(){
        System.out.println("This is method of B1");
    }
    protected void B2Method(){
        System.out.println("This is method of B2");
    }
}
class C1 extends B1{
    protected void C1Method(){
        System.out.println("This is method of C1");
    }
    protected void C2Method(){
        System.out.println("This is method of C2");
    }
    /*
    englis lit 70 -40
    geog 50 -26
    englisth 70 - 44
    commp 50-43
    hin 70 - */
}
public class DynamicMethodDispatching {
    public static void main(String[] args) {
    A1 obj = new C1();
    obj.A1Method1();
    obj.A1Method2();

    }
}
