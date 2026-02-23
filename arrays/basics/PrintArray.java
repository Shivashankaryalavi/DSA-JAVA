package arrays.basics;
import java.util.Scanner;
public class PrintArray {
    public static void PrintUsingFor(int[] arr){
        System.out.println("Using norml for loop");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void printUsingForEach(int[] arr){
             System.out.println("Using for each loop");
             for(int num :arr){
                System.out.print(num+" ");
             }
             System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        PrintUsingFor(arr);
        printUsingForEach(arr);
        sc.close();
    }
}
