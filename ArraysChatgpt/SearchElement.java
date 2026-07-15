package ArraysChatgpt;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to search");
        int n=sc.nextInt();
        int[] arr={10,20,3,40,5,8,45,74};
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println(n);
                found=true;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        else{
            System.out.println("found");
        }
        
    }
}
