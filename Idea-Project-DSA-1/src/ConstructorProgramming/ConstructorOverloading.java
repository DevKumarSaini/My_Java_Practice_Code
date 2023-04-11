package ConstructorProgramming;

public class ConstructorOverloading {
    int rn;
    int age;
    String name;
    ConstructorOverloading (){}
    ConstructorOverloading(String name,int age){
        this.age=age;
        this.name=name;
    }
    ConstructorOverloading(String name,int rn,int age){
        this.name=name;
        this.rn=rn;
        this.age=age;
    }

    public void displayDetails(){
        System.out.println("-------------------------------------------");
        System.out.println("Name    = "+name);
        System.out.println("Roll no = "+rn);
        System.out.println("Age     = "+age);
        System.out.println("-------------------------------------------");
        System.out.println();
    }
    public static void main(String[] args) {
        ConstructorOverloading Student1 = new ConstructorOverloading("Rahul singh",28) , Student2 = new ConstructorOverloading("Ram Gopal",45,13), Student3 = new ConstructorOverloading("Dev kumar saini", 15,20);
        Student1.displayDetails();
        Student2.displayDetails();
        Student3.displayDetails();


        // Copying Constructor values without using constructor
        ConstructorOverloading copyObj = new ConstructorOverloading();
        copyObj=Student2;
        System.out.println("This is copy value constructor");
        copyObj.displayDetails();

        ConstructorOverloading CopyByAConstrucotr = new ConstructorOverloading(), deeno = new ConstructorOverloading();
        CopyByAConstrucotr.clone(Student2);
        deeno.clone(deeno);

    }

    private void clone(ConstructorOverloading student2) {
        student2.displayDetails();
    }

}

