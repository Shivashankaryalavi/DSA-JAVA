
import java.util.*;
public class ThreeSumOptimal {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right =nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                                left++;
                            }
                    while(left < right && nums[right] == nums[right + 1]){
                                right--;
                            }
                }

            }
         
        }
           return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int nums[]= new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<nums.length;i++){
              nums[i]=sc.nextInt();
        }
      ThreeSumOptimal obj = new ThreeSumOptimal();

System.out.println(obj.threeSum(nums));

    }
}
