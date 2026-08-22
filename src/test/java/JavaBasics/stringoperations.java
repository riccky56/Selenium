package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class stringoperations {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rahul gupta is a selenium tester";
		
		// Store text data that will be processed by the program logic.
		String d = "Prajjwal";
		// Store text data that will be processed by the program logic.
		String e = "prajjwal";
		
		// Display information to the console for the user.
		System.out.println(d==e);


           System.out.println(s.indexOf("z")); // if element is not present in a string then it will return as -1 index value
		// Display information to the console for the user.
		System.out.println(s);

		System.out.println("-------------"); // To split the string we use split keyword and it willb e now stored as a array

		String[] a = s.split(" "); // splitting on basis of whitespaces
		// Display information to the console for the user.
		System.out.println(a[0]);
		// Display information to the console for the user.
		System.out.println(a[1]);
		// Display information to the console for the user.
		System.out.println(a[2]);
		// Display information to the console for the user.
		System.out.println(a[3]);
		// Display information to the console for the user.
		System.out.println(a[4]);
		// Display information to the console for the user.
		System.out.println(a[5]);
		// Display information to the console for the user.
		System.out.println("-------------");

		System.out.println("-------------"); // To split the string we use split keyword and it will be now stored as a array

		String v = new String("you are using this string now");  // splitting on basis of whitespaces
		String[] b = v.split("this");

		// Display information to the console for the user.
		System.out.println(b[0]);
		// Display information to the console for the user.
		System.out.println(b[1]);
		System.out.println(b[1].trim()); // this will remove the white space from the left and right side
		// Display information to the console for the user.
		System.out.println("-------------");

		//now reverse this string 
		for(int i = v.length()-1; i>=0; i--) {
			
			// Display information to the console for the user.
			System.out.print(v.charAt(i));
		

		}
		// Display information to the console for the user.
		System.out.println();
		// Display information to the console for the user.
		System.out.println("-------");
		// Display information to the console for the user.
		System.out.println(v);

	}
}
