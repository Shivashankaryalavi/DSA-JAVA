package DsaSheet;
public class MoveZerosToEnd {

    public static void moveZero(int[] nums){
         int j=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]!=0){
               int temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
               j++;
            }
             
           }
        
    }
    public static void main(String[] args) {
        int nums[]={0,0,2,5,0,4,0,7,8,7};
        moveZero(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
        
    }
}
