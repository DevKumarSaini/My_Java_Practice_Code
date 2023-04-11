package Classes_And_Objects;

public class Average {
    private int average(int ... avg){
        int totalAvg=0,count=0;
        for(int i : avg){
            totalAvg=totalAvg+i;
            count++;
        }
        return totalAvg/count;
    }

    public static void main(String[] args) {
        Average average = new Average();
    int temp=average.average(12,54,65,32,49,87,65,98,35,15,64,7);
        System.out.println(temp);
    }
}
