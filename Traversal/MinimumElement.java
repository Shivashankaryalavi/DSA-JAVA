package Traversal;
import java.util.Scanner;
public class MinimumElement {
    public static int findMin(int [] arr){
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Array is empty");
            sc.close();
            return;
        }
        int [] arr = new int[n];
        System.out.println("Enter array elements :");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result = findMin(arr);
        System.out.println("minimum number is : " + result);
        sc.close();
    }
}
