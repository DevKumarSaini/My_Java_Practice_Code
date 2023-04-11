package TestingPrograms;

public class freelyTEsting {
    public static void main(String[] args) {
        int i=0;
        while(i<100) {
        if(i>50  && i<55) {
            System.out.println("This part is skipped");
            i++;
            continue;
        }
            System.out.println(i);
            i++;
        }
    }
}
