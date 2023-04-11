package Practice_Programs;

public class Testin_This_keyword {
    int i;

    Testin_This_keyword(){
        System.out.println("this is non parameterized constructor which display nothing ");    }

    Testin_This_keyword(int a){
        this();  // this is caling the non parameterized constructor    [ same as super in inheritance ]
        System.out.println("display the value of a and passing three to another constructor " +a);    }
    Testin_This_keyword(int a,int b){
        this(a);  // this is caling the non parameterized constructor    [ same as super in inheritance ]
        System.out.println("display the value of b and passing three to another constructor " +b);    }
    Testin_This_keyword(int a,int b, int c){
        this(a,b);  // this is caling the non parameterized constructor    [ same as super in inheritance ]
        System.out.println("display the value of c and passing three to another constructor " +c);    }
    Testin_This_keyword(int a,int b, int c,int d){
        this(a,b,c);  // this is caling the non parameterized constructor    [ same as super in inheritance ]
        System.out.println("display the value of d and passing three to another constructor " +d);
    }

    //---------------------------------------------------------------------------------------------------------------------------
    void maintain(Testin_This_keyword td){
        System.out.println("This is maintaining in main");
    }
    void maintaining2(int a){
        maintain(this);   // this keyword is passing values to the class referenced method
        System.out.println("parameter value of a i "+a);
    }
    void assigning(int i){

        this.i=i;    // this is used for assigning the parameter value to the instance variable
        System.out.println(this.i);
    }
    void valueOfI(){
        System.out.println("Displaying the value of i is "+this.i);
    }
    void display(){
        System.out.println("Hello ji namastae aa gya kya app");
        System.out.println("the value of i is  "+this.i+" before assigning the value to i");
    }
    void show(){
        this.display();  // this can display current class method
    }
}
class action{
    public static void main(String[] args) {
        Testin_This_keyword test = new Testin_This_keyword(10,20,30,40);
        test.show();
       test.assigning(10);
       test.valueOfI();
       test.maintaining2(11110);
    }
}
