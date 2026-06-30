package JavaPractice;

public class remove_consecutive_vowels { 
	// function which returns True or False for occurrence of a vowel
	static boolean is_vow(char c)
	{
		// this compares vowel with character 'c'
		return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
	}
	// function to print resultant string
	static void removeVowels(String str)
	{
		// print 1st character
		System.out.print(str.charAt(0));
		// loop to check for each character
		for (int i = 1; i < str.length(); i++)
			// comparison of consecutive characters
			if ((!is_vow(str.charAt(i - 1))) || (!is_vow(str.charAt(i))))
				System.out.print(str.charAt(i));
	}

	// Driver Code
	public static void main(String[] args)
	{
		String str = "geeks for geeks";
		removeVowels(str);
	}
}