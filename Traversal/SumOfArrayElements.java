package Traversal;
import java.util.Scanner;
public class SumOfArrayElements {
    public static int sumOfArray(int[] arr){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Array is empty");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter Array elements :");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = sumOfArray(arr);
        System.out.println("Sum of Array is :" + result);
        sc.close();
    }
}