package Practice_Programs;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSecior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalChance=5;
        int compChance=0,userChance=0;
        do {
            System.out.println("\n--------------->  "+(totalChance)+" Chance Left");

            System.out.println("Enter your input " +
                    "\n0 for Rock" +
                    "\n1 for Paper" +
                    "\n2 for Scissor");
            System.out.println("Enter your Input");
            byte usrinp = scanner.nextByte();

            Random random = new Random();
            byte computer = (byte) random.nextInt(3);

            if (usrinp == computer) {
                System.out.println("Match Draw");
            } else if (usrinp == 0 && computer == 2 || usrinp == 1 && computer == 0 || usrinp == 2 && computer == 1) {
                System.out.println("Your Won !!!!");
                userChance++;
            } else {
                System.out.println("Your Loose");
                compChance++;
            }

            System.out.println("Computer guess " + computer);
            System.out.println("User     guess " + usrinp);

            totalChance--;
            System.out.println("------------------------------------------------------");
        }while (totalChance>0);

        if(userChance>compChance){
            System.out.println("User is the Final Winner !!!");
            System.out.println("By Winning "+userChance+" Matches");
        }
        else {
            System.out.println("Computer is the Final Winner !!!");
            System.out.println("By Winning "+compChance+" Matches");
        }

    }
}
