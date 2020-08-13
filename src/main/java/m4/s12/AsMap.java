package m4.s12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AsMap {
    public static void main(String[] args) {
        Map<Integer, String> map = aMap();
        System.out.println("original map: " + map);

        // Set<Map.Entry<Integer, String>>
        var items = map.entrySet();
        // Map.Entry<Integer, String>
        for (var item : items) {
            item.setValue(item.getValue() + "!");
        }
        System.out.println("modified map: " + map);

        Set<Integer> keys = map.keySet();
        System.out.print("accessing map from keys " + keys + ": ");
        for (Integer key : keys) {
            System.out.print(String.format("[%d: %s] ", key, map.get(key)));
        }
        System.out.println();

        // Iterator<Map.Entry<Integer, String>>
        var it = items.iterator();
        System.out.print("looping via map iterator: ");
        while (it.hasNext()) {
            // Map.Entry<Integer, String>
            var item = it.next();
            System.out.print(String.format("[%d, %s] ", item.getKey(), item.getValue()));
        }
        System.out.println();

        System.out.println("values are: " + map.values());

        System.out.println("contains key 12: " + map.containsKey(12));
        System.out.println("contains value seven: " + map.containsValue("seven"));

        System.out.println("is the map empty? " + map.isEmpty());

        System.out.println("Value for key -1 (or null): " + map.get(-1));
        System.out.println("Value for key -1 (or default): " + map.getOrDefault(-1, "missing"));

        System.out.println("Previous value for 99 was: " + map.put(99, "nintynine"));
        System.out.println("Current value for 99 is: " + map.putIfAbsent(99, "star"));

        System.out.println("Removed value for key 23: " + map.remove(23));
        System.out.println("Replaced value for key 12: " + map.replace(12, "twelve"));

        System.out.println("Size is " + map.size());

        map.clear();
    }

    private static Map<Integer, String> aMap() {
        Map<Integer, String> result = new HashMap<>();
        result.put(7, "seven");
        result.put(12, "twelve");
        result.put(23, "twentythree");
        result.put(31, "thirtyone");
        result.put(42, "fortytwo");

        return result;
    }

}
