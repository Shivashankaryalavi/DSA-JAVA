package Traversal;

import java.util.Scanner;

public class AverageOfArray {
    public static int average(int[] arr){
    
        int sum =0;
    
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];

        }
        int avg = sum/arr.length;

        return avg;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements :");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=average(arr);
        System.out.println("Average of array is : " + result);
        sc.close();

    }
    
}
