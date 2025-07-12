package JavaBasics;

public class pyramidof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		for (int i = 0; i<=9; i+=3) {
			
			for (int j = 3; j<=i; j+=3) {
				System.out.print(k);
				System.out.print("\t");
				k+=3;
			}
			System.out.println(" ");
		}
		
	}

}
