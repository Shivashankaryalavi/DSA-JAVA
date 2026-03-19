

import java.util.Scanner;

public class MoveUserNumberToEnd {
       public static int[] moveNumberToEnd(int[] arr, int num){
        int size = arr.length;
        if(size==0 || size==1){
            return arr;
        }
        int nz =0;
        int z =0;
   
        while(nz<size){
            if(arr[nz]!=num){
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
        System.out.println("Enter a number to move at end");
        int num = sc.nextInt();
        int[] result = moveNumberToEnd(arr,num);
        for(int num1 : result){
            System.out.print(num1 + " ");
        }
        sc.close();

    }
    
}
