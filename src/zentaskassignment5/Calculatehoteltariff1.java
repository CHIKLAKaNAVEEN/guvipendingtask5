package zentaskassignment5;



import java.util.Scanner;

public class Calculatehoteltariff1 {

	
	
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: month (1-12), rent per day, days stayed
	        int month = scanner.nextInt();
	        double rentPerDay = scanner.nextDouble();
	        int daysStayed = scanner.nextInt();

	        // Calculate hotel tariff
	        double totalTariff = calculateTariff(month, rentPerDay, daysStayed);

	        // Output the total tariff formatted to 2 decimal places
	        System.out.printf("%.2f%n", totalTariff);
	    }

	    private static double calculateTariff(int month, double rentPerDay, int daysStayed) {
	        // Use switch to determine peak season
	        switch (month) {
	            case 4: // April
	            case 5: // May
	            case 6: // June
	            case 11: // November
	            case 12: // December
	                rentPerDay *= 1.2; // Increase rent by 20% during peak season
	                break;
	            default:
	                // No change in rent for other months
	                break;
	        }

	        // Calculate total tariff
	        return rentPerDay * daysStayed;
	
}
}