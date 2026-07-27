package allarraysquestions;

import java.util.*;

public class squareOfSortedArrayofElements {

	public static void main(String[] args) {

		int[] arr = { -11,-8, -4, -3, -1, 0, 2, 3, 6, 7,9,13 };


		        int[] result = new int[arr.length];

		        int left = 0;
		        int right = arr.length - 1;
		        int position = arr.length - 1;

		        while (left <= right) {
		            int leftSquare = arr[left] * arr[left];
		            int rightSquare = arr[right] * arr[right];

		            if (leftSquare > rightSquare) {
		                result[position] = leftSquare;
		                left++;
		            } else {
		                result[position] = rightSquare;
		                right--;
		            }

		            position--;
		        }

		        System.out.println("Original array: " + Arrays.toString(arr));
		        System.out.println("Sorted squares: " + Arrays.toString(result));
		    }
		}
