package Inheritance;

public class Testing_inheritance {
    int rollNumber;
    String Name;
    int StudentClass;
    String FatherName;
    String MotherName;


    Testing_inheritance(int rollNumber,String name,int StudntClass){
     this.rollNumber=rollNumber;
     this.Name=name;
     this.StudentClass=StudntClass;
    }


    public void DislayDetails(){
        System.out.println("Name of Student  >-->  "+Name);
        System.out.println("Roll no Student  >-->  "+rollNumber);
        System.out.println("Student Class    >-->  "+StudentClass);
        System.out.println("Student FName    >-->  "+FatherName);
        System.out.println("Student MName    >-->  "+MotherName);
    }

}
class child extends Testing_inheritance{

    child(int rollNumber, String name, int StudntClass) {
        super(rollNumber, name, StudntClass);
    }
//    child(String FName, String MName){
//        super(FName, MName);
//    }
        public void SettingValuesINSuper(String Fname,String Mname){
        super.FatherName=Fname;
        super.MotherName=MotherName;
        }


    // Initializing the values in objects
    public static void main(String[] args) {
        Testing_inheritance Dev = new child(45,"Dev kumar saini",10);
        Dev.DislayDetails();

    }
}