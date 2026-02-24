package arrays.basics;
import java.util.Optional;
import java.util.Scanner;


public class MinimumElement {

    public static int findMinimum(int arr[]){
        int  minimum = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Array must contain atleast  one element");
            sc.close();
            return;
        }
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i =0; i< n;i++){
            arr[i]=sc.nextInt();
        }
        int result = findMinimum(arr);
        System.out.println("Minimum element is : " + result);
        sc.close();
    }
}
