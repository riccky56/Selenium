package allarraysquestions;

// Class declaration that groups the related example logic in one place.
public class TwoSUM {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 5, 7, 9, 11, 15 };

		// Initialize a variable that will be used in the logic.
		int target = 9;

		// Check the condition before deciding whether this block should run.
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array is null or has less than 2 elements");
		}

		// Initialize a variable that will be used in the logic.
		int left = 0, right = arr.length - 1;

		// Continue looping while the given condition remains true.
		while (left < right) {
			// Initialize a variable that will be used in the logic.
			int sum = arr[left] + arr[right];
			// Check the condition before deciding whether this block should run.
			if (sum == target) {
				// Display information to the console for the user.
				System.out.println("Two pair sum is first index :>" + left + " & second index : > " + right);
				// Display information to the console for the user.
				System.out.println(arr[left] + " & " + arr[right]);
				break;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}

		}

	}
}
