package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class stringclassdemo {

	// Main method where program execution starts.
	public static void main(String[] args) {
		//String : it is one of the prebuilt class in java
	
		String a = " javatraining"; //string 
		// Store text data that will be processed by the program logic.
		String b = "j b bn fhg   hfh hyh ";
		String c = b.replaceAll("\\s", "");// replace spaces
		// Display information to the console for the user.
		System.out.println(c);

		// Display information to the console for the user.
		System.out.println(a.charAt(2));
		// Display information to the console for the user.
		System.out.println(a.indexOf("e"));
		// Display information to the console for the user.
		System.out.println(a.substring(3, 6));
		// Display information to the console for the user.
		System.out.println(a.substring(5));
		// Display information to the console for the user.
		System.out.println(a.concat("rahul teaches"));
		//a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//split
		String[] arr=a.split("t");
		// Display information to the console for the user.
		System.out.println(arr[0]);
		// Display information to the console for the user.
		System.out.println(arr[1]);
		// Display information to the console for the user.
		System.out.println(a.replace("t", "s"));








	}


}

