package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Class declaration that groups the related example logic in one place.
public class remove_the_duplicate_and_store_into_list_of_integers {
	// Main method where program execution starts.
	public static void main(String[] args) {

		// Declare and initialize an integer array used in this example.
		int[] arr = {5, 2, 9, 2, 6, 4, 1, 6, 2, 5};
       
		ArrayList<Integer> list = new ArrayList();
		                
		for(int a:arr) {  //to remove the duplicate and store into list of integers
		
			// Check the condition before deciding whether this block should run.
			if(!list.contains(a))
			{
				// Add the current value into the collection.
				list.add(a);
			}
		}
		
		//to convert the list into the array
		int b[] = new int [list.size()];

		// Loop through the data using an index or counter.
		for(int i=0;i<list.size(); i++) {
			
			b[i]= list.get(i) ;
		}

		
		System.out.println(list);    //[5, 2, 9, 6, 4, 1]
		
		// Sort the collection into natural order.
		Collections.sort(list);      
		
		System.out.println("Sorted list : " +list);     //[1, 2, 4, 5, 6, 9]
		
		System.out.println(Arrays.toString(b)); //[5, 2, 9, 6, 4, 1]
		
		// Sort the array so values are arranged in ascending order.
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(b));		 //[1, 2, 4, 5, 6, 9] 		

	}

}
