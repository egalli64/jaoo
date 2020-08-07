package m4.s14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise {
	/**
	 * @param data
	 * @return
	 * 
	 *         {2, 3, 4, 5} -> {2, 4}
	 */
	public ArrayList<Integer> evens(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int value : data) {
			if (value % 2 == 0) {
				result.add(value);
			}
		}
		return result;
	}

	/**
	 * @param data
	 * @return
	 * 
	 *         {2, 3, 4, 4} -> {2, 3}
	 */
	public ArrayList<Integer> singles(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (data == null) {
			return result;
		}

		for (int i = 0; i < data.length; i++) {
			boolean single = true;

			for (int j = 0; j < data.length; j++) {
				if (i != j && data[i] == data[j]) {
					single = false;
					break;
				}
			}
			if (single) {
				result.add(data[i]);
			}
		}
		return result;
	}

	public ArrayList<Integer> singlesLinear(int[] data) {
		Map<Integer, Integer> counters = new HashMap<>();
		for (Integer current : data) {
			Integer counter = counters.putIfAbsent(current, 1);
			if (counter != null) {
				counters.put(current, counter + 1);
			}
		}

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (Integer key : counters.keySet()) {
			if (counters.get(key) == 1) {
				result.add(key);
			}
		}

		return result;
	}

	public ArrayList<Integer> singlesLinearClassic(int[] data) {
		Map<Integer, Integer> counters = new HashMap<>();
		for (Integer current : data) {
			if (!counters.containsKey(current)) {
				counters.put(current, 1);
			} else {
				counters.put(current, counters.get(current) + 1);
			}
		}

		ArrayList<Integer> result = new ArrayList<Integer>();
		// Map.Entry<Integer, Integer> entry
		for (Map.Entry<Integer, Integer> entry : counters.entrySet()) {
			if (entry.getValue() == 1) {
				result.add(entry.getKey());
			}
		}

		return result;
	}
	
/*
 
     0      1            89    90
  [false, false, ...., false, false] O(1)
  [false, true,      , true , true ]

18 8 88 %
     0        5        7      8     9
  [  null     5        null  ref      ]
                              |
                              [18, 88]
                                    |
                                    "ciao"
    0 .... 2_000_000_000
  [false  ...       true ]
  
    0 ...  1_000
             |
             [2_G]
  
  [1, 89, 90] O(n)
 
 */
}
