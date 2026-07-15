import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        String result = hm.put(101, "Shivu");

        System.out.println(result);
        System.out.println(hm);
    }
}