package Array;

public class Calculate_Average_Marks {
    String sname;
    int hindi,english,maths,science;

    Calculate_Average_Marks(String sname,int hindi,int english,int maths, int science){
        this.english=english;
        this.hindi=hindi;
        this.maths=maths;
        this.science=science;
        this.sname=sname;
    }
    public static void AverageNumber(Calculate_Average_Marks obj[]){
        int Averages=0;
        for(int i=0;i< obj.length;i++){
            System.out.println("--------------------------------------------------------");
            System.out.println("Student Name  "+obj[i].sname);
            System.out.println("English   "+obj[i].english);
            System.out.println("Hindi     "+obj[i].hindi);
            System.out.println("Maths     "+obj[i].maths);
            System.out.println("Science   "+obj[i].science);
            Averages=(obj[i].english+obj[i].science+obj[i].maths+obj[i].hindi)/4;
            System.out.println("Average Mask  "+Averages);
            System.out.println("--------------------------------------------------------");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Calculate_Average_Marks Rohan=new Calculate_Average_Marks("Rohan Sharma",45,78,65,98);
        Calculate_Average_Marks Manish=new Calculate_Average_Marks("Manish Kumawat",65,32,78,55);
        Calculate_Average_Marks suresh=new Calculate_Average_Marks("Suresh Meena",12,23,45,56);
        Calculate_Average_Marks gopal=new Calculate_Average_Marks("Gopal Gujar",78,89,56,45);
        Calculate_Average_Marks gagendra=new Calculate_Average_Marks("Gagendra Goyal",43,56,89,17);

        Calculate_Average_Marks [] Students={Rohan,Manish,suresh,gopal,gagendra};
        AverageNumber(Students);

    }
}
