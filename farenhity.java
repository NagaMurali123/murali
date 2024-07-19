public class TemperatureConverter {

    public static void main(String[] args) {
        // Initialize Fahrenheit temperature
        double fahrenheit = 98.6; // Example Fahrenheit temperature

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the conversion
        System.out.println("Fahrenheit Temperature: " + fahrenheit + " °F");
        System.out.println("Celsius Equivalent: " + celsius + " °C");
    }
}