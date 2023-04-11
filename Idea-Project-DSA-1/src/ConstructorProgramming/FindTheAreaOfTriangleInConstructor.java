package ConstructorProgramming;

public class FindTheAreaOfTriangleInConstructor {
//    int height;
//    int base;

    FindTheAreaOfTriangleInConstructor(int height, int base){
//        this.base=base;
//        this.height=height;
        System.out.println(height+"  "+base);
        int value = (base*height);
        System.out.println(height*base);
        System.out.println("Area of a triangle is  -> "+value);

    }

    public static void main(String[] args) {
        FindTheAreaOfTriangleInConstructor obj= new FindTheAreaOfTriangleInConstructor(110,20);
    }
}

