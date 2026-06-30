package JavaPractice;

import java.util.Scanner;

public class fibonnacci {

	static void fibonaccii(int N) {


		int n1=0 , n2=1;
		
		for (int i=0; i<N; i++) {
			
			System.out.println(n1 + " ");
			
			int n3 = n2+n1;
			n1=n2;
			n2=n3;

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		fibonaccii(N);
	}

}
