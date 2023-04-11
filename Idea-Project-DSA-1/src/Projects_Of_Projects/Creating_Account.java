package Projects_Of_Projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Random;

import static java.lang.System.exit;

interface BasicMethodImplementationForBank{
    void Display_All_Details() throws IOException;
    void Open_Account() throws IOException;  //---------
    void Credit_Amount() throws IOException;
    void Debited_Amount() throws IOException;
    void Display_Account_Details() throws IOException;
}
public class Creating_Account implements BasicMethodImplementationForBank {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private String Name;
    private String Account_Type;
    private int Age_Of_Customer;
    private int Amount;
    private String Phone_No;
    private String Address;
    private long Account_Number;

    Creating_Account() {
    } // This is non parameterized constructor

//    Creating_Account(String name,String Account_type,int Age,int Amount,String Phone_no,String Address){
//        this.Account_Type=Account_type;
//        this.Address=Address;
//        this.Age_Of_Customer=Age;
//        this.Name=name;
//        this.Amount=Amount;
//        this.Phone_No=Phone_no;
//    }  //

    void Welcome_Screen() throws IOException {
        System.out.println("                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      \n" +
                "WWWWWWWW                           WWWWWWWW                              lllllll                                                                                                      \n" +
                "W::::::W                           W::::::W                              l:::::l                                                                                                      \n" +
                "W::::::W                           W::::::W                              l:::::l                                                                                                      \n" +
                "W::::::W                           W::::::W                              l:::::l                                                                                                      \n" +
                " W:::::W           WWWWW           W:::::W          eeeeeeeeeeee          l::::l          cccccccccccccccc        ooooooooooo           mmmmmmm    mmmmmmm            eeeeeeeeeeee    \n" +
                "  W:::::W         W:::::W         W:::::W         ee::::::::::::ee        l::::l        cc:::::::::::::::c      oo:::::::::::oo       mm:::::::m  m:::::::mm        ee::::::::::::ee  \n" +
                "   W:::::W       W:::::::W       W:::::W         e::::::eeeee:::::ee      l::::l       c:::::::::::::::::c     o:::::::::::::::o     m::::::::::mm::::::::::m      e::::::eeeee:::::ee\n" +
                "    W:::::W     W:::::::::W     W:::::W         e::::::e     e:::::e      l::::l      c:::::::cccccc:::::c     o:::::ooooo:::::o     m::::::::::::::::::::::m     e::::::e     e:::::e\n" +
                "     W:::::W   W:::::W:::::W   W:::::W          e:::::::eeeee::::::e      l::::l      c::::::c     ccccccc     o::::o     o::::o     m:::::mmm::::::mmm:::::m     e:::::::eeeee::::::e\n" +
                "      W:::::W W:::::W W:::::W W:::::W           e:::::::::::::::::e       l::::l      c:::::c                  o::::o     o::::o     m::::m   m::::m   m::::m     e:::::::::::::::::e \n" +
                "       W:::::W:::::W   W:::::W:::::W            e::::::eeeeeeeeeee        l::::l      c:::::c                  o::::o     o::::o     m::::m   m::::m   m::::m     e::::::eeeeeeeeeee  \n" +
                "        W:::::::::W     W:::::::::W             e:::::::e                 l::::l      c::::::c     ccccccc     o::::o     o::::o     m::::m   m::::m   m::::m     e:::::::e           \n" +
                "         W:::::::W       W:::::::W              e::::::::e               l::::::l     c:::::::cccccc:::::c     o:::::ooooo:::::o     m::::m   m::::m   m::::m     e::::::::e          \n" +
                "          W:::::W         W:::::W                e::::::::eeeeeeee       l::::::l      c:::::::::::::::::c     o:::::::::::::::o     m::::m   m::::m   m::::m      e::::::::eeeeeeee  \n" +
                "           W:::W           W:::W                  ee:::::::::::::e       l::::::l       cc:::::::::::::::c      oo:::::::::::oo      m::::m   m::::m   m::::m       ee:::::::::::::e  \n" +
                "            WWW             WWW                     eeeeeeeeeeeeee       llllllll         cccccccccccccccc        ooooooooooo        mmmmmm   mmmmmm   mmmmmm         eeeeeeeeeeeeee  \n" +
                "                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      \n" +
                "                                                                                                                                                                                      ");
        System.out.println("" +
                "Are you want to create an Bank Account" +
                "\n1  For Display Menu List " +
                "\n2  For Exit to Application");
        int input = Integer.parseInt(bufferedReader.readLine());
        if (input == 1) {
            // Calling program---------------------------  Calling Creating+_Account Function
            Display_Menu_List();
        } else {
            System.out.println("Thank your for using System");
            exit(0);
        }
    }

    void Display_Menu_List() throws IOException {
        try{
        System.out.println("Select your options -------------------------------------------------" +
                "\n1  Open Use Account" +
                "\n2  User All Details [[ User + Account ]]" +
                "\n3  Deposit Your Money" +
                "\n4  Withdrawal your Money" +
                "\n5  Display_Account_Details");
        int input = Integer.parseInt(bufferedReader.readLine());
        switch (input) {
            case 1:
                System.out.println("Open user Account");
                Open_Account();
                break;
            case 2:
                System.out.println("Display All Account Details");
                Display_All_Details();
                break;
            case 3:
                // Add Money
                System.out.println("Deposit your Amount");
                Credit_Amount();
                break;
            case 4:
                // Subtract Money
                System.out.println("Withdrawal your Amount");
                Debited_Amount();
                break;
            case 5:
                Display_Account_Details();
                break;

            default: {
                System.out.println("Invalid Input");

                System.out.println("\n1  Display Menu List" +
                        "\n2  Exit Program");
                int taking_Values = Integer.parseInt(bufferedReader.readLine());
                if (taking_Values == 1) {
                    Display_Menu_List();
                } else if(taking_Values == 2){
                    System.out.println("Exiting to Program ......");
                    exit(0);
                }
                else {
                    System.out.println("Invalid Input");
                    Display_Menu_List();
                }
            }
        }
        }
        catch (InputMismatchException inp){
            System.out.println("Please input Integer Only");
            Display_Menu_List();
        }
    }

    public void Display_Account_Details() throws IOException {
        System.out.println("Name " + this.Name);
        System.out.println("Account type " + this.Account_Type);
        System.out.println("Account Number " + this.Account_Number);
        System.out.println("Phone Number " + this.Phone_No);
        System.out.println("-----------------------------------");
        System.out.println("Select Option" +
                "\n1  Main Menu List" +
                "\n2  Exit Program");
        int temp = Integer.parseInt(bufferedReader.readLine());
        if (temp == 1) {
            Display_Menu_List();
        } else {
            exit(0);
        }

    }

    public void Display_All_Details() throws IOException {
        System.out.println("Enter your Account Number ");
        long temp_Ac_No = Long.parseLong(bufferedReader.readLine());
        if (this.Account_Number == temp_Ac_No) {
            System.out.println("Displaying User Account Details ---------------------------------");
            System.out.println("Name " + this.Name);
            System.out.println("Age " + this.Age_Of_Customer);
            System.out.println("Account Type " + this.Account_Type);
            System.out.println("Address  " + this.Address);
            System.out.println("Phone Number " + this.Phone_No);

            System.out.println("\nSelect Options----------------------" +
                    "\n1  Display Menu List" +
                    "\n2  Terminate Program");
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (temp == 1) {
                Display_Menu_List();
            } else {
                exit(0);
            }

        } else {
            System.out.println("This is not your Account");
            System.out.println("\n1  Re-enter your Account number" +
                    "\n2  Display Menu List");
            int check = Integer.parseInt(bufferedReader.readLine());
            if (check == 1) {
                Display_All_Details();
            } else {
                Display_Menu_List();
            }
        }
    }

    public void Open_Account() throws IOException {
        System.out.println("Enter your Name");
        this.Name = bufferedReader.readLine();
        System.out.println("");
        //--------------------------------
        System.out.println("Enter your Phone Number");
        this.Phone_No = bufferedReader.readLine();
        System.out.println("");
        //--------------------------------
        System.out.println("Enter your Account Type");
        this.Account_Type = bufferedReader.readLine();
        System.out.println("");
        //--------------------------------
        System.out.println("Enter Your Address ");
        this.Address = bufferedReader.readLine();
        System.out.println("");
        //--------------------------------
        System.out.println("Enter your Age");
        this.Age_Of_Customer = Integer.parseInt(bufferedReader.readLine());
        System.out.println("");
        //--------------------------------
        System.out.println("Enter your Initial Amount to Opening an Account");
        this.Amount = Integer.parseInt(bufferedReader.readLine());
        System.out.println("");
        //--------------------------------

        this.Account_Number = Account_Number_Generator(); //-------
        System.out.println(this.Account_Number);

        System.out.println("Thank you for Enter your Necessary Credentials ");
        System.out.println("Redirecting you to Main Menu List");
        Display_Menu_List();

    }

    long Account_Number_Generator() {
        Random random = new Random();
        int temp = random.nextInt(1000, 2000);
        String s1 = Integer.toString(temp);   // Converting integer to string
        String s2 = "6768";
        String concat = s2 + s1;
//        System.out.println( Integer.parseInt(concat));
        return Integer.parseInt(concat);
//            return 0;
    }

    public void Credit_Amount() throws IOException {
        System.out.println("Enter your Account Number");
        long acc_no = Long.parseLong(bufferedReader.readLine());
        if (acc_no == this.Account_Number) {
            System.out.println("Enter your Amount ");
            int temp_Amount = Integer.parseInt(bufferedReader.readLine());
            if (temp_Amount > 1000000) {
                System.out.println("Amount is too High it cannot be credited in your account");
            } else if (temp_Amount < 0 || temp_Amount == 0) {
                System.out.println("Invalid Amount");
            } else {
                this.Amount = temp_Amount;
                System.out.println("Your Amount is Successfully Credited in your Account ");
            }
        } else {
            System.out.println("This is not your Account Number");
            System.out.println("Choose one Option" +
                    "\n1  For Re-Enter your Account number" +
                    "\n2  Go-To Main menu");
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (temp == 1) {
                Credit_Amount();
            } else if (temp == 2) {
                Display_Menu_List();
            } else {
                System.out.println("Invalid Input" +
                        "\nJumping into Main Menu Forcefully");
                Display_Menu_List();
            }
        }
    }

    public void Debited_Amount() throws IOException {
        System.out.println("Enter your Account Number");
        long Check_Ac_No = Integer.parseInt(bufferedReader.readLine());
        if (Check_Ac_No == this.Account_Number) {
            System.out.println("Enter your Amount to Withdrawal");
            int temp_Amount = Integer.parseInt(bufferedReader.readLine());
            // Checking Account Amount status
            if (this.Amount < 500) {
                System.out.println("Your cannot Withdrawal your Amount " +
                        "500 is the Minimum Account Balance");
                System.out.println("Your Current Account Balance is " + this.Amount);
            } else {
                System.out.println(temp_Amount + " is successfully Debited in your account");
                this.Amount = this.Amount - temp_Amount;
                System.out.println("Your Remaining Amount is " + this.Amount + "\n");
                System.out.println("Forwarding to Main menu");
                Display_Menu_List();
            }
        } else {
            System.out.println("This is not your Account Number");
            System.out.println("Choose one Option" +
                    "\n1  For Re-Enter your Account number" +
                    "\n2  Go-To Main menu");
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (temp == 1) {
                Debited_Amount();
            } else if (temp == 2) {
                Display_Menu_List();
            } else {
                System.out.println("Invalid Input" +
                        "\nJumping into Main Menu Forcefully");
                Display_Menu_List();
            }
        }
    }


    //--------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        Creating_Account Rajesh = new Creating_Account();
        Rajesh.Welcome_Screen();
//
    }

}
