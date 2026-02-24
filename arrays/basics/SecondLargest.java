package arrays.basics;
import java.util.*;
public class SecondLargest {
    public static int secondLargest (int[] arr){
        if(arr.length<2){
           throw new IllegalArgumentException("Array must contain atleast two elements");
        }
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!= largest ){
                secondlargest=arr[i];
            }

        }
        if(secondlargest==Integer.MIN_VALUE){
            throw new IllegalArgumentException("No second largest");
        }
        return secondlargest;
        
    
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter a array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result =secondLargest(arr);
        System.out.println("second largest element is : " + result);
        sc.close();
    }

}