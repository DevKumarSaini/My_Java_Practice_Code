package TestingPrograms;

public class breakingNumber {
    public static void main(String[] args) {
        int n=2345;
        int p=n;
        int product=1;  //Multiplication
        int sum=0;   // addition

        while(n>0){
            int digit=n%10;  // last Extracted Value is Stored in Digit

            product=product*digit;
            sum=sum+digit;
//            System.out.print(digit+" ");

            System.out.println(n);
            n=n/10;    // and using divide the value will  be decreases;

        }
        System.out.println("Product of "+p+" is "+product);
        System.out.println("Sum of "+p+" is "+sum);
        System.out.println("Result of Both is "+(product-sum));

    }
}
