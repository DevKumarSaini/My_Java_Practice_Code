package Practice_Programs;

public class PlayingWithConstructor {
    int count =0;
    static int count1 =0;
    static final int x = 100;

    PlayingWithConstructor(){
        count ++;
        count1 ++;
        System.out.println("counter  value  -->  "+count);
        System.out.println("counter1 value  -->  "+count1);
        System.out.println();

        //x++;  // We cannot assign vlaues to final variable

        System.out.println(x+1);
    }

    public static void main(String[] args) {
        PlayingWithConstructor obj1= new PlayingWithConstructor();
        PlayingWithConstructor obj2= new PlayingWithConstructor();
        PlayingWithConstructor obj3= new PlayingWithConstructor();
        PlayingWithConstructor obj4= new PlayingWithConstructor();

        System.out.println("All of resultant is one because all individual object have its own separate value of count ");
        System.out.println("Counter1 value is increasing because counter one is static and static variable can get memory once when class is initialized and static variable is shared to all objects" +
                "that's why counter1 value is been updated not se separated like counter");
    }
}
