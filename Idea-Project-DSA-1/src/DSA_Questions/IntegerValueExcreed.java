package DSA_Questions;

import java.util.Scanner;

public class IntegerValueExcreed {
    public static void main(String[] args) {

        IntegerValueExcreed obj= new IntegerValueExcreed();
        int receive = obj.reverseCheck();
        System.out.println("Your ans is  -->  "+receive);;
    }
    public int reverseCheck(){
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        int limitTake = scanner.nextInt();
        int ans=0;
        int i=0;
        while (limitTake>0){
//            int getnumber= scanner.nextInt();
            int getnumber = limitTake%10;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10){
                return 0;
            }
            ans=((ans*10)+getnumber);
            limitTake=limitTake/10;
            i++;
        }
            return ans;
    }
}
