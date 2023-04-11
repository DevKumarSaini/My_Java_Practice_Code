package PackagesPrograms;
import java.util.ArrayList;
public class PackageProgram {
    public static void main(String[] args) {
    ArrayList<Integer> localvalue = new ArrayList<Integer>();
    int i=0;
    java.util.Random random = new java.util.Random(9);
    while (i<100){
//        int localPuncher= ran
        localvalue.add(random.nextInt(10));
        i++;
    }
        System.out.println(localvalue);
        System.out.println(localvalue.size());
    }
}
