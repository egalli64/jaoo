package s092;

import java.util.NavigableMap;
import java.util.TreeMap;

public class AsNavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navMap = aNavMap();

        System.out.println("Entry with key greater or equal to 15 (or null): " + navMap.ceilingEntry(15));
        System.out.println("Key greater or equal to 15 (or null): " + navMap.ceilingKey(15));

        System.out.println("First entry (or null): " + navMap.firstEntry());

        System.out.println("Entry with key less or equal to 15 (or null): " + navMap.floorEntry(15));
        System.out.println("Key less or equal to 15 (or null): " + navMap.floorKey(15));

        System.out.println("Head map up to 23 (excluded): " + navMap.headMap(23));
        System.out.println("Head map up to 23 (included): " + navMap.headMap(23, true));

        System.out.println("Higher (next) entry of 23 (or null): " + navMap.higherEntry(23));
        System.out.println("Higher (next) key of 23 (or null): " + navMap.higherKey(23));

        System.out.println("Last (higher) entry (or null): " + navMap.lastEntry());

        System.out.println("Lower (previous) entry of 23 (or null): " + navMap.lowerEntry(23));
        System.out.println("Lower (previous) key of 23 (or null): " + navMap.lowerKey(23));

        System.out.println("Keys as navigable set: " + navMap.navigableKeySet());

        System.out.println("Poll (extract) the first entry (or null): " + navMap.pollFirstEntry());
        System.out.println("Poll (extract) the last entry (or null): " + navMap.pollLastEntry());

        System.out.println(navMap);
        System.out.println("Submap from 10 to 30 (maybe empty): " + navMap.subMap(10, 30));

        System.out.println("Tail map from 23 (included): " + navMap.tailMap(23));
        System.out.println("Tail map from 23 (excluded): " + navMap.tailMap(23, false));
    }

    private static NavigableMap<Integer, String> aNavMap() {
        NavigableMap<Integer, String> result = new TreeMap<>();
        result.put(7, "seven");
        result.put(12, "twelve");
        result.put(23, "twentythree");
        result.put(31, "thirtyone");
        result.put(42, "fortytwo");

        return result;
    }

}
