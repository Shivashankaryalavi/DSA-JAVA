package Traversal;
import java.util.Scanner;

public class SortedArray {

    public static boolean sortedArray(int[] arr){
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
        int[] arr = new int[n];
        if(n ==0 ){
            System.out.println("Array is empty ");
            sc.close();
            return;
        }
        
        System.out.println("Enter array elements : ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean result= sortedArray(arr);
        System.out.println("Is Array sorted ? " + result);
        sc.close();
        
    }
    
}
