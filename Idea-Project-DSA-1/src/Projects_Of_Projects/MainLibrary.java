package Projects_Of_Projects;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

class Library{
    Scanner scanner = new Scanner(System.in);
    String [] Books;
    Library [] MainArray;
    Library(){
        this.Books = new String[10];
//        mainMenu();

    }
    public void addBook(){
        scanner.nextLine();
        System.out.println("Enter you Book name and Author name associated with colon");
        for(int i=0;i< this.Books.length;i++){
            System.out.print("Book "+i+" --> ");
                Books[i]=scanner.nextLine();
        }
        mainMenu();
    }
    public void issueBook(){
        scanner.nextLine();
        try{
        System.out.println("Enter book name which you want to add");
        String str = scanner.nextLine();
    for(int i=0;i<this.Books.length;i++){
        if(this.Books[i].equals(str)){
            System.out.println("Your Book is found");
            this.Books[i]=null;
        }
        else {
            System.out.println("Your Book is not in my library \nPlease Search Agai");
        }
    }
    } catch (NullPointerException exception){
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("Your Book shelf is empty please enter books first in your library");
            System.out.println("\n---------------------------------------------------------------");
        }
    mainMenu();
    }
    public void returnBook(){
        System.out.println("How many Books you want to return");
        byte inp= scanner.nextByte();
        scanner.nextLine(); // for down our cursor to next line
        // Remember string is not taken just next after you input the value
        while (inp>0){
            for (int i=0;i< Books.length;i++){
                if(Books[i] == null){
                    Books[i]=scanner.nextLine();
                    break;
                }
                else {
                    continue;
                }
            }
            inp--;
        }
        mainMenu();
    }
    public void showAvailableBooks(){
    for(int i =0;i<Books.length;i++){
        System.out.println("Book -> "+i+"  >>  "+Books[i]);
        if(this.Books[i]==null){
            continue;
        }
    }
    mainMenu();
    }
    public void mainMenu(){
        System.out.println("Choose Options " +
                "\n1  Adding Books" +
                "\n2  Displaying Books" +
                "\n3  Issue Book" +
                "\n4  Return Book");
        int inp= scanner.nextInt();
        if(inp == 1){
            addBook();
        }
        else if (inp == 2) {
            showAvailableBooks();
        }
        else if (inp==3) {
            issueBook();
        }
        else if(inp == 4){
            returnBook();
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    public void hostArray(){
        // Creating All the Objects in this function
        Library History = new Library();
        Library Computer = new Library();
        Library English = new Library();
        Library Space = new Library();
        Library Oceans = new Library();
        Library Personality = new Library();

        MainArray = new Library[]{History, Computer,English,Space,Oceans,Personality};

        System.out.println("Sections In Your Library");
        for(int i=0;i<MainArray.length;i++){
            System.out.println(i+")  "+MainArray[i]);
        }
        System.out.println("Select your Library Section");
        int inpsel= scanner.nextInt();
        switch (inpsel){
            case 1:
                History = new Library();
        }

    }
}
public class MainLibrary {
    public static void main(String[] args) {
//        You have to implement a library Using Java Class "Library"
//        Methods: addBook, issueBook, returnBook, showAvailableBooks
//        Properties: Array to store the available books,
//        Array to store the issued books
            Library library = new Library();
            library.hostArray();
        /*
        what if i store all objects of library in an object type array and first we
        show all the objects of the array then select one of them get perform certain operations on
        them and get back in the main array of Object.

         */

    }
}
