package Methods;

public class overloadingSimpleMethod {
    public int adding(int a,int b){
        return a+b;
    }
    public double adding(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        overloadingSimpleMethod obj = new overloadingSimpleMethod();
        int temp1 = obj.adding(10,20);
        System.out.println("This is the result of the first overloaded method "+temp1);

        double temp2 = obj.adding(4.5,89.7);

        System.out.println("This is the second overloaded method which is taking the result of double datatype "+temp2);
    }
}
