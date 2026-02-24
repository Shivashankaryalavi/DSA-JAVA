package arrays.basics;
import java.util.Scanner;
public class CountPositiveNegativeZero {
    public static int[] PositiveNegativeZero(int[] arr){
        int positive =0;
        int negative=0;
        int zero=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else{
                negative++;
            }
        }
        return new int[]{positive,negative,zero};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int[] result=PositiveNegativeZero(arr);
        System.out.println("Positive count :" + result[0]);
        System.out.println("negative count : " + result[1]);
        System.out.println("Zeros count : " +result[2]);
        sc.close();
        
    }
}