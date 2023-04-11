package VarArgs;

public class TEstingVarargs {
    public static void main(String[] args) {
        TEstingVarargs obj=new TEstingVarargs();
        float holevalue=obj.average(10,23,74,98,56,34,87,24,25,26,13,45,37,98,66,24);
        float sum=obj.sumOfAll(10,23,74,98,56,34,87,24,25,26,13,45,37,98,66,24);
        System.out.println("Average is  >-->  "+holevalue);
        System.out.println("Sum of all  >-->  "+sum);
        System.out.println("Subtraction of value is  >-->  "+obj.fixingOneARgument(200,10,32,54,10));
    }
    public float average(int ...arr){
        float sum=0;
        int i=0;
        while(i< arr.length){
            sum +=arr[i];
            i++;
        }
        return sum/arr.length;
    }
    public int fixingOneARgument(int a,int ... arr){
        int sum=0;
        for(int aa: arr){
            sum =sum+aa;
        }
        return a-sum;
    }
    public int sumOfAll(int ...arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
}
