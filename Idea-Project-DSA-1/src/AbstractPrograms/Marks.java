package AbstractPrograms;

class Aa{
    int hindi,english,computer;
    Aa(){}  // Default constructor
    Aa(int hindi,int english,int computer){
        this.english=english;
        this.hindi=hindi;
        this.computer=computer;
    }
    public int getpercentage(Aa obj){
        int percentage;
        percentage=obj.computer+obj.english+obj.hindi;
        return (percentage/300)*100;
    }
}
class Bb extends Aa{
    int science;
    Bb(){}
    Bb(int hindi,int english,int computer,int science ){
        super.hindi=hindi;
        super.english=english;
        super.computer=computer;
        this.science=science;
    }
    public int getpercentage(Bb obj){
        int percentage;
        percentage=obj.computer+obj.english+obj.hindi;
        System.out.println((percentage/300)*100);
        return 0;
    }
}
abstract public class Marks {
    abstract int getpercentage();
    /*
    We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A
    and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method
    'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which
     returns the percentage of the students. The constructor of student A takes the marks in three subjects as its
      parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two
       classes and print the percentage of marks for both the students.
     */
}
class Perform{
    public static void main(String[] args) {
        //Creating object of both class
        Aa student1=new Aa(98,45,69);
        int resutl1=student1.getpercentage(student1);
        System.out.println("Total Percentage of student is "+resutl1);

        //Creating object of both class
        Bb student2 = new Bb(78,86,94,70);
        int result2 = student2.getpercentage(student2);
        System.out.println("Total percentage of student 2 is "+result2);
    }
}
