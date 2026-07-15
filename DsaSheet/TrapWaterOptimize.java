package DsaSheet;

public class TrapWaterOptimize {
     public int trap(int[] height){

        int left =0;
        int right = height.length-1;

        int leftMax=0;
        int rightMax=0;
        int water =0;

        while(left<right){
            if(height[left]<=height[right]){
                leftMax=Math.max(leftMax,height[left]);
                water+= leftMax-height[left];
                left++;
            }
            else{
                rightMax=Math.max(rightMax,height[right]);
                water += rightMax-height[right];
                right--;
            }
        }
        return water;
     }
     public static void main(String[] args) {
        int[] height ={5,2,1,2,1,5};

        TrapWaterOptimize t = new TrapWaterOptimize();
        int res = t.trap(height);
        System.out.println(res);
     }
}
