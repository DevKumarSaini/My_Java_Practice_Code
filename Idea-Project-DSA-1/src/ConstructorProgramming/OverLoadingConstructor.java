package ConstructorProgramming;

class a{
    int A,B;
a(int a , int b){
    A=a;
    B=b;
}
int adding(){
    System.out.println("I am Normal Adding of class A with value of "+(A+B));
   return A+B;
}
void show(){
    System.out.println("I am show of class A and adding both the values of A and B "+(A+B));
}
}
//----------------------------------------------------------------------
class b extends a{
int C;
b(int a, int b,int c){ // This is constructor which is taking three values and pass two value to the super class and retain one value and initialize to its local variable
    super(a,b);
    C=c;  // Initializing the value of c to its own class member
}

    @Override
    int adding() {
    int c=10;
        System.out.println("I am Override Adding of Class B with extra value of 10");
        return c;
    }

    int show(String message){  // watch can super is getting back with its own value
    super.show();
    System.out.println("I am show of class B and only display the message which is passed to me "+message);
    return A+B;
}
void show(){
//    super.show();
    System.out.println("I am empty show of class B");
}

}
public class OverLoadingConstructor {
    public static void main(String[] args) {
    b obj = new b(10,20,30);
//    obj.show("Hello Buddy");
//    obj.show();
        System.out.println("Adding function "+obj.adding());
    }

}
