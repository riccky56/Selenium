

package allarraysquestions;

import java.util.Arrays;

public class RotateArrayByK {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 2, 1};
        int k = 3;

        System.out.println("Before rotation: " + Arrays.toString(input));
        rotateByK(input, k);
        System.out.println("After rotation by " + k + ": " + Arrays.toString(input));
    }

    static void rotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] a, int left, int right) {
       
    	while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}
