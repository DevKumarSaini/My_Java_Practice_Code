package BitwiseProgram;

import java.util.ArrayList;

public class BItwiseOperations {
    public static void main(String[] args) {
//     int i=0;
//        while(i<=50){
//            System.out.println(i+"  ->  "+Integer.toBinaryString(i));
//            i++;
//     }
//        System.out.println(~7);
        ArrayList <Integer> al = new ArrayList<Integer>();
        for(int i=0;i<100;i++){

            System.out.println(al.add(i));
        }
        System.out.println(al);
        al.remove(46);
        al.remove(47);
        al.remove(48);
        al.remove(49);

        int count=1;
        try{
        for(int i=0;i<count;i++){
            System.out.println(al.remove(i));
            count ++;
            if(i==120){
                break;
            }
        }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Reduce array length");

        }
        finally {
            {
                System.out.println(al);
            }
        }
    }
}
