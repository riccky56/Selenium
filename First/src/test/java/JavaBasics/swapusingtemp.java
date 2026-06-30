package JavaBasics;

public class swapusingtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 5;
		int b =4;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		
		//Swap with out variable

		a=a+b;  // a= 9
		b=a-b;  //b = 5
		a=a-b; // a= 4  
		System.out.println(a);
		System.out.println(b);
	}

}
