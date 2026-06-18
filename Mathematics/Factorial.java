package Mathematics;
import java.util.Scanner;
public class Factorial {
    static int Fact(int n){
        int res =1;
        for(int i=1;i<=n;i++){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(Fact(n));

         
    }
    
}
