package ArraysChatgpt;

public class OddNumber {
    public static void main(String[] args) {
        int[] arr={10,20,33,45,76};
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                odd++;
            }
        }
        System.out.println(odd);
    }
    
}
