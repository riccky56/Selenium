package allarraysquestions;

public class TwoSUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 5, 7, 9, 11, 15 };

		int target = 9;

		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array is null or has less than 2 elements");
		}

		int left = 0, right = arr.length - 1;

		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				System.out.println("Two pair sum is first index :>" + left + " & second index : > " + right);
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
