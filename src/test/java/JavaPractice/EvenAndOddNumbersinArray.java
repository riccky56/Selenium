package JavaPractice;

import java.util.Scanner;

// Class declaration that groups the related example logic in one place.
public class EvenAndOddNumbersinArray
{
	// Main method where program execution starts.
	public static void main(String[] args)
	{


		int a[] = { 10, 20, 15, 3, 6, 7, 8, 2, 5, 7 };
		// Initialize a variable that will be used in the logic.
		int n = a.length;

		// Display information to the console for the user.
		System.out.print("Odd numbers: ");

		// Loop through the data using an index or counter.
		for (int i = 0; i < n; i++)
		{
			// Check the condition before deciding whether this block should run.
			if (a[i] % 2 != 0)
			{

				// Display information to the console for the user.
				System.out.print(a[i] + " ");
			}
		}
		// Display information to the console for the user.
		System.out.println();

		// Display information to the console for the user.
		System.out.print("Even numbers: ");
		// Loop through the data using an index or counter.
		for (int i = 0; i < n; i++)
		{
			// Check the condition before deciding whether this block should run.
			if (a[i] % 2 == 0)
			{
				// Display information to the console for the user.
				System.out.print(a[i] + " ");
			}
		}
	
	}
}

