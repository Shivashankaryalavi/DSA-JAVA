import java.util.Scanner;
public class SelectionSort {


    public static int[] selectionSort(int[] arr){
        int n = arr.length;
   
        for(int i =0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                     minIndex=j;
                }
                  
            }
                    int temp =arr[i];
                    arr[i]=arr[minIndex];
                    arr[minIndex]=temp;
        }
        return arr;
    }
    









     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] result =selectionSort(arr);
        for(int num: result){
            System.out.println(num +" ");
        }
        sc.close();
     }
    
}
