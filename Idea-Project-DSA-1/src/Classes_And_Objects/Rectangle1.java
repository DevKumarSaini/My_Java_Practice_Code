package Classes_And_Objects;

public class Rectangle1 {
    private int length,breadth;
    Rectangle1(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int getArea(){
        return length*breadth;
    }
    int getPerimeter(){
        return 2*(length+breadth);
    }

    public static void main(String[] args) {
        Rectangle1 rec1 = new Rectangle1(4,5);
        Rectangle1 rec2 = new Rectangle1(5,8);

        System.out.println("Area of Rectangle is "+rec1.getArea());
        System.out.println("Perimeter of Rectangle is "+rec1.getPerimeter());
    }
}
