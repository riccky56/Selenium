package JavaBasics;

public class stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rahul gupta is a selenium tester";
		
		String d = "Prajjwal";
		String e = "prajjwal";
		
		System.out.println(d==e);


           System.out.println(s.indexOf("z")); // if element is not present in a string then it will return as -1 index value
		System.out.println(s);

		System.out.println("-------------"); // To split the string we use split keyword and it willb e now stored as a array

		String[] a = s.split(" "); // splitting on basis of whitespaces
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println("-------------");

		System.out.println("-------------"); // To split the string we use split keyword and it will be now stored as a array

		String v = new String("you are using this string now");  // splitting on basis of whitespaces
		String[] b = v.split("this");

		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[1].trim()); // this will remove the white space from the left and right side
		System.out.println("-------------");

		//now reverse this string 
		for(int i = v.length()-1; i>=0; i--) {
			
			System.out.print(v.charAt(i));
		

		}
		System.out.println();
		System.out.println("-------");
		System.out.println(v);

	}
}