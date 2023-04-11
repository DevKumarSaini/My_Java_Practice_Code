package LoopingPracticePrograms;

public class lableLoop {
    public static void main(String[] args) {
        int i;
        label:
        for(i=1;i<=20;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        for(int j=19;j>=1;j--){
            for(int k=1;j>=k;k++) {
                System.out.print(k*j+" ");
            }
            System.out.println();
        }
    }
}
