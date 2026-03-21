import java.util.Scanner;


public class DutchFlag {
    public static int[] dutchFlag(int[] arr){
        int low =0;
        int mid =0;
        int high = arr.length-1;
        while (mid<=high) {
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
            
        }
        return arr;

    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a size of an array");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter array elements");
         for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int[] result = dutchFlag(arr);
         for(int num :result){
            System.out.print(num+" ");
         }
         sc.close();
    }
}