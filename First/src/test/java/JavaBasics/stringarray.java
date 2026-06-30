package JavaBasics;

public class stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"rahul", "shetty", "selenium"};
		
   
		for(int i =0; i<name.length;i++){

			System.out.print(name[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		for( String s: name)
		{
      
			System.out.println(s);
		}
	}
}
