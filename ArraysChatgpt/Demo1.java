import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "Shivu");

        String result = hm.put(101, "King");

        System.out.println(result);
        System.out.println(hm);
    }
} {
    
}
