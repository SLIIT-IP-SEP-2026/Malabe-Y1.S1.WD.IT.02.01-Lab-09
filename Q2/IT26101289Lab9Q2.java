import java.util.Scanner;

public class Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        area = circleArea(radius);

        System.out.println("The area of the circle with radius "
                + radius + " is : " + area);

       
    }
}