package Array;

import Classes_And_Objects.DisplayingDetails;

public class Employee_Array_Of_Object {
    String name,dateOfJoining;
    int salary;
    Employee_Array_Of_Object(String name,String dateOfJoining,int salary){
        this.name=name;
        this.salary=salary;
        this.dateOfJoining=dateOfJoining;
    }
    Employee_Array_Of_Object(){}

    private void DisplayingDetails(Employee_Array_Of_Object obj[]){
        for(int i=0;i<obj.length;i++){
            System.out.println("--------------------------------------------------");
            System.out.println("Name            "+obj[i].name);
            System.out.println("Salary          "+obj[i].salary+" ₹");
            System.out.println("DOJ             "+obj[i].dateOfJoining);
            System.out.println("--------------------------------------------------");

        }
    }

    public static void main(String[] args) {
        // these all are object which is used constructor to assign value to it
        Employee_Array_Of_Object Emp1=new Employee_Array_Of_Object("Rahul Sharma","12/04/2001",34000);
        Employee_Array_Of_Object Emp2=new Employee_Array_Of_Object("Sandeep Maheswari","24/03/2000",45031);
        Employee_Array_Of_Object Emp3=new Employee_Array_Of_Object("kishan Gopal","05/07/2003",21365);
        Employee_Array_Of_Object Emp4=new Employee_Array_Of_Object("Madhu saini","30/12/2004",41526);
        Employee_Array_Of_Object Emp5=new Employee_Array_Of_Object("Dev kumar saini","01/02/2003",142369);
        Employee_Array_Of_Object Emp6=new Employee_Array_Of_Object("Ram Kishor","29/05/2013",455665);
        Employee_Array_Of_Object Emp7=new Employee_Array_Of_Object("Hari Meena","15/01/2007",24785);
        Employee_Array_Of_Object Emp8=new Employee_Array_Of_Object("Mahul Sharma","20/20/2020",85236);
        Employee_Array_Of_Object Emp9=new Employee_Array_Of_Object("Dananjya gupta","22/08/2010",35769);
        Employee_Array_Of_Object Emp10=new Employee_Array_Of_Object("Agni path","31/11/2020",40402);

        Employee_Array_Of_Object obj = new Employee_Array_Of_Object();

        // All Objects are packed in an array and it is called array of object
        Employee_Array_Of_Object EMP[]={Emp1,Emp2,Emp3,Emp4,Emp5,Emp6,Emp7,Emp8,Emp9,Emp10};

        System.out.println("---------###-------Displaying all records of Employee---------###-------");
        obj.DisplayingDetails(EMP);
    }

}
