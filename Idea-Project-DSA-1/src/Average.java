public class Average {

    public int average(int ...arr){
        int check = arr.length;
        int result=0;
        for(int a: arr){
            result += a;
        }
        int avg = result/check;
        return avg;
    }
}
class action1{
    public static void main(String[] args) {
        Average obj1 = new Average();
        int store=obj1.average(10,34,51,64,78,21,54,68,95,36);
        System.out.println("Average of your value is "+store);
    }
}
