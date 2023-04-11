package Practice_Programs;

import java.util.Scanner;

public class farahnite_to_Celcious_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fahrenheit to celsius");
        float inp=scanner.nextFloat();
        float f=0;
        while (f<=inp) {
            float celcious = ((f - 32) * 5 / 9);
            if(celcious == 0 ){
                System.out.println("========= Reached O Degree =========");
            }
            System.out.println(f+" °F    ==   "+celcious+"  °C");
            f++;
        }
    }
}
