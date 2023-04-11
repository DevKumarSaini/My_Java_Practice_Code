package Inheritance;

public class circlecircle {
    void area(){

    }
    void volume(){

    }
}
class cylinder extends circlecircle{

}
//----------------------------------
class rectangle{
private int length,breadth,height;
    private void area(int length, int breadth){
    this.breadth=breadth;
    this.length=length;
    }
    private void volume(int length,int width,int height){
    this.length=length;
    this.breadth=width;
    this.height=height;
    }
    public void setVolume(int length,int width,int height){
        this.volume(length,breadth,height);
    }
    public int getVolume(){
        return this.length*this.breadth*this.height;
    }
    public void setArea(int length,int breadth){
        area(length,breadth);
    }
    public int getArea(){
        return this.length*this.breadth;
    }
}
class cuboid extends rectangle{
    public static void main(String[] args) {
        rectangle rectangle = new rectangle();
        rectangle.setArea(10,23);
        rectangle.setVolume(10,20,30);

        //--------------------------------------------------------------
        System.out.println("Volume of your Rectangle is  -->  "+rectangle.getVolume()+" C/m/sqr");
        System.out.println("Area of your Rectangle is  -->  "+rectangle.getArea());

    }
}
