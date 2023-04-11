package Practice_Programs;
import java.util.Stack;

public class ConvertNumberTOBinary {
    public static void main(String[] args) {
//        for(int i=0;i<=1000;i++){
//            System.out.println(i+" >>--> "+Integer.toBinaryString(i));
//            System.out.println(Integer.hashCode(45687));
//        }

        // Function to convert integer to binary
        int i;
        ConvertNumberTOBinary convert = new ConvertNumberTOBinary();
        for( i=0;i<=1000;i++){
            convert.decimalToBinary(i);
            System.out.println();
        }

    }
     void decimalToBinary(int num)
    {
        // Creating Stack Object Vector
        Stack<Integer> st = new Stack<>();

        // Number Should be positive
        while (num > 0) {

            // Pushing numbers inside stack that
            // are divisible by 2
            st.push(num % 2);
            // Dividing number by 2
            num = num / 2;
        }

        // Checking condition whether stack is empty
        while (!(st.isEmpty())) {

            // Printing binary number

            System.out.print(st.pop());
        }
    }
}
