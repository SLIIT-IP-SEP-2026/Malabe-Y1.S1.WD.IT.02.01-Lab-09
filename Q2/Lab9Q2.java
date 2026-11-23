import java.util.Scanner;

public class Lab9Q2 {

    public static double circleArea(double rad) {
        double area = Math.PI * rad * rad;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double rad = input.nextDouble();

        double area = circleArea(rad);
        System.out.println("The area of the circle with radius " + rad + " is: " + area);
    }
}