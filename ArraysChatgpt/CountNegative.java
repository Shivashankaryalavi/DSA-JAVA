package ArraysChatgpt;

public class CountNegative {
    public static void main(String[] args) {
        int[] arr={10,20,30,-45,-67};
        int neg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg++;
            }
        }
        System.out.println(neg);
    }
}
