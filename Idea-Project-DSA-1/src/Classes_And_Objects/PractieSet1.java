package Classes_And_Objects;

import Methods.PrintngStars;

public class PractieSet1 {
    int salary;
    String Name;

    public void setCredintials(int salary,String name){
    this.Name=name;
    this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return Name;
    }
    public static void main(String[] args) {
        PractieSet1 rohan = new PractieSet1();
        PractieSet1 Mohan = new PractieSet1();

        rohan.setCredintials(20000,"Rohan sharma");
        Mohan.setCredintials(30000,"Mohan Sharma");

        System.out.println("Name  ->  "+rohan.getName()+"  \nSalary  -->  "+rohan.getSalary());
        System.out.println("Name  ->  "+Mohan.getName()+"  \nSalary  -->  "+Mohan.getSalary());
    }
}
