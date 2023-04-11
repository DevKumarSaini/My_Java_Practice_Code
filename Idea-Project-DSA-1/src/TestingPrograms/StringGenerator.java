package TestingPrograms;

public class StringGenerator {

    public String RandomStringGenerator(int n){
        String AlphaNumericString ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";

        // This is used for defining size fo string Builder
        StringBuilder sb= new StringBuilder(n);

        for(int i=0;i<n;i++){
            int index = (int)(AlphaNumericString.length()*Math.random());

            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    StringGenerator rsg=new StringGenerator();
        System.out.println(rsg.RandomStringGenerator(5));
    }
}
