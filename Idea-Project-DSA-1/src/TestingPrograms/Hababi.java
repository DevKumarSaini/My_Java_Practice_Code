package TestingPrograms;

    import java.util.Random;

    public class Hababi {
        class Baby{
            public void displayBaby(){
                System.out.println("This is Baby of Inner Class\n" +
                        "And We Run Inner Class Object Object Name of --> \"Displaying Baby\"");
            }
        }
        public static void main(String[] args) {
            Hababi hababhiObject = new Hababi();
            Hababi.Baby babyobj = hababhiObject.new Baby();
            babyobj.displayBaby();
            //----------------------------------------------------------------
            Random random = new Random();
            int count=0;
            int check=0;
            int n=30;
            while(true){
                System.out.print(random.nextInt(20,50)+" ");
                if(count>=n){
                    System.out.println();
                    count=0;
                    check ++;
                    n +=1;
                    if(check == 30){
                        System.exit(0);
                    }
                }
                count ++;
            }
        }
    }
