package PatternProgramming;

public class NumberBrick {

    NumberBrick(){
        System.out.println();
    }
    public static void main(String[] args) {
        short n=20;
        int i=1,count=0;
        while(i<n){
            int j=1;
            while (j<n){
                System.out.print(" "+count+" ");
                count +=1;
                j++;
            }
            System.out.println();
            i +=1;
        }
        NumberBrick obj= new NumberBrick();
        obj.Display_add();
    }
    public void Display_add(){
        System.out.println("non parameterised method");
        this.Display_add(10);

    }

    public void Display_add(int a){
        System.out.println("single parameterised method");

    }
}
