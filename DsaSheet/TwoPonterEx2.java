package DsaSheet;

public class TwoPonterEx2 {
    public static void main(String[] args) {
        int[] arr ={ 1,1,2,2,3,4,5,5,6};
        int slow =0;
        int fast =1;
        while(fast<arr.length){
            if(arr[slow]==arr[fast]){
                fast++;
            }
            else {
                slow++;
                arr[slow]=arr[fast];
                fast++;
                
            }
            

        }
        System.out.println(slow + 1);
        for(int i = 0; i <= slow; i++){
    System.out.print(arr[i] + " ");
}
      
        
    }
}
