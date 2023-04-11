package Inheritance;

public class BaseClass {
    private double width;
    private double height;
    private double depth;
    BaseClass (BaseClass Ob){   // Constructor using Object Copying
        this.width= Ob.width;
        this.depth= Ob.depth;;
        this.height= Ob.height;
    }
    BaseClass(double w,double h,double d){  //Constructor using Parameter passing
        this.width=w;
        this.height=h;
        this.depth=d;
    }
    BaseClass(){  // Empty Constructor
        this.width=-1;
        this.height=-1;
        this.depth=-1;
    }

    BaseClass(double len){  // Using only one object
        width=height=depth=len;
    }

    double volume(){
        return width*height*depth;
    }

}
class Derived_1 extends BaseClass{
    double weight;
    Derived_1(Derived_1 Ob){  // Passing object to its parent class using super keyword
        super(Ob);
        weight= Ob.weight;
    }

    Derived_1(double w,double h,double d,double weight){ // Constructor passing parameters to super class
        super(w, h, d);
        weight=weight;
    }

    Derived_1(){ // Empty Constructor
        super();
        weight=-1;
    }
    Derived_1(double len,double m){
        super(len); // this super is for calling cube
        weight=m;  // passing weight using constructor
    }

}

class ActionPerforming extends Derived_1{

    public static void main(String[] args) {
//        ActionPerforming box1 = new ActionPerforming(10,20,15,34.3);
    }
}
