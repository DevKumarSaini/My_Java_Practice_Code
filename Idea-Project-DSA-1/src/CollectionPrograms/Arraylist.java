package CollectionPrograms;

import java.util.ArrayList;

public class Arraylist {
    int value=100;
    class hello{
        public void display(){
            System.out.println("I am inner class method");
        }
        public void displayOuterValue(){
            System.out.println("Displaying OUter class Variable --> "+value);
        }
    }
    public void outer(){
        System.out.println("This is outer class method and accessig value of own class -> "+value);
    }

    public static void main(String[] args) {
//        Arraylist Outer = new Arraylist();
//        Arraylist.hello inner = Outer.new hello();
//        inner.displayOuterValue();
//        inner.display();
//        Outer.outer();
//        ArrayList<Integer> intnum = new ArrayList<>();
//        for (int i = 0; i <= 500; i++) {
//            intnum.add(i * i);
//        }
//        System.out.println(intnum);
//        System.out.println(intnum.remove(Integer.valueOf(36)));
//        System.out.println(intnum);
//        // Displaying Array list
    }
}
