package ArraysChatgpt;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[]= {1,2,2,3,1,4,2};
         HashMap<Integer,Integer> hm = new HashMap<>();
         for(int num:arr){
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }
            else{
                hm.put(num,1);
            }
         }
         for(int key:hm.keySet()){
            System.out.println(key+"-->"+hm.get(key));
         }
       
    
}
}