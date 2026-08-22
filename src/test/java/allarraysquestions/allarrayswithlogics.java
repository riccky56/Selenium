package allarraysquestions;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class allarrayswithlogics {
		// Main method where program execution starts.
		public static void main(String[] args) {
		// Example usage
		int[] arr = { 1, 5, 9, 12, 16, 25};
		// Display information to the console for the user.
		System.out.println("Max: " + findMax(arr));
		// Display information to the console for the user.
		System.out.println("Second Largest: " + secondLargest(arr));
		reverse(arr);
		// Display information to the console for the user.
		System.out.println("Reversed: " + Arrays.toString(arr));
		// Display information to the console for the user.
		System.out.println("Is Sorted: " + isSorted(arr));
		// Display information to the console for the user.
		System.out.println("Frequency: " + frequency(arr));
		// Initialize a variable that will be used in the logic.
		int newLength = removeDuplicates(new int[]{1, 1, 2, 2, 3});
		// Display information to the console for the user.
		System.out.println("New Length after removing duplicates: " + newLength);
		// Declare and initialize an integer array used in this example.
		int[] arr2 = {0, 1, 0, 3, 12};
		moveZeros(arr2);
		// Display information to the console for the user.
		System.out.println("After moving zeros: " + Arrays.toString(arr2));
		// Declare and initialize an integer array used in this example.
		int[] merged = mergeSorted(new int[]{1, 3, 5}, new int[]{2, 4, 6});
		// Display information to the console for the user.
		System.out.println("Merged Sorted Arrays: " + Arrays.toString(merged));
	}

	// ========== TIER 1 â€” BASICS (1â€“10) ==========
	
	// 1. Find the largest element in an array
	static int findMax(int[] arr) {
		// Check the condition before deciding whether this block should run.
		if (arr.length == 0) throw new IllegalArgumentException("empty array");
		// Initialize a variable that will be used in the logic.
		int max = arr[0];
		// Loop through the data using an index or counter.
		for (int i = 1; i < arr.length; i++) {
			
			// Check the condition before deciding whether this block should run.
			if (arr[i] > max) max = arr[i];}
		// Return the final result back to the caller.
		return max;
	}

	// 2. Find the second largest element
	static int secondLargest(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		// Loop through each element one by one.
		for (int x : arr) {
			// Check the condition before deciding whether this block should run.
			if (x > max) {
				second = max;
				max = x;
			} else if (x > second && x != max) {
				second = x;
			}
		}
		// Return the final result back to the caller.
		return second;
	}

	// 3. Reverse an array in place (two-pointer)
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

	// 4. Check if an array is sorted (ascending)
	static boolean isSorted(int[] arr) {
		// Loop through the data using an index or counter.
		for (int i = 1; i < arr.length-1; i++) {
					
			// Check the condition before deciding whether this block should run.
			if (arr[i] < arr[i + 1]) 
				// Return the final result back to the caller.
				return false;
		}
		// Return the final result back to the caller.
		return true;
		
	}
	
	// 5. Find frequency of each element using HashMap
	static Map<Integer, Integer> frequency(int[] arr) {
		// Create a HashMap to store keys with their counts or mapped values.
		Map<Integer, Integer> freq = new HashMap<>();
		// Loop through each element one by one.
		for (int x : arr)
			freq.merge(x, 1, Integer::sum);
		// Return the final result back to the caller.
		return freq;
		
	}

	// 6. Remove duplicates from a sorted array (in place, slow-fast pointer)
	static int removeDuplicates(int[] arr) {
		// Check the condition before deciding whether this block should run.
		if (arr.length == 0) return 0;
		// Initialize a variable that will be used in the logic.
		int slow = 0;
		// Loop through the data using an index or counter.
		for (int fast = 1; fast < arr.length; fast++) {
			// Check the condition before deciding whether this block should run.
			if (arr[fast] != arr[slow]) {
				slow++;
				arr[slow] = arr[fast];
			}
		}
		return slow + 1; // new length
	}

	// 7. Left-rotate array by one position
	static void rotateByOne(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int first = arr[0];
		// Loop through the data using an index or counter.
		for (int i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
		arr[arr.length - 1] = first;
	}

	// 8. Move all zeros to the end (keep relative order of non-zeros)
	static void moveZeros(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int insertPos = 0;
		// Loop through each element one by one.
		for (int x : arr)
			// Check the condition before deciding whether this block should run.
			if (x != 0) arr[insertPos++] = x;
		// Continue looping while the given condition remains true.
		while (insertPos < arr.length)
			arr[insertPos++] = 0;
	}

	// 9. Binary search on sorted array
	static int binarySearch(int[] arr, int target) {
		// Initialize a variable that will be used in the logic.
		int lo = 0, hi = arr.length - 1;
		// Continue looping while the given condition remains true.
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2; // avoids overflow 
			// Check the condition before deciding whether this block should run.
			if (arr[mid] == target) return mid;
			// Check another condition if the previous condition was false.
			else if (arr[mid] < target) lo = mid + 1;
			// Execute this block when the earlier conditions do not match.
			else hi = mid - 1;
		}
		// Return the final result back to the caller.
		return -1;
	}

	// 10. Merge two sorted arrays into one sorted array
	static int[] mergeSorted(int[] a, int[] b) {
		// Declare and initialize an integer array used in this example.
		int[] result = new int[a.length + b.length];
		// Initialize a variable that will be used in the logic.
		int i = 0, j = 0, k = 0;
		// Continue looping while the given condition remains true.
		while (i < a.length && j < b.length)
			result[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
		// Continue looping while the given condition remains true.
		while (i < a.length) result[k++] = a[i++];
		// Continue looping while the given condition remains true.
		while (j < b.length) result[k++] = b[j++];
		// Return the final result back to the caller.
		return result;
	}

	// ========== TIER 2 â€” INTERMEDIATE (11â€“20) ==========

	// 11. Find the missing number (1 to n, one missing)
	static int findMissing(int[] arr, int n) {
		long expectedSum = (long) n * (n + 1) / 2;
		long actualSum = 0;
		// Loop through each element one by one.
		for (int x : arr) actualSum += x;
		// Return the final result back to the caller.
		return (int) (expectedSum - actualSum);
	}

	// 12. Two Sum â€” sorted array, two-pointer approach
	static int[] twoSumSorted(int[] arr, int target) {
		// Initialize a variable that will be used in the logic.
		int left = 0, right = arr.length - 1;
		// Continue looping while the given condition remains true.
		while (left < right) {
			// Initialize a variable that will be used in the logic.
			int sum = arr[left] + arr[right];
			// Check the condition before deciding whether this block should run.
			if (sum == target) return new int[]{left, right};
			// Check another condition if the previous condition was false.
			else if (sum < target) left++;
			// Execute this block when the earlier conditions do not match.
			else right--;
		}
		// Return the final result back to the caller.
		return new int[]{-1, -1};
	}

	// 12b. Two Sum â€” unsorted array, HashMap approach
	static int[] twoSumUnsorted(int[] arr, int target) {
		// Create a HashMap to store keys with their counts or mapped values.
		Map<Integer, Integer> seen = new HashMap<>();
		// Loop through the data using an index or counter.
		for (int i = 0; i < arr.length; i++) {
			// Initialize a variable that will be used in the logic.
			int complement = target - arr[i];
			// Check the condition before deciding whether this block should run.
			if (seen.containsKey(complement))
				// Return the final result back to the caller.
				return new int[]{seen.get(complement), i};
			// Store or update the current value in the map.
			seen.put(arr[i], i);
		}
		// Return the final result back to the caller.
		return new int[]{-1, -1};
	}

	// 13. Kadane's Algorithm â€” Maximum Subarray Sum
	static int maxSubArraySum(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int maxSoFar = arr[0], currentMax = arr[0];
		// Loop through the data using an index or counter.
		for (int i = 1; i < arr.length; i++) {
			currentMax = Math.max(arr[i], currentMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, currentMax);
		}
		// Return the final result back to the caller.
		return maxSoFar;
	}

	// 14. Dutch National Flag â€” Sort array of 0s, 1s, 2s in one pass
	static void sortColors(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int low = 0, mid = 0, high = arr.length - 1;
		// Continue looping while the given condition remains true.
		while (mid <= high) {
			// Check the condition before deciding whether this block should run.
			if (arr[mid] == 0) {
				swap(arr, low++, mid++);
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, high--);
			}
		}
	}

	static void swap(int[] arr, int i, int j) {
		// Initialize a variable that will be used in the logic.
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	// 15. Majority Element (Boyer-Moore Voting Algorithm)
	static int majorityElement(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int candidate = arr[0], count = 0;
		// Loop through each element one by one.
		for (int x : arr) {
			// Check the condition before deciding whether this block should run.
			if (count == 0) candidate = x;
			count += (x == candidate) ? 1 : -1;
		}
		// Return the final result back to the caller.
		return candidate;
	}

	// 16. Product of Array Except Self (no division allowed)
	static int[] productExceptSelf(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int n = arr.length;
		// Declare and initialize an integer array used in this example.
		int[] result = new int[n];
		result[0] = 1;
		// Loop through the data using an index or counter.
		for (int i = 1; i < n; i++)
			result[i] = result[i - 1] * arr[i - 1];
		// Initialize a variable that will be used in the logic.
		int suffix = 1;
		// Loop through the data using an index or counter.
		for (int i = n - 1; i >= 0; i--) {
			result[i] *= suffix;
			suffix *= arr[i];
		}
		// Return the final result back to the caller.
		return result;
	}

	// 17. Find the duplicate number (Floyd's cycle detection)
	static int findDuplicate(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int slow = arr[0], fast = arr[0];
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		} while (slow != fast);
		slow = arr[0];
		// Continue looping while the given condition remains true.
		while (slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		// Return the final result back to the caller.
		return slow;
	}

	// 18. Find all pairs with a given difference k
	static List<int[]> pairsWithDiff(int[] arr, int k) {
		List<int[]> result = new ArrayList<>();
		// Create a HashSet to store only unique values.
		Set<Integer> seen = new HashSet<>();
		// Loop through each element one by one.
		for (int x : arr) seen.add(x);
		// Loop through each element one by one.
		for (int x : arr) {
			// Check the condition before deciding whether this block should run.
			if (seen.contains(x + k)) result.add(new int[]{x, x + k});
		}
		// Return the final result back to the caller.
		return result;
	}

	// 19. First non-repeating element
	static int firstNonRepeating(int[] arr) {
		Map<Integer, Integer> freq = new LinkedHashMap<>();
		// Loop through each element one by one.
		for (int x : arr) freq.merge(x, 1, Integer::sum);
		// Loop through each element one by one.
		for (Map.Entry<Integer, Integer> e : freq.entrySet())
			// Check the condition before deciding whether this block should run.
			if (e.getValue() == 1) return e.getKey();
		// Return the final result back to the caller.
		return -1;
	}

	// 20. Merge Intervals
	static int[][] mergeIntervals(int[][] intervals) {
		// Sort the array so values are arranged in ascending order.
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		List<int[]> merged = new ArrayList<>();
		// Loop through each element one by one.
		for (int[] interval : intervals) {
			// Check the condition before deciding whether this block should run.
			if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
				// Add the current value into the collection.
				merged.add(interval);
			} else {
				merged.get(merged.size() - 1)[1] = Math.max(
					merged.get(merged.size() - 1)[1], interval[1]);
			}
		}
		// Return the final result back to the caller.
		return merged.toArray(new int[0][]);
	}

	// ========== TIER 3 â€” ADVANCED (21â€“30) ==========

	// 21. Trapping Rain Water
	static int trapRainWater(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int left = 0, right = arr.length - 1;
		// Initialize a variable that will be used in the logic.
		int leftMax = 0, rightMax = 0, water = 0;
		// Continue looping while the given condition remains true.
		while (left < right) {
			// Check the condition before deciding whether this block should run.
			if (arr[left] < arr[right]) {
				leftMax = Math.max(leftMax, arr[left]);
				water += leftMax - arr[left];
				left++;
			} else {
				rightMax = Math.max(rightMax, arr[right]);
				water += rightMax - arr[right];
				right--;
			}
		}
		// Return the final result back to the caller.
		return water;
	}

	// 22. Next Permutation
	static void nextPermutation(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int n = arr.length, i = n - 2;
		// Continue looping while the given condition remains true.
		while (i >= 0 && arr[i] >= arr[i + 1]) i--;
		// Check the condition before deciding whether this block should run.
		if (i >= 0) {
			// Initialize a variable that will be used in the logic.
			int j = n - 1;
			// Continue looping while the given condition remains true.
			while (arr[j] <= arr[i]) j--;
			swap(arr, i, j);
		}
		reverse(arr, i + 1, n - 1);
	}

	static void reverse(int[] arr, int start, int end) {
		// Continue looping while the given condition remains true.
		while (start < end) {
			swap(arr, start++, end--);
		}
	}

	// 23. Subarray Sum Equals K (prefix sum + HashMap)
	static int subarraySumEqualsK(int[] arr, int k) {
		// Create a HashMap to store keys with their counts or mapped values.
		Map<Integer, Integer> prefixCount = new HashMap<>();
		prefixCount.put(0, 1); // empty prefix
		// Initialize a variable that will be used in the logic.
		int sum = 0, count = 0;
		// Loop through each element one by one.
		for (int x : arr) {
			sum += x;
			count += prefixCount.getOrDefault(sum - k, 0);
			prefixCount.merge(sum, 1, Integer::sum);
		}
		// Return the final result back to the caller.
		return count;
	}

	// 24. Maximum Product Subarray (track both max and min)
	static int maxProductSubarray(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int maxProd = arr[0], minProd = arr[0], result = arr[0];
		// Loop through the data using an index or counter.
		for (int i = 1; i < arr.length; i++) {
			// Initialize a variable that will be used in the logic.
			int x = arr[i];
			// Check the condition before deciding whether this block should run.
			if (x < 0) {
				// Initialize a variable that will be used in the logic.
				int tmp = maxProd;
				maxProd = minProd;
				minProd = tmp;
			}
			maxProd = Math.max(x, maxProd * x);
			minProd = Math.min(x, minProd * x);
			result = Math.max(result, maxProd);
		}
		// Return the final result back to the caller.
		return result;
	}

	// 25. Find All Duplicates (use array as hash)
	static List<Integer> findAllDuplicates(int[] arr) {
		List<Integer> result = new ArrayList<>();
		// Loop through each element one by one.
		for (int x : arr) {
			// Initialize a variable that will be used in the logic.
			int idx = Math.abs(x) - 1;
			// Check the condition before deciding whether this block should run.
			if (arr[idx] < 0) result.add(idx + 1);
			// Execute this block when the earlier conditions do not match.
			else arr[idx] = -arr[idx];
		}
		// Return the final result back to the caller.
		return result;
	}

	// 26. Find Missing AND Repeating Number
	static int[] findMissingAndRepeating(int[] arr, int n) {
		long sum = 0, sumSq = 0;
		// Loop through each element one by one.
		for (int x : arr) {
			sum += x;
			sumSq += (long) x * x;
		}
		long expectedSum = (long) n * (n + 1) / 2;
		long expectedSumSq = (long) n * (n + 1) * (2L * n + 1) / 6;
		long sumDiff = expectedSum - sum;
		long sumSqDiff = expectedSumSq - sumSq;
		long sumTotal = sumSqDiff / sumDiff;
		// Initialize a variable that will be used in the logic.
		int missing = (int) ((sumDiff + sumTotal) / 2);
		// Initialize a variable that will be used in the logic.
		int repeated = (int) (missing - sumDiff);
		// Return the final result back to the caller.
		return new int[]{repeated, missing};
	}

	// 27. Rotate Array by K positions (reversal trick)
	static void rotateByK(int[] arr, int k) {
		// Initialize a variable that will be used in the logic.
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}

	// 28. Longest Consecutive Sequence (O(n) with HashSet)
	static int longestConsecutive(int[] arr) {
		// Create a HashSet to store only unique values.
		Set<Integer> set = new HashSet<>();
		// Loop through each element one by one.
		for (int x : arr) set.add(x);
		// Initialize a variable that will be used in the logic.
		int longest = 0;
		// Loop through each element one by one.
		for (int x : set) {
			// Check the condition before deciding whether this block should run.
			if (!set.contains(x - 1)) {
				// Initialize a variable that will be used in the logic.
				int length = 1;
				// Continue looping while the given condition remains true.
				while (set.contains(x + length)) length++;
				longest = Math.max(longest, length);
			}
		}
		// Return the final result back to the caller.
		return longest;
	}

	// 29. Minimum Swaps to Sort an Array (cycle detection)
	static int minSwapsToSort(int[] arr) {
		// Initialize a variable that will be used in the logic.
		int n = arr.length;
		Integer[] idx = new Integer[n];
		// Loop through the data using an index or counter.
		for (int i = 0; i < n; i++) idx[i] = i;
		// Sort the array so values are arranged in ascending order.
		Arrays.sort(idx, (a, b) -> arr[a] - arr[b]);

		boolean[] visited = new boolean[n];
		// Initialize a variable that will be used in the logic.
		int swaps = 0;
		// Loop through the data using an index or counter.
		for (int i = 0; i < n; i++) {
			// Check the condition before deciding whether this block should run.
			if (visited[i] || idx[i] == i) continue;
			// Initialize a variable that will be used in the logic.
			int cycleLength = 0, j = i;
			// Continue looping while the given condition remains true.
			while (!visited[j]) {
				visited[j] = true;
				j = idx[j];
				cycleLength++;
			}
			swaps += cycleLength - 1;
		}
		// Return the final result back to the caller.
		return swaps;
	}

	// 30. Sliding Window Maximum (monotonic deque)
	static int[] slidingWindowMax(int[] arr, int k) {
		Deque<Integer> deque = new ArrayDeque<>();
		// Declare and initialize an integer array used in this example.
		int[] result = new int[arr.length - k + 1];
		// Loop through the data using an index or counter.
		for (int i = 0; i < arr.length; i++) {
			// Check the condition before deciding whether this block should run.
			if (!deque.isEmpty() && deque.peekFirst() <= i - k)
				deque.pollFirst();
			// Continue looping while the given condition remains true.
			while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i])
				deque.pollLast();
			deque.offerLast(i);
			// Check the condition before deciding whether this block should run.
			if (i >= k - 1)
				result[i - k + 1] = arr[deque.peekFirst()];
		}
		// Return the final result back to the caller.
		return result;
	}
}
