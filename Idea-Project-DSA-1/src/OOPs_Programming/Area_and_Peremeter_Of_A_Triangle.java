package OOPs_Programming;

public class Area_and_Peremeter_Of_A_Triangle {
    int base,RightSide,LeftSide;
    Area_and_Peremeter_Of_A_Triangle(){
        this.base=5;
        this.RightSide=3;
        this.LeftSide=4;
    }
    Area_and_Peremeter_Of_A_Triangle(int leftSide,int rightSide,int base){
        this.base=base;
        this.RightSide=rightSide;
        this.LeftSide=leftSide;
    }
    //------------------------------------------------------------------------
    protected int areaOfTriangle(){
    return base*RightSide*LeftSide;
    }
    protected int perimeterOfTriangle(){
        return base+RightSide+LeftSide;
    }

    protected int areaOfTriangle(int leftSide,int rightSide, int base){
            return leftSide*rightSide*base;
    }
    protected int perimeterOfTriangle(int leftSide,int rightSide,int base){
        return rightSide+leftSide+base;
    }
    //Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
    //units by creating a class named 'Triangle' without any parameter in its constructor.
}
class Action{
    public static void main(String[] args) {
        Area_and_Peremeter_Of_A_Triangle obj1=new Area_and_Peremeter_Of_A_Triangle();
        int Area=obj1.areaOfTriangle();
        int Perimeter=obj1.perimeterOfTriangle();
        System.out.println("Area of Triangle is = "+Area);
        System.out.println("Perimeter of Triangle is = "+Perimeter);

        Area_and_Peremeter_Of_A_Triangle Triangle2= new Area_and_Peremeter_Of_A_Triangle(5,6,7);
        System.out.println("Area of Triangle is -- "+Triangle2.areaOfTriangle());
        System.out.println("Perimeter of Triangle is -- "+Triangle2.perimeterOfTriangle());
    }
}
