package ArraysChatgpt;
import java.util.Scanner;

public class PosiandNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entersize of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=0;
        int neg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg++;
            }
            else{
                pos++;
            }
        }
        System.out.println("positive numbers are"+pos);
        System.out.println("Negative numbers are:"+neg);
        sc.close();
    }
    
}
