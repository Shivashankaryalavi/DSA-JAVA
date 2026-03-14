package Traversal;
import java.util.Scanner;
public class ReverseArray {
    public static void reverseArray(int[] arr){
        int right =0;
        int left = arr.length-1;
        while(right<left){
            int temp =arr[right];
            arr[right] = arr[left];
            arr[left]= temp;

            left--;
            right++;

        }
         

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        reverseArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}