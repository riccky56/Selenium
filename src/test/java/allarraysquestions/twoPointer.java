package allarraysquestions;

public class twoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		reverse(arr);
		
	System.out.println("Reversed array: ");
	
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
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

}
