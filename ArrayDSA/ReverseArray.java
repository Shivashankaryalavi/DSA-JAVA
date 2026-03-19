
import java.util.Scanner;

public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
      
        System.out.println("enter array elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = reverseArray(arr);
        System.out.println("Resultant reversed array :");
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
  
    }
    
}
