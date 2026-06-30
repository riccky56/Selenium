package interview;

	public class CountA {
	    public static void main(String[] args) {
	        String str = "Automation";
	        int count = 0;

	        for (char ch : str.toLowerCase().toCharArray()) {
	            if (ch == 'a')
	            	count++;
	        }

	        System.out.println("'A' appears: " + count + " times.");
	   


	}

}
