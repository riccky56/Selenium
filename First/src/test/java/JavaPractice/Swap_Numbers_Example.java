package JavaPractice;


public class Swap_Numbers_Example {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Logic to swap 2 numbers.

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("num1 = " + a);
		System.out.println("num2 = " + b);
	}

}