import java.util.Scanner;

public class RansitResortReservation {
    // Declare constants
    public static final double ROOM_RATE = 4800.00;
    public static final int DISCOUNT_3_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get start date and end date from user
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validate the start and end dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }

        if (startDate > endDate) {
            System.out.println("Error: Start date cannot be greater than end date.");
            return;
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate + 1;

        // Calculate the total amount before discount
        double totalAmount = numberOfDays * ROOM_RATE;

        // Determine the discount rate
        int discountRate = 0;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        // Calculate the discount amount
        double discountAmount = (totalAmount * discountRate) / 100;

        // Calculate the final total amount after applying discount
        double finalAmount = totalAmount - discountAmount;

        // Display the results
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Room Rate Per Day: Rs. " + ROOM_RATE);
        System.out.println("Total Amount Before Discount: Rs. " + totalAmount);
        System.out.println("Discount Applied: " + discountRate + "%");
        System.out.println("Total Amount to be Paid: Rs. " + finalAmount);

        scanner.close();
    }
}