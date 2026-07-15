package ArraysChatgpt;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int largest=0;
        int seclargest=0;
        for(int i=0;i<arr.length;i++){
              if(arr[i]>largest ){
                seclargest=largest;
              }
             
        }
         
        System.out.println(seclargest);
    }
}
