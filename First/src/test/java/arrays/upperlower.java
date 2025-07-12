package arrays;

public class upperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "rahulguptaistester";
		String result="";
		
		for(int i=0; i<s.length()-2;i+=2)
		{
			char a = s.toLowerCase().charAt(i);
			char b= s.toUpperCase().charAt(i+1);
			
			result = result + a + b;
			//i++;  // to get the third character now then fifth use with i++ in the forloop 
			
			
		}
		
		System.out.println(result);
		

	}

}
