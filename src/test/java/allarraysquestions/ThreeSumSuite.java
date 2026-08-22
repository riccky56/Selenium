package allarraysquestions;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class ThreeSumSuite {

	// 1) Basic 3Sum: return all unique triplets that sum to 0
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		// Check the condition before deciding whether this block should run.
		if (nums == null || nums.length < 3) {
			// Return the final result back to the caller.
			return result;
		}

		// Sort the array so values are arranged in ascending order.
		Arrays.sort(nums);
		// Initialize a variable that will be used in the logic.
		int n = nums.length;

		// Loop through the data using an index or counter.
		for (int i = 0; i < n - 2; i++) {
			// Check the condition before deciding whether this block should run.
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			// Initialize a variable that will be used in the logic.
			int left = i + 1;
			// Initialize a variable that will be used in the logic.
			int right = n - 1;

			// Continue looping while the given condition remains true.
			while (left < right) {
				// Initialize a variable that will be used in the logic.
				int total = nums[i] + nums[left] + nums[right];

				// Check the condition before deciding whether this block should run.
				if (total == 0) {
					// Add the current value into the collection.
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;

					// Continue looping while the given condition remains true.
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}

					// Continue looping while the given condition remains true.
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if (total < 0) {
					left++;
				} else {
					right--;
				}
			}
		}

		// Return the final result back to the caller.
		return result;
	}

	// 2) 3Sum Closest: return sum of triplet closest to target
	public int threeSumClosest(int[] nums, int target) {
		// Check the condition before deciding whether this block should run.
		if (nums == null || nums.length < 3) {
			throw new IllegalArgumentException("Array must contain at least three numbers.");
		}

		// Sort the array so values are arranged in ascending order.
		Arrays.sort(nums);
		// Initialize a variable that will be used in the logic.
		int closest = nums[0] + nums[1] + nums[2];
		// Initialize a variable that will be used in the logic.
		int n = nums.length;

		// Loop through the data using an index or counter.
		for (int i = 0; i < n - 2; i++) {
			// Check the condition before deciding whether this block should run.
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			// Initialize a variable that will be used in the logic.
			int left = i + 1;
			// Initialize a variable that will be used in the logic.
			int right = n - 1;

			// Continue looping while the given condition remains true.
			while (left < right) {
				// Initialize a variable that will be used in the logic.
				int total = nums[i] + nums[left] + nums[right];

				// Check the condition before deciding whether this block should run.
				if (Math.abs(total - target) < Math.abs(closest - target)) {
					closest = total;
				}

				// Check the condition before deciding whether this block should run.
				if (total == target) {
					// Return the final result back to the caller.
					return total;
				} else if (total < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		// Return the final result back to the caller.
		return closest;
	}

	// 3) Count unique 3Sum combinations equal to target
	public int countThreeSum(int[] nums, int target) {
		// Check the condition before deciding whether this block should run.
		if (nums == null || nums.length < 3) {
			// Return the final result back to the caller.
			return 0;
		}

		// Sort the array so values are arranged in ascending order.
		Arrays.sort(nums);
		// Initialize a variable that will be used in the logic.
		int count = 0;
		// Initialize a variable that will be used in the logic.
		int n = nums.length;

		// Loop through the data using an index or counter.
		for (int i = 0; i < n - 2; i++) {
			// Check the condition before deciding whether this block should run.
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			// Initialize a variable that will be used in the logic.
			int left = i + 1;
			// Initialize a variable that will be used in the logic.
			int right = n - 1;

			// Continue looping while the given condition remains true.
			while (left < right) {
				// Initialize a variable that will be used in the logic.
				int total = nums[i] + nums[left] + nums[right];

				// Check the condition before deciding whether this block should run.
				if (total == target) {
					count++;
					left++;
					right--;

					// Continue looping while the given condition remains true.
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}

					// Continue looping while the given condition remains true.
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if (total < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		// Return the final result back to the caller.
		return count;
	}

	// Main method where program execution starts.
	public static void main(String[] args) {
		ThreeSumSuite solution = new ThreeSumSuite();

		// Declare and initialize an integer array used in this example.
		int[] nums1 = { -1, 0, 1, 2, -1, -4 };
		// Display information to the console for the user.
		System.out.println("Basic 3Sum: " + solution.threeSum(nums1));

		// Declare and initialize an integer array used in this example.
		int[] nums2 = { -1, 2, 1, -4 };
		// Initialize a variable that will be used in the logic.
		int target2 = 1;
		// Display information to the console for the user.
		System.out.println("3Sum Closest: " + solution.threeSumClosest(nums2, target2));

		// Declare and initialize an integer array used in this example.
		int[] nums3 = { 1, 2, -1, 0, -2, 1 };
		// Initialize a variable that will be used in the logic.
		int target3 = 2;
		// Display information to the console for the user.
		System.out.println("Count 3Sum: " + solution.countThreeSum(nums3, target3));
	}
}
