package Classes_And_Objects;

public class Triangle1 {
    /*
    Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
    units by creating a class named 'Triangle' without any parameter in its constructor.
     */
    Triangle1(int side1,int side2, int side3){
        if(side1+side2 > side3){
            System.out.println("Perimeter of triangle is "+(side1+side2+side3));
        }
        else {
            System.out.println("value of Side1 & Side2 "+(side1+side2)+" is less then total of side3 "+side3);
            System.out.println("Re enter your values");
        }
    }
    Triangle1 (int base,int height){
        System.out.println("Area of triangle is "+((base*height)/2));
    }
    Triangle1(){}  // This is Default Constructor
    public int getArea(int base,int height){
        return (base * height)/2;
    }

    public int getPeimeter(int side1,int side2,int side3){
        return (side1+side2+side3);
    }

    public static void main(String[] args) {
        Triangle1 triangle = new Triangle1();
        System.out.println("Area of Triangle is "+triangle.getArea(75,120));
        System.out.println("Perimeter of Triangle is "+triangle.getPeimeter(80,45,67));

        System.out.println("-------------------------------  Using Constructor \n");
        Triangle1 triangle2 = new Triangle1(70,23,78);
        Triangle1 triangle3 = new Triangle1(45,34);
    }
}
