package Inheritance;

class parent{

    int a,b,c;
    parent(){
        System.out.println("I am no argument constructor");
    }
    parent(int x){   // reciving and printing first this
        System.out.println("Parent class constructor with argument "+x);
    }
}
class derived extends parent{
    derived(){
        System.out.println("parent child class constructor ");
    }
    derived(int x,int y){
        super(x); // Passing on of above and reciving two args
        System.out.println("Parent child class constructor with value x and y"+x +"  "+y);
    }
}
class childOfDerived extends derived{
    childOfDerived(){
        System.out.println("Child of Derived with no Argument");
    }
    childOfDerived(int x, int y,int z){
        super(x, y);  // Passing x and y to super and the constructor paramater is also containg with the same name
        System.out.println("Child of Derived with three argument x,y,z "+x+"  "+y+"   "+z);
    }
        public void display(){
        super.a=100;
        super.b=200;
        super.c=300;
            System.out.println("Super A  "+super.a);
            System.out.println("Super B  "+super.b);
            System.out.println("Super C  "+super.c);
        }
}

public class ConstructorInInheritance extends derived{
    public static void main(String[] args) {
//        childOfDerived test = new childOfDerived();
//        derived d= new derived(10,20);
        childOfDerived cd = new childOfDerived(10,20,30);
        cd.display();
    }
}
