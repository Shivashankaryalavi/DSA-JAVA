package Mathematics;

import java.util.Scanner;

public class Digitcount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc .nextInt();
        int count =0;
        if (n==0){
            count=1;
        }
        else{
        while(n>0){
          n= n/10; 
            count++;
        }
    }
          System.out.println(count);
    }
  
    
}
