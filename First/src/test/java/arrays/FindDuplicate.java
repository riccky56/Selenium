
package arrays;

public class FindDuplicate {
	public static void main(String[] args) {
		int[] a = {1, 3, 4, 5, 2, 3, 4, 6, 7, 4, 5, 5, 6, 7, 4, 2, 4, 6, 3, 2, 4, 5};
       
    
		for (int i = 0; i < a.length; i++) {
			
			boolean isDuplicate = false;
			
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] == a[j]) {
					
					// Check if this duplicate has already been printed
					for (int k = 0; k < i; k++) {
						if (a[k] == a[i]) {
							isDuplicate = true;
							break;
						}
					}
					if (!isDuplicate) 
					{
						System.out.print(a[i] + " ");
					}
					break;
				}
			}}}}