package ArrayDSA;
import java.util.Scanner;
public class MaximumElement {
    public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array elements: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result = maxElement(arr);
        System.out.println("Maximum element is : " + result);
        sc.close();
    }
    
}
