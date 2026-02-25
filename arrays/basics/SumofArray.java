package arrays.basics;
import java.util.Scanner;
public class SumofArray {
    public static int Sumofarray(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
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
        int result = Sumofarray(arr);
        System.out.println("The sum of array is : " + result);
        
        sc.close();
    }
}