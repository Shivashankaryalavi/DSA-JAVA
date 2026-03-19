
import java.util.Scanner;

public class LeftRotation {
    public static void leftRotate(int[] arr ,int k){
        int n = arr.length;
         k  = k%n;
        for(int i =0;i<k;i++){
            int first = arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter a value of K");
        int k = sc.nextInt();
        System.out.println("Enter array elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        leftRotate(arr, k);
        System.out.println("Array after k rotation");
        for(int num: arr){
            System.out.print(num + " ");
        }
        sc.close();
       
        

    }
}
