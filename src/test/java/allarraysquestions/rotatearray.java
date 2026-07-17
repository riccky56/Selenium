package allarraysquestions;
import java.util.Arrays;
public class rotatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		rotateByOne(arr);
		System.out.println("Array after rotation: " + Arrays.toString(arr));
	}
		static void rotateByOne(int[] arr) {
			int first = arr[0];
			for (int i = 0; i < arr.length - 1; i++)
				arr[i] = arr[i + 1];
			arr[arr.length - 1] = first;
		}
	}

