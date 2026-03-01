package arrays.basics;

import java.util.Scanner;

public class MoveZerosToEnd {

    public static void moveZeros(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();

        int[] arr =new int[n];
        System.out.println("Enter array elements : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}