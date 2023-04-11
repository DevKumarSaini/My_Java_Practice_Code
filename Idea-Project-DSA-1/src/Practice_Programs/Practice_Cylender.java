package Practice_Programs;

import java.util.Scanner;

public class Practice_Cylender {
    public static void main(String[] args) {
//        Cylender2 c1= new Cylender2(10,20);
//        c1.getdetialsCylender();
//        Cylender2 rectangle = new Cylender2( 40.1f,20.0f);
//        rectangle.getdetailsRectangle();

        Cylender2 sphere= new Cylender2();

        int radius= sphere.setRadius();
        sphere.displaySphereProperties(radius);


    }
}
class Cylender2{
    int height;
    int radius;
    float length,breadth;
    Cylender2(int height,int radius){
        this.height=height;
        this.radius=radius;
    }
    Cylender2(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Cylender2(/*int radius*/){
//        this.radius=radius;
    }  // Empty Constructor

    public int setRadius(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of your Sphere to find your Diameter ");
        int inpradius = scanner.nextInt();
        return inpradius;
    }
    public void displaySphereProperties(int radius){
        System.out.println("Radius of your Sphere is  -->  "+radius);
        System.out.println("Diameter of your Sphere is  -->  "+radius*2);
    }






    public void getdetialsCylender(){
        System.out.println("Height of Your cylinder  -->  "+this.height);
        System.out.println("Radius of your Cylinder  -->  "+this.radius);
    }
    public void getdetailsRectangle(){
        System.out.println("\nLength of your Rectangle    -->  "+this.length+"    f (feet)");
        System.out.println("Breadth of your Rectangle   -->  "+this.breadth+"    f (feet)");
        System.out.println("Area of Your Rectangle is   -->  "+(this.length*this.breadth)+"  sf (square feet)");
    }
}
