
import java.util.Scanner;
public class LinearSearch {
    public static  int linearSearch(int[] arr,int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if(n==0){
            System.out.println("Array is empty");
            sc.close();
            return;
        }
        System.out.println("Enter array elements");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target value");
        int target = sc.nextInt();
        int result = linearSearch(arr, target);
        if(result!=-1){
            System.out.println("Element found at index : " + result);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();

    }
}
 