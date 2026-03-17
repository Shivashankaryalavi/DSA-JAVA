package ArrayDSA;
import java.util.Scanner;
public class MoveZerosToEnd {
    public static int[] moveZerosToEnd(int[] arr){
        int size = arr.length;
        if(size==0 || size==1){
            return arr;
        }
        int nz =0;
        int z =0;
        while(nz<size){
            if(arr[nz]!=0){
                int temp = arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
        return  arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements :");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = moveZerosToEnd(arr);
        for(int i =0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
        sc.close();

    }
}