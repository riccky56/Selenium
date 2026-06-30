package Hashmapexamples;

import java.util.HashMap;
import java.util.Map;

public class convert_to_a1b2c3d4e5f6 {

	public static void main(String[] args) {
		String d = "abbcccddddeeeeeffffff";
		Map<Character,Integer> hashmap = new HashMap<>();
		
		for (char c : d.toCharArray()) {
			if (hashmap.containsKey(c)) 			// && c!=' ' to remove space give this condition also
			{
				int count = hashmap.get(c);
				count++;
				hashmap.replace(c, count);
	
			}

			else //if( c !=' ')to remove space from here also
			{
				hashmap.put(c, 1);
			}

		}
		System.out.println(hashmap);
		
		for(Character key:hashmap.keySet())
		{
			System.out.print(key+ "" +hashmap.get(key));
		}

	}

}
