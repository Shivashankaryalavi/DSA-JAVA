package arrays.basics;
import java.util.Scanner;
public class EvenoddCount {
    public static int[] countEvenOdd(int[] arr){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
           
        }
         return  new int[]{even,odd};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements  : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=countEvenOdd(arr);
        System.out.println("EvenCount : " + result[0]);
        System.out.println("Oddcount : "+ result[1]);
        sc.close();
    }
}