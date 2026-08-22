package JavaBasics;
// Class declaration that groups the related example logic in one place.
public class Geeks {
    // Main method where program execution starts.
    public static void main(String[] args) {
      
        // Store text data that will be processed by the program logic.
        String s1 = "hello";
        // Store text data that will be processed by the program logic.
        String s2 = "hello";
        // Store text data that will be processed by the program logic.
        String s3 =  new String("hello");

        // Display information to the console for the user.
        System.out.println(s1 == s2);
        // Display information to the console for the user.
        System.out.println(s1 == s3); 
        // Display information to the console for the user.
        System.out.println(s1.equals(s2));
        // Display information to the console for the user.
        System.out.println(s1.equals(s3)); 
    }
}
