package DsaSheet;
public class TrapWater{

    public int trap(int[] height){

      int n = height.length;

      int[] leftMax =new int[n];

      int[] rightMax=new int[n];

      leftMax[0]=height[0];

      rightMax[n-1]=height[n-1];

      for(int i=1;i<n;i++){
        leftMax[i]=Math.max(leftMax[i-1],height[i]);
      }

      for(int i =n-2;i>=0;i--){
        rightMax[i]=Math.max(rightMax[i+1],height[i]);
      }

      int water =0;

      for(int i=0;i<n;i++){
        water += Math.min(leftMax[i],rightMax[i]) -height[i];
      }
      return  water;

    }
    public static void main(String[] args) {

        int[] height={5,2,1,2,1,5};

        TrapWater t = new TrapWater();

        int res = t.trap(height);

        System.out.println(res);

        
    }
}