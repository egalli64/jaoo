package m09.s22;

import java.util.Map;
import java.util.TreeMap;

public class Example {
    public static void main(String[] args) {
        // name -> phone number
        // "Tom" -> "0044 3242344234234"
        // "Bill" -> "3242344234234"

        // ? Tom -> "0044 3242344234234"
        // ? Bob -> "no number!"
        Map<String, String> map = new TreeMap<>();
        map.put("Tom", "43534534534534");
        map.put("Bob", "78768679789");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (var key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
