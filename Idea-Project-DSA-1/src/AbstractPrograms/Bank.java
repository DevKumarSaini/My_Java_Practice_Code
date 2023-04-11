package AbstractPrograms;

abstract public class Bank {
    /*
    Create an abstract class 'Bank' with an abstract method 'getBalance'.
    $100, $150 and $200 are deposited in banks A, B and C respectively.
    'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
    each having a method named 'getBalance'.
     Call this method by creating an object of each of the three classes.
     */
    abstract void getBalance();

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.cash=100;
        obj2.cash=150;
        obj3.cash=200;

        System.out.println("Balance of Bank 1 is "+obj1.getBalance());
        System.out.println("Balance of Bank 2 is "+obj2.getBalance());
        System.out.println("Balance of Bank 3 is "+obj3.getBalance());

        A dekho = new B();
        Bank obj = new Bank() {
            @Override
            void getBalance() {

            }
        };

    }
}
class A{
    int cash ;
    public int getBalance(){
        return cash;
    }
    public void deekho(){
        System.out.println("Deekho mera code");
    }
}
class B extends A{
    int cash = 150;
    public int getBalance(){
        return cash;
    }
    public void deekho(){
        System.out.println("Deekho na mera code");
    }
}
class C extends B{
    int cash = 200;
    public int getBalance(){
        return cash;
    }
}