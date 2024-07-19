public class LeapYearChecker {

    public static void main(String[] args) {
        // Initialize the year to be checked
        int year = 2024; // Example year

        // Check if it's a leap year
        boolean isLeapYear = checkLeapYear(year);

        // Display the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to check if a year is a leap year
    public static boolean checkLeapYear(int year) {
        // Leap year condition:
        // 1. Year should be divisible by 4
        // 2. If the year is divisible by 100, it should also be divisible by 400
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}