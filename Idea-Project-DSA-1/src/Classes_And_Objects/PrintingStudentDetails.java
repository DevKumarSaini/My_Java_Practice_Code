package Classes_And_Objects;

class student1{
    private int rollNumber;
    private String Address;
    private long phoneNumber;

    public int getRollNumber() {
        return rollNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    student1(int rollNumber, long phoneNumber, String address){
        this.rollNumber=rollNumber;
        this.phoneNumber=phoneNumber;
        this.Address=address;
    }
    student1(){};


}
public class PrintingStudentDetails {
    public static void main(String[] args){
        student1 Sam = new student1(45,978645313,"24 kirti nagar,Bombay Rameshwaram");
        student1 John = new student1(78,785612489,"23A,Holy Place, Shyam nagar,Bombay");
        System.out.println("Name  "+Sam.getRollNumber()
                          +"\nPhone Number   "+Sam.getPhoneNumber()+
                           "\nAddress   "+ Sam.getAddress());
        System.out.println("------------------------------------------------");
        System.out.println("Name  "+John.getRollNumber()
                          +"\nPhone Number   "+John.getPhoneNumber()+
                           "\nAddress   "+ John.getAddress());
    }
}
