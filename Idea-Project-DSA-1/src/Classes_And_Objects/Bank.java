package Classes_And_Objects;

public class Bank {
String First_Name;
String Last_name;
String Account_Type;
int Account_Balance;

Bank(String First_n,String Second_n,String Account_Type,int Balance){
    this.First_Name=First_n;
    this.Last_name=Second_n;
    this.Account_Type=Account_Type;
    this.Account_Balance=Balance;
}
protected void Display(){
    System.out.println("=============================================================================================");
    System.out.println("First Name          -->  "+First_Name);
    System.out.println("Last Name           -->  "+Last_name);
    System.out.println("Account Type        -->  "+Account_Type);
    System.out.println("Account Balance     -->  "+Account_Balance);
    System.out.println("=============================================================================================");
}

}
class Action3{
    public static void main(String [] args){
        Bank Rahul= new Bank("Rahul","Kant Verma","Saving Account",40000);
        Bank Ganesh= new Bank("Ganesh","Peendi","Saving Account",7000);
        Bank Mohan= new Bank("Mohan ","Mishra","Current Account",10000);
        Bank Veeran= new Bank("Veeran","Reedi","Currnt Account",900000);

        Rahul.Display();
        Ganesh.Display();
        Mohan.Display();
        Veeran.Display();

        Bank[] Objects = {Rahul,Ganesh,Mohan,Veeran};
        {
            for(int i=0;i<Objects.length;i++){
                System.out.println("Particularly single field of an array   --->   "+Objects[i].First_Name+"    --->>  "+Objects[i].Account_Balance);
            }
        }
    }
}
/*         Create classes that capture bank customers and bank accounts. A customer has a first and last name.
        An account has a customer and a balance. Make objects for two accounts held by the same customer.

       */
