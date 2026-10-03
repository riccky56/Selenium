package allarraysquestions;

// Class declaration that groups the related example logic in one place.
public class twoPointer {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		reverse(array);

		// Display information to the console for the user.
		System.out.println("Reversed array: ");

		// Loop through each element one by one.
		for (int i : array) {
			// Display information to the console for the user.
			System.out.print(i + " ");
		}
	}

	static void reverse(int[] arr) {

		// Initialize a variable that will be used in the logic.
		int left = 0, right = arr.length - 1;
		// Continue looping while the given condition remains true.
		while (left < right) {

			// Initialize a variable that will be used in the logic.
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			left++;
 			right--;
		}

	}

}
