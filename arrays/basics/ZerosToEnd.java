package arrays.basics;
import java.util.Scanner;
public class ZerosToEnd {
    public static void moveZeros( int nums[]){
        int size = nums.length;
        if(size==0 || size==1){
            return;
        }
        int nz =0 ,z=0;
        while(nz<size){
            if(nums[nz]!=0){
                int temp = nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        int n = sc.nextInt();
        int nums[]= new int[n];
        System.out.println("Enter array elements : ");
        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        moveZeros(nums);
        System.out.println("After moving zeros to an end : ");
        for(int  num : nums){
            System.out.print(num + " ");
        }
        sc.close();

    }
}