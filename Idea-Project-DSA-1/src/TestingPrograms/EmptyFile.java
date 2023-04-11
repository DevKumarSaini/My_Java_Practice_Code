package TestingPrograms;

public class EmptyFile{
    public static void main(String [] args){
        System.out.println(Math.pow(4,4));
        System.out.println("---------------------  Using Bitwise Operator");
        int temp=4;
        for (int i = 0; i<7;i++){
            System.out.println(temp<<i++);
        }
    }
}
