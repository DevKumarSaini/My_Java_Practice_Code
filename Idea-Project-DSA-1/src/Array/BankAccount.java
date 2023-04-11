package Array;

import java.util.Scanner;

public class BankAccount {
    /*
    Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions

Class 'BankAccount' has a method for each of the following
1 - Generate a unique account number for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor

After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.
     */
    private String Nameofdepositor;
    private String Addressofdepositor;
    private String Typeofaccount;
    private int Balanceinaccount;
    private int Numberoftransactions=0;
    private String AccountNumber;
    private int tempnumber=1000;// This can upgrade automatically whenever you create and object of class because this is class level variable
    Scanner scanner = new Scanner(System.in);
    //------------------------------------------------------------------------------------------------------------------
    public void mainMenuList(){

    }
    public void AccountNumberGenerator(){
        String no="BA";
        int num=this.tempnumber;
        this.AccountNumber=no+num;
        this.tempnumber++;
        System.out.println(this.AccountNumber);
    }
    public void addDetailsOfUser(){
        System.out.println("Please Enter your information to Create Bank Account\n");
        System.out.println("-----------------------------------------------------------\n");
        System.out.println("Enter your Name of Account Holder");
        this.Nameofdepositor= scanner.nextLine();
        System.out.println("Enter type of your Account" +
                "\n1    Saving  Account" +
                "\n2    Current Account" +
                "\n3    Fix_Deposit");
        byte inp=scanner.nextByte();
        if(inp == 1){
            this.Typeofaccount="Saving Account";
            System.out.println("Setting to Saving Account");
        } else if (inp == 2) {
            this.Typeofaccount="Current Account";
            System.out.println("Setting to Current Account");
        }
        else if(inp==3){
            this.Typeofaccount="Fix_Deposit";
            System.out.println("Setting to Fix_Deposit Account");
        }
        else {
            System.out.println("Choose Invalid Option\nNo Account is set");
            addDetailsOfUser();
        }
        System.out.println("Enter Address of your Account");
        this.Addressofdepositor= scanner.nextLine();

        System.out.println("Enter Balance in your Account");
        int inpmon= scanner.nextInt();
        if(inpmon <=0 && inpmon < 500){
            System.out.println("Amount is too low \nplease enter minimum 500 rs to create and account");
        }
        else {
            this.Balanceinaccount=inpmon;
            System.out.println("Amount is Successfully Debited");
        }

        AccountNumberGenerator(); // For Assigning the value of the account
        System.out.println("Your Account Number is  -->  "+this.AccountNumber);

        System.out.println("\n Thank for using our service ------------------\n");

        System.out.println("\n-----------------------------------------------------------");

    }
    public void userAndBalancerOfDepositor(){
        System.out.println("\n------ Details of (User & User_Amount) ------");
        System.out.println("Name       -->  "+this.Nameofdepositor);
        System.out.println("Address    -->  "+this.Addressofdepositor);
        System.out.println("Amount     -->  "+this.Balanceinaccount);
        System.out.println("------------------------------------------------");
    }
    public void addMoney(){
        System.out.println("\n----------------Adding Money---------------------");
        if(this.Balanceinaccount == 0){
            System.out.println("Please Add Money in your Account");
            // This is inner If for Processing further amount conditions
        if(this.Balanceinaccount >1000000){
            System.out.println("Your cannot add More money in your account\nMaximum Money deposit limit reached ");
        }
        else if(this.Balanceinaccount <=0){
            System.out.println("You have no amount in your Bank");
        } else{
            int tempAmount= scanner.nextInt();
            this.Balanceinaccount=this.Balanceinaccount+tempAmount;
            System.out.println("Your Amount is Added Successfully :) ");
        }
        }
        System.out.println("Your Money is Successfully Upgraded");
            this.Numberoftransactions++;
    }
    public void withDrawl(){
        System.out.println("Enter your Amount which you want to be withdrawal");
        int guestMoney= scanner.nextInt();
        if(this.Balanceinaccount == 0){
            System.out.println("Your Account is empty");
        } else if (this.Balanceinaccount < guestMoney) {
            System.out.println("Your Have not sufficient money to withdrawal");
        } else if (this.Balanceinaccount > guestMoney) {
            if((this.Balanceinaccount=this.Balanceinaccount-guestMoney) == 0 ){
                System.out.println("Transaction cannot be processed not have sufficient amount");
            }
            else {
                this.Balanceinaccount=this.Balanceinaccount-guestMoney;
                System.out.println("Amount is successfully Creadited");
            }
        }
        this.Numberoftransactions++;
    }
    public void totalOperationPerformedOnBankMoney(){
        System.out.println("Total no of Transaction performed by a user is "+this.Numberoftransactions);
    }
    public void changeAddressForDepositor(){
        System.out.println("Enter you new Address to Update your Existing Address");
        String update=scanner.nextLine();

        System.out.println("Choose Option \n" +
                "1  Confirm Updation\n" +
                "2  Reject Updation ");
        int choose=scanner.nextInt();
        if(choose == 1){
            this.Addressofdepositor=update;
        }
        else {
            System.out.println("You cancel the updation process of Home Address");
        }
    }


    public static void main(String[] args){
    BankAccount obj = new BankAccount();

    }
}
