// package DsaSheet;

public class DutchFlag {

    public static void nums(int[] arr){
        int low=0;
        int mid=0;
        int high = arr.length-1;
         while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
         }
    }
    public static void main(String[] args) {
        int[] arr ={2,0,2,1,0,1,2,0,2};
        nums(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
       
    }
    
}
