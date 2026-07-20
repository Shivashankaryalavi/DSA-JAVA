

public class RemoveElements {
    public static int numsOf(int[] nums){
        int slow =0;
        int fast =1;
        while(fast<nums.length){

            if(nums[slow]==nums[fast]){
                fast++;
            }
            else{
                slow++;
                nums[slow]=nums[fast];
                fast++;
            }
        }
        return slow+1;
}
   public static void main(String[] args) {
    int nums[]={0,0,1,1,2,3,4,5,6};
    int res = numsOf(nums);
    System.out.println(res);
      for(int i = 0; i < res; i++) {
        System.out.print(nums[i] + " ");
    }
   }
}
