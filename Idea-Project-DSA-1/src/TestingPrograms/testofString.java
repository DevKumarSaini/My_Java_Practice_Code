package TestingPrograms;

public class testofString {
    public static void main(String[] args) {
        testofString obj= new testofString();
        System.out.println(obj.RandomStringGenerator(10));
    }

    public StringBuilder RandomStringGenerator(int num){
        StringBuilder sb = new StringBuilder(); // not givinge a perticular length
        String RamdomsString="abcdefghijklmnopqrstuvwxyz"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i=0;i<num;i++){
            int Ran=(int)(Math.random()*(RamdomsString.length()));
            sb.append(RamdomsString.charAt(Ran));
        }
//        System.out.println(RandomStringGenerator(45));

        return sb;
    }
}
