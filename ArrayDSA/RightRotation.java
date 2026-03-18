package ArrayDSA;
import java.util.Scanner;


public class RightRotation {
    public static void rightRotation(int[] arr,int k){
             int n = arr.length;
             if(n==0) return;
             k= k%n;
             for(int i =0;i<k;i++){
                int last = arr[n-1];
    
                for(int j =n-1;j>0;j--){
                    arr[j]= arr[j-1];
                }
                arr[0]=last;
             }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        rightRotation(arr, k);
        for(int num : arr){
            System.out.print(num +" ");
        }
        sc.close();
    }
    
}
