package ARRAYDSA;

import java.util.HashMap;

public class FrequencyOfgivenElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,20,40,20};
        int target=20;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:arr){
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }
            else{
                hm.put(num,1);
            }
        }
        System.out.println(hm.get(target));
    }
}
