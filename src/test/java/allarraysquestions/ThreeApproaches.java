package allarraysquestions;



	public class ThreeApproaches {

	    // 1. SLIDING WINDOW (fixed k=3)
	    // "Max sum of exactly k elements"
	    public static int slidingWindow(int[] arr, int k) {
	        int sum = 0;
	        for (int i = 0; i < k; i++) sum += arr[i];
	        int max = sum;
	        for (int i = k; i < arr.length; i++) {
	            sum =sum + arr[i] - arr[i - k];
	            max = Math.max(max, sum);
	        }
	        return max;
	    }

	    // 2. TWO POINTERS (sorted array, sum = target)
	    // "Does any pair sum equal target?"
	    public static boolean twoPointers(int[] sorted, int target) {
	        int l = 0, r = sorted.length - 1;
	        while (l < r) {
	            int s = sorted[l] + sorted[r];
	            if (s == target) return true;
	            else if (s < target) l++;
	            else r--;
	        }
	        return false;
	    }

	    // 3. KADANE'S (any subarray, handles negatives)
	    // "Max sum of ANY contiguous subarray"
	    public static int kadanes(int[] arr) {
	        int max = arr[0], run = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            run = Math.max(arr[i], run + arr[i]);
	            max = Math.max(max, run);
	        }
	        return max;
	    }
	}


