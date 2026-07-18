package DsaSheet;
public class MoreWater{
    public static int maxWater(int[] height){
        // {1,8,6,2,5,4,8,3,7}
        int left=0;
        int right= height.length-1;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int minHeight=Math.min(height[left],height[right]);
            int area = width*minHeight;
            maxarea=Math.max(maxarea,area);

            if(height[left]<height[right]){
                left++;
             }
             else{
                right--;
             }
        }
        return maxarea;
    }
    public static void main(String[] args)
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int res = maxWater(height);
        System.out.println(res);
    }
}