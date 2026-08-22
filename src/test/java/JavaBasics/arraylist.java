package JavaBasics;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class arraylist {

	// Main method where program execution starts.
	public static void main(String[] args) {

	
		// to dynamically change and increase the size of array we use array list
		ArrayList<String> a = new ArrayList<String>();
		// To add in array list	 
		a.add("rahul");
		// Add the current value into the collection.
		a.add("gupta");
		// Add the current value into the collection.
		a.add("is");
		// Add the current value into the collection.
		a.add("a");
		// Add the current value into the collection.
		a.add("tester");

		// Display information to the console for the user.
		System.out.println(a);
        
       a.set(0, " ji ");
       // Display information to the console for the user.
       System.out.println(a.get(0));
       // Display information to the console for the user.
       System.out.println(a);
		// to get the 1st index value or second value of arraylist
		System.out.println(a.get(1));

		// Display information to the console for the user.
		System.out.println("          ");
		//to check if the array list contains the element or not
				System.out.println(a.contains("gupta"));
				// Display information to the console for the user.
				System.out.println("------------");	
		//To delete from a array list	 
		a.remove(1);
		// Display information to the console for the user.
		System.out.println(a);

		// Display information to the console for the user.
		System.out.println("------------");
		// for loop 
		for(int i=0; i<a.size(); i++) {
			// Display information to the console for the user.
			System.out.println(a.get(i));

		} 
		// Display information to the console for the user.
		System.out.println("------------");
		
		// enhanced for loop

		for (String b : a) {
			// Display information to the console for the user.
			System.out.println(b);
		}
		// Display information to the console for the user.
		System.out.println("------------");
		// to convert from traditional array to dynamic or Arraylist we use this 
		
		String[] name = {"rahul", "shetty", "selenium"};
		List<String> D = Arrays.asList(name);
		// Display information to the console for the user.
		System.out.println(D);
		// Display information to the console for the user.
		System.out.println(a.contains("tester"));

	}

}
