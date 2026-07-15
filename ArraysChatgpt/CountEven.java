package ArraysChatgpt;

public class CountEven {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,33,35};
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
        }
        System.out.println(even);
    }
}
