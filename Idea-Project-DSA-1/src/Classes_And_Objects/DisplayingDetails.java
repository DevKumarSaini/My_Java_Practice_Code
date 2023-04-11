package Classes_And_Objects;

public class DisplayingDetails {
    /*
            Write a program that would print the information (name, year of joining, salary, address)
            of three employees by creating a class named 'Employee'. The output should be as follows:
            Name        Year of joining        Address
            Robert            1994                64C- WallsStreat
            Sam               2000                68D- WallsStreat
            John              1999                26B- WallsStreat
     */
    private String Name;
    private int YearOfJoining;
    private String Address;
    DisplayingDetails(){}
    DisplayingDetails(String name,int yearofjoining,String address){
        this.Name=name;
        this.Address = address;
        this.YearOfJoining=yearofjoining;
    }

    static public void display(DisplayingDetails arr[]){
        System.out.println("Name            Year of Joining             Address"  );
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i].Name+"               "+arr[i].YearOfJoining+"               "+arr[i].Address);
        }
    }

    public static void main(String[] args) {
        DisplayingDetails Robert=new DisplayingDetails("Robert",1994,"64C-WallsStreet");
        DisplayingDetails Sam=new DisplayingDetails("Sam",2000,"68D-WallsStreet");
        DisplayingDetails John=new DisplayingDetails("John",1999,"26B-WallStreet");

        DisplayingDetails arr[]={Robert,Sam,John};
        display(arr);
    }
}
