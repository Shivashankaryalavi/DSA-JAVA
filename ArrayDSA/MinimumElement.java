package ArrayDSA;
import java.util.Scanner;
public class MinimumElement {
    public static int minimumElement(int[] arr){
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
     
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result = minimumElement(arr);
        System.out.println("Minimum element is : " + result);
        sc.close();
        
     
    }
    
}
