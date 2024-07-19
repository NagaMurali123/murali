public class TriangleCheck {

    public static void main(String[] args) {
        // Initialize angles
        int angle1 = 45;
        int angle2 = 45;
        int angle3 = 90;

        // Check if they form a triangle
        boolean isTriangle = checkTriangle(angle1, angle2, angle3);

        // Display the result
        if (isTriangle) {
            System.out.println("Angles " + angle1 + ", " + angle2 + ", " + angle3 + " form a triangle.");
        } else {
            System.out.println("Angles " + angle1 + ", " + angle2 + ", " + angle3 + " do not form a triangle.");
        }
    }

    // Method to check if angles can form a triangle
    public static boolean checkTriangle(int angle1, int angle2, int angle3) {
        // Sum of angles in a triangle should be 180 degrees
        return (angle1 + angle2 + angle3 == 180) && (angle1 > 0 && angle2 > 0 && angle3 > 0);
    }
}