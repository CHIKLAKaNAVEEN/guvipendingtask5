package zentaskassignment5;

import java.util.Scanner;

public class task5reversingorderofcharaterssuingloop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scanner = new Scanner(System.in);
	        
	        // Input from the user
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        // Call the method to reverse the string
	        String reversedString = reverseString(inputString);
	        
	        // Output the reversed string
	        System.out.println("Reversed string: " + reversedString);
	        
	        scanner.close();
	    }

	    public static String reverseString(String s) {
	        StringBuilder reversed = new StringBuilder();
	        
	        // Loop through the string in reverse order
	        for (int i = s.length() - 1; i >= 0; i--) {
	            reversed.append(s.charAt(i)); // Append each character to the StringBuilder
	        }
	        
	        return reversed.toString(); // Convert StringBuilder to String and return
	}

}
