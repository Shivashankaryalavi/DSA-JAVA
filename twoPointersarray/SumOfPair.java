package twoPointersarray;
import java.util.*;
public class SumOfPair {
    public static boolean pairSum(int[] arr,int target){
        int left =0;
        int right = arr.length-1;
  
        while(left<right){
            int sum =arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if(sum< target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a target");
        int target = sc.nextInt();
        Arrays.sort(arr);
    
        System.out.println(pairSum(arr,target));
        sc.close();
        

    }
}