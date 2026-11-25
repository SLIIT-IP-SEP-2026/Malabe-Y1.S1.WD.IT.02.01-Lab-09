import java.util.Scanner;

public class IT26520069Lab9Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
        } else {
            double area = circleArea(radius);
            System.out.println("The area of the circle with the radius " + radius + " is : " + area);
        }

    
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

