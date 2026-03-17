package ArrayDSA;
import java.util.Scanner;
public class ReverseArrays {
    public static int[] reverse(int[] arr ){
         int start =0;
         int end = arr.length-1;
         while (start<end) {
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
            
         }
         return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc .nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result =reverse(arr);
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();

     }
    
}
