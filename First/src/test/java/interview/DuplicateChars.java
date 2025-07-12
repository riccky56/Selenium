package interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {

	public static void main(String[] args) {

		String str = "programming";
		Map<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate: " + entry.getKey() + " repeated "+ entry.getValue());
			}
			
			
			
		}}}
