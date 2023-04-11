package Classes_And_Objects;

public class Area {
    /*
    Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of
    its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns
    the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
     */
    private int length,breadth;
    Area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int returnArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Area area = new Area(4,5);
        System.out.println("Area of rectangle is "+area.returnArea());
    }
}
