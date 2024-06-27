import java.util.*;

// Class name should be "Source"
public class fsdHw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the base price of the product
        double basePrice = scanner.nextDouble();

        // Clear the newline character after nextDouble()
        scanner.nextLine();

        // Read the product category
        String category = scanner.nextLine().toLowerCase().trim();

        // Read whether the customer is eligible for a discount
        boolean isEligibleForDiscount = scanner.nextBoolean();

        // Initialize final price with the base price
        double finalPrice = basePrice;

        // Apply discounts based on category and discount eligibility
        if (category.equals("electronics")) {
            if (isEligibleForDiscount) {
                finalPrice = basePrice * 0.90; // 10% discount
            }
        } else if (category.equals("clothing")) {
            if (isEligibleForDiscount) {
                finalPrice = basePrice * 0.80; // 20% discount
            }
        } else if (category.equals("grocery")) {
            // No discount for grocery items
            finalPrice = basePrice;
        } else {
            System.out.println("Invalid product category.");
            return; // Exit the program if the category is invalid
        }

        // Output the final price
        System.out.println("Output: " + finalPrice);

        // Close the scanner
        scanner.close();
    }
}
