package arrays.basics;
import java.util.Scanner;
public class SortingArray {
    public static void bubblesort(int[] arr){
      
        for(int i =0; i<arr.length;i++){
              boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped =true;

                }
            }
            if(!swapped){
                break;
            }
        }
     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubblesort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}