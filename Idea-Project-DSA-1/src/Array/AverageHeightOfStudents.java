package Array;

public class AverageHeightOfStudents {
    String name;
    int height;
    AverageHeightOfStudents(String name,int height){
        this.name=name;
        this.height=height;
    }
    AverageHeightOfStudents(){}

    public static void main(String[] args) {
        AverageHeightOfStudents student1= new AverageHeightOfStudents("Ramesh",54);
        AverageHeightOfStudents student2= new AverageHeightOfStudents("Hari",32);
        AverageHeightOfStudents student3= new AverageHeightOfStudents("Kripal",23);
        AverageHeightOfStudents student4= new AverageHeightOfStudents("Manju",21);
        AverageHeightOfStudents student5= new AverageHeightOfStudents("Govind",55);
        AverageHeightOfStudents student6= new AverageHeightOfStudents("Culambs",12);
        AverageHeightOfStudents student7= new AverageHeightOfStudents("Nicola",30);
        AverageHeightOfStudents student8= new AverageHeightOfStudents("Om",15);
        AverageHeightOfStudents student9= new AverageHeightOfStudents("Jitendra",33);
        AverageHeightOfStudents student10= new AverageHeightOfStudents("Ghamora",42);


        // We can create an array of student object which is passed into an method of an array
        AverageHeightOfStudents students[]={student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        AverageHeightOfStudents obj=new AverageHeightOfStudents();
        obj.displayAge(students); // Passing object array to the method
    }
    public void displayAge(AverageHeightOfStudents [] students){
        // here we reciving array of objects to perform operations
        int average=0,length=0;
        for(int i=0;i<students.length;i++){
            System.out.println("----------------------------------");
            System.out.println("Name    -->  "+students[i].name);
            System.out.println("Height  -->  "+students[i].height);
            System.out.println("----------------------------------");
            average=average+students[i].height;
            length=students.length;
        }
        average = average/length;
        System.out.println("Average Height of Students in Class is "+average);
    }
}
