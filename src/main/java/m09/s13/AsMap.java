package m09.s13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AsMap {
    public static void main(String[] args) {
        // any concrete map will do
        Map<Integer, String> map = aMap(false);
        System.out.println("original map: " + map);

        // using var instead of Map.Entry<Integer, String>
        for (var current : map.entrySet()) {
            System.out.println("I'm modifying element with key: " + current.getKey());
            current.setValue(current.getValue() + "!");
        }
        System.out.println("modified map: " + map);

        Set<Integer> keys = map.keySet();
        System.out.print("accessing map from keys " + keys + ": ");
        for (Integer key : keys) {
            System.out.print(String.format("[%d: %s] ", key, map.get(key)));
        }
        System.out.println();

        // using var instead of Iterator<Map.Entry<Integer, String>>
        var it = map.entrySet().iterator();
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

        // put() returns null if there was no previous value (or no entry)
        System.out.println("Previous value for 99 was: " + map.put(99, "nintynine"));
        System.out.println("Previous value for 99 was: " + map.put(99, "hello"));
        System.out.println("Current value for 99 is: " + map.putIfAbsent(99, "star"));

        System.out.println("Removed value for key 23: " + map.remove(23));
        System.out.println("Replaced value for key 12: " + map.replace(12, "twelve"));

        System.out.println("Size is " + map.size());

        map.clear();
        System.out.println("Map after clear: " + map);
    }

    private static Map<Integer, String> aMap(boolean flag) {
        Map<Integer, String> result = flag ? new HashMap<>() : new TreeMap<>();
        result.put(7, "seven");
        result.put(12, "twelve");
        result.put(23, "twentythree");
        result.put(31, "thirtyone");
        result.put(42, "fortytwo");

        return result;
    }

}
