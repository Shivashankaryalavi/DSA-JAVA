package ArraysChatgpt;
import java.util.Scanner;


public class NegativeNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

   System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Negative elements are");
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
                found = true;
            }
          
        }
          if(!found){
                System.out.println(0);
            }
            sc.close();

    }
    
  

}
    

