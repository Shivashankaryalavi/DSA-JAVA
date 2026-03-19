import java.util.Scanner;
public class MissingNumber {
    public static int missingNumber(int[] arr,int n){
        int totalSum =(n*(n+1))/2;
        int arraysum =0;
        for(int num: arr){
            arraysum+=num;

        }
        return totalSum-arraysum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int[]arr = new int[n-1];
        System.out.println("Enter array elements : ");
        for(int i =0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int result = missingNumber(arr, n);
        System.out.println("missing number is :" + result);
        sc.close();     
    }
}
