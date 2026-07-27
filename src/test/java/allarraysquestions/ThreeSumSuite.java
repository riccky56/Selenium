package allarraysquestions;

import java.util.*;

public class ThreeSumSuite {

	// 1) Basic 3Sum: return all unique triplets that sum to 0
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		if (nums == null || nums.length < 3) {
			return result;
		}

		Arrays.sort(nums);
		int n = nums.length;

		for (int i = 0; i < n - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				int total = nums[i] + nums[left] + nums[right];

				if (total == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;

					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}

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

		return result;
	}

	// 2) 3Sum Closest: return sum of triplet closest to target
	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length < 3) {
			throw new IllegalArgumentException("Array must contain at least three numbers.");
		}

		Arrays.sort(nums);
		int closest = nums[0] + nums[1] + nums[2];
		int n = nums.length;

		for (int i = 0; i < n - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				int total = nums[i] + nums[left] + nums[right];

				if (Math.abs(total - target) < Math.abs(closest - target)) {
					closest = total;
				}

				if (total == target) {
					return total;
				} else if (total < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		return closest;
	}

	// 3) Count unique 3Sum combinations equal to target
	public int countThreeSum(int[] nums, int target) {
		if (nums == null || nums.length < 3) {
			return 0;
		}

		Arrays.sort(nums);
		int count = 0;
		int n = nums.length;

		for (int i = 0; i < n - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				int total = nums[i] + nums[left] + nums[right];

				if (total == target) {
					count++;
					left++;
					right--;

					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}

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

		return count;
	}

	public static void main(String[] args) {
		ThreeSumSuite solution = new ThreeSumSuite();

		int[] nums1 = { -1, 0, 1, 2, -1, -4 };
		System.out.println("Basic 3Sum: " + solution.threeSum(nums1));

		int[] nums2 = { -1, 2, 1, -4 };
		int target2 = 1;
		System.out.println("3Sum Closest: " + solution.threeSumClosest(nums2, target2));

		int[] nums3 = { 1, 2, -1, 0, -2, 1 };
		int target3 = 2;
		System.out.println("Count 3Sum: " + solution.countThreeSum(nums3, target3));
	}
}