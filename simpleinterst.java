

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Initialize values
        double principal = 1000; // Principal amount
        double rate = 5; // Annual interest rate (in percentage)
        double time = 2; // Time period in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the simple interest
        System.out.println("Principal Amount: $" + principal);
        System.out.println("Interest Rate: " + rate + "% per annum");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: $" + simpleInterest);
    }
}