package Classes_And_Objects;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Random;

import static java.lang.System.exit;

public class GuessTheNumber {
    int Random;
    int takeUserInput;
    int userGuess;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    GuessTheNumber()throws IOException{ // Constructor to Guess the Random Number Once
        Random random = new Random();
        this.Random= random.nextInt(100);
        takeUserInput();
    }

    public void takeUserInput()throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-------------------------------------------------------------\n");
        System.out.println("Input Number");
        int localInput=0;
        try {

             localInput = Integer.parseInt(bufferedReader.readLine());
        }catch (InputMismatchException e){
            System.out.println("Your are try to input Non Integer Number");
            takeUserInput();
        }
        catch (NumberFormatException e){
            System.out.println("Your are try to input Non Numeric Number");
            takeUserInput();
        }
//        this.takeUserInput=localInput; //  ----- Partial Input Without Checking the number
        isCorrect(localInput);  // Passing user input to check it is a valid number or not
    }
    public void isCorrect(int check) throws IOException {
        try {

            if (check >= 0 && check <= 100) {
                System.out.println("Correct Input -- "+check);
                this.takeUserInput = check;
                MainGame();
            } else {
                System.out.println("Invalid Input");
                takeUserInput();  //Method to calling again take input to re-enter the input
            }
        }catch (InputMismatchException e){
            System.out.println("Enter Only Numbers");
        }
        catch (NumberFormatException e){
            System.out.println("Your Are Try to input Alphabets and Special Characters");
        }
        finally {
//            System.out.println("Invalid Input Alphabets and Special Characters Are used");
            takeUserInput();
        }
    }
    public void setUserGuess(){  // this is updating user score
        this.userGuess++;
    }

    public int getUserGuess(){// this is getter to get the user choices to pass the game
        return  this.userGuess;
    }

    //-------------------------------------------------------------------
    public void MainGame()throws IOException{
        System.out.println("Printing Random Number  ->  "+Random);
        do {
            if(this.Random < this.takeUserInput){  // Eak Bar iske andar se call krke Dheekta hu  !!!!!!!
                System.out.println("Your Guess is too high");
                setUserGuess();
                takeUserInput();
            } else if (this.Random > this.takeUserInput) {
                System.out.println("Your Guess is too Low  -- "+this.takeUserInput);
                setUserGuess();
                takeUserInput();
            }
            else {
                Random random = new Random();
                int RandomUpdator=random.nextInt(100);
                this.Random=RandomUpdator;
                System.out.println("!!!!!!!!!------------Congratulation------------!!!!!!!!!");
                System.out.println("Your Guess the number");
                System.out.println("Your Take total "+getUserGuess()+" chance to Guess the right One");
                this.userGuess=0;
                exit(0);
            }

            // Varna Yeha se call karuga  !!!!!!!!!!!!!!!
        }while (true);
    }
    public static void main(String[] args) throws IOException{
        GuessTheNumber obj= new GuessTheNumber();
    }
}
