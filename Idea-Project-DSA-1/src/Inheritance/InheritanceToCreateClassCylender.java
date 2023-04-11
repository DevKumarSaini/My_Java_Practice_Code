package Inheritance;

class Circle1{
double radius;
double height;
Circle1(double radius,double height){ // Assigning values to  it's variable
    this.radius=radius;
    this.height=height;
}
void circleProperties(){
    System.out.println("Radius of circle is "+radius);
    System.out.println("Diameter of circle is "+(radius*radius));
    System.out.println("Height of circle is "+height);
}

}
class Cylinder1 extends Circle1{
    double pie=3.14;
    double weight;
    Cylinder1(double radius,double height,double weight){
        super(radius,height);
        this.weight=weight;
    }
    double volume(){
        return pie*(radius*radius)*height;
    }

}
class third extends Cylinder1{

    //Constructor of third class
    third(double radius, double height, double weight) {  // This constructor is just passing the values to it's superior class constructor or nothing else
        super(radius, height, weight);
    }
    double volume(){
        System.out.println("Volume of Cylinder is "+super.volume()+" C/m (Cubic Meter)");
        System.out.println("Weight of Cylinder is "+weight+" Kg");
        return 0;
    }
}

public class InheritanceToCreateClassCylender {
    public static void main(String[] args) {
        third obj = new third(10,20,50);
            obj.volume();
    }
}
