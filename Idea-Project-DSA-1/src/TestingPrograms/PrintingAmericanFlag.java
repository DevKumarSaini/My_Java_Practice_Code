package TestingPrograms;

public class PrintingAmericanFlag {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i % 2 == 0){
//                System.out.println("*  *  *  *  *  *  *  *  *  * ");
                for(int j=0;j<10;j++){
                    System.out.print("*   ");
                }
                for(int j=0;j<60;j++){
                    System.out.print("=");
                }
                System.out.println();
            }
            else {
//                System.out.println(" *  *  *  *  *  *  *  *  *  * ");
                for(int j=0;j<10;j++){
                    System.out.print(" *  ");
                }
                for(int j=0;j<60;j++){
                    System.out.print("=");
                }
                System.out.println();
            }
        }
        for (int i=0;i<=10;i++){
            for(int j=0;j<=99;j++){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
