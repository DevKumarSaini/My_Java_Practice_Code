package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Library {

        protected String [] Books = new String[10];

        public void AvailableBooks(){
                System.out.println("All Available Books ");
                for(int i=0;i<Books.length;i++){
                        System.out.println(Books[i]);
                }
        }

        public void AddBook(){
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Position of Your new Book ");
                int position = scanner.nextInt();
                System.out.println("Enter your Book");
                for(int i=position;i<Books.length;i++){
                       scanner.nextLine();
                        Books[i]=scanner.nextLine();
                        System.out.println("Add more press 1\nStop for press 2");
                        int check= scanner.nextShort();
                        if(check == 1){
                        }
                        else {
                                break;
                        }
                }
        }

        public void IssueBook(){

        }
        public void ReturnBook(){

        }
}
class Main{
        public static void main(String [] args){
                Library person1= new Library();
                person1.AddBook();
                person1.AvailableBooks();
        }
}
