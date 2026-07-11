package allarraysquestions;

import java.util.*;

public class allarrayswithlogics {
		public static void main(String[] args) {
		// Example usage
		int[] arr = { 1, 5, 9, 12, 16, 25};
		System.out.println("Max: " + findMax(arr));
		System.out.println("Second Largest: " + secondLargest(arr));
		reverse(arr);
		System.out.println("Reversed: " + Arrays.toString(arr));
		System.out.println("Is Sorted: " + isSorted(arr));
		System.out.println("Frequency: " + frequency(arr));
		int newLength = removeDuplicates(new int[]{1, 1, 2, 2, 3});
		System.out.println("New Length after removing duplicates: " + newLength);
		int[] arr2 = {0, 1, 0, 3, 12};
		moveZeros(arr2);
		System.out.println("After moving zeros: " + Arrays.toString(arr2));
		int[] merged = mergeSorted(new int[]{1, 3, 5}, new int[]{2, 4, 6});
		System.out.println("Merged Sorted Arrays: " + Arrays.toString(merged));
	}

	// ========== TIER 1 — BASICS (1–10) ==========
	
	// 1. Find the largest element in an array
	static int findMax(int[] arr) {
		if (arr.length == 0) throw new IllegalArgumentException("empty array");
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > max) max = arr[i];}
		return max;
	}

	// 2. Find the second largest element
	static int secondLargest(int[] arr) {
		int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for (int x : arr) {
			if (x > max) {
				second = max;
				max = x;
			} else if (x > second && x != max) {
				second = x;
			}
		}
		return second;
	}

	// 3. Reverse an array in place (two-pointer)
	static void reverse(int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			left++;
			right--;
		}
	}

	// 4. Check if an array is sorted (ascending)
	static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length-1; i++) {
					
			if (arr[i] < arr[i + 1]) 
				return false;
		}
		return true;
		
	}
	
	// 5. Find frequency of each element using HashMap
	static Map<Integer, Integer> frequency(int[] arr) {
		Map<Integer, Integer> freq = new HashMap<>();
		for (int x : arr)
			freq.merge(x, 1, Integer::sum);
		return freq;
	}

	// 6. Remove duplicates from a sorted array (in place, slow-fast pointer)
	static int removeDuplicates(int[] arr) {
		if (arr.length == 0) return 0;
		int slow = 0;
		for (int fast = 1; fast < arr.length; fast++) {
			if (arr[fast] != arr[slow]) {
				slow++;
				arr[slow] = arr[fast];
			}
		}
		return slow + 1; // new length
	}

	// 7. Left-rotate array by one position
	static void rotateByOne(int[] arr) {
		int first = arr[0];
		for (int i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
		arr[arr.length - 1] = first;
	}

	// 8. Move all zeros to the end (keep relative order of non-zeros)
	static void moveZeros(int[] arr) {
		int insertPos = 0;
		for (int x : arr)
			if (x != 0) arr[insertPos++] = x;
		while (insertPos < arr.length)
			arr[insertPos++] = 0;
	}

	// 9. Binary search on sorted array
	static int binarySearch(int[] arr, int target) {
		int lo = 0, hi = arr.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2; // avoids overflow
			if (arr[mid] == target) return mid;
			else if (arr[mid] < target) lo = mid + 1;
			else hi = mid - 1;
		}
		return -1;
	}

	// 10. Merge two sorted arrays into one sorted array
	static int[] mergeSorted(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length)
			result[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
		while (i < a.length) result[k++] = a[i++];
		while (j < b.length) result[k++] = b[j++];
		return result;
	}

	// ========== TIER 2 — INTERMEDIATE (11–20) ==========

	// 11. Find the missing number (1 to n, one missing)
	static int findMissing(int[] arr, int n) {
		long expectedSum = (long) n * (n + 1) / 2;
		long actualSum = 0;
		for (int x : arr) actualSum += x;
		return (int) (expectedSum - actualSum);
	}

	// 12. Two Sum — sorted array, two-pointer approach
	static int[] twoSumSorted(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) return new int[]{left, right};
			else if (sum < target) left++;
			else right--;
		}
		return new int[]{-1, -1};
	}

	// 12b. Two Sum — unsorted array, HashMap approach
	static int[] twoSumUnsorted(int[] arr, int target) {
		Map<Integer, Integer> seen = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (seen.containsKey(complement))
				return new int[]{seen.get(complement), i};
			seen.put(arr[i], i);
		}
		return new int[]{-1, -1};
	}

	// 13. Kadane's Algorithm — Maximum Subarray Sum
	static int maxSubArraySum(int[] arr) {
		int maxSoFar = arr[0], currentMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentMax = Math.max(arr[i], currentMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, currentMax);
		}
		return maxSoFar;
	}

	// 14. Dutch National Flag — Sort array of 0s, 1s, 2s in one pass
	static void sortColors(int[] arr) {
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid <= high) {
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
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	// 15. Majority Element (Boyer-Moore Voting Algorithm)
	static int majorityElement(int[] arr) {
		int candidate = arr[0], count = 0;
		for (int x : arr) {
			if (count == 0) candidate = x;
			count += (x == candidate) ? 1 : -1;
		}
		return candidate;
	}

	// 16. Product of Array Except Self (no division allowed)
	static int[] productExceptSelf(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		result[0] = 1;
		for (int i = 1; i < n; i++)
			result[i] = result[i - 1] * arr[i - 1];
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] *= suffix;
			suffix *= arr[i];
		}
		return result;
	}

	// 17. Find the duplicate number (Floyd's cycle detection)
	static int findDuplicate(int[] arr) {
		int slow = arr[0], fast = arr[0];
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		} while (slow != fast);
		slow = arr[0];
		while (slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		return slow;
	}

	// 18. Find all pairs with a given difference k
	static List<int[]> pairsWithDiff(int[] arr, int k) {
		List<int[]> result = new ArrayList<>();
		Set<Integer> seen = new HashSet<>();
		for (int x : arr) seen.add(x);
		for (int x : arr) {
			if (seen.contains(x + k)) result.add(new int[]{x, x + k});
		}
		return result;
	}

	// 19. First non-repeating element
	static int firstNonRepeating(int[] arr) {
		Map<Integer, Integer> freq = new LinkedHashMap<>();
		for (int x : arr) freq.merge(x, 1, Integer::sum);
		for (Map.Entry<Integer, Integer> e : freq.entrySet())
			if (e.getValue() == 1) return e.getKey();
		return -1;
	}

	// 20. Merge Intervals
	static int[][] mergeIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		List<int[]> merged = new ArrayList<>();
		for (int[] interval : intervals) {
			if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
				merged.add(interval);
			} else {
				merged.get(merged.size() - 1)[1] = Math.max(
					merged.get(merged.size() - 1)[1], interval[1]);
			}
		}
		return merged.toArray(new int[0][]);
	}

	// ========== TIER 3 — ADVANCED (21–30) ==========

	// 21. Trapping Rain Water
	static int trapRainWater(int[] arr) {
		int left = 0, right = arr.length - 1;
		int leftMax = 0, rightMax = 0, water = 0;
		while (left < right) {
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
		return water;
	}

	// 22. Next Permutation
	static void nextPermutation(int[] arr) {
		int n = arr.length, i = n - 2;
		while (i >= 0 && arr[i] >= arr[i + 1]) i--;
		if (i >= 0) {
			int j = n - 1;
			while (arr[j] <= arr[i]) j--;
			swap(arr, i, j);
		}
		reverse(arr, i + 1, n - 1);
	}

	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			swap(arr, start++, end--);
		}
	}

	// 23. Subarray Sum Equals K (prefix sum + HashMap)
	static int subarraySumEqualsK(int[] arr, int k) {
		Map<Integer, Integer> prefixCount = new HashMap<>();
		prefixCount.put(0, 1); // empty prefix
		int sum = 0, count = 0;
		for (int x : arr) {
			sum += x;
			count += prefixCount.getOrDefault(sum - k, 0);
			prefixCount.merge(sum, 1, Integer::sum);
		}
		return count;
	}

	// 24. Maximum Product Subarray (track both max and min)
	static int maxProductSubarray(int[] arr) {
		int maxProd = arr[0], minProd = arr[0], result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			if (x < 0) {
				int tmp = maxProd;
				maxProd = minProd;
				minProd = tmp;
			}
			maxProd = Math.max(x, maxProd * x);
			minProd = Math.min(x, minProd * x);
			result = Math.max(result, maxProd);
		}
		return result;
	}

	// 25. Find All Duplicates (use array as hash)
	static List<Integer> findAllDuplicates(int[] arr) {
		List<Integer> result = new ArrayList<>();
		for (int x : arr) {
			int idx = Math.abs(x) - 1;
			if (arr[idx] < 0) result.add(idx + 1);
			else arr[idx] = -arr[idx];
		}
		return result;
	}

	// 26. Find Missing AND Repeating Number
	static int[] findMissingAndRepeating(int[] arr, int n) {
		long sum = 0, sumSq = 0;
		for (int x : arr) {
			sum += x;
			sumSq += (long) x * x;
		}
		long expectedSum = (long) n * (n + 1) / 2;
		long expectedSumSq = (long) n * (n + 1) * (2L * n + 1) / 6;
		long sumDiff = expectedSum - sum;
		long sumSqDiff = expectedSumSq - sumSq;
		long sumTotal = sumSqDiff / sumDiff;
		int missing = (int) ((sumDiff + sumTotal) / 2);
		int repeated = (int) (missing - sumDiff);
		return new int[]{repeated, missing};
	}

	// 27. Rotate Array by K positions (reversal trick)
	static void rotateByK(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}

	// 28. Longest Consecutive Sequence (O(n) with HashSet)
	static int longestConsecutive(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int x : arr) set.add(x);
		int longest = 0;
		for (int x : set) {
			if (!set.contains(x - 1)) {
				int length = 1;
				while (set.contains(x + length)) length++;
				longest = Math.max(longest, length);
			}
		}
		return longest;
	}

	// 29. Minimum Swaps to Sort an Array (cycle detection)
	static int minSwapsToSort(int[] arr) {
		int n = arr.length;
		Integer[] idx = new Integer[n];
		for (int i = 0; i < n; i++) idx[i] = i;
		Arrays.sort(idx, (a, b) -> arr[a] - arr[b]);

		boolean[] visited = new boolean[n];
		int swaps = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] || idx[i] == i) continue;
			int cycleLength = 0, j = i;
			while (!visited[j]) {
				visited[j] = true;
				j = idx[j];
				cycleLength++;
			}
			swaps += cycleLength - 1;
		}
		return swaps;
	}

	// 30. Sliding Window Maximum (monotonic deque)
	static int[] slidingWindowMax(int[] arr, int k) {
		Deque<Integer> deque = new ArrayDeque<>();
		int[] result = new int[arr.length - k + 1];
		for (int i = 0; i < arr.length; i++) {
			if (!deque.isEmpty() && deque.peekFirst() <= i - k)
				deque.pollFirst();
			while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i])
				deque.pollLast();
			deque.offerLast(i);
			if (i >= k - 1)
				result[i - k + 1] = arr[deque.peekFirst()];
		}
		return result;
	}
}
