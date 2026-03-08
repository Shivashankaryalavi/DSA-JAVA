package arrays.basics;
public class CountEvenOrOdd {
    public static void countEvemOdd(int[] arr){
        int even =0;
        int odd = 0;
        for(int num : arr){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
          
        }
        System.out.println("Even count is : " + even);
        System.out.println("Odd count is : "+ odd);
    }

    public static void main(String[] args) {
        int[] arr = {10,25 ,69,35,28,75,24,26,71,99,100};
        countEvemOdd(arr);
        
    }
}