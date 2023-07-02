/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.xtra;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // any concrete map will do
        Map<Integer, String> map = aMap(false);
        System.out.println("original map: " + map);

        loopOnEntries(map);
        enhancedForLoopOnKeys(map);
        iteratingOnEntries(map);

        System.out.print("looping by forEach(): ");
        map.forEach((key, value) -> System.out.printf("[%d, %s] ", key, value));
        System.out.println();

        System.out.println("values are: " + map.values());

        System.out.println("contains key 12: " + map.containsKey(12));
        System.out.println("contains value seven: " + map.containsValue("seven"));

        System.out.println("is the map empty? " + map.isEmpty());

        System.out.println("get() a missing key: " + map.get(-1));
        System.out.println("getOrDefault() a missing key: " + map.getOrDefault(-1, "missing"));

        System.out.println("put() a new key, previous: " + map.put(99, "ninety nine"));
        System.out.println("put() an existing key, previous: " + map.put(99, "hello"));
        System.out.println("putIfAbsent() an existing key, current value is still: " + map.putIfAbsent(99, "star"));
        System.out.println("putIfAbsent() a new key, no current value: " + map.putIfAbsent(95, "star"));
        System.out.println("after putting: " + map);

        System.out.println("removing element w/ key 23, value was: " + map.remove(23));
        System.out.println("removed element w/ key 7? " + map.remove(7, "wrong"));

        System.out.println("replacing value w/ key 12, value was: " + map.replace(12, "twelve"));
        System.out.println("(not) replacing value w/ key 51, returns " + map.replace(51, "not used"));
        System.out.println("(not) replacing [12, wrong], returns " + map.replace(12, "wrong", "not used"));
        System.out.println("after removing and replacing: " + map);

        System.out.println("compute() returns the new value: " +
                map.compute(42, (k, v) -> v + '!'));
        System.out.println("computeIfAbsent() returns the current value: " +
                map.computeIfAbsent(42, k -> "not used"));
        System.out.println("computeIfPresent() returns the new value, or null: " +
                map.computeIfPresent(2, (k, v) -> "not used"));
        System.out.println("after computing: " + map);

        System.out.println("size is " + map.size());

        map.clear();
        System.out.println("Map after clear: " + map);
    }

    private static void loopOnEntries(Map<Integer, String> map) {
        // using var instead of Map.Entry<Integer, String>
        System.out.print("Changing elements: ");
        for (var current : map.entrySet()) {
            String modified = current.getValue() + "!";
            current.setValue(modified);
            System.out.printf("[%d, %s]", current.getKey(), modified);
        }
        System.out.println();
    }

    private static void enhancedForLoopOnKeys(Map<Integer, String> map) {
        Set<Integer> keys = map.keySet();
        System.out.print("accessing map from keys " + keys + ": ");
        for (Integer key : keys) {
            System.out.printf("[%d, %s] ", key, map.get(key));
        }
        System.out.println();
    }

    private static void iteratingOnEntries(Map<Integer, String> map) {
        // using var instead of Iterator<Map.Entry<Integer, String>>
        var it = map.entrySet().iterator();
        System.out.print("looping via map iterator: ");
        while (it.hasNext()) {
            // Map.Entry<Integer, String>
            var item = it.next();
            System.out.printf("[%d, %s] ", item.getKey(), item.getValue());
        }
        System.out.println();
    }

    private static Map<Integer, String> aMap(boolean flag) {
        Map<Integer, String> result = flag ? new HashMap<>() : new TreeMap<>();
        result.put(7, "seven");
        result.put(12, "twelve");
        result.put(23, "twenty three");
        result.put(31, "thirty one");
        result.put(42, "forty two");

        return result;
    }

}
