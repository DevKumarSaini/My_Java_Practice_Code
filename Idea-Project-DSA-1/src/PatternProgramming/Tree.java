package PatternProgramming;

public class Tree {
    //-------------------------------------  Locan
    int var1=10;
    static int x =4000;
    int var2=140;
    char ch='D';
    String st="ev";
    //------------------------------------- Cloning object by Copy Constructor
    Tree(){}
    Tree(int var1,int var2,char ch,String st){
        this.var1=var1;
        this.var2=var2;
        this.ch=ch;
        this.st=st;
    }
    Tree(Tree clone){   // this is copy constructor
        var1=clone.var1;
        var2=clone.var2;
        ch= clone.ch;
        st= clone.st;
    }

    //-------------------------------------
    public static void main(String [] args) throws CloneNotSupportedException {
        int n=15;
        for (int i=0;i<n-10;i++){
            System.out.print("            ");
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //-------------------------------------
        for (int i=0;i<n-5;i++){
            System.out.print("            ");
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //------------------------------------
        for (int i=0;i<n;i++){
            System.out.print("            ");
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //-----------------------------------
        for (int i=0;i<n-10;i++){
            System.out.print("            ");
            for(int j=0;j<n;j++){
                System.out.print(" ");
                if(j>9  && j < 12){
                    System.out.print("||");
                }
            }
            System.out.println();
        }
        Tree t1=new Tree(10,20,'D',"ev"),
                t2=new Tree(),
                t3=new Tree(),
                t4=new Tree(),
                t5=new Tree();
        t2=t1; // Copy COnstructor using Copy COnstructor
t3.calling();
//        t2.clone(t3);
    }
    public void calling(){
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
    }
}
