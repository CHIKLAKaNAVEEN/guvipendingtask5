package zentaskassignment5;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Input from the user
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        
	        // Variable to keep track of the current number
	        int currentNumber = 1;
	        
	        // Loop for the number of rows
	        for (int i = 1; i <= n; i++) {
	            // Loop for printing numbers in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(currentNumber);
	                currentNumber++;
	            }
	            // Move to the next line after each row
	            System.out.println("");
	        }
	        
	        scanner.close();
	}

}
