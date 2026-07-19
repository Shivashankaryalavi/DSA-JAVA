public class SortedSquare {

    public static int[] squareNum(int[] nums){
        
        int left=0;
        int right= nums.length-1;
        int fill=nums.length-1;
        int[] ans=new int[nums.length];

        while(left<=right){
              int leftSquare=nums[left]*nums[left];
              int rightSquare=nums[right]*nums[right];
            if(leftSquare>rightSquare){
               ans[fill]=leftSquare;
               left++;
            
            }
            else{
                ans[fill]=rightSquare;
                right--;
            }
            fill--;
        }
         return ans;
    }


    public static void main(String[] args) {

        int[] nums={-4,-1,0,3,10};
        int[] result = squareNum(nums);
        for(int num:result){
            System.out.print(num+" ");
        }
      
    }
    
}
