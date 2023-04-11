package Practice_Programs;

import java.util.ArrayList;

public class typeConversion {
    public static void main(String[] args) {
        String s=new String("Hello bBuddy");
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        StringBuffer sb= new StringBuffer();
        StringBuffer sb1= new StringBuffer();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);

        System.out.println("Printing the capacity of string buffer  ->  "+sb.capacity());
        long l=sb.hashCode();
        ArrayList<Integer> hasnumber= new ArrayList<Integer>();
        while(l>0){
            int temp=(int)l%10;
            int temp2=(int)l/10;
            hasnumber.add(temp);
            l=temp2;
        }
        System.out.println("\n"+sb1.append(hasnumber));
        System.out.println(sb1.reverse());
        sb.append(78.98);
        System.out.println(sb);
        String ss=("Google Earth");
        System.out.println(ss.substring(0,3));
    }
}
