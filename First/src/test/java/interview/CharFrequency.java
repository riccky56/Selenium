package interview;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
	    public static void main(String[] args) {
	        String str = "automationtoolsweuse";
	        Map<Character, Integer> map = new HashMap<>();

	        for (char c : str.toCharArray()) 
	        {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        char maxChar = ' ';
	        int maxFreq = 0;
           
	        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
	        	
	            if (entry.getValue() > maxFreq ) 
	            {
	            	
	                maxFreq = entry.getValue();
	                maxChar = entry.getKey();
	                
	            }
	        }

	        System.out.println("Frequencies: " + map);
	        System.out.println("Most frequent: " + maxChar + " = " + maxFreq);
	    }
	}

		