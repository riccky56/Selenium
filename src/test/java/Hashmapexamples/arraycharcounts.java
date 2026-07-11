package Hashmapexamples;
import java.util.*;

public class arraycharcounts {

	    public static void main(String[] args) {

	        // example array with duplicate values
	        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
	        
	        int[] arr2 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

	        // notebook to store number -> how many times it showed up
	        Map<Integer, Integer> freq = new HashMap<>();
	        
	        Map<Integer, Integer> simpleMap = new HashMap<>();

	        // go through the array one number at a time
	        for (int x : arr) {
	            freq.merge(x, 1, Integer::sum);
	           
	        }

	        // print the final result
	        System.out.println("Array: " + Arrays.toString(arr));
	        System.out.println("Frequency count: " + freq);
	        
	        for(int y: arr) {
	        	if(simpleMap.containsKey(y)) {
	        		simpleMap.put(y, simpleMap.get(y)+1);
	        	}  	else {
	        		
	        		simpleMap.put(y, 1);
	        	}
	        }
	        System.out.println("Frequency count: " + simpleMap);
	        
	    }
	}

