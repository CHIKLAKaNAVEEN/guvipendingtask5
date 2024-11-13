package zentaskassignment5;

import java.util.Scanner;

public class LargestNumberCalculatortask5 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: three numbers
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        
	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        // Calculate the largest number
	        double largest = findLargest(num1, num2, num3);

	        // Output the largest number
	        System.out.printf("The largest number is: %.2f%n", largest);
	    }

	    private static double findLargest(int num1, int num2, int num3) {
	        double largest = num1; // Assume num1 is the largest initially

	        if (num2 > largest) {
	            largest = num2; // Update largest if num2 is greater
	        }
	        
	        if (num3 > largest) {
	            largest = num3; // Update largest if num3 is greater
	        }

	        return largest;
	    }
}
