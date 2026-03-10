package Traversal;
import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array elements : ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result =secondLargest(arr);
        System.out.println("Second largest element : " + result);
        sc.close();
    }
}
