package interview;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentPrefix {

	public static void main(String[] args) {
		String[] arr = {"testcase", "testdata", "testing", "team", "test"};
		Map<String, Integer> map = new HashMap<>();

		for (String word : arr) {
			for (int i = 1; i <= word.length(); i++) {
				String prefix = word.substring(0, i);
			
				map.put(prefix, map.getOrDefault(prefix, 0) + 1);
			}
		}

		String mostFreqPrefix = "";
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostFreqPrefix = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		System.out.println("Most frequent prefix: " + mostFreqPrefix);
	}
}


