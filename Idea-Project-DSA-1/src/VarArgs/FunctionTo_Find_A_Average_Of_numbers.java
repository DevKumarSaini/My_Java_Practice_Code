package VarArgs;

public class FunctionTo_Find_A_Average_Of_numbers {
    public static void main(String[] args) {
        FunctionTo_Find_A_Average_Of_numbers perform = new FunctionTo_Find_A_Average_Of_numbers();
        int store=perform.Average(10,20,34,56,78,14,75,85,96,32,65,45);
        System.out.println("Average of Given numbers is "+store);
    }
    private int Average(int ... arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum/arr.length;
    }
}
