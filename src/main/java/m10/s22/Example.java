package m10.s22;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        // name -> phone number
        Map<String, String> map = new HashMap<>();
        map.put("Tom", "43534534534534");
        map.put("Bob", "78768679789");

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
