package Practice_Programs;

import java.util.Scanner;

public class ActionCylender {
    public static void main(String [] args){
    Cylender firstCylender= new Cylender();
    System.out.println("First Cylinder");
    firstCylender.Height=100;
    firstCylender.Radius=20;
    firstCylender.displayProperty();

        System.out.println("Second Cylinder");
    Cylender seconeCylender =new Cylender(500,50);
    seconeCylender.displayProperty();
    float volumeofsecondcylender=seconeCylender.volumeOfCylender(20,100);
    System.out.println("Volume of your Cylinder is  ->> "+volumeofsecondcylender);

    Cylender thirdcircle= new Cylender();
    int R=thirdcircle.takingRadius();
    int H=thirdcircle.takingHeight();
    int volume=thirdcircle.volumeOfCylender(R,H);
        System.out.println("Volume Of Circle is --> "+volume);

    }
}
class Cylender{
    int Radius;
    int Height;
    static float pie =3.14f;
    int rad;
    int hei;
    Scanner scanner = new Scanner(System.in);
    Cylender (){
    }

    Cylender (int x ,int y){
        this.Radius=x;
        this.Height=y;
    }

    public void setRadius(int radius,int height){
        this.Radius=radius;
        this.Height=height;
    }

    public int takingRadius(){

        System.out.println("Enter Radius of Circle");
        short rad=scanner.nextShort();
        return rad;
    }

    public int takingHeight(){
        System.out.println("Enter Height of Circle");
        short hei=scanner.nextShort();
        return  hei;
    }
    public int getRadius(){
        return this.Radius;
    }
    public int getHeight(){
        return this.Height;
    }
    public void displayProperty(){
        System.out.println("Height of Your Cylinder is --> "+this.Height+" Meter");
        System.out.println("Radius of Your Cylinder is --> "+this.Radius+" Millimeter");
    }

    public int volumeOfCylender(int radius,int height){
    float volumeOfCylender=pie*(radius*radius)*height;
    return (int)volumeOfCylender;
    }
}