package DsaSheet.SlidingWindow;

public class LongestSubarray {

    public static int longestSubarray(int[] arr){
        int maxLength=0;
        int right=0;
        int left=0;
        int sum=0;
        int k=5;
        for(right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
           
           maxLength=Math.max(maxLength,right-left+1);
        }
        


        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        System.out.println(longestSubarray(arr));
        
    }
    
}
