package zentaskassignment5;

import java.util.Scanner;

public class palindrome1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Input from the user
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        // Check if the string is a palindrome
	        if (isPalindrome(inputString)) {
	            System.out.println("\"" + inputString + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + inputString + "\" is not a palindrome.");
	        }
	        
	        scanner.close();
	    }

	    public static boolean isPalindrome(String s) {
	        // Normalize the string by removing spaces and converting to lowercase
	        s = s.replaceAll("\\s+", "").toLowerCase();
	        int length = s.length();
	        
	        // Check each character from the start with the corresponding character from the end
	        for (int i = 0; i < length / 2; i++) {
	            if (s.charAt(i) != s.charAt(length - 1 - i)) {
	                return false; // Not a palindrome
	            }
	        }
	        
	        return true; // It is a palindrome
}

}
