package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class exercise_array {

		 // Main method where program execution starts.
		 public static void main(String[] args) {
		        // 1. Create an Array
		        int[] numbers = {2,9,17,5,3};
		        
		        
		        // 2. Access and Print
		        System.out.println("First element: " + numbers[0]);
		        // Display information to the console for the user.
		        System.out.println("Last element: " + numbers[numbers.length - 1]); 
		 
		        // 3. Reverse Order
		        System.out.println("Elements in reverse order: ");
		        // Loop through the data using an index or counter.
		        for (int i = numbers.length - 1; i >= 0; i--) {
		            // Display information to the console for the user.
		            System.out.println(numbers[i]);
		        }
		 
		        // 4. Bonus: Element Count
		        System.out.println("Total elements in the array: " + numbers.length);
		    }

}

