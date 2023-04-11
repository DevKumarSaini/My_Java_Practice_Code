package Classes_And_Objects;

public class NestedClass {
    private int sample1=10;
    public void display(){
        System.out.println(sample1);
    }
    //---------------------------------------------------------------------------  Inner Class
    class InnerClass{
        private int sample2=20;
        public void display(){
            System.out.println("This is private member of outer Class  "+sample1);
            System.out.println("This is private member of Inner Class  "+sample2);
        }
    }
    static class InnerClass2{
        private int sample3=30;
        public void DisplayingStaticInneerClass(){
            System.out.println(sample3);
        }
    }

    public void ChomuSultan(){
        System.out.println("Displayig Chomu Sultan");
    }

    public void initiatingInnerClassObject() {
        InnerClass obj = new InnerClass();
        System.out.println("\n This method is firstly make object of inner Class and then display member of inner class");
        obj.display();
    }
    //---------------------------------------------------------------------------  Inner Class
    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.initiatingInnerClassObject();
        System.out.println(nestedClass);
    }
}
