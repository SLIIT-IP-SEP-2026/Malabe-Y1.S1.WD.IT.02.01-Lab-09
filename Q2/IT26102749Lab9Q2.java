import java.util.Scanner;

public class IT26101664Lab9Q2 {

    // Method to calculate and return the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call circleArea() method and display the result
        double area = circleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is : " + area);

        input.close();
    }
}