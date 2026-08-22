package JavaPractice;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class firstandlastelementofarray {


	// Main method where program execution starts.
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		// Add the current value into the collection.
		arrayList.add("Apple");
		// Add the current value into the collection.
		arrayList.add("Banana");
		// Add the current value into the collection.
		arrayList.add("Cherry");
		// Add the current value into the collection.
		arrayList.add("Date");
		// Add the current value into the collection.
		arrayList.add("Elderberry");

		// Check the condition before deciding whether this block should run.
		if (!arrayList.isEmpty()) {

			// Store text data that will be processed by the program logic.
			String firstElement = arrayList.get(0);

			// Store text data that will be processed by the program logic.
			String lastElement = arrayList.get(arrayList.size() - 1);

			// Display information to the console for the user.
			System.out.println("First element: " + firstElement);

			// Display information to the console for the user.
			System.out.println("Last element: " + lastElement);

		} else 
		{
			// Display information to the console for the user.
			System.out.println("The ArrayList is empty.");
		}
	}
}
