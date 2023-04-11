package String;

public class OperationOnCharArray {
    public static void main(String[] args) {
        String st="Hello Darling i am learning Java right now";
        char [] ch =st.toCharArray();
        for(int pri : ch){
            System.out.print((char)pri+" ");
    }
        System.out.println("\nLength of your array is "+st.length());
}
}
