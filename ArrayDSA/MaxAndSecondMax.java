package ArrayDSA;
import java.util.Scanner;

public class MaxAndSecondMax {
    public static int[] maxAndSecondMax(int[] arr){
        int max =Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax =max;
                max= arr[i];
            }
            else if(arr[i]>secondMax && arr[i]<max){
                secondMax =arr[i];
            }

        }
        return new int[]{max,secondMax} ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] result= maxAndSecondMax(arr);
        
        System.out.println("Maximum element : " + result[0] );
        System.out.println("Second Maximum : " + result[1]);
        
        sc.close();
    }
    
}
