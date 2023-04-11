package Array;

public class ReverseAnArray {
    public static void main(String []args){
        int arr[]={10,54,68,79,31,46,19,77,12,34,56,10,20,4,30};

        int mid= Math.floorDiv(arr.length, 2);
        int temp=0,l= arr.length;

        // Printing Before reverse
        System.out.println("Before Reversing");
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();
        // Swapping Logic
        for(int i=0;i< mid;i++){
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-i-1]=temp;
        }
        System.out.println("After Reversing");
        // Printing After reverse
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
