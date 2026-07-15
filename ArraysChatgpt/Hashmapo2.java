import java.util.HashMap;
public  class Hashmapo2 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 6,7,7,7, 8, 5};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num:arr){
            if(hm.containsKey(num)){
                hm.put(num, hm.get(num) + 1);
            }
            // System.out.println(hm);
            else{
                hm.put(num,1);
            }
        }
        // System.out.println(hm);
        for(int key:hm.keySet()){
            System.out.println(key + " -> " + hm.get(key));
            
        }

      
    }
}