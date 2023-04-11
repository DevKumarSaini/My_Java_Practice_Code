package Practice_Programs;

import java.util.Scanner;

public class Try_With_Array {

    public static void main(String []  args){
        int [] id   = {10,11,12,13,14};
        String  [] name ={"User 1","User 2","User 3","User 4","User 5"};
        int [] age  ={25,35,20,32,19};
        int [] salary  ={34,40,30,39,35};

        Try_With_Array obj= new Try_With_Array();

        // Passing array parameters with the help of object of class in the method
        System.out.println("--------------------------------------------");
//        System.out.println("Age is Greater then 30");
        obj.Satisfying_Our_Conditions(age,name,id,salary);
        System.out.println();
        obj.Age_With_Salary(age,name,id,salary);
    }
    void Satisfying_Our_Conditions(int []age,String []name,int [] id,int [] salary){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age to filter Date");
        int inp_age= scanner.nextShort();
        for (int i=0;i<age.length;i++){
        if(age[i]>inp_age){
            System.out.println("User id --> "+id[i]+"   "+"User name --> "+name[i] +"   "+"User age --> "+age[i]+"   "+"User Salary --> "+salary[i]+"k");
        }
    }
    }

    void Age_With_Salary(int [] age,String [] name, int [] id,int [] salary){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age to filter");
        int input_age = scanner.nextShort();
        System.out.println("Enter your salary to filter");
        int input_salary = scanner.nextShort();
        for(int i=0;i< age.length;i++){
            if(age[i]>input_age && salary[i] < input_salary){
                System.out.println("User id --> "+id[i]+"   "+"User name --> "+name[i] +"   "+"User age --> "+age[i]+"   "+"User Salary --> "+salary[i]+"k");
            }
        }
    }
}
