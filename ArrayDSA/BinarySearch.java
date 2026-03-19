import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr , int target){
        int n =arr.length;
       int left =0;
       int right = n-1;
       
       while(left<=right){
        int mid = left +( right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }

       }
       return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements :");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a target value ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if(result!=-1){
            System.out.println("number found at index "+ result);
        }
        else{
            System.out.println("Not found");
        }
        sc.close();

    }
    
}
