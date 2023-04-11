package Classes_And_Objects;

public class Rectangle {
    int length,breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int areaOfRectangle(Rectangle Obj){
        return 2*(Obj.length+Obj.breadth);
    }
    int perimeterOfRectangle(Rectangle Obj){
        return Obj.length* Obj.breadth;
    }
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(20,40);
        int area=rectangle1.areaOfRectangle(rectangle1);
        int perimeter=rectangle1.perimeterOfRectangle(rectangle1);
        System.out.println("Area of Rectangle is "+area);
        System.out.println("perimeter of Rectangle is "+perimeter);

    }
}
