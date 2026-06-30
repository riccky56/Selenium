package arrays;

public class primetill200 {

	public static void main(String[] args) {

		System.out.println("Prime numbers till 200 are : ");

		for(int number=2; number<=200; number++) {
			boolean isPrime=true;


			for(int i=2; i<=Math.sqrt(number); i++) {        

				if(number%i==0) {
					isPrime=false;
					break;
				} 		  

			}
			if(isPrime) {
				System.out.println(number + " ");
			}

		}
	}

}
