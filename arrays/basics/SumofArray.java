package arrays.basics;
import java.util.Scanner;
public class SumofArray {
    public static int[] Sumofarray(int[] arr){
        if(arr.length == 0){
            return new int[]{0,0};
        }

        int sum =0; 
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
          
        }
   
        int avg = sum/arr.length;
        return new int[]{sum,avg};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = Sumofarray(arr);
        int sum = result[0];
        int avg = result[1];
        System.out.println("The sum of array is : " + sum);
        System.out.println("the  average is : " + avg);
        
        sc.close();
    }
}