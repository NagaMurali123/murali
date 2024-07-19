public class GreatestNumberFinder {

    public static void main(String[] args) {
        // Initialize five numbers
        int num1 = 25;
        int num2 = 18;
        int num3 = 40;
        int num4 = 12;
        int num5 = 30;

        // Find the greatest number
        int greatest = findGreatest(num1, num2, num3, num4, num5);

        // Display the result
        System.out.println("The greatest number among " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + " is: " + greatest);
    }

    // Method to find the greatest number among five numbers
    public static int findGreatest(int a, int b, int c, int d, int e) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }
        return max;
    }
}