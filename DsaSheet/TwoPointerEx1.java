package DsaSheet;

public class TwoPointerEx1 {

    public static void main(String[] args) {
        
        int[] arr ={2,4,5,7,11,15};
        int target =9;

        int left=0;
        int right = arr.length-1;

        while(left<right){
             int sum =arr[left]+arr[right];
             if(sum<target){
                left++;
             }
             else if(sum>target){
                right--;
             }
             else{
                System.out.println("Found");
                System.out.println(arr[left]+ " " + arr[right]);
                System.out.println(left + " " + right);
                break;
             }
        }
    }
    
}
