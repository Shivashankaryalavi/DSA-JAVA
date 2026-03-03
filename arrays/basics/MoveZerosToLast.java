package arrays.basics;
import java.util.Scanner;
public class MoveZerosToLast {
    public static void moveZerosTolast(int arr[]){
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
            
        }
        while (j<arr.length) {
                arr[j]=0;
                j++;
                
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        moveZerosTolast(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();

    }
}