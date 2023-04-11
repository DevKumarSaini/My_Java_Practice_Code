package Classes_And_Objects;

public class Student {
    String First_Name;
    String Last_Name;
    int Year;
    String Subject;

    Student(String F_name, String L_name,int Year,String Subject){
        this.First_Name=F_name;
        this.Last_Name=L_name;
        this.Year=Year;
        this.Subject=Subject;
    }

    public void displayStudentDetails(){
        System.out.println("___________________________________________________________");
        System.out.println("First Name -->  "+this.First_Name);
        System.out.println("Last  Name -->  "+this.Last_Name);
        System.out.println("Year       -->  "+this.Year);
        System.out.println("Subject    -->  "+this.Subject);
        System.out.println("___________________________________________________________");
    }
}
class Action1{
    public static void main(String [] args){
        Student Rohit= new Student("Rohit","Kumar Mishra",3,"B.S.C(Batchelor of Science");
        Student Govind = new Student("Govind","Sharma",2,"B.A");
        Student Ramesh = new Student("Ramesh","Go Swami",1,"Accounts");

        Rohit.displayStudentDetails();
        Govind.displayStudentDetails();
        Ramesh.displayStudentDetails();
    }
}
        /*Create a class that captures students. Each student has a first name, last name, class year, and major. Create two examples of students.

        Create a class that captures planets. Each planet has a name, a distance from the sun, and its gravity relative to Earth’s gravity.
        For distance and gravity, use the type double which captures real numbers. Make objects for Earth and your favorite non-earth planet.

        Create classes that capture bank customers and bank accounts. A customer has a first and last name.
        An account has a customer and a balance. Make objects for two accounts held by the same customer.

        Create a class that captures airline tickets. Each ticket lists the departure and arrival cities, a flight number, and a seat assignment
        . A seat assignment has both a row and a letter for the seat within the row (such as 12F). Make two examples of tickets.*/