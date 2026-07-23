package DsaSheet.SlidingWindow;

import java.util.HashMap;

public class FruitsinBasket {

    public static int totalFruits(int[] fruits){

        int max=0;
        int left=0; int right=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right], 0)+1);

            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max, right-left+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] fruits={1,2,1,3,2,2};
        System.out.println(totalFruits(fruits));
    }
    
}
