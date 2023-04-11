package TestingPrograms;

public class MethodOverloadingMainMethod {
    public static void main(String[] args) {
        System.out.println("Every time This main Can invoke firstly");

        for(int i=0;;i++){
            System.out.println(i);
            if(i>500){
                break;
            }
        }
//        main(20);
//        main("HabaBI");
//        MethodOverloadingMainMethod o = new MethodOverloadingMainMethod();
//        o.google();
    }
    public static void main(int z){
        System.out.println("I am not running until i got a int number  -->  "+z);
    }
    public static void main(String str){
        System.out.println("Displaying String --> "+str);
    }
    int a=10;
    static public void Youtube(){
        System.out.println("Hello I am Youtuber");
    }
    public void google(){
        System.out.println("Hello I am Google");
        Youtube();
    }
    final void a(){

    }
    final void a(int a){

    }
}
class hello extends MethodOverloadingMainMethod{
    public static void main(String[] args) {
        hello h= new hello();
        h.hellovin(120);
    }
    public void hellovin(int a){
        int hello=super.a;
        System.out.println(a+hello);
    }

}
