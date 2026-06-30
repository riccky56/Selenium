package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class remove_the_duplicate_and_store_into_list_of_integers {
	public static void main(String[] args) {

		int[] arr = {5, 2, 9, 2, 6, 4, 1, 6, 2, 5};
       
		ArrayList<Integer> list = new ArrayList();
		                
		for(int a:arr) {  //to remove the duplicate and store into list of integers
		
			if(!list.contains(a))
			{
				list.add(a);
			}
		}
		
		//to convert the list into the array
		int b[] = new int [list.size()];

		for(int i=0;i<list.size(); i++) {
			
			b[i]= list.get(i) ;
		}

		
		System.out.println(list);    //[5, 2, 9, 6, 4, 1]
		
		Collections.sort(list);      
		
		System.out.println("Sorted list : " +list);     //[1, 2, 4, 5, 6, 9]
		
		System.out.println(Arrays.toString(b)); //[5, 2, 9, 6, 4, 1]
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(b));		 //[1, 2, 4, 5, 6, 9] 		

	}

}
