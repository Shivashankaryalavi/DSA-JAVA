package Traversal;
import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicates {
    public static int  removeDuplicates(int[] arr){
     Arrays.sort(arr);
     int slow =0;
    for(int fast = 1;fast<arr.length;fast++){
          if(arr[fast] != arr[slow]){
            slow++;
            arr[slow]=arr[fast];
          }

    }
    return slow+1;

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter array size : ");
        int[] arr = new  int[sc.nextInt()];
        System.out.println("Enter array elements :");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = removeDuplicates(arr);
        for(int i=0;i<result;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}