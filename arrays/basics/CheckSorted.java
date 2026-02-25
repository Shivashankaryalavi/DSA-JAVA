package arrays.basics;
import java.util.Scanner;
public class CheckSorted {
    public static boolean isSorted(int[] arr){
 
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1])
                 return false;

        }
        return true;
          
            

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements : ");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean result = isSorted(arr);
        System.out.println(result);
        sc.close();
    }
}