
import java.util.Scanner;

public class SortedArray {
    public static boolean isArraySorted(int[] arr){
        if(arr.length<=1){
            return true;
        }
       
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        
        System.out.println("Enter array elements : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isArraySorted(arr)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
        sc.close();
    }
    
}
