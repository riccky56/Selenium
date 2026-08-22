package JavaBasics;

import java.util.Arrays;

// Class declaration that groups the related example logic in one place.
public class SortArray		{
	// Main method where program execution starts.
	public static void main(String[] args)
	{
		// Number Array sorting
		int data[] = { 4, 10, 2, 6, 1 };
		// Sort the array so values are arranged in ascending order.
		Arrays.sort(data);
		
		// Loop through each element one by one.
		for (int c : data)
		{
			// Display information to the console for the user.
			System.out.print(c +" ");
		}
		// Display information to the console for the user.
		System.out.println();
		// String array sorting
		String data2[] = { "z", "a", "x" };
		// Sort the array so values are arranged in ascending order.
		Arrays.sort(data2);
		// Loop through each element one by one.
		for (String c : data2)
		{
			// Display information to the console for the user.
			System.out.println(c);
		}
	}




}
